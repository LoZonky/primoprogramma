package Esercitazione3;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Quadrato;
import prog.utili.Rettangolo;

import java.util.ArrayList;

public class es_16 {

	public static void main(String[] args) {
		ConsoleInputManager in=new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		ArrayList<Rettangolo> figure= new ArrayList<>();
		int base, altezza;
		
	//Quando metti -1 l'inserimento dei dati FINSICE
	//se base e altezza sono uguali, costruisco un quadrato invece di un rettangolo 
	do {
		base=in.readInt("Inserisci la base: ");
		altezza=in.readInt("Inserisci l'altezza : ");
			
		if(base==-1 || altezza==-1) {break;}
		if(base==altezza) {		//VARIANTE A
					figure.add(new Quadrato(base));
			}
		figure.add(new Rettangolo(base,altezza));
		
	}while(base>0&&altezza>0);
	
	//Calcolo figura con area massima
	double maxArea=0;
	Rettangolo maxFigura=null;
	for(Rettangolo r: figure) {
		if(r.getArea()>maxArea) {
			maxArea=r.getArea();
			maxFigura=r;
		}
	}		
	//Calcolo figura con perimetro massimo VARIANTE B
	double max2P=0;
	Rettangolo maxPerimetro=null;
	for(Rettangolo r: figure) {
		if(r.getPerimetro()>max2P) {
			max2P=r.getPerimetro();
			maxPerimetro=r;
		}
		
	}
	out.print("La figura con il perimetro maggiore appartiene ad un: ");
	if (maxPerimetro instanceof Quadrato) {		//VARIANTE D
		out.println("Quadrato");
	}else {
		out.println("Rettangolo");
	}
	out.println(maxPerimetro.toString());
	
	out.print("La figura con l'area maggiore appartiene ad un: ");
	if (maxFigura instanceof Quadrato) {		//VARIANTE D
		out.println("Quadrato");
	}else {
		out.println("Rettangolo");
	}
	out.println(maxFigura.toString());
	//basta anche mettere solo maxFigura
//	out.println("La figura con l'area più grande è: "+ maxFigura.toString()+" con un area di: "+maxArea);
//    out.println("La figura con il perimentro più grande è: "+ maxPerimetro.toString()+". Con un perimetro di: "+max2P);
	}//fine main 

}
