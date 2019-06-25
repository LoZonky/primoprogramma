package es_29_Esercitazione14_03;

public class test_voli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
passeggero a=new passeggero("caciocavallo","Ajeje","Brazof",149.99,'E');
passeggero b=new passeggero("caciocavallo1","Luca","Giurato",149.99,'E');
passeggero c=new passeggero("caciocavallo2","Giacomo","Poretti",149.99,'E');
passeggero d=new passeggero("caciocavallo3","Giovanno","Storti",149.99,'E');
volo randazz=new volo("SucaM****","Figgep******",10,50);
		System.out.println(randazz.toString());
		System.out.println(randazz.AddPasseggero(a));
		randazz.AddPasseggero(b);
		randazz.AddPasseggero(c);
		randazz.AddPasseggero(d);
		System.out.println(randazz.ListaPasseggeri());
		System.out.println(randazz.calcPrezzo());
		System.out.println(randazz.removePass("caciocavallo1"));
		System.out.println(randazz.ListaPasseggeri());
	}

}
