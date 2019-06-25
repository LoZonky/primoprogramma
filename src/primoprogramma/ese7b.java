package primoprogramma;

import prog.io.ConsoleOutputManager;
import prog.io.ConsoleInputManager;

public class ese7b {

	public static void main(String[] args) {
		int N,i;
		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out=new ConsoleOutputManager();
		N= in.readInt("Inserisci l'intero: ");
		i=1;
		while(i<N) {
			out.println(i+" | "+(N*i)+" | "); // N*i(fino ad N) | risultato |
			i++;
		}
	}

}
