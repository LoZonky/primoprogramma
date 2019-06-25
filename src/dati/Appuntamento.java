package dati;

import prog.utili.Data;
import prog.utili.Orario;

public class Appuntamento {

	private String descrizione;
	private Data giorno;
	private Orario inizio, fine;

	public Appuntamento(String descr, Data day, Orario start, Orario end) {
		this.descrizione=descr;
		this.giorno=day;
		this.inizio=start;
		this.fine=end;
		
	}
	public void visualizza() {
		
	}
	
}
