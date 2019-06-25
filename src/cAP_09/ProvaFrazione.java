package cAP_09;

public class ProvaFrazione {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frazione f = new Frazione ("1/2");
		Frazione x=new Frazione (3,12);
		x.per(f);
		System.out.println(x);
	
		Frazione a=new Frazione(2,4);
		Frazione b=new Frazione("1/2");
	
		System.out.println(a.equals(b));  //equals viene ereditato MA NON GUARDA IL CONETNUTO DELLA FRAZIONE SE SONO UGUALI
	
	
	
	
	
	
	
	
	}//FINE MAIN

}
