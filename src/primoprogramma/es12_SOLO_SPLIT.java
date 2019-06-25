package primoprogramma;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

public class es12_SOLO_SPLIT {

	public static void main(String[] args) {
		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out=new ConsoleOutputManager();
		String valori;
		Frazione prodotto=new Frazione(1,1);
		
		valori=in.readLine("Inserisci le frazioni (num/den), separate da ';' : ");
		
		String[] vals= valori.split(";");
		for(String n: vals) {
			String[] test=n.split("/");
			Frazione a=new Frazione(Integer.parseInt(test[0]),Integer.parseInt(test[1]));
			out.println("Frazione :"+a+" è stata inserita ");
			prodotto=prodotto.per(a);
		}	
		out.println(prodotto);
	}

}
