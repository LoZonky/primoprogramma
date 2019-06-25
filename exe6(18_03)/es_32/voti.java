package es_32;

import java.util.ArrayList;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class voti {

		
	
	public static void main(String[] args) {
		
		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		String voti;
		ArrayList<Integer>list_voti= new ArrayList<>();
		int cont=0;
		int MAX=0, med=0;
		
		voti=in.readLine("Inserisci i voti separati da ';': ");
		String[]s=voti.split(";");
		
			for(int i=0;i<s.length;i++) {
				try {
					
						if(Integer.parseInt(s[i])<18||Integer.parseInt(s[i])>30)
						{
							
							throw new RuntimeException("Voto non valido") ;
						}else{
							cont++;
							list_voti.add(Integer.parseInt(s[i]));
							if(Integer.parseInt(s[i])>MAX) {
								MAX=Integer.parseInt(s[i]);
							}
							med+=Integer.parseInt(s[i]);
						}
				}catch(RuntimeException re) {out.println("carr");}
			}
		med/=cont;
		out.println("Lista voti: "+list_voti);
		out.println("Voto massimo: "+MAX+"| media: "+med);
	}//fine main

}

/**
 * 	Le eccezioni hanno una gerarchia, ma possiamo definire delle nuove eccezzioni:
 * 	"Estendendo" un classe che vogli estendere
 * 
 *  class MyArithmeticExceptio extends ArithmeticExceptions(){
 *  	//TODO 
 *  }
 * 	RuntimeException-->non è controllata (QUINDI SE CREO DELLE SOTTOCLASSI CHE LA ESTENDONO NON SARANNO CONTROLLATE)
 *  
 * 
 * 
 * 
 */
