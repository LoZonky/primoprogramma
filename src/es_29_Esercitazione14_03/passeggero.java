package es_29_Esercitazione14_03;

public class passeggero {
		//CAMPI
	String id_biglietto, nome, cognome;
	double biglietto;
	char tipo_classe;		//'P': prima classe , 'E': economia
	
		//COSTRUTTORI
	public passeggero(String ticket,String name, String surname, double price, char typeT) {
		this.id_biglietto=ticket;
		this.nome=name;
		this.cognome=surname;
		this.biglietto=price;
		this.tipo_classe=typeT;
	}

	public String toString() {
		return "\n"+"Nome: "+this.nome+" | Cognome:  "+this.cognome+"\n";
	}






}//fine class passeggero 


/**
*	esempio del prof per id univoco (un numero che si incrementa...) 
*		class Persona{
	private static int nPersoneCreate = 0;
	private int id;
	private String nome;
	Persona(String nome){id = nPersoneCreate++; this.nome = nome;}
	public String toString() {return id + ":" + nome;}
}
public class UsoIDUnivoco {
	public static void main(String[] args) {
		Persona p1 = new Persona("piero");
		Persona p2 = new Persona("paolo");
		Persona p3 = new Persona("giovanni");
		System.out.println(p1 + "\n" + p2 + "\n" + p3);
	}

}
*
*
*
*
*
*/
