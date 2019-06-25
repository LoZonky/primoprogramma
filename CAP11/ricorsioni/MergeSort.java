package ricorsioni;

import java.util.Arrays;

public class MergeSort {
	//Ordina array a dalla posizione min a max
	static void mergeSort(int[] a, int min, int max) {
		
		if (min==max) {return;}
		
		//altrimenti scelgo un elemento in centro
		int middle =(max+min)/2;
		
		//ordiniamo gli elementi da min a middle
		mergeSort(a,min,middle);
		
		//ordino gli altri
		
		mergeSort(a,middle+1,max);
		//a questo punto gli elementi da mi a middle e da middle a max 
		//sono ordinati tra di loro nelle due parti
		merge(a,min,middle,max);
	}
	
	// assume a ordinato da min a middle e da middle+1 a max
	// merge gli elementi di a tramite merge da min a max
	private static void merge(int[]a, int min, int middle, int max) {
		//	Scorro i due sotto-array con "sx" e "dx"
		
		int sx=min, dx=middle+1;
		//array id supporto che conterrà gli elementi merged
		int temp[]= new int[max-min+1]; 
		
		for(int i=0; i< temp.length;i++) {
			//copio quello di sx se minore oppure 
			// ho copiato già tutti quelli di destra
			// ma non ho copiato ancora tutti quelli di sinistra
			if(dx >max ||(a[sx]<a[dx] && sx <= middle) ) {
				//copio a[sx] e avanzo sx
				temp[i]=a[sx];
				sx++;
			
			}else {
				//copio a[dx] e avanzo dx
				temp[i]=a[dx];
				dx++;
		
			}
		}
		//ricopio temp dentro a
		for(int i=0;i<temp.length;i++) {
			a[i+min]=temp[i];
		}
	}
	
	//per ordinare tutto quanto
	static void mergeSort(int[] a) {
			mergeSort(a,0,a.length-1);
		}
	public static void main(String[] args) {
	
		int[]a= {8,11,6,4,10,7,12,3,2,1,9,5};
		System.out.println(Arrays.toString(a));
		mergeSort(a);
		System.out.println(Arrays.toString(a));
	
	}//end main
}
