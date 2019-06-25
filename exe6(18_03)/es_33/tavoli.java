package es_33;

import java.util.ArrayList;

public class tavoli {
		//CAMPI
	private static int nTavoliCreate=0; 
	private int id_T;
	private int n_posti;
	ArrayList<piatto>list_piatti=new ArrayList<>();
	ArrayList<persone>list_persone=new ArrayList<>();
	ArrayList<Integer>creaz_tav=new ArrayList<>();
		
		//COSTRUTTORI
	public tavoli(int n) {
		this.n_posti=n;
		this.id_T=nTavoliCreate++;
		this.creaz_tav.add(this.id_T);
	}
	public tavoli(int i, int n) {
		for(Integer l: creaz_tav) {
			if(l==i) {
				throw new RuntimeException("tavolo già esistente");
			}
		}
		this.id_T=i;
		this.creaz_tav.add(i);
		this.n_posti=n;
	}
	public int getID() {
		return this.id_T;
	}
	
	//METODI
		public void addPerson(persone p) {
			for(persone x: list_persone) {
				if((x.getNome()).equals(p.getNome())&&(x.getCognome()).equals(p.getCognome())){
					throw new RuntimeException("La persona è già presente al tavolo");
				}
			}
			this.list_persone.add(p);
		}
		public void addPiatto(String s, int q) {
			//faccio in modo che i clienti chiedano il piatto e venga scalato dalla disponibilità
		for()	
		
		
		}
	
	
}//end class-tavoli
