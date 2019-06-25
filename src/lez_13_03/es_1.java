package lez_13_03;

import prog.utili.Quadrato;
import prog.utili.Rettangolo;

public class es_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		es_1 e=new es_1();
		System.out.println(e.toString());
		
		Rettangolo r=new Rettangolo(7,8);
		Quadrato q=new Quadrato(3);
		
		Object o = (Rettangolo)r;
		
		System.out.println(o.toString());
		/* q=(Rettangolo)r; //non puoi convertire un Quadrato (sottoclasse) a Rettangolo (superclasse) */
		
		r=(Quadrato)r;
		
		
		
		
	}//fine main

}
