package Es_36;

public class Rettangolo  extends Figure_geometriche{
	//CAMPI
	double base, altezza;
	
	//COSTRUTTORI
	Rettangolo(double b, double h){
		this.base=b;
		this.altezza=h;
		
	}
	
	//METODI
	public double getArea() {
		return (this.base*this.altezza);
	}
	public double get2P() {
		return ((this.base+this.altezza)*2);
	}
	
}
