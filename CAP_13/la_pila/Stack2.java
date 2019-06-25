package la_pila;



//TODO ...

public class Stack2<E> {

	private static final int SIZE = 100;
	
	Object[] dati;
	private int top;
	
	public Stack2() {
		dati = new Object[SIZE];  // se fai: new E[SIZE] Non puoi fare un generico array   | Con la supreclasse Object invece puoi 
 	}
	
	public void push(E e) {
		// Se l'array è già pieno
		if (top>=dati.length) {	
			// ingrandisco l'array
			// 1. creo uno più grande
			Object[] newArray= new Object[dati.length + SIZE];
			// 2. copio gli elementi in dati
			for(int i=0; i<dati.length; i++ ) {
				newArray[i]= dati[i];
			}
			//sostituisco l'array orgininale con quello nuovo
			dati = newArray;
		}
		dati[top]= e;
		top++;
	}
	
	public E pop() {
		
		//Se la pila è vuota non posso fare il pop
		if (top==0) throw new EmptyStackException();
		top--;
		return (E) dati[top];
	}
	
	
	public static void main(String[] args) {
		
		Stack<Integer> numeri = new Stack<>();
		Stack<String> nomi = new Stack<>();
		numeri.push(5);
		numeri.push(50);
		numeri.push(500);
		System.out.println(numeri.pop());
		System.out.println(numeri.pop());
		System.out.println(numeri.pop());
	
	}//end main
}
