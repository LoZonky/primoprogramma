package Es_39;

import java.util.ArrayList;

public class Studente extends Persona{
//CAMPI
	private Integer matricola;
	ArrayList<Esame>listaEsami=new ArrayList<>();
	private int mediaVoti;
	int fascia;
	
	//Vorrei sapere il registro delle matricole per evitare di avere dei "doppioni"
	// ArrayList<Integer>lista_matricole=new ArrayList<>();   
	 
//COSTRUTTORI
	public Studente(String n, String c, Integer m) {
		super(n,c);
		this.matricola=m;
	}
	
//METODI

/*
	public void insFascia(int i) throws Exception{
		if(i>1)
	}
*/
	
	public void addEsame(Esame e) throws Exception{
		for(Esame x: listaEsami) {
			if(x.nome.equals(e.nome)) {
				//Se trovo che ci sono degli esami con lo stesso nome stampo errore
				throw new Exception("Errore: Esame già presente");
			}
		}
		//Se non vengo buttato fuori dal for{}, inserisco l'esame
		listaEsami.add(e);
	}
	public void calcoloMedia()throws Exception {
		if(listaEsami.size()==0) {
			throw new Exception("Errore: Lo studente non ha conseguito nessun esame");
		}
		int count=0;
		int med=0;
		for(Esame x: listaEsami) {
			med+=x.voto;
			count++;
		}
		this.mediaVoti=med/count;
	}
	
	public void getTasse(int f, double MAX) throws Exception{
		if(MAX<0) {throw new Exception("Errore: importo non valido");}
		switch(f) {
				// TODO togliere i vari try{}catch...
		case 1:
			try {
			System.out.println(MAX-((MAX*50)/100));
			}catch(ArithmeticException ae) {}
			break;
		case 2: try {
			System.out.println(MAX-((MAX*35)/100));
			}catch(ArithmeticException ae) {}
			break;
		case 3: 
			try {
			System.out.println(MAX-((MAX*25)/100));
			}catch(ArithmeticException ae) {}
			break;
		case 4: 
			try {
			System.out.println(MAX-((MAX*10)/100));
			}catch(ArithmeticException ae) {}
			break;
		case 5: 
			System.out.println(MAX);
			break;
		default: throw new Exception("Errore: fascia non valida");
		}
	}
	
	public void getTasse(double MAX) throws Exception{
		if(MAX<0) {throw new Exception("Errore: importo non valido");}
		switch(mediaVoti) {
		case 30: 
			System.out.println(MAX-((MAX*10)/100));
			break;
		case 29:
			System.out.println(MAX-((MAX*8)/100));
			break;
		case 28: 
			System.out.println(MAX-((MAX*6)/100));
			break;
		case 27: 
			System.out.println(MAX-((MAX*4)/100));
			break;
		
		default: System.out.println(MAX);
		}
	}
}//end class Studente
