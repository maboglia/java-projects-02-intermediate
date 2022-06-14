/**
 * Created by mauro on 03/03/16.
 */
public class MainBloccoNote {


    public static void main(String[] args) {
        Annotazione s1 = new Annotazione("a","b1","c1");
        Annotazione s2 = new Annotazione("a","b2","c2");
        Annotazione s3 = new Annotazione("a3","b3","c3");
        System.out.println(s1);
        System.out.println(s1.haTipo("c1"));
        System.out.println(s1.haTipo("c2"));
        System.out.println(s1.uguali(s2));
        System.out.println(s1.uguali(s3));
        BloccoNote pref = new BloccoNote();
        pref.aggiungi("http://www.google.it", "GOOGLE", "Motore di ricerca");
        pref.aggiungi("http://www.amazon.com", "AMAZON", "Shop on-line");
        pref.aggiungi("http://www.yahoo.it", "YAHOO", "Motore di ricerca");
        pref.aggiungi("http://www.itunesstore.com", "ITUNES", "Shop on-line");
        pref.aggiungi("http://www.ebay.it", "EBAY", "Shop on-line");
        pref.aggiungi("http://www.repubblica.it", "REPUBBLICA", "Informazione");
        System.out.println(pref.quanteTipo("Motore di ricerca"));
        System.out.println(pref.quanteTipo("Shop on-line"));
        System.out.println(pref.quanteTipo("Pippo"));
        System.out.println(pref.quanteTipo("Informazione"));
        pref.stampaTipo("Shop on-line");
        pref.eliminaTipo("Shop on-line");
        pref.stampaTipo("Shop on-line");
        System.out.println(pref.quanteTipo("Motore di ricerca"));
        System.out.println(pref.quanteTipo("Shop on-line"));
        System.out.println(pref.quanteTipo("Informazione"));
        System.out.println(pref.haDuplicati());
        pref.aggiungi("http://www.google.it", "FUGOL", "Pastrocchio di rierca");
        System.out.println(pref.haDuplicati());
    }


}
