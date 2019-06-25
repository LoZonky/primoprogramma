package liste_dinamiche;



public class pilaDinamica<E> {

	// INNER CLASS or NESTED CLASS  !!! (Posso creare una classe dentro un'altra classe)
	 private class Nodo<E>{
		E dato;
		Nodo<E> pros;  // struttura dati ricorsiva (quando ha nei suoi campi: utilizza se stessa )
		
	}//end class Nodo
	
	 private Nodo cima;
	 
	 pilaDinamica() {
		 cima = null;		 
	 }
	 
	 boolean isEmpty() {
		 return cima == null;
	 }
	 
	 void push (E e) {
		 // costruisci un nuovo nodo
		 Nodo newNodo = new Nodo();
		 newNodo.dato=e;
		 //metti il pros del nuovo nodo
		 newNodo.pros= cima;
		 // cambia la cima
		 cima = newNodo;
	 }

	 /*  TODO...
	 E pop() {
		 E result = cima.dato;
		 
	 }
	 */
	 
	 public String toString() {
		 String result ="";
		 for (Nodo i = cima; i != null; i=i.pros) {
			 result += "->" + i.dato;
		 }
		 return result;
	 }
	 
	 public static void main(String[] args) {
		 pilaDinamica<String> nomi = new pilaDinamica<>();
		 // nomi.push(A); System.out.println(nomi.toString());
	     // nomi.push(B); System.out.println(nomi.toString());
		 // nomi.push(C); System.out.println(nomi.toString());

	 
	 }
	 
	 
}//end class pilaDinamica
