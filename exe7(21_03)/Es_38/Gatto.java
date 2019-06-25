package Es_38;

public class Gatto extends Animale{

	//COSTRUTTORI
	
	public Gatto(String s) {
		super(s);
	}
	//METODI
	@Override
	public void parla() {
		System.out.println("Miao");
		super.parla();
	}
	
	@Override
	public void incontra(Animale a) {
		if(a instanceof Topo) {
			System.out.println(nome+"<Ti prendo!>");
		}else {
			super.incontra(a);
		}
	}
	
}//end class Gatto
