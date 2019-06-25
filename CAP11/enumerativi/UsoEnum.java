package enumerativi;

import java.util.Arrays;

enum GiornoSettimana {

	LUN(8),MAR(8),MER(8),GIO(8),VEN(8),SAB(0),DOM(0); //Non posso crearne di nuovi!
	//int h;   <------!!!!Non puoi creare variabili!!! o forse si.... TODO guarda libro
	
	//CAMPI
	int numeroOreLavorative;  //per arrichire l'enumarativo con dei dati
	
	// !ATTENZIONE! non puoi fare dei costruttori per gli enumerativi del tipo | new costr(a,b,c) |
	
	//Quando costruisco un giorno della settimana, viene chiamato in automatico questo costruttore
	GiornoSettimana(int n) {
		numeroOreLavorative=n;  //E devo aggiungere ai giorni il loro valore---> LUN(intero)
	}
	
	
	//RIDEFINIRE IL TOSTRING 
	@Override
	public String toString(){
		switch(this) {
		case LUN: return "Lunedì"; 
		case MAR: return "Martedì"; 
		case MER: return "Mercoledì"; 
		case GIO: return "Giovedì"; 
		case VEN: return "Venerdì"; 
		case SAB: return "Sabato"; 
		case DOM: return "Domenica";
		
		default: return "Errore: altro giorno";
		}
		//throw new Exception("Non so che giorno sia");
	}
	//NUOVI METODI
	String mood() {
		switch(this) {
		case LUN: return "Maledettih"; 
		case MAR: return "2balls"; 
		case MER: return "A facc ro'cazz"; 
		case GIO: return "ole ole ola"; 
		case VEN: return "Daje"; 
		case SAB: return "Hype"; 
		case DOM: return "Depresso";
		
		default: return "Errore: insesistente";
		}
	}
	
	//restituisce il giorno successivo
	GiornoSettimana domani() {
		//Invece di fare lo switch...
		
		int indiceDiOggi=this.ordinal();
		//Se è domenica va fuori dall'array---> faccio il modulo
		int indiceDiDomani=(indiceDiOggi+1) % values().length; 
		GiornoSettimana domani= values()[indiceDiDomani];
		return domani;
		
	}
	
}//end enum GiornoSettimana

class UsoEnum{
	public static void main(String[] args) {
		GiornoSettimana oggi=GiornoSettimana.VEN;
		//nome
		System.out.println(oggi.name());
		//ordinale
		System.out.println(GiornoSettimana.LUN.ordinal());
		//comparable
		System.out.println("Oggi è sabato ? ");
		System.out.println(oggi.compareTo(GiornoSettimana.SAB)>0);
	
		//Stampo i possibili valori di GiornoSettimana
		System.out.println(GiornoSettimana.values());
		System.out.println(Arrays.toString(GiornoSettimana.values()));
	
		//da un intero ad un enum
		//esempio: 0 -> LUN
		GiornoSettimana primoGiorno =GiornoSettimana.values()[0];
	
		
		
	}//end main
	
	
}