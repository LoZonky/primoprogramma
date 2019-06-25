package lez_06_03;

import prog.utili.Quadrato;		//Libreria  per creare i quadrati 
import prog.utili.Rettangolo;	//Libreria per creare i rettangoli

/* USO DELLA GERARCHIA */

public class agamennone {

	public static void main(String[] args) {	
		Rettangolo r;
		if(Math.random()>0.5) {
			r = new Rettangolo(5,5);
			System.out.println(r.toString());
			System.out.println(r.getArea());
			System.out.println(r.getPerimetro());
		}else {
			r = new Quadrato(8);		//quadrato è una sottoclasse di rettangolo 
			System.out.println(r.toString());
			System.out.println(r.getArea());
			System.out.println(r.getPerimetro());
		}
	}

}
