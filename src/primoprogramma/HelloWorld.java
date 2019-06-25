package primoprogramma;

import prog.io.ConsoleOutputManager;
import prog.io.ConsoleInputManager;
import prog.utili.Frazione;		//Importo la libreria delle frazioni

public class HelloWorld {
	public static void main(String[] args) {
		int a,b;
		boolean state=true;
		//System.out.println("Hello world!");
		ConsoleInputManager in = new ConsoleInputManager();
		//String frase = in.readLine("Inserisci una frase: "); 		
		ConsoleOutputManager out=new ConsoleOutputManager();
		//frase.concat("istoh");
		//out.println(frase);
		//String str="WEWE";
		//frase=frase + " ISTOOOH";
		//out.println(frase);
	
		/* FRAZIONI */
		//Frazione prima= new Frazione(1,3);
		//Frazione seconda= new Frazione(2,3);
		//Frazione somma = prima.piu(seconda);		//somma
		 //out.println("La somma è: "+ somma);
		//Frazione prodotto = prima.per(seconda);		//prodotto
		//out.println("Il prodotto è: "+ prodotto);
	
				/* ESERCIZIO 5 */
		Frazione sums= new Frazione(0,1);
		Frazione conta= new Frazione(0,1);
		Frazione incremento=new Frazione(1,1);
		do {
			conta=conta.piu(incremento);
			a=in.readInt("Numeratore: ");
			b=in.readInt("Denominatore: ");
			Frazione count= new Frazione(a,b);
			sums = count.piu(sums);
		}while(state = in.readSiNo("Vuoi inserire un'altra frazione?  "));
		out.println("La media è: "+ sums.diviso(conta));
	}

	private static Frazione Frazione(int conta, int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
