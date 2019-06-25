package es_33;

import java.util.ArrayList;

public class ristorante {
	//CAMPI
	ArrayList<tavoli>list_tavoli= new ArrayList<>();
	
	
	
	//COSTRUTTORI
	public ristorante() {}
	
	public void addTavolo(tavoli t) {
		for(tavoli x: list_tavoli) {
			if(x.getID()==t.getID()) {
				throw new RuntimeException("Tavolo già presente");
			}
		}
		this.list_tavoli.add(t);
	}
	
}//end class-ristorante

/**
 * 			ES PROF
 * 		
 * 	static int ntav=0;
 * 
 * 	public tav(){
 * 		id=ntav++;   //per gli id univoci
 * 	}
 * 
 * 
 * 
 * SE HO GIA UN TAVOLO
 * 
 * costruttore (int id){
 * 	//VOGLIO ECCEZIONE
 * 	//si memorizzano tutti gli id usati -> static vector<string> id_usati= new vector<>()
 * 	//e quando crei un tavolo lo aggiungi alla lista
 * if(id_usati.contains(id)){
 * 		
 * 		throws new RuntimeExceptions("ID GIA' USATO");
 * 	}
 * else{
 * aggiungi id}
 * }
 * 	
 */

