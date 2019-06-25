package Es_37;

public class DipendenteResponsabile extends Dipendente{
	double bonus;
	
	//COSTRUTTORI
	public DipendenteResponsabile(String n, String c, int o, int r,double b) {
	super(n,c,o,r);
	this.bonus=b;
	}
	
	//METODI
	@Override
	public double getStipendio() {
		
		return (super.getStipendio()+this.bonus);
	}

}//end class DipendeteResponsabile
