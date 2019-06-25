package Es_36;

public class Cerchio extends Figure_geometriche{
	//CAMPI
	double raggio;
	
	//COSTRUTTORI
	Cerchio(double r){this.raggio=r;}

	//METODI
	public double getArea() {
		return ((this.raggio*this.raggio)*Math.PI);
	}
	public double get2P() {
		return (this.raggio*(2*Math.PI));
	}

}//end class Cerchio
