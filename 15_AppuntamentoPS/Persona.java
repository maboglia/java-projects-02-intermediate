
public class Persona {
  private String nome;
  private String cognome;
  private String cf;
  private Persona next;
  
  private ElementoApp headApp;
  private ElementoApp currentApp;
  
  private static Persona head = null;
	
	public Persona(String nome, String cognome, String cf){
		this.nome = nome;
		this.cognome = cognome;
		this.cf = cf;
		this.next = head;
		head = this;
	}
  public String getCf() {
    return cf;
  }

  public String getCognome() {
    return cognome;
  }

  public String getNome() {
    return nome;
  }
  public static Persona cercaPersona(String input) {
    Persona current = head;
    while(current!=null){
    	if(current.cf.equals(input))
    		return current;
    	current = current.next;
    }
    return null;
  }
  
  public void addAppuntamento(Appuntamento a){
  	ElementoApp p = new ElementoApp();
  	p.info = a;
  	p.next = headApp;
  	headApp = p;
  }
  
  public int getNumAppuntamenti() {
  	int count=0;
  	ElementoApp current=headApp;
  	while(current!=null){
  		count ++;
  		current = current.next;
  	}
    return count;
  }
  
  public Appuntamento getFirstApp() {
	currentApp = headApp;
	if(currentApp==null) return null;
    return currentApp.info;
  }
  public Appuntamento getNextApp() {
	if(currentApp==null) return null;
	currentApp = currentApp.next;
	if(currentApp==null) return null;
	return currentApp.info;
  }

//  public void setNome(String string) {
//  	if(string == null) return;
//    nome = string;
//  }

}
