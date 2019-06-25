package exe_4;

import java.util.ArrayList;

//ES 25
public class Studente {
	//CAMPI
	String nome, cognome,paese_res;
	double voto;
	ArrayList<Double> n_voti= new ArrayList<>();
	
	//COSTRUTTORI
	public Studente(String n,String c, String p) {
		this.nome=n;
		this.cognome=c;
		this.paese_res=p;
	}
	
	//METODI
	public void ins_voto(double x) {
		this.n_voti.add(x);
	}
	
	public double media() {
		double media=0.0;
		double cont=0.0;
		for( double r: this.n_voti ) {
			media+=r;
			cont++;
		}
		media=media/cont;
		return media;
	}
	
}//fine classe
