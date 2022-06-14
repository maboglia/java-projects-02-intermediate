package rubrica;

public class Persona {
  
  public Persona(String nome2, String cognome2, String telefono) {
    nome= nome2;
    cognome= cognome2;
    numero= telefono;
  }
  
  private String nome;
  private String cognome;
  private String numero;
  
  public String toString() {
    return nome + " " +cognome + " " + numero;
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
  public String getNumero() {
    return numero;
  }
  public void setNumero(String numero) {
    this.numero = numero;
  }
}
