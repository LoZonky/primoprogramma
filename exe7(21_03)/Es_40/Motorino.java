package Es_40;

public class Motorino {
	//CAMPI
	String colore,tipo;
	protected double velocity;
	private boolean antifurto=false;
	
	
	//COSTRUTTORI
	public Motorino(String c, String t, double v) {
		this.colore=c;
		this.tipo=t;
		this.velocity=v;
	}
	
	
	//METODI
	public  double getVelocita() {
		return this.velocity;
	}
	public void accelera(double addV) throws Exception {
		if(!this.antifurto) {this.velocity+=addV;}
		else {throw new Exception("Antifurto attivo!");}
	}
	public void inserisciAntifurto() {
	 this.antifurto=true;	
	}
	public void togliAntifurto() { 		//A differenza di maffi, voglio usare nuovamente la moto
		this.antifurto=false;
	}
}//end class Motorino
