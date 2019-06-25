package Esercitazione3;
/**
Struttura:
> R,b,h per il rettangolo, con "b" base e "h" altezza
> Q,l per il quadrato, con "l" lato
> C,r per il cerchio, con "r" raggio

La separazione da una figura all'altra ";"
es) Q,3;R,5,8.7;C,0.5
*/

import java.util.ArrayList;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Cerchio;
import prog.utili.Quadrato;
import prog.utili.Rettangolo;


public class es_17 {

	public static void main(String[] args) {
		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		String ins;
		ArrayList<Object>Inserimenti=new ArrayList<>();	//Lista delle forme inserite

		ins=in.readLine("Inserisci le figure: ");
		String[]vals=ins.split(";");	//separo la stringa  ";" ---> |Q,3| |R,5,8.7| |C,0.5| 
		for(String r: vals) {		//scorro tutto il contenuto di vals
			String[]Forme=r.split(",");
			switch(Forme[0]) {
				case "R":
					Inserimenti.add(new Rettangolo(Double.parseDouble(Forme[1]),Double.parseDouble(Forme[2])));
					break;
				case "Q":
					Inserimenti.add(new Quadrato(Double.parseDouble(Forme[1])));
					break;
				case "C":
					Inserimenti.add(new Cerchio(Double.parseDouble(Forme[1])));
					break;
			}
		}//fine for di vals
		
	//ricerca area e perimetro maggiore maggiore + dati
	ricercaAreaPerimetro(out, Inserimenti);
	}//fine main

	private static void ricercaAreaPerimetro(ConsoleOutputManager out, ArrayList<Object> Inserimenti) {
		Double maxArea=0.0;
		Double max2P=0.0;
		Object maxA=null;
		Object maxP=null;
			for(Object x: Inserimenti) {
				if(x instanceof Rettangolo) {
					if(((Rettangolo) x).getArea()>maxArea) {
						maxArea=((Rettangolo) x).getArea();
						maxA=x;
					}
					if(((Rettangolo) x).getPerimetro()>max2P) {
						max2P=((Rettangolo) x).getPerimetro();
						maxP=x;
					}
				}
				if(x instanceof Quadrato) {
					if(((Quadrato) x).getArea()>maxArea) {
						maxArea=((Quadrato) x).getArea();
						maxA=x;
					}
					if(((Quadrato) x).getPerimetro()>max2P) {
						max2P=((Quadrato) x).getPerimetro();
						maxP=x;
					}
				}
				if(x instanceof Cerchio) {
					if(((Cerchio) x).getArea()>maxArea) {
						maxArea=((Cerchio) x).getArea();
						maxA=x;
					}
					if(((Cerchio) x).getPerimetro()>max2P) {
						max2P=((Cerchio) x).getPerimetro();
						maxP=x;
					}
				}
			}//fine for Inserimenti
			out.println("max Area: "+maxArea+" con "+maxA);
			out.println("max Perimetro: "+max2P+" con "+maxP);
	}

}
