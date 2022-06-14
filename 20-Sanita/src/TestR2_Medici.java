import junit.framework.TestCase;
import sanita.*;

public class TestR2_Medici extends TestCase {

  public TestR2_Medici(String arg0) {
    super(arg0);
  }

  public void testAggiungi() throws ErrMedicoInesistente {
    Sanita s = new Sanita();

    String mat = "XYZ";
    String cf = "THEPID12I99F181K";
    String nome = "Giova";
    String cognome = "Reds";
    s.aggiungiMedico(mat, nome, cognome, cf);

    Medico p = s.getMedico(mat);

    assertEquals(mat, p.getMatricola());
    assertEquals(nome, p.getNome());
    assertEquals(cognome, p.getCognome());
  }

  public void testAggiungiMedicoGetPersona() {
    Sanita s = new Sanita();

    String mat = "XYZ";
    String cf = "THEFIT12I97F181Z";
    String nome = "Mario";
    String cognome = "White";
    s.aggiungiMedico(mat, nome, cognome, cf);

    try {
      Persona p = s.getPersona(cf);
      assertEquals(nome, p.getNome());
    } catch (ErrPersonaInesistente e) {
      fail("Un medico dovrebbe essere anche una persona");
    }

  }

  public void testNotFound() {
    Sanita s = new Sanita();

    String mat = "XYZ";
    String cf = "THEFIT12I97F181Z";
    String nome = "Mario";
    String cognome = "White";

    s.aggiungiMedico(mat, nome, cognome, cf);

    try {
      Medico p = s.getMedico(mat + "W");
      fail("Non ci dovrebbe essere nessuno");
    } catch (ErrMedicoInesistente e) {
      assertTrue(true);
    }
  }

  public void testGetNull() {
    Sanita s = new Sanita();

    String mat = "XYZ";
    String cf = "THEFIT12I97F181Z";
    String nome = "Mario";
    String cognome = "White";

    s.aggiungiMedico(mat, nome, cognome, cf);

    try {
      Medico p = s.getMedico(null);
      assertSame(null, p);
    } catch (ErrMedicoInesistente e) {
      assertTrue(true);
    }

  }

  public void testInserimentoDoppio() throws ErrMedicoInesistente {
    Sanita s = new Sanita();

    String mat = "XYZ";
    String cf = "THEFIT12I97F181Z";
    String nome = "Mario";
    String cognome = "White";

    s.aggiungiMedico(mat, nome + "X", cognome + "X", cf + "X");
    s.aggiungiMedico(mat, nome, cognome, cf);

    Medico p = s.getMedico(mat);

    assertEquals(mat, p.getMatricola());
  }

}
