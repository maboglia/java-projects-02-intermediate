package bottega;

import java.util.ArrayList;

public class Bottega {
	private String nome;
	private String nomeBottegaio;
	private String indirizzo;
	private String telefono;
	private String sitoWeb;
	private double incasso;
	private ArrayList<Prodotto> prodotti;
	
	public Bottega(String n, String nb) {
		nome = n;
		nomeBottegaio = nb;
		// creo i prodotti
		creaProdotti();
	}
	
	private void creaProdotti() {
		prodotti = new ArrayList<Prodotto>();
		// uso il metodo .add per inserire gli elementi nella lista
		prodotti.add(new Prodotto("Sale", 0.5));
		prodotti.add(new Prodotto("Pepe", 2));
		prodotti.add(new Prodotto("Pasta", 1.20));
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String n) {
		nome = n;
	}
	
	public String getNomeBottegaio() {
		return nomeBottegaio;
	}
	
	public void setNomeBottegaio(String nb) {
		nomeBottegaio = nb;
	}
	
	public String getIndirizzo() {
		return indirizzo;
	}
	
	public void setIndirizzo(String i) {
		indirizzo = i;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String t) {
		telefono = t;
	}
	
	public String getSitoWeb() {
		return sitoWeb;
	}
	
	public void setSitoWeb(String w) {
		sitoWeb = w;
	}
	
	public double getIncasso() {
		return incasso;
	}
	
	public void setIncasso(double i) {
		incasso = i;
	}
	
	public void elencaProdotti() {
		for (int i = 0; i < prodotti.size(); i++) {
			Prodotto p = prodotti.get(i); // equivale a prodotti[i] con l'array
			int pos = i + 1;
			System.out.println(pos + ") " + p.getNome() + " - € " + p.getPrezzo());
		}
	}
	
	public Prodotto vendiProdotto(int posizione) {
		int i = posizione - 1;
		Prodotto p = prodotti.get(i);
		incasso = incasso + p.getPrezzo();
		// rimuovo il prodotto dalla lista
		prodotti.remove(i);
		return p;
	}
	
	public void nuovoProdotto(Prodotto p) {
		prodotti.add(p);
	}
}
