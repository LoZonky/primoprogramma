package Es_38;

public class prova {
	public static void main(String[] args) {
		
		Animale n=new Animale("Cthulhu");
		Topo a= new Topo("Tom");
		Gatto b=new Gatto("Jerry");
		
		a.incontra(n);
		b.incontra(n);
		a.incontra(b);
		b.incontra(a);
		
	}//end main
}
