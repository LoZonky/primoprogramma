package primoprogramma;

import java.util.StringTokenizer;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class es_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out=new ConsoleOutputManager();
		String valori;
		Double somma=0.0;
		Double media=0.0;
		int cont=0;
		
		valori=in.readLine("Inserisci i vari valori desiderati separati da '-' : ");
		
						/** UTILIZZO DI StringTokenizer */
		/*Suddivido una stringa in sottostringhe (detti token) e faccio la somma */
		StringTokenizer st= new StringTokenizer(valori, "-");
		while(st.hasMoreTokens()) {
			somma =somma + Double.parseDouble(st.nextToken()); //converto il token in un double
			cont++;
		}
		out.println(somma);
		media=somma/cont;
		out.println("La media è: "+media);
	
	}//fine main

}
