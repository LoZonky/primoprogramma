package Esercitazione3;

import java.util.ArrayList;

import prog.io.FileInputManager;
import prog.utili.SequenzaOrdinata;
//PRIF HA CANNATO
public class es_18 {

	public static void main(String[] args) {
		//apro il file 
		FileInputManager file= new FileInputManager("La tigre della Malesia.txt");
		ArrayList<String> parole=new ArrayList<>();
		
		//leggo le righe del file
		while(true) {
			String s = file.readLine();
			if(s==null) {break;}
			//uso s
			String[] data=s.split(" ");
			for(String d: data) {
			
				parole.add(d.toLowerCase().trim()); //.trim()  serve per togliere gli spazi
			
			}
			
		}
		
		System.out.println(parole);
		
	}

}
