package Esercitazione3;

import prog.io.FileInputManager;
import prog.utili.SequenzaOrdinata;

public class es_18ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputManager file=new FileInputManager("La tigre della Malesia.txt");
		
		SequenzaOrdinata<String> parole= new SequenzaOrdinata<>();
		
		//leggo le righe del file
		while(true) {
			String s = file.readLine();
			if(s==null) {break;}
			//uso s
			String[] data=s.split(" ");
			for(String d: data) {
			
				parole.add(d.toLowerCase().trim());
			
			}
			
		}
		
		System.out.println(parole);
		
	}
		

}
