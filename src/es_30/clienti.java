package es_30;

import java.util.ArrayList;

public class clienti {
	//CAMPI
	private static int nClientiCreate=0; 
	private int ID_c;
	private String nome_C,cognome_C;
	//faccio in modo che il cliente prenda ID e quantità, per il riconoscimento del prezzo ci deve pensare il negozio 
	//se prendo anche i prezzi, per ottenere il conto-> for(lista_spesa) {cont+=lista_spesa.getprezzo(); } return cont;
	ArrayList<String>Lista_spesa=new ArrayList<>(); 
	
	//COSTRUTTORI
	public clienti(String n, String c) {
		this.nome_C=n;
		this.cognome_C=c;
		this.ID_c=nClientiCreate++;
	}
		//aggiunta di prodotto alla lista della spesa
	public String addListaSpesa(int id, int quantita, negozio n) {
		for(prodotto l: n.lista_prodotti) {
			if(l.getID()==id) {
				if(quantita>l.getQuantity()) {
					return "Non è presente la quantità desiderata";
					//Potrei fare in modo che il cliente prenda il prodotto anche se la quantità non basta
					//		this.Lista_spesa.add(id+"|"+l.getQuantity())
					//      return "prese le scorte disponibili: "+l.getQuantity;
				}else {
					this.Lista_spesa.add(n.getNome()+"|"+id+"|"+quantita);
				}
			}
		}
		return "il prodotto con id: "+id+", non è presente nel negozio";
	}
	//riduione dei proddotti dalla lista della spesa
	public String riduciListaSpesa(int id, int q) {
		for(String l: this.Lista_spesa) {
			String[]s=l.split("|");
			if(Integer.parseInt(s[1])==id) {
				if((Integer.parseInt(s[2])-q)<0) {
					this.Lista_spesa.remove(l);
					return "Prodotto tolto dalla lista della spesa (dovrebbe essere errore, ma io lo interpreto come togliere l'intero prodotto dalla lista)";
				}else {
				s[2]=""+(Integer.parseInt(s[2])-q);
				return "Riduzione prodotto effettuata";
				}
			}	
		}
		return "Il prodotto da rimuovere non è presente nella lista della spesa";
	}
	//remove prodotto dalla lista della spesa
	public String removeListaSpesa(int id) {
		for(String l: this.Lista_spesa) {
			String[]s=l.split("|");
			if(Integer.parseInt(s[1])==id) {
				this.Lista_spesa.remove(l);
				return "Rimozione del prodotto dall lista della spesa";
			}
		}	
		return "Il prodotto inserito non è presente nella lista della spesa";
	}
	
	//conto
	public String getConto() {
		
		return "";
	}
	
	public static void main(String[] args) {
		System.out.print(""+1);
	}
}//fine class-clienti
