package Es_38;

public class Animale {
	//CAMPI
	protected String nome;
	
	//COSTRUTTORI
	public Animale(String s){
		nome = s;
	}
	
	//METODI
	public String comeTiChiami() {
		return nome;
	}
	public void parla() {}

	public void incontra(Animale a) {
		System.out.println(nome+":<Ciao, "+a.nome+">");
		parla();
	}
	
	
}//end class Animale
	

