package Es_36;

import java.util.ArrayList;

public class prova_figure_geometriche {

	public static void main(String[] args) {
	ArrayList<Figure_geometriche> list= new ArrayList<>();	
		
	Rettangolo a=new Rettangolo(1.0,2.0);
	Quadrato b=new Quadrato(3.0);
	Traingolo c1=new Traingolo(1.5);
	Traingolo c2=new Traingolo(1.2,2.8);
	Traingolo c3=new Traingolo(1.7,1.2,2.2);
	
	list.add(a);
	list.add(b);
	list.add(c1);
	list.add(c2);
	list.add(c3);
	
	System.out.println(list);
		
		
	}//fine main
	
}
