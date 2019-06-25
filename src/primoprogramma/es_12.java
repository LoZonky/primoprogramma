package primoprogramma;

import java.util.StringTokenizer;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

public class es_12 {

	public static void main(String[] args) {
		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out=new ConsoleOutputManager();
		String valori;
		
		valori=in.readLine("Inserisci le frazioni (num/den), separate da ';' : ");
	
		String[] vals= valori.split(";");
		for(String n: vals) {
			StringTokenizer test= new StringTokenizer(n,"/");
					//Frazione[] prova=new Frazione(Integer.parseInt(test.nextToken()),Integer.parseInt(test.nextToken()));
			Frazione a=new Frazione(Integer.parseInt(test.nextToken()),Integer.parseInt(test.nextToken()));
					//out.println(test.nextToken()+" e "+test.nextToken());
			out.println("Le frazioni inserite sono: "+a);
		}
	 
	//	StringTokenizer st= new StringTokenizer(valori, ";");
		// StringTokenizer st2 = new StringTokenizer(st, "/");
	//	while(st.hasMoreTokens()) {
	/*	println(st.nextToken()+" e "+st.nextToken()); */
			//out.println(st2.nextElement());
		}

	
	}//fine main


