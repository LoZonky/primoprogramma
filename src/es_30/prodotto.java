package es_30;

public class prodotto {
	//CAMPI
	private static int nProdottiCreate=0;
	private int ID_p;
	private int quantity;
	private double prezzo;
	
	//COSTRUTTORI
	public prodotto(int q, double p) { //creazione del prodotto
		this.quantity=q;
		this.prezzo=p;
		this.ID_p= nProdottiCreate++;
	}
	
	public int getID() {
		return this.ID_p; 
	}
	public int getQuantity() {
		return this.quantity;
	}
	public void addNum(int i) {
		this.quantity+=i;
	}
	
	
	
	
	
}//fine class-prodotto
