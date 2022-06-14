import Stanza;



public class Appuntamento {
	private Persona persona;
	private Stanza stanza;
	//...
	

  public Appuntamento(Persona p1, Stanza s1, String string, String string2) {
  	persona = p1;
  	stanza = s1;
  	//...
  	p1.addAppuntamento(this);
//  	s1.addAppuntamento(this);
  }

  public Persona getPersona() {
    return persona;
  }

  public Stanza getStanza() {
    return stanza;
  }

}
