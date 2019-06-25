package Prova_esame1;

import java.util.ArrayList;

public class prenotazione_gruppo extends prenotazione{
	//CAMPI
	ArrayList<String> listaPersone=new ArrayList<>();  //Formato = persona-costo 
	
	//COSTRUTTORI
	public prenotazione_gruppo(){
		super(); //per creare l'ID
		
	}
	
	//METODI
	/*
	 * @param n -> nome persona
	 * @param c -> prezzo biglietto
	 */
	public void addPersona(String n, double c) {
		listaPersone.add(n+"-"+c);
	}
	
	public double getCosto() throws Exception{
		//Sconto : fino a 10 persone -> 10% | se > 10 -> 20%
		if(listaPersone.isEmpty()) {
			throw new Exception("Errore: la lista del gruppo è vuota");
		}
		int cont=0;
		double tot=0.0;
		
		for(String x: listaPersone) {
			cont++;
			
			
			//tot+=x
		}
		
		return 1.1;
	}
}//end class prenotazione gruppo
