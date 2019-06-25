package es_31;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class num_int {

	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		int n;
		n = in.readInt("Inserisci un numero intero: ");
	//	Math.round(Math.random()*3) per ottenere un numero da 0 a 3 | Math.round() -> server per arrotondare 
		try {
		out.println(n/(int)Math.round(Math.random()*3));
		}catch(ArithmeticException ae) {
			out.println("Errore: non è possibile dividere per zero!");
		}
		
	}//fine main

}
