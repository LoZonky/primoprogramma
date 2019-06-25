package Es_37;

public class prova {

	public static void main(String[] args) {
		Dipendente a=new Dipendente("Marco","Merrino",2,3);
		DipendenteResponsabile b= new DipendenteResponsabile("Anco", "Marzio", 60, 9, 1000);
		
		System.out.println(a.getStipendio());
		System.out.println(b.getStipendio());
	}
}
