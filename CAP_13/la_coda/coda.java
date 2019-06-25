package la_coda;

public class coda<E> {

		private class NodoCoda{
			E dato;
			NodoCoda pros;
			
			public NodoCoda(E e) {
				dato = e;
				
			}
			
		}//end class  NodoCoda
	
		NodoCoda primo, ultimo; // Ho due puntatori 
	
		coda(){
			primo = ultimo = null;  // Sconsigliata prima assegna null ad utlimo, poi primo è uguale a ultimo --> primo = ( ultimo = null ) 
		}
		
		// Sarebbe l'add all'ultimo elemento della coda
		void insert(E e) {
			NodoCoda n = new NodoCoda(e);
				// Se la lista è vuota
			if (primo == null) {
				primo = n;
				ultimo = n; // In caso puoi mettere anche fuori dal controllo if-else 
							// (dato che indipendentemente dal numero di elementi, ultimo punta sempre all'elemento inserito)
			} else {
				// lista non vuota 
				// collego il nuovo nodo all'ultimo di adesso
				ultimo.pros=n;
				ultimo=n;
			} 
		}
		
		@Override
		public String toString() {
			String result = "";
			for (NodoCoda i = primo; i != null; i = i.pros) {
				
				if(result.length() > 0) {
					result += ",";
				}
				result += i.dato; 
			}
			return result;
		}
		
		// Rimuovo l'elemento in testa alla lista 
		E remove() {
			// Se vuoto lancia eccezione
			if(primo==null) {
				throw new RuntimeException("Coda vuota !!!");
			}
			//
			E temp = primo.dato;
			primo = primo.pros;
			// controlla se la lista è ora vuota
			if(primo == null) {
				ultimo = null;
			}
			return temp;
			
		}
		
		
		
		
		
		
		
		// MAIN 
		public static void main(String[] args) {
			
			coda <String> nomi= new coda();
			// list_coda.insert();
			nomi.insert("A");
			nomi.insert("B");
			nomi.insert("C");
		System.out.println(nomi.toString());
				// prelievo dell'elemento in testa
			System.out.println(nomi.remove());
			System.out.println(nomi.remove());
			System.out.println(nomi.remove());
		}// end main
		
		
		
		
		
}//end class coda
