import java.util.HashSet;
import java.util.Set;

public class Utente {

    // Attributi
    private String username;
    private String password;
    private String nome;
    private String cognome;
    private metodoPagamento metodoPagamento;

    // Costruttore
    public Utente(String username, String password, String nome, String cognome, metodoPagamento metodoPagamento) {
        this.username = username;
        this.password = password;
        this.nome = nome;
        this.cognome = cognome;
        this.metodoPagamento = metodoPagamento;
    }

    // Get & set

    // Set statico per tenere traccia dei username unici
    private static Set<String> usernameUnici = new HashSet<>();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        // Controllo unicità
        if (usernameUnici.contains(username)) {
            throw new IllegalArgumentException("Esiste già un utente con questo username.");
        }
        this.username = username;
        // Aggiungo il codice al set
        usernameUnici.add(username);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public metodoPagamento getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(metodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }
}
