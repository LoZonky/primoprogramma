package Es_38;

public class Topo extends Animale{

	//COSTRUTTORI
	public Topo(String s) {
		super(s);
		
	}
	//METODI
	@Override
	public void parla() {
		System.out.println("Squit");
		super.parla();
	}
	
	@Override	
	public void incontra(Animale a) {
		if (a instanceof Gatto) {
			
			System.out.println(nome+":<Aiuto!>");
		}else {
			super.incontra(a);
		}
	}
	
}//end class Topo
