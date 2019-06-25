package ricerca_array;

public class ricerca {

	
	/*
	 * @param a
	 * @param chiave
	 * @return posizione della chiave se presente, -1 altrimenti 
	 * 
	 */
	//Prima versione di cerca (LIBRO)
	static int cerca1(int[]a, int chiave) {
		int index=-1;
		for(int i=0; i<a.length;i++) {
			if(a[i]==chiave) {
				index=i;
				break; //return i;
			}
		}
		return index;
	}
	//V2 prof
	public static int cerca2(int [] a, int chiave) {
		
		boolean trovato = false;
		int i;
		
		for(i=0;i<a.length && !trovato;i++) {
			if (chiave== a[i]) {
				trovato=true;
			}
		}
		
		if(trovato) {
			return i-1;
			}else {
			return -1;
			}
	}
	
	//Nel caso l'array sia ordinato
	 static int cercaInOrdinato(int [] a, int chiave) {
		int index=-1;
		for(int i=0; i<a.length;i++) {
			if(a[i]==chiave) {
				index=i;
				break; //return i;
			}
			else if(a[i]>chiave) {
				break; //return i;
			}
		}
		return index;
	}
	 //Ricerca DICOTOMICA
	 
	 
static int cercaInOrdinatoDic(int [] a,  int chiave) {
		 return cercaInOrdinatoDic(a, 0, a.length-1, chiave);
	 }
	 
	 //cerca chiave in a tra low e high (compreso)
	 static int cercaInOrdinatoDic(int [] a,int high, int low,  int chiave) {
		 System.out.println("cerca"+ chiave+" da "+low+" a "+high+" in "+a);  //TODO stampare l'array -> [2, 4, 6, 9, 11, 14, 28] 
		 //caso base: l'array è vuoto
		 if(low>high) return -1;  //TODO stampa sempre -1?
		 //prende l'elemtento in mezzo nella parte in cui cercare chiave
		 int middle = (high+low)/2;
		 //Se l'elemento in mezzo è la chiave, ho finito
		 if(a[middle]==chiave) return middle;
		 //altrimenti cerco a Sx o Dx?
		 if (a[middle]>chiave) {
			 //Cerca a sinistra (ad esemptio chiave=2 | a[middle]=100)
			 return cercaInOrdinatoDic(a, low, middle-1, chiave);
		 }else {
			 return cercaInOrdinatoDic(a, middle+1, high, chiave);
		 }
	 }
	
	 
	 
	 
	 
	 
	 public static void main(String[] args) {
		int a[]= {2,4,6,9,11,14,28};
		System.out.println(a);
		System.out.println(cercaInOrdinatoDic(a, 4));
		System.out.println(cercaInOrdinatoDic(a, 28));
	 }
}//end class ricerca
