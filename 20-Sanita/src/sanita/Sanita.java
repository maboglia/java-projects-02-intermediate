package sanita;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Sanita {

  private Map persone = new HashMap();
  private Map medici = new HashMap();

  public void aggiungiPersona(String nome, String cognome, String cf) {
    Paziente p = new Paziente(nome, cognome, cf);
    persone.put(cf, p);
  }

  public Persona getPersona(String cf) throws ErrPersonaInesistente {
    Paziente p = (Paziente) persone.get(cf);
    if (p == null)
      throw new ErrPersonaInesistente();
    return p;
  }

  public void aggiungiMedico(
    String matricola,
    String nome,
    String cognome,
    String cf) {
    Dottore m = new Dottore(matricola, nome, cognome, cf);
    medici.put(matricola, m);
    persone.put(cf, m);
  }

  public Medico getMedico(String matricola) throws ErrMedicoInesistente {
    Dottore m = (Dottore) medici.get(matricola);
    if (m == null)
      throw new ErrMedicoInesistente();
    return m;
  }

  public void assegnaMedico(String matricola, String cf)
    throws ErrPersonaInesistente, ErrMedicoInesistente {
    Dottore m = (Dottore) getMedico(matricola);
    Paziente p = (Paziente) getPersona(cf);
    m.addPaziente(p);
    p.setMedico(m);
  }

  public int caricaDati(String nomeFile) throws IOException {
    BufferedReader in = new BufferedReader(new FileReader(nomeFile));
    String line;
    int numLinee = 0;
    int countLinee = 1;
    while ((line = in.readLine()) != null) {
      try {
        StringTokenizer st = new StringTokenizer(line, ";");
        String tipo = st.nextToken();
        if (tipo.toUpperCase().equals("P")) {
          String nome = st.nextToken().trim();
          String cognome = st.nextToken().trim();
          String cf = st.nextToken().trim();
          this.aggiungiPersona(nome, cognome, cf);
        } else {
          String mat = st.nextToken().trim();
          String nome = st.nextToken().trim();
          String cognome = st.nextToken().trim();
          String cf = st.nextToken().trim();
          aggiungiMedico(mat, nome, cognome, cf);
        }
        numLinee++;
      } catch (NoSuchElementException nse) {
        System.err.println(
          "Errore: mancano informazioni:" + nomeFile + "(" + countLinee + ")");
      }
      countLinee++;
    }
    return numLinee;
  }
}
