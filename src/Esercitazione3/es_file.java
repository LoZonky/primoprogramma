package Esercitazione3;
/** IL FILE DEVE STARE NELLA CARTELLA DEL PROGETTO JAVA (primoprogramma)*/

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.io.FileInputManager;


public class es_file {

	public static void main(String[] args) {
		ConsoleInputManager in= new ConsoleInputManager();
		String nomeFile ="La tigre della Malesia.txt";//indico come si chiama il file
		ConsoleOutputManager out=new ConsoleOutputManager();
		int contA=0,contE=0,contI=0,contO=0,contU=0;
		
		if(FileInputManager.exists(nomeFile)) {
			FileInputManager ingresso= new FileInputManager(nomeFile);//apertura del file .txt
			String riga; //creo una stringa che contiene il conenuto di una riga del file 
			while((riga=ingresso.readLine())!=null) {  //esco dal while quando 
				for(int i=0;i<riga.length();i++) {
					switch(riga.charAt(i)) {
					case'a':contA++;
						break;
					case'A':contA++;
						break;
					case'e':contE++;
						break;
					case'E':contE++;
						break;
					case'i':contI++;
						break;
					case'I':contI++;
						break;
					case'o':contO++;
						break;
					case'O':contO++;
						break;
					case'u':contU++;
						break;
					case'U':contU++;
						break;
						
					}
				}//fine for di riga
				
				
			}//fine while
		}//fine if fileInput
		out.println("Vocale a: "+contA); //88210
		out.println("Vocale e: "+contE); //81375
		out.println("Vocale i: "+contI); //73297	
		out.println("Vocale o: "+contO); //66145
		out.println("Vocale u: "+contU); //22928
		
	}//fine main
}
