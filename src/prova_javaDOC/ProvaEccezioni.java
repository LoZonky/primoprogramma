package prova_javaDOC;

public class ProvaEccezioni {

	public static void main(String[] args) {
		double x=Math.PI/0;
		System.out.println(x); //no ecc.
		//int y= 9/0
		//char c = "pippo".charAt(10);
	//	int h[]= {5,6,7,8};				//crea un oggetto che ti indica dove sta l'errore 
		// System.out.println(h[4]);   //per evitare metti dei controlli 
		// svantaggio : numero elevato di controlli
	
	//prendi un numero R intero tra 0 e 4, dividi  
	//dividi 10/R e stampalo, se avviene un eccezione AE(ArithmeticException) stampa errore
		int R=(int)Math.round(Math.random()*5);			//MAth.random() va da zero a 1 (quindi double)
		int h[]= {5,6};
		try {
		System.out.println(10/R);		//Se mi esce 0 mi da eccezione
		System.out.println(h[R]/R);
		}catch(ArithmeticException ae) {
			System.out.println("non posso dividere per zero");
		}
		catch(ArrayIndexOutOfBoundsException oob) {  //Conviene dare il nome che identifichi il tipo di errore OutOfBounds => oob
			System.out.println("elementi fuori dall'array");
		}
		System.out.println("finito");
	}//fine main

}
