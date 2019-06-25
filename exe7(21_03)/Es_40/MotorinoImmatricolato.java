package Es_40;

public class MotorinoImmatricolato extends Motorino{
	//CAMPI
	
	double maxVelocita; //deve essere maggioredi velocità, altrimenti sollevi un eccezione e assegni a maxV il valore di velocità 
	String targa;
	
	//COSTRUTTORI
	
	public MotorinoImmatricolato(String c, String t, double v, double max, String targ) throws Exception {
			super(c,t,v);
		//try {
				if(getVelocita()>max) {
					this.maxVelocita=v;
					throw new Exception("Velocità MAX < velocità attuale");
				}else{
					this.maxVelocita=max;
					this.targa=targ;
				}
		//	}catch(Exception e){System.out.println("mancanza dati");}
		}

	//METODI
	
	public void getMax() {
		System.out.print(this.maxVelocita);
	}
	
	@Override
	public void accelera(double addV) {
		double s=addV+velocity;
		if(s<this.maxVelocita) {
			velocity=s;
			//super.accelera(addV);
		}else {
			velocity=this.maxVelocita;
		}
		
	}
	
}//end class MotorinoImmatricolato
