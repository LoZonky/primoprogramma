package zoncamarco;

class Computer implements {
	int costo;
	@Override
	public int conto{
		return this.costo - costo;
	}
}


public class pilaComputer {

	class Nodo{
		Computer dato;
		Nodo prossimo;
	}
	
	Nodo cima = null;
	
	void push(Computer c) {
		Nodo newNodo = new Nodo();
		newNodo.dato=c;
		newNodo.prossimo= cima;
		cima = newNodo;
	}
	
	void print() {
		for(Nodo i = cima; i!= null; i=i.prossimo ) {
			
		}
	}
	
	Computer pop() {
		Computer dato = cima.dato;
		cima = cima.prossimo;
		return dato;	
	}
	
	boolean find(int costo) {
	for(Nodo i = cima; i!= null; i=i.prossimo ) {
			if (i.dato.costo == costo) {
				return true;
			}	
		}
	} 
}

public class zoncamarco{public static void main (String[] args) {
	pilaComputer pc = pilaComputer(); 


}
}