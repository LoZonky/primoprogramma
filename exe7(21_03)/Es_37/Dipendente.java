package Es_37;

public class Dipendente {
	//CAMPI
	String Nome, Cognome;
	int oreLavorativeMensili, retribuzioneOraria;
	
	//COSTRUTTORI
	public Dipendente(String n, String c, int o, int r){
		this.Nome=n;
		this.Cognome=c;
		this.oreLavorativeMensili=o;
		this.retribuzioneOraria=r;
	}
	
	//METODI
	public double getStipendio() {
		return (this.oreLavorativeMensili*this.retribuzioneOraria);
	}
	
}//end class Dipendete
