import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

  public static Test suite() {
    TestSuite suite = new TestSuite("Test for default package");
    //$JUnit-BEGIN$
    suite.addTest(new TestSuite(TestR1_Pazienti.class));
    suite.addTest(new TestSuite(TestR2_Medici.class));
    suite.addTest(new TestSuite(TestR3_AssegnazionePazienti.class));
    suite.addTest(new TestSuite(TestR4_ElencoPazienti.class));
    suite.addTest(new TestSuite(TestR5_CaricamentoFile.class));
    //$JUnit-END$
    return suite;
  }
}
