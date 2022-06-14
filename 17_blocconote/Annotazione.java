/**
 * Created by mauro on 03/03/16.
 */
public class Annotazione {

    private String testo;
    private String descrizione;
    private String tipo;

    public Annotazione(String u, String d, String c) {
        this.testo = u;
        this.descrizione = d;
        this.tipo = c;
    }


    public boolean haTipo(String c1) {
        return this.tipo.equals(c1);

    }

    public boolean uguali(Annotazione s2) {
        return this.testo.equals(s2.testo);

    }
    public String toString() {
        return this.tipo + " - " + this.descrizione + ", " + this.testo ;
    }
}
