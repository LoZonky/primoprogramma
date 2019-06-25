package primoprogramma;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class es_11_Split {
	public static void main(String[] Args) {
		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out=new ConsoleOutputManager();
		String valori;
		Double somma=0.0;
		Double media=0.0;
		int cont=0;
		
		valori=in.readLine("Inserisci i vari valori desiderati separati da '-' : ");
							/** UTILIZZO DI Split */
		String[] vals= valori.split("-");
		for( String n: vals) {		//Tipo_variabile nome_nuova_var : variabile_da_analizzare
			out.println(n);			//per le varie operazionie usi la nuova variabile
			somma+=Double.parseDouble(n);
			cont++;
		}
		out.println("La somma è: "+ somma);
		media=somma/cont;
		out.println("La media è: "+media);
	}//fine main
}
