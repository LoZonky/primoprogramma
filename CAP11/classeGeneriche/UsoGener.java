package classeGeneriche;

class Coppia<G,K>{
	G primo;
	K secondo;
	
	Coppia(G p, K s){
		
	}
	
}//end Coppia

class MioArray<T>{
	
}

public class UsoGener {
	public static void main(String[] args) {
		Coppia<String,Integer> c1; //c1-> primo sarà una String, c1-> secondo sarà un int
		
	/*	//Se non metto il costruttore devo dare in questo modo:
		c1 = new Coppia(); //Se primo e secondo fossero private, non potrei modificarle
		c1.primo="Analisi II";
		c1.secondo=27;
	*/	
		c1=new Coppia("Analisi II", 27);
	
		MioArray<String> lo;
		MioArray<Integer> lo1;
		
		
		
		
	}//end main
}
