package classeGeneriche;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



class Persona {

	
	
	static void ordinaBubbleSort(Persona a[]) {
		boolean scambiato;
		do {
			scambiato=false;
			for(int i=0;i<a.length;i++) {
				if(a[i].compareTo(a[i+1])>0) {
					//Scambio
					Persona temp= a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
					scambiato=true;
				}
			}
		}while(scambiato);
		}

	private int compareTo(Persona persona) {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class Ordinamenti {
	static void ordinaBubbleSort(int a[]) {
	boolean scambiato;
	do {
		scambiato=false;
		for(int i=0;i<(a.length-1);i++) {
			if(a[i]>a[i+1]) {
				//Scambio
				int temp= a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				scambiato=true;
			}
		}
	}while(scambiato);
	}
	
	static void ordinaBubbleSort(String a[]) {
	boolean scambiato;
	do {
		scambiato=false;
		for(int i=0;i<a.length;i++) {
			if(a[i].compareTo(a[i+1])>0) {
				//Scambio
				String temp= a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				scambiato=true;
			}
		}
	}while(scambiato);
	}
	//metodo generico
	//vincolo su tipo T generico
	
	static <T extends Comparable<T>>  void ordinaBubbleSort(T a[]) {
		
			boolean scambiato;
			do {
				scambiato=false;
				for(int i=0;i<a.length;i++) {
					if(a[i].compareTo(a[i+1])>0) {
						//Scambio
						T temp= a[i];
						a[i]=a[i+1];
						a[i+1]=temp;
						scambiato=true;
					}
				}
			}while(scambiato);
			
	} 
	
	public static void main(String[] args) {
		int[]a = {7,4,9,2,0,12};
		System.out.println(a);
		ordinaBubbleSort(a);
		System.out.println(a);

		//array -> lista
		String nomi[]= {"pippo","paudo","pappy","Peterzano"};
		List<String>listaNomi= Arrays.asList(nomi);
		System.out.println();
		Collections.sort(listaNomi);
		System.out.prontln(listaNomi);
	
		List<Figura>listaFigure=new ArrayList<>();
		Collections.sort(listaFigure);
	
	}//end main
}
