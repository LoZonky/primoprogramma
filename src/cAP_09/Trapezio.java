package cAP_09;
//ES 23

public class Trapezio {
	//CAMPI
	double B,b,h; //B = base magg, b = base min, h = altezza 
	
	//COSTRUTTORI
	public Trapezio(double magg, double min, double alt) {
		this.B=magg;
		this.b=min;
		this.h=alt;
	}
	
	//METODI
	public double getArea() {
		double area=0.0;
		area=((this.B+this.b)*this.h)/2;
		return area;
	}
	public double getPerimetro() {
		double perim=0.0;
		double lato;
		lato=Math.sqrt(Math.pow(((this.B+this.b)/2),2.0)+Math.pow(this.h, 2.0));
		perim=this.B+this.b+(lato*2);
		return perim;
	}
	
}//fine classe
