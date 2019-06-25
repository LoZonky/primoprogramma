package cap10;

/**
 * 								Persona
 * 								   |
 * 								Studente
 *  							   |
 * 							  Studente_uni
 * 
 * @author utente
 *
 */


class Persona{
	String nome;
	Persona(String n){
		nome=n;
	}
}//end-Persona

class Studente extends Persona{
	String corso;
	Studente(String n, String c){
		super(n);	//chiamo il costruttore della superclasse
		corso= c;
	}
	
	void sp() {
		System.out.println(nome);
		}
	
	String dati() {
		return nome + corso;
	} 
	
}//end-Studente

class Studente_uni extends Studente{
	long matricola;
	Studente_uni(String n, String c, long m){
		//chiamo il costruttore della classe che estende (Studente, ma Studente estende Persona) passando:
		// > nome(per il costruttore di Persona) 
		// > corso(per il costruttore di Studente )
		super(n,c);
		matricola=m;
		//@override
	}
	String dati(int h) {
		return matricola;
	}//end-Studente_uni
/*
	Studente_uni(String n, String c){
		
	}
*/
	
}//end-Studente_uni

public class University {
	
	
	public static void main(String[] args) {
		Studente_uni piero =new  Studente_uni("Piero","Gestionale",1090909);
		piero.sp();
	
	
	}//fine main
	
}//end-University
