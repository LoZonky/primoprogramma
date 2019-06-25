package primoprogramma;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class es_9 {

	public static void main(String[] args) {
		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out=new ConsoleOutputManager();
		String frase;	
		char caratt;
		frase=in.readLine("inserisci la frase:");
		numVocali(frase);
		caratt=in.readChar("Inserisci un carattere: ");
		checkVocale(caratt);
		
	}//fine main
	
	
	/*Funzione per conteggio delle vocali*/ 
	private static void numVocali(String s) {
		ConsoleOutputManager out=new ConsoleOutputManager();
		char c;
		int cont=0;
		for(int i=0;i<s.length();i++) {
			c=s.charAt(i);
			switch(c) {
			case 'a':cont++;
				break;
			case 'A':cont++;
				break;
			case 'e':cont++;
				break;
			case 'E':cont++;
				break;
			case 'i':cont++;
				break;
			case 'I':cont++;
				break;
			case 'o':cont++;
				break;
			case 'O':cont++;
				break;
			case 'u':cont++;
				break;
			case 'U':cont++;
				break;
			default:
				break;
	}
}
		out.println(cont);
}
	/*Funzione controllo vocale		*/
	private static void checkVocale(char c) {
		ConsoleOutputManager out=new ConsoleOutputManager();
		if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U') {
			out.println("Hai inserito una vocale");
			}	
		else {out.println("Hai inserito una consonante");
		}
	}
	}