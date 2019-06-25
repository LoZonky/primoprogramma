package exe_4;
//ES 22

public class Parallelogramma {
	//CAMPI
	double D,d,p;	//D = diagonale maggiore / d = diag. minore / p = angolo (tra diag. maggiore e l'orizzonte)
	
	//COSTRUTTORI
	public Parallelogramma (double diag_magg, double diag_min, double angl) {
		this.D=diag_magg;
		this.d=diag_min;
		this.p=angl;
	}
	
	public Parallelogramma(double diag, double angl) { //se diag_magg=diag_min
		this(diag, diag, angl);
	}
	
	//METODI
	public String calc_lati() {
		double latA=0.0,latB=0.0;
		double radianti=0.0;
		radianti=Math.toRadians(this.p);
		
		
		
		return "i lati sono rispettivamente"+latA+" e "+latB;
	}
	
	
	
	
	
}//fine classe 
