package sanita;

class Paziente implements Persona, Comparable {

  private String nome;
  private String cognome;
  private String cf;
  private Dottore medico;

  public Paziente(String nome, String cognome, String cf) {
    this.nome = nome;
    this.cognome = cognome;
    this.cf = cf;
  }

  public String getNome() {
    return nome;
  }

  public String getCognome() {
    return cognome;
  }

  public Medico getMedico() {
    return medico;
  }

  public void setMedico(Dottore medico) {
    this.medico = medico;
  }

  public int compareTo(Object obj) {
    Paziente other = (Paziente) obj;
    int c = this.cognome.compareTo(other.cognome);
    if (c != 0)
      return c;
    int n = this.nome.compareTo(other.nome);
    return n;
  }
}
