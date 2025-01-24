import java.time.LocalDate;
import java.util.List;

public class Ordine {
    private int numeroOrdine;
    private LocalDate data;
    private List<Prodotto> elencoProdottiOrdinati;

    // Costrutture
    public Ordine(int numeroOrdine, LocalDate data, List<Prodotto> elencoProdottiOrdinati) {
        this.numeroOrdine = numeroOrdine;
        this.data = data;
        this.elencoProdottiOrdinati = elencoProdottiOrdinati;
    }

    // Get & set
    public int getNumeroOrdine() {
        return numeroOrdine;
    }

    public void setNumeroOrdine(int numeroOrdine) {
        this.numeroOrdine = numeroOrdine;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public List<Prodotto> getElencoProdottiOrdinati() {
        return elencoProdottiOrdinati;
    }

    public void setElencoProdottiOrdinati(List<Prodotto> elencoProdottiOrdinati) {
        this.elencoProdottiOrdinati = elencoProdottiOrdinati;
    }



    
}


