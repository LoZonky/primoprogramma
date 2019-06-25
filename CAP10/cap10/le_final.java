package cap10;

class A {final void m() {}}

class B extends A{void m(){}} 		//NON posso ridefinire i metodi imposti come final (es: pagamento carta di credito )

class MyString extends String{}

final class Final{}

class NotSoFinal extends Final{} //NON posso estendere una classe messa come final

class persona{
	String name;
	persona(String s){name = s;}
	void changeName(String a) {this.name=a;}
	void getName() {}
}


public class le_final {
	//creazioni di costanti 
	static final String NAME = "Angelo";  //voglio che sia visibile a tutte le istanze -> #define NAME = "Angelo"
	static final int j=0;
	
	persona p1 = new persona("uno");
	persona p2 = new persona("due");
	persona p3 = new persona("tre");
	
	public static void main(String[] args) {
		final int X;
		final int Y=2;
		X=Y+2;
		final String P="pippo";
		System.out.println(X);
		
		P.toUpperCase();		//tento di modificargli i caratteri in maiuscoli, ma dato che è final non me lo permette 
		System.out.println(P);
		
		//In questo caso posso modificare l'oggetto ma non il riferimento 
    	final StringBuffer bf = new StringBuffer("angelo ");
		System.out.println(bf);
		bf.append("come stai? ");
		System.out.println(bf);
		
		
		
		
		
		
	}//fine main 

}
