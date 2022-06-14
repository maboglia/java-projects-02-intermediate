/**
 * Created by mauro on 03/03/16.
 */
public class BloccoNote {


    private Annotazione[] note;

    public BloccoNote() {
        this.note = new Annotazione[0];
    }

    public void aggiungi(String u, String d, String c) {
        Annotazione s = new Annotazione(u, d, c);
        Annotazione[] nuovi = new Annotazione[this.note.length + 1];
        nuovi[0] = s;
        for (int i = 1; i < nuovi.length; i++)
            nuovi[i] = this.note[i - 1];
        this.note = nuovi;
    }

    public int quanteTipo(String c) {
        int count = 0;
        for (int i = 0; i < this.note.length; i++)
            if (this.note[i].haTipo(c))
                count++;
        return count;
    }

    public void stampaTipo(String c) {
        for (int i = 0; i < this.note.length; i++)
            if (this.note[i].haTipo(c))
                System.out.println(this.note[i]);
    }

    public void eliminaTipo(String c) {
        int quanti = this.quanteTipo(c);
        Annotazione[] nuovi = new Annotazione[this.note.length - quanti];
        int cursor = 0;
        for (int i = 0; i < this.note.length; i++) {
            if (!this.note[i].haTipo(c)) {
                nuovi[cursor] = this.note[i];
                cursor++;
            }
        }
        this.note = nuovi;
    }

    public int quanteAnnotazioni() {
        return this.note.length;
    }

    public boolean haDuplicati() {
        for (int i = 0; i < this.note.length; i++)
            for (int j = 0; j < this.note.length; j++)
                if (i != j)
                    if (this.note[i].uguali(this.note[j]))
                        return true;
        return false;
    }
}
