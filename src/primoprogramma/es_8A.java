package primoprogramma;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class es_8A {

	public static void main(String[] args) {
	ConsoleInputManager in= new ConsoleInputManager();
	ConsoleOutputManager out=new ConsoleOutputManager();
	String frase;
	char c;
	frase=in.readLine("Inserisci una frase: ");
	out.println(frase.length());
	isVocale(out, frase);
	/* 	public static boolean(char c){ 
	 * if(c=='a'){
	 * isVocale ????
	 * }
	 * 
	 * 
	 * }
	 */
	
	}

	private static void isVocale(ConsoleOutputManager out, String frase) {
		char c;
		for(int i=0;i<frase.length();i++) {
			c=frase.charAt(i);
			switch(c) {
			case 'a':
				break;
			case 'A':
				break;
			case 'e':
				break;
			case 'E':
				break;
			case 'i':
				break;
			case 'I':
				break;
			case 'o':
				break;
			case 'O':
				break;
			case 'u':
				break;
			case 'U':
				break;
			default:
				out.print(c);
				break;
			}
		}
	}

}
