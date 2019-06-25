package primoprogramma;

import java.util.Collections;
import java.util.Vector;
import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class es_13 {

	public static void main(String[] args) {
		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out=new ConsoleOutputManager();
		String valori;
		Vector<Integer> test=new Vector<>();

		valori=in.readLine("Inserisci i valori separati da ',' : ");
		String[] vals= valori.split(",");
		for(String n: vals) {
			test.add(Integer.parseInt(n));
		}
		
			out.println(test);
			
			
			
			
		//utilizzo di una libreria per invertire
	//	Collections.reverse(test);
	//	out.println(test);
	
	
	}//fine main

}
