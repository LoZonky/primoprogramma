package cap10;

class Persona {		void setName(String n) {}}

class Cantante extends Persona{
	void setName(String n) throws Exception {
		if (n.length() < 10 ) {throw new Exception();}
	}
	
}

public class UsoEcc {

	public static void main(String[] args) {
	Persona p = new Persona();
	p.setName("A");
	
	
	
	}//fine main
	
	
}
