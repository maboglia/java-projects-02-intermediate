import sanita.ErrMedicoInesistente;
import sanita.ErrPersonaInesistente;
import sanita.Medico;
import sanita.Persona;
import sanita.Sanita;
import junit.framework.TestCase;



public class TestR3_AssegnazionePazienti extends TestCase {

  public TestR3_AssegnazionePazienti(String arg0) {
    super(arg0);
  }

  
	public void testAssegnaMedico() throws ErrPersonaInesistente, ErrMedicoInesistente{
		Sanita s = new Sanita();
  	
		String cf = "THEPID12I99F181K";
		s.aggiungiPersona("Giova","Reds",cf);

		String mat = "XYZ";
		s.aggiungiMedico(mat, "Mario", "White", "THEFIT12I97F181Z");		
		s.assegnaMedico(mat,cf);
		
		Persona p = s.getPersona(cf);
		Medico m = p.getMedico();
		
		String risultato = m.getMatricola();
		
		assertEquals(mat,risultato);
	}
  
	public void testNessunMedicoAssegnato() throws ErrPersonaInesistente{
		Sanita s = new Sanita();
  	
		String cf = "THEPID12I99F181K";
		s.aggiungiPersona("Giova","Reds",cf);

		Persona p = s.getPersona(cf);
		
		Medico m = p.getMedico();
		
		assertSame(null,m);	
	}
  
	public void testDoppioAssegnamento() throws ErrPersonaInesistente, ErrMedicoInesistente{
		Sanita s = new Sanita();
  	
		String cf = "THEPID12I99F181K";
		s.aggiungiPersona("Giova","Reds",cf);

		String mat1 = "XYZ";
		s.aggiungiMedico(mat1, "Mario", "White", "THEFIT12I97F181Z");		
		s.assegnaMedico(mat1,cf);
		
		String mat2 = "ZZZ";
		s.aggiungiMedico(mat2, "Joseph", "Greens", "JSHGRN18I93F181Z");		
		s.assegnaMedico(mat2,cf);

		Persona p = s.getPersona(cf);
		Medico m = p.getMedico();
		
		String risultato = m.getMatricola();
		
		assertEquals(mat2,risultato);
	}


}
