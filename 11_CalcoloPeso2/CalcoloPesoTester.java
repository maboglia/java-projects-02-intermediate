package week3.calcoloPeso;

/**
 * Created by mauro on 22/06/16.
 */
public class CalcoloPesoTester {

    private final static String MESSAGGIO_PESO = "Inserisci il tuo peso in Kg";
    private final static String MESSAGGIO_ALTEZZA = "Inserisci la tua altezza in mt";

    public static void main(String[] args) {

        DatiPersona mieiDati = creaDati();
        System.out.println(mieiDati.toString());


    }

    private static DatiPersona creaDati(){

        double peso = GetInput.leggiDouble(MESSAGGIO_PESO);
        double altezza = GetInput.leggiDouble(MESSAGGIO_ALTEZZA);

        return new DatiPersona(peso, altezza);
    }

}
