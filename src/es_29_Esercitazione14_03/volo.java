package es_29_Esercitazione14_03;

import java.util.ArrayList;

public class volo {
	//CAMPI
	String id_partenza, id_destinazione;
	int numPrimaC, numEcoC; 
	ArrayList<passeggero> lista_passeggeri=new ArrayList<>();
	
	//COSTRUTTORI				manca id univoco a voli e passeggeri
	public volo(String id_start,String id_end,int first,int eco) {
		this.id_partenza=id_start;
		this.id_destinazione=id_end;
		this.numPrimaC=first;
		this.numEcoC=eco;
	}
	
	public String toString() {
		return "Codice partenza: "+this.id_partenza+" | Codice destinazione: "+this.id_destinazione;
	}
			//stampo la lista di tutti i passeggeri
	public String ListaPasseggeri() {
		return "I passeggeri del volo sono: "+this.lista_passeggeri;
	}
			//inserimento del passeggerio al volo
	public String AddPasseggero(passeggero pass) {
		if(pass.tipo_classe=='P') {
			if(this.numPrimaC>0) {
				this.lista_passeggeri.add(pass);
				this.numPrimaC--;
				return "Inserimento in prima classe effettuato";
			}else {
				return "Errore inserimento: I posti in prima classe sono esauriti";
			}
		}
		if(pass.tipo_classe=='E') {
			if(this.numEcoC>0) {
				this.lista_passeggeri.add(pass);
				this.numEcoC--;
				return "Inserimento in classe economica effettuato";
			}else {
				return "Errore inserimento: i posti in classe economica sono esauriti";
			}
			
			}
		return"Errore inserimento: il tipo di biglietto non è compatibile con i posti presenti sul volo";	
		}
			
		public String removePass(String id) {
			boolean check=false;
			for(passeggero p: lista_passeggeri) {
				if(p.id_biglietto.contentEquals(id) ) {
				lista_passeggeri.remove(p);
				if(p.tipo_classe=='P') {this.numPrimaC++;}
				else {this.numEcoC++;} //non controllo che sia E perchè all'inserimento accetto solo char 'P' o 'E'
					check=true;
					//return "aio";
				break;
				}
			}
			if(check==true) {
				return "Il passeggero con id: "+id+" è stato tolto dal volo";
			}else {
				return "L'id inserito non è presente nei passeggeri del volo";
			} 
		} 
	
	
			//calcolo del prezzo volo
		public double calcPrezzo() {
			double tot=0.0;
			for(passeggero p: this.lista_passeggeri) {
				tot+=p.biglietto;
			}
			
			return tot;
		}	
	
	
	
	
}//fine classe volo

/*
 * 		esempio di come settare in modo univoco un ID (char + num che si incrementano...)
class Volo{
	private static int idNumero = 1;
	private static char idCarattere = 'A';
	private String id;
	Volo(){
		id = idNumero + ":" + idCarattere; 
		// incrementa i contatori per gli ID
		if (idCarattere == 'Z') {idCarattere = 'A'; idNumero++; System.out.println();}
		else idCarattere++;}
	public String toString() {return id;}
}
public class UsoIDAlfanumeri {
	public static void main(String[] args) {
		for(int i = 0; i < 100; i++) {
			Volo p1 = new Volo();
			System.out.print(p1 + " ");
		}
	}

}
 * 
 * 
 */
