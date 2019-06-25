package Es_40;

public class prova {

	public static void main(String[] args) throws Exception {
		
		
		Motorino a=new Motorino("Cielestinorosapallido","Piaggio: Antonacci",10.5);
		MotorinoImmatricolato i=new MotorinoImmatricolato("Verdognolo", "OTO Melaria: Centauro", 20.7, 130.0, "B1C37Y");
		
		
		a.accelera(12);
		//a.inserisciAntifurto();
		a.accelera(3.4);
		
		i.accelera(300);
		
		System.out.println(i.getVelocita());
		
		
	}//end main
}
