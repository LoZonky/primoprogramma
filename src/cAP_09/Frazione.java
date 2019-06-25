package cAP_09;

public class Frazione {
		//CAMPI
	private int num;
	private int den;
		//COSTRUTTORI
	public Frazione(int n, int d) {
		//num=n;den=d;
		int resto;
		int a = num, b=den;
		do {
			resto= a%b;
			b=resto;
			
		}while(resto!=0);
		this.num=n/a;
		this.den=d/b;
	
	}
	public Frazione(int n) {
		//num=n;den=1;
		this(n,1);//chiamo il primo costruttore di frazione, perchè gli passo 2 interi: num,(den=1)
	}
	public Frazione(String s) {
		String[]dati=s.split("/");
		num=Integer.parseInt(dati[0]);
		den=Integer.parseInt(dati[1]);
	}
	//PER STAMPARE
	public String toString() {
		// num/den
		return num+"/"+den; //  Stampa: z	
		}
	public Frazione per(Frazione f) {			//retun du una frazione 	
			//num è una variabile locale(temporanea) POICHE' è privata	
			//this.num = è il num della frazione creata in precedenza 
			//f.num= numeratore della frazione passata 
				
		int num=this.num * f.num;
		int den= this.den * f.den;
		return new Frazione(num,den);
	}
	
	//CONFRONTO TRA FRAZIONI (equals())
	
	public boolean equals(Frazione f) { 
		return this.num*f.den==f.num*this.den;
	}
	
	
}//fine class Frazione

