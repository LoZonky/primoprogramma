package exe_4;
//ES 21

public class ContoCorrente {
	/* CAMPI */
	
	long num_conto;
	String nome_prop;
	int importo_iniz;

	/* COSTRUTTORI */
/*	
 public ContoCorrente(int conto, String nome, int prelev) {
	 
	 
	 this.importo_iniz=-prelev;
 }*/

	
	
	public void preleva(long conto, String nome, int prelev) { //da rifare
		
		this.importo_iniz=-prelev;
	}
	
	public void versa(long conto, int vers) { //da rifare
		
		this.importo_iniz+=vers;
	}
	
	public String tostring(long conto) { //da rifare 
		return "Il suo importo è: "+this.importo_iniz;
	}
 
}//fine classe
