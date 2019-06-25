package la_coda;



public class lista_ordinata<E extends Comparable<E>>  {


	private class NodoLista{
		E dato;
		NodoLista pros;
		public NodoLista() {}
		
		public NodoLista(E e) {
			dato = e;
			
		}
		
	}//end class  NodoCoda

	NodoLista inizio, ultimo; // Ho due puntatori 

	lista_ordinata(){
		inizio = ultimo = null;  // Sconsigliata prima assegna null ad utlimo, poi primo è uguale a ultimo --> primo = ( ultimo = null ) 
	}
	
	/**
	 *  Inserimento di un elemento alla lista ordinata
	 * 
	 * @param e elmento da inserire
	 * @param p puntatore 
	 * @param q puntatore, precedente a p
	 */
	void insert(E e) {
		// scorro la lista fino a che trovo il primo p > di e
		
		NodoLista p = inizio;
		NodoLista q = null; // q rimarrà sempre 1 nodo indietro rispetto a p
		
		while(p!= null && p.dato.compareTo(e) < 0) {
			q = p;
			p=p.pros;
		}
		
		NodoLista n = new NodoLista();
		n.dato = e;
		n.pros= p;
		if (q==null) inizio= n;
		else q.pros=n;
	
	}

	@Override
	public String toString() {
		String result = "";
		for (NodoLista i = inizio; i != null; i = i.pros) {
			
			if(result.length() > 0) {
				result += ",";
			}
			result += i.dato; 
		}
		return result;
	}
	
	/**
	 * Trova un elemento nella lista ordinata
	 * 
	 * @param e elemento da trovare
	 * @return  true, se trovato
	 */
	
	private boolean trova(E e) {
		for (NodoLista i = inizio; i != null; i = i.pros) {
		//NON sfrutta ordinamento -> if (i.dato.equals(e)) return true;	
		int comp = i.dato.compareTo(e);
		System.out.println("Confronto "+e+" con "+ i.dato);
		if(comp==0) return true;
		else if (comp > 0) return false;
		
	}
	return false;
	}
	
	
	
	
	
	
	
	// Rimuovo l'elemento in testa alla lista 
	
	
	
	
	
	
	
	
	// MAIN 
	public static void main(String[] args) {
		
		lista_ordinata <String> nomi= new lista_ordinata();
		
		nomi.insert("C");
		nomi.insert("A");
		nomi.insert("B");
		nomi.insert("M");
		nomi.insert("T");
		
		System.out.println(nomi.toString());
			// Ricerca nella lista degli elementi  ( NON POSSO FARE RICERCA DICOTOMICA, puoi solo cercare in sequenza )
		System.out.println(nomi.trova("Z"));
		System.out.println(nomi.trova("C"));
		System.out.println(nomi.trova("D"));
		System.out.println(nomi.trova("N"));
		
	}// end main
	
	
	
	
	
}
