import java.util.Collection;
import java.util.Iterator;

import sanita.ErrMedicoInesistente;
import sanita.ErrPersonaInesistente;
import sanita.Medico;
import sanita.Persona;
import sanita.Sanita;
import junit.framework.TestCase;



public class TestR4_ElencoPazienti extends TestCase {

  public TestR4_ElencoPazienti(String arg0) {
    super(arg0);
  }

  public void testElenco() throws ErrPersonaInesistente, ErrMedicoInesistente{
		Sanita s = new Sanita();
  	
		String cf1 = "THEPID12I99F181K";
		s.aggiungiPersona("Giova","Reds",cf1);

		String cf2 = "BLKSRS11I88F981K";
		s.aggiungiPersona("Sirius","Black",cf2);

		String mat = "XYZ";
		s.aggiungiMedico(mat, "Mario", "White", "THEFIT12I97F181Z");		
		s.assegnaMedico(mat,cf1);
		s.assegnaMedico(mat,cf2);
		
		Persona p1 = s.getPersona(cf1);
		Persona p2 = s.getPersona(cf2);

		Medico m = s.getMedico(mat);
		
		Collection pazienti = m.getPazienti();
		
	    assertTrue(pazienti.contains(p1));
		assertTrue(pazienti.contains(p2));
  }
  
  public void testElencoOrdinato() throws ErrPersonaInesistente, ErrMedicoInesistente{
		Sanita s = new Sanita();
  	
		String cf3 = "RSSPLA13I88F981K";
		s.aggiungiPersona("Paolo","Reds",cf3);

		String cf1 = "THEPID12I99F181K";
		s.aggiungiPersona("Giova","Reds",cf1);

		String cf2 = "BLKSRS11I88F981K";
		s.aggiungiPersona("Sirius","Black",cf2);

		String mat = "XYZ";
		s.aggiungiMedico(mat, "Mario", "White", "THEFIT12I97F181Z");		
		s.assegnaMedico(mat,cf1);
		s.assegnaMedico(mat,cf2);
		s.assegnaMedico(mat,cf3);
		
		Medico m = s.getMedico(mat);
		
		Collection pazienti = m.getPazienti();
		Iterator it = pazienti.iterator();
		
  		Persona p1 = (Persona)it.next();
		Persona p2 = (Persona)it.next();
		Persona p3 = (Persona)it.next();
		
		assertEquals("Black",p1.getCognome());
		assertEquals("Reds",p2.getCognome());
		assertEquals("Reds",p3.getCognome());
		assertEquals("Paolo",p3.getNome());
  }
}
