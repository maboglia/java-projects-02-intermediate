import java.io.FileOutputStream;
import java.io.IOException;

import sanita.ErrMedicoInesistente;
import sanita.ErrPersonaInesistente;
import sanita.Medico;
import sanita.Persona;
import sanita.Sanita;

import junit.framework.TestCase;



public class TestR5_CaricamentoFile extends TestCase {

  public TestR5_CaricamentoFile(String arg0) {
    super(arg0);
  }
  
  private static void writeFile(String fileName,String content) {
  	try{
  		FileOutputStream fos = new FileOutputStream(fileName);
  		fos.write(content.getBytes());
  		fos.close();
	}catch(IOException ioe){
		throw new RuntimeException(ioe.getMessage());
	}
  }
  
  public void testCaricamento() throws ErrPersonaInesistente, ErrMedicoInesistente, IOException{
  	String normale = "P;Giovanni;Rossi;RSSGNN33B30F316I\n" +
					"P;Giuseppe;Verdi;VRDGPP76F09B666I\n" + 
					"M;XY345Z;Mario;Bianchi;BNCMRA44C99A320Z";
  	
  	writeFile("elenco.txt",normale);
  	Sanita s = new Sanita();
  	s.caricaDati("elenco.txt");
  	Persona p = s.getPersona("VRDGPP76F09B666I");
  	assertEquals("Verdi",p.getCognome());

	Medico m = s.getMedico("XY345Z");
	assertEquals("Bianchi",m.getCognome());
  }

	public void testNumeroLinee() throws ErrPersonaInesistente, ErrMedicoInesistente, IOException{
		String normale = "P;Giovanni;Rossi;RSSGNN33B30F316I\n" +
					"P;Giuseppe;Verdi;VRDGPP76F09B666I\n" + 
					"M;XY345Z;Mario;Bianchi;BNCMRA44C99A320Z";
  	
		writeFile("elenco.txt",normale);
		Sanita s = new Sanita();
		int n = s.caricaDati("elenco.txt");
		
		assertEquals(3,n);
	}
  
  public void testErroriBanali() throws IOException, ErrPersonaInesistente, ErrMedicoInesistente{
	String normale = "P;Giovanni;Rossi;RSSGNN33B30F316I\n" +
				"P;Giuseppe;Verdi;VRDGPP76F09B666I\n" + 
				"P;Giuseppe;VRDGPP76F09B444I\n" + // manca il nome 
				"M;Mario;Bianchi;BNCMRA44C99A320Y\n" + // manca la matricola
				"M;XY345Z;Mario;Bianchi;BNCMRA44C99A320Z\n";

	writeFile("elenco.txt",normale);
	Sanita s = new Sanita();
	s.caricaDati("elenco.txt");
	Persona p = s.getPersona("VRDGPP76F09B666I");
	assertEquals("Verdi",p.getCognome());

	Medico m = s.getMedico("XY345Z");
	assertEquals("Bianchi",m.getCognome());
  }
  
  public void testErroriSpeciali() throws IOException, ErrPersonaInesistente, ErrMedicoInesistente{
		String normale = "P;Giovanni;Rossi;RSSGNN33B30F316I\n" +
					"P;Giuseppe; Verdi ; VRDGPP76F09B666I \n" + // spazi aggiuntivi
					"\n" + // linea vuota 
					"M;XY345Z;Mario;Bianchi;BNCMRA44C99A320Z\n";

		writeFile("elenco.txt",normale);
		Sanita s = new Sanita();
		s.caricaDati("elenco.txt");
		Persona p = s.getPersona("VRDGPP76F09B666I");
		assertEquals("Verdi",p.getCognome());

		Medico m = s.getMedico("XY345Z");
		assertEquals("Bianchi",m.getCognome());
  }
}
