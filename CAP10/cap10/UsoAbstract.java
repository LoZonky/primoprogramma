package cap10;

// classe animale che rappresenta gli animali
// che possono essere o Gatti o Cani
// non voglio animali che non siano ne cani ne gatti

abstract class Animale{
	//tutti gli animali hanno un nome 
	String nome; //lo metto nella superclasse cosi verrà ereditato dalle sottoclassi (Gatto e Cane)
	
	protected Animale(String na) {nome=na;}
	
} //se una classe è astratta non posso chiamare un costruttore !

class Gatto extends Animale {
	Gatto(String ng){super(ng);} 
	
}

class Cane extends Animale {
	Cane(String ng){super(ng);} 		//con super vado a richiamare il costruttore che passa una stringa 
	
}

public class UsoAbstract {

}
