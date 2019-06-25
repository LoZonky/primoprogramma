package Alberi;



/* 	DAL LIBRO (?)
 *
 * 	public class Albero<E extends Comparable<? super E>>{
 * 	private NodoAlbero a;
 * 
 * private class NodoAlbero{
 * 	E dato;
 * Albero<E> sx, dx;
 * }
 * ||COSTRUTORE
 public Albero() {
	 a=null;
 }
 * }
 * 
 * 
 * 
 */


/** albero di ricerca */
public class albero<E extends Comparable<E>> {
	
	private class NodoAlbero {
		
		E dato;
		albero<E> sx;
		albero<E> dx;
	
		public NodoAlbero() {}
		
	}// end class NodoAlbero

	NodoAlbero root;

	public albero()
	{
		root = null;
	}
	
	// Inserisci un elemento nell'albero ordinato
	public void insert(E e) {
		if(root == null) {
			root = new NodoAlbero();
			root.dato=e;
			root.sx=new albero();
			root.dx=new albero();
		} else {
			// Devo inserirlo in un sotto albero
			// root < e 
			if(root.dato.compareTo(e)<0) {
				// vado a destra 
				root.dx.insert(e);
			}else {
				// vado a sinistra
				root.sx.insert(e);
			}
		}
		
	} 
	
	
	@Override
	public String toString() {
		if(root==null) return "";
		
		String sx = root.sx.toString();
		String dx = root.dx.toString();
		
	//	return (sx.length() !=0 ? sx+ "<-" : "") + root.dato+(dx.length() != 0 ?  "->" + dx : "" );
	return sx + " " + root.dato + " " + dx ; 
	}
	
	/**
	 * Ricerca di un elemento nell'albero
	 * 
	 * @param e da cercare
	 * @return true se trovato
	 */
	public boolean trova(E e) {
		System.out.println("Ricerca di: "+ e);
		if(root == null) return false;
		// System.out.println("Sto cercando nel albero con radice:" + root.dato);
		int cmp = root.dato.compareTo(e);
		if(cmp == 0) return true;
		if (cmp < 0) // root < e 
			return root.dx.trova(e);
		else // rott > e
			return root.sx.trova(e);
	}
	
	
	public static void main(String[] args) {
		
		albero<Character> sigle= new albero();
		
		sigle.insert('G');
		sigle.insert('S');
		sigle.insert('A');
		sigle.insert('B');
		sigle.insert('H');
		sigle.insert('J');
		sigle.insert('P');
		sigle.insert('T');
		
		System.out.println(sigle.toString());
		
		System.out.println(sigle.trova('G'));
		System.out.println(sigle.trova('W'));
		System.out.println(sigle.trova('Z'));
		System.out.println(sigle.trova('L'));
		
	} // end Main
	
	
	
} // end class albero
