import org.polito.po.Console;

public class ProvaApp {

  public static void main(String[] args) {
		Console con = new Console();
		Persona p1 = new Persona("Giovanni","Bianchi","GVIBCH123213");
  	    Stanza s1 = new Stanza("A6");
  	    
  	    Appuntamento aa = p1.getFirstApp();
  	    if(aa==null) con.println("Nessun appuntamento");
  	     
  	    if(! p1.getCognome().equals("Bianchi")){
  	    	con.println("Cognome della persona errato!");
  	    	return;
  	    }
  	    
  	    String s = new String("A6");
  	    
  	    if(s1.getNome() != s){
  	    	con.println("SONO DIVERSI"); // dovrebbe essere questo...
  	    }else{
			con.println("SONO UGUALI");
  	    }

		if(! s1.getNome().equals("A6")){
			con.println("Nome della stanza errato!");
			return;
		}
  	    
  	    Appuntamento a = new Appuntamento(p1,s1,"Data","Ora");
  	    //p1.addAppuntamento(a);  // nel ctor di Appuntamento
  	    
  	    if( a.getPersona() != p1){
  	    	con.println("Persona appuntamento errata");
  	    	return;
  	    }
  	    
		Appuntamento a2 = new Appuntamento(p1,s1,"Data2","Ora2");
  	    
  	    int nAppuntamenti = p1.getNumAppuntamenti();
  	    if(nAppuntamenti != 2){
  	    	con.println("Num app errato");
  	    	return;
  	    }
  	    
		Appuntamento app;
		app = p1.getFirstApp();

		if (app == null) {
			System.err.println("Errore: nessun appuntamento");
			return;
		}

		if (app.getPersona() != p1) {
			System.err.println("Errore: persona sbagliata");
			return;
		}
		app = p1.getNextApp();
		if (app.getPersona() != p1) {
			System.err.println("Errore: persona sbagliata");
			return;
		}
		app = p1.getNextApp();

		if (app != null) {
			System.err.println("Errore: troppi appuntamenti");
			return;
		}
  	    
  	    con.println("OK");
  }
}
