package rubrica;

public class Rubrica {

    // inserire tutti gli attributi necessari
    // eventualmente creare altre classi
    private String titolo;
    private Persona[] voci;
    private int num=0;
  public Rubrica(String titolo, Persona[] voci, int num) {
      super();
      this.titolo = titolo;
      this.voci = voci;
      this.num = num;
    }

  /**
   * crea una nuova rubrica con il nome dato
   */
  public Rubrica(String nome) {
    titolo=nome;
    voci = new Persona[10];
  }

  /**
   * inserisce una nuova voce nella rubrica 
   */  
  public void aggiungi(String nome, String cognome, String telefono){
    voci[num++] = new Persona(nome,cognome,telefono);
    
  }
  
  /**
   * restituisce la prima voce inserita nella rubrica
   */  
  public String primo() {
      return voci[0].toString();
  }

  /**
   * restituisce il nome della rubrica
   */
  public String getTitolo() {
    return titolo;
  }

  /**
   * Restituisce la voce i-esima inserita nella rubrica
   */
  public String voce(int i) {
      if (i>num || i<0) return null;
      return voci[i-1].toString();
  }

  /**
   * Restituisce una stringa con l'elenco delle voci
   * della rubrica separate da ", ".
   * L'elenco inizia con "(" e termina con ")"
   */
  public String elenco() {
  	String s = "";
    for (int i = 0; i< num; i++)
      s = s + voci[i].toString() + ", ";
    
    return s;
  }

  /**
   * Restituisce la stringa con la prima voce che
   * contiene il parametro daCercare come nome,
   * cognome oppure telefono.
   */
  public String ricerca(String daCercare) {
  	for (int i=0; i<num; i++) {
  	  if (voci[i].getCognome().equals(daCercare))
  	    return voci[i].toString();
  	 if (voci[i].getNome().equals(daCercare))
       return voci[i].toString();
  	 if (voci[i].getNumero().equals(daCercare))
       return voci[i].toString();
  	}
  	return null;
  }

}
