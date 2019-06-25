package Prova_esame1;

public class prova_GestoreVoli {

	public static void main(String[] args) throws Exception {
		char ab []= {'B','G','Y'};
		char av []= {'A','B','C'};
	//	char[] abb= {'A','B','C','D'};  //Se i char non sono esattamente 3 -> da errore
		
		 volo b=new volo(ab,av,"23/..","12..",150,12);
		 volo a=new volo(ab,av,"23/..","12..",130,60);
		 volo c=new volo(ab,av,"23/..","12..",130);
		 volo d=new volo(ab,av,"23/..","12..",130);
		 volo e=new volo(ab,av,"23/..","12..",130);
		 volo f=new volo(ab,av,"23/..","12..",130);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		
		GestorePrenotazioneVoli g= new GestorePrenotazioneVoli();
		g.addVolo(a);
		//g.addVolo(a);
	/*	
		prenotazione test1= new prenotazione();
		prenotazione test2= new prenotazione();
		prenotazione test3= new prenotazione();
		prenotazione test4= new prenotazione();
		System.out.println("1: "+test1.getID()+ " |2: "+test2.getID()+" |3: "+test3.getID()+" |4: "+test4.getID());
		*/
		
		
		prenotazione_individuale m=new prenotazione_individuale("Anco", 12.40,"CORRIDOIO");
		System.out.println(m.getInfo());
		
		
		
		
		
		
		
		
		
		
	}//end main
	
	
}
