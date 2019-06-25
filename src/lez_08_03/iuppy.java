package lez_08_03;

import prog.utili.SequenzaOrdinata;

public class iuppy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="pippo";
	
		System.out.println(s.compareTo("pluto"));
		System.out.println(s.compareTo("inzaghi"));
		System.out.println(s.compareTo("pippo"));
	
		SequenzaOrdinata<String>nomi= new SequenzaOrdinata<>(); //Mette in ordine le Maiuscole, in ordine alfabetico, poi le minuscole in ordine alfabetico 
		nomi.add("VErcinge");
		nomi.add("Torige");
		nomi.add("AGamennoNE");
		nomi.add("aaa");
		nomi.add("AAA");
	
		System.out.println(nomi);
		
	}//FINE MAIN

	public int compareTo(String anotherString) {
		int x=0;
		return x;
	}
}
