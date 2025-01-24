import java.util.HashSet;
import java.util.Set;

public class Prodotto {

    // Attrubuti
    private String codice;
    private String descrizione;
    private Double prezzo;

    // Costruttore
    public Prodotto(String codice, String descrizione, Double prezzo) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
    }

    // Set statico per tenere traccia dei codici unici
    private static Set<String> codiciUnici = new HashSet<>();

    // Get and set
    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
          // Controllo unicità
          if (codiciUnici.contains(codice)) {
            throw new IllegalArgumentException("Esiste già un prodotto con questo codice.");
        }

        this.codice = codice;
        // Aggiungo il codice al set
        codiciUnici.add(codice);
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }
}
