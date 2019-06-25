package primoprogramma;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class es_10 {

	public static void main(String[] args) {
		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out=new ConsoleOutputManager();
		int cont;
		String frase;
		frase=in.readLine("Inserisci una frase: ");
		for(char lett='a';lett<='z';lett++) {
			cont=0;
				for(int i=0;i<frase.length();i++) {
					if (lett==frase.charAt(i)) {
						cont++;
					}
				}
		if(cont!=0) {	
		out.println(lett+": "+ cont);
		}
		}
	}
}