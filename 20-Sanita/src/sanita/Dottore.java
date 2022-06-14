package sanita;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Dottore extends Paziente implements Medico{
	private String matricola;
	private List pazienti = new LinkedList();
	
	public Dottore(String matricola, String nome, String cognome, String cf) {
		super(nome,cognome,cf);
		this.matricola = matricola;
	}

	public Collection getPazienti() {
		Collections.sort(pazienti);
		return pazienti;
		// alternativamente per mantenere l'ordinamento
//		LinkedList l = new LinkedList(pazienti);
//		Collections.sort(l,new Comparator(){
//
//      public int compare(Object arg0, Object arg1) {
//        Persona primo = (Persona)arg0;
//        Persona secondo = (Persona)arg1;
//        //....
//        return 0;
//      }
//								});
//		return l;
	}

	public void addPaziente(Paziente p) {
		pazienti.add(p);
	}

	public String getMatricola(){
		return matricola;
	}
}
