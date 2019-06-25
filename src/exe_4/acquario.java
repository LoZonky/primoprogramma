package exe_4;

import java.util.ArrayList;
//ES 27
public class acquario {
		
	String vasca;
	ArrayList<pesce> pesci=new ArrayList<>();
	
	//COSTRUTTORI
	public acquario(String v) {
		this.vasca=v;
	}
	
	//METODI
	public void ins_pesce(pesce a) {
		
		pesci.add(a);
		
	}
	
	public void delete(String id) {
	//id è univoco
	for(pesce p: pesci) {
		
	}
}
	
	public String toString() {
		return "contiene :"+this.pesci;
	}
	
}
