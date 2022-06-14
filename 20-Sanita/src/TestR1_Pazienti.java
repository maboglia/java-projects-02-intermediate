import junit.framework.TestCase;
import sanita.*;

public class TestR1_Pazienti extends TestCase {

  public TestR1_Pazienti(String arg0) {
    super(arg0);
  }

  public void testAggiungi() throws ErrPersonaInesistente {
    Sanita s = new Sanita();

    String cf = "THEPID12I99F181K";
    String nome = "Giova";
    String cognome = "Reds";
    s.aggiungiPersona(nome, cognome, cf);

    Persona p = s.getPersona(cf);

    assertEquals(nome, p.getNome());
    assertEquals(cognome, p.getCognome());
  }

  public void testNotFoundEmpty() {
    Sanita s = new Sanita();

    String cf = "THEPID12I99F181K";

    try {
      Persona p = s.getPersona(cf);
      fail("Non ci dovrebbe essere nessuno");
    } catch (ErrPersonaInesistente e) {
      assertTrue(true);
    }
  }

  public void testAggiungiNull() {
    Sanita s = new Sanita();

    s.aggiungiPersona(null, null, null);

  }

  public void testNotFound() {
    Sanita s = new Sanita();

    String cf = "THEPID12I99F181K";
    String nome = "Giova";
    String cognome = "Reds";

    s.aggiungiPersona(nome, cognome, cf);

    try {
      Persona p = s.getPersona(cf + "_");
      fail("Non ci dovrebbe essere nessuno");
    } catch (ErrPersonaInesistente e) {
      assertTrue(true);
    }
  }

  public void testGetNull() {
    Sanita s = new Sanita();

    String cf = "THEPID12I99F181K";
    String nome = "Giova";
    String cognome = "Reds";

    s.aggiungiPersona(nome, cognome, cf);

    try {
      Persona p = s.getPersona(null);
      assertSame(null, p);
    } catch (ErrPersonaInesistente e) {
      assertTrue(true);
    }
  }

  public void testInserimentoDoppio() throws ErrPersonaInesistente {
    Sanita s = new Sanita();

    String cf = "THEPID12I99F181K";
    String nome = "Giova";
    String cognome = "Reds";

    s.aggiungiPersona(nome + "X", cognome + "Y", cf);
    s.aggiungiPersona(nome, cognome, cf);

    Persona p = s.getPersona(cf);

    assertEquals(nome, p.getNome());
  }

}
