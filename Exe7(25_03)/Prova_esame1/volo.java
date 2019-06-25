package Prova_esame1;

import java.util.ArrayList;



public class volo extends GestorePrenotazioneVoli{
	//CAMPI
	private static int nVoliCreate = 1;

	private char origine [] = new char[3];
	private char destinazione []=new char[3];		//es) BGY
	private String data, ora;
	private int MAX_passeggeri, ID; //Id deve essere univoco
	ArrayList<prenotazione>lista_prenotazioni=new ArrayList<>();
	
	/*	Per controllare se esiste già l'ID devi aprire il file : "PrenotazioneVoli.txt"
	 * 
	 */
	
	
	//COSTRUTTORI
	
	/* Costruttore di un volo, con il passaggio di un ID
	 * 
	 * @param origin -> partenza del volo
	 * @param destination -> destinazione del volo
	 * @param date -> data
	 * @param time -> l'ora
	 * @param MAX_passenger -> numero massimo di passeggeri
	 * @param Id -> ID del volo da assegnarli 
	 */
	public volo(char[] origin,char[] destination,String date,String time,int MAX_passenger, int Id) throws Exception{	
		if(origin.length!=3||destination.length!=3) {
			throw new Exception("Errore: campo origine/destianzione non conformi");
		}
			this.origine=origin;
			this.destinazione=destination;
			this.data=date;
			this.ora=time;
			this.MAX_passeggeri=MAX_passenger;
			this.ID=Id;
	}
	/* Costruttore di un volo (che richiama il primo costruttore )
	 * 
	 * @param origin -> partenza del volo
	 * @param destination -> destinazione del volo
	 * @param date -> data
	 * @param time -> l'ora
	 * @param MAX_passenger -> numero massimo di passeggeri
	 */
	public volo(char[] Origin,char[] Destination,String Date,String Time,int MAX_Passenger) throws Exception{
		this(Origin, Destination, Date, Time, MAX_Passenger, nVoliCreate);
		nVoliCreate++;
	}
	
	//METODI
	
	public String toString() {
		return ""+this.origine[0]+this.origine[1]+this.origine[2]+" e id: "+this.ID+" posti: "+this.MAX_passeggeri;
	}
	
	public int getID() {
		return this.ID;
	}
	
	
}//end class volo
