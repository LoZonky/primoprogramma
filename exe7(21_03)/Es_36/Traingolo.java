package Es_36;

public class Traingolo extends Figure_geometriche{
	//CAMPI
	double latA,latB,latC;

	//COSTRUTTORI
	Traingolo(double l){
		this.latA=l;
		this.latB=l;
		this.latC=l;
	
	}
	Traingolo(double l1, double l2){
		this.latA=l1;
		this.latB=l2;
		this.latC=l2;
		
	}
	Traingolo(double l1, double l2, double l3){
		this.latA=l1;
		this.latB=l2;
		this.latC=l3;
	}
	
	//METODO
	public double getArea() {
		double p=get2P()/2;
		return (Math.sqrt(p*(p-this.latA)*(p-this.latB)*(p-this.latC)));
	}
	public double get2P() {
		return (this.latA+this.latB+this.latC);
	}
	
}//end class Triangolo
