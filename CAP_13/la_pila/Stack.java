package la_pila;

class EmptyStackException extends RuntimeException{}


public class Stack<E> {

	private static final int SIZE = 100;
	
	Object[] dati;
	private int top;
	
	public Stack() {
		dati = new Object[SIZE];  // se fai: new E[SIZE] Non puoi fare un generico array   | Con la supreclasse Object invece puoi 
 	}
	
	public void push(E e) {
		
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
	
}//end class Stack


//TODO Stack2 <E>
