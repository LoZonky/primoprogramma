package ricorsioni;

public class Ricorsioni {

	// n!= n*(n-1)*...
	static int fattoriale1(int n) {
		//con un ciclo for
		int risultato =1;
		for(int i=1; i<=n;i++) {
			risultato=risultato*i;
		}
		return risultato;
	}
	
	//VERSIONE RICORSIVA (semplice)
	// (Es) ordinamento / fibonacci
	// n! = n*(n-1)!
	static int fattoriale2(int n) {
		
		return n <= 1 ? 1 :  n*fattoriale2(n-1);
	}
	
	public static void main(String[] args) {
		
		System.out.println(fattoriale1(10));
		System.out.println(fattoriale2(10));
		
	}//end main
}
