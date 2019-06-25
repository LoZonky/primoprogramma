package Es_36;

public class Quadrato extends Rettangolo{
	//CAMPI
	double lato;
 
	//COSTRUTTORI
	Quadrato (double l){
		super(l,l);
	}
	
	//METODI
	public double getArea() {
		
		return (this.lato*this.lato);
	}
	public double get2P() {
		return (this.lato*4);
	}
}
