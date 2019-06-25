package Prova_esame1;

enum postiDiPreferenza {
	FINESTRINO("FINESTRINO"), CORRIDOIO("CORRIDOIO"), INDIFFERENTE("INDIFFERENTE");
	//CAMPI
	String posto;
	//COSTRUTTORE
	postiDiPreferenza(String s){
		posto=s;
	}
	//METODI
	public String getNome() {
		return posto;
	}
	
	
}// end enum postiDiPreferenza
