package es_33;

public class persone {
	//CAMPI
	private String nome,cognome;
	
	
	//COSTRUTTORI
	public persone(String n,String c) {
		this.nome=n;
		this.cognome=c;
	}
	
	//METODI
	public String getNome() {
		return this.nome;
	}
	public String getCognome() {
		return this.cognome;
	}
	
	
}//end class-persone
