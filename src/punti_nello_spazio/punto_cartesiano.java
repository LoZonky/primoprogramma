package punti_nello_spazio;

public class punto_cartesiano {
	//CAMPI
	private double x,y;
	//COSTRUTTORI
	public punto_cartesiano(double x, double y) {
		this.x=x;
		this.x=y;
	}
	double getx() {
		return this.x;
	}
	double gety() {
		return this.y;
	}							   	   //	       /|			
	double getR() {					  //          / |
		return Math.sqrt(x*x+y*y);   //          /  |
	}								//	        /	| y
	double getTheta() {			   //	       /    |
		return Math.atan(y/x);	  //     	  /     |
		                         //  theta-> /______|
	}							//               x	
	
}//fine punto_cartesiano
