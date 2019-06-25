package Prova_esame1;

public class prenotazione_individuale extends prenotazione{
	//CAMPI
	private String persona;
	private double costo;
	postiDiPreferenza postoPreferito;
	
	//COSTRUTTORI
	/*
	 * @param p -> persona 
	 * @param c -> costo
	 * @param s -> preferenza del posto
	 */
	public prenotazione_individuale(String p, double c, String s){
		super(); //Così creo l'ID
		this.persona=p;
		this.costo=c;
		this.postoPreferito= postiDiPreferenza.valueOf(s);
		
	}
	//METODI
	public String getInfo() {
		return "| "+this.getID()+" | "+ "Persona: "+ persona+" |costo: "+this.costo+" |preferenza di posto: "+postoPreferito;
	}
	
}//end class prenotazione_individuale
