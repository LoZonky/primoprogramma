package es_30;

import java.util.ArrayList;

public class negozio {
	//CAMPI
	private static int nNegoziCreate=0;
	private int ID_n;
	private String nome_neg;
	ArrayList<prodotto>lista_prodotti= new ArrayList<>();
	
	//COSTRUTTORI
	public negozio(String n) {
		this.nome_neg=n;
		ID_n=nNegoziCreate++;
	}
		//Aggiunta di un prodotto al negozio
	public String addProdotto(prodotto p) {
		for(prodotto r: lista_prodotti) {
			if(r.getID()==p.getID()) {
				r.addNum(p.getQuantity()); //aumento le scorte del prodotto con stesso id 
				return "Il prodotto è gia presente nell'elenco, aggiunta dirette alle scorte";
			}
		}
		this.lista_prodotti.add(p);
		return "Prodotto inserito";
	}
	public String getConto(clienti c) {
		
		return "";
	}
	
	public String getNome() {
		return this.nome_neg;
	}
}//fien class-negozio
