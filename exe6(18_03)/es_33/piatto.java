package es_33;

import java.util.ArrayList;
/** INDICO QUANTI PIATTI CI SONO */
public class piatto {
	//CAMPI
	private String id_P;
	private int quantity;
	private double prezzo;
	ArrayList<String>creaz_piatti= new ArrayList<>();
	
	//COSTRUTTORI
	public piatto(String s, int q, double p) {
		for(String l: this.creaz_piatti) {
			if(l.contentEquals(s)) {
				throw new RuntimeException("Il piatto è già presente"); //mando l'errore e mi esce automaticamente dal for
			}
		}//se esco dal for perchè non ho trovato un id già presente, aggiungo il piatto
		this.id_P=s;
		this.creaz_piatti.add(s);
		this.quantity=q;
		this.prezzo=p;
	}
	
	//METODI
	
	
	
}//end class-paitto
