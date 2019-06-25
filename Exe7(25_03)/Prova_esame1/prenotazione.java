package Prova_esame1;

import java.util.ArrayList;
import java.util.Random;

public class prenotazione extends GestorePrenotazioneVoli{
	//CAMPI
	private static final String char_list="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
	private static final int ID_length=6;
	
	private String ID;
	
	Random a= new Random();
	//COSTRUTTORI
	protected  prenotazione() {
		StringBuffer randomString = new StringBuffer();
		for(int i=0; i<ID_length;i++) {
			int n= getRandomNumber();
			char ch=char_list.charAt(n);
			randomString.append(ch);
		}
		this.ID=randomString.toString();
	}
	
	
	//METODI
	private int getRandomNumber() {
		int n=0;
		Random randomGenerator=new Random();
		n = randomGenerator.nextInt(char_list.length());
		if(n-1==-1) {
			return n;
		}else {
			return n-1;
		}
	}

	public String getID() {
		return this.ID;
	}
	
	
	
}//end class prenotazione
