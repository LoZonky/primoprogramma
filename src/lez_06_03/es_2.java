package lez_06_03;

import java.util.ArrayList;

import prog.utili.Quadrato;
import prog.utili.Rettangolo;

public class es_2 {

	public static void main(String[] args) {
		/* DOMANDA SEQUENZA RETTANGOLI */

		//separiamo le figure con ";"
		//separiamo base e altezza con ","
	
		String dati= "8,9;8,10;7,7;1,10"; 
	ArrayList<Rettangolo> figure= new ArrayList<>();
	
	for(String figura: dati.split(";")) {
		String[] baseEaltezza= figura.split(","); 
			double base = Double.parseDouble(baseEaltezza[0]);
			double altezza = Double.parseDouble(baseEaltezza[1]);
		if(base==altezza) {
			figure.add(new Quadrato(base));
		}else {
			figure.add(new Rettangolo(base,altezza));
			}	
	}
	double maxArea=0;
	Rettangolo maxFigura=null;
	for(Rettangolo r: figure) {
		if(r.getArea()>maxArea) {
			//completalo..
		}
	}
	
	
	}//fine main

}
