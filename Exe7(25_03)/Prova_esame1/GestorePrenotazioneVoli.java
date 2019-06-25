package Prova_esame1;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import prog.io.FileInputManager;

 public class GestorePrenotazioneVoli {
	//CAMPI
	String nomeFile ="PrenotazioneVoli.txt";
	FileInputManager ingresso = new FileInputManager(nomeFile);
	String riga;
	
	
	ArrayList<volo>Voli=new ArrayList<>(); 
	ArrayList<prenotazione>Prenotazioni=new ArrayList<>();
	
	// V-numeroDiAggiuntaVolo-ID_volo-Origine-Destinazione-Data-Ora-PostiMAX
	// P-numeroAssociatoAlVolo-ID_prenotazione-....TODO....
	
	/*
	 * FileInputManager ingresso= new FileInputManager(nomeFile);   //apertura del file .txt
			String riga;                                            //creo una stringa che contiene il conenuto di una riga del file 
			while((riga=ingresso.readLine())!=null) {
			...TODO...
			}
	 */
	
	//COSTRUTTORI
	public GestorePrenotazioneVoli() {}
	
	//METODI
	
	/* (1) Inserimento volo
	 *  @param v identifica il volo da inserire 
	 */
	public void addVolo(volo v) throws Exception{
		for(volo x: Voli) {
			if(x.getID()==v.getID()) {
				throw new Exception("Errore: ID del volo già esistente!");
			}
		}
		Voli.add(v);
	}
	
	/* (2) Inserimento di un volo (da/a per una certa data e ora)
	 * 
	 * @param v -> identifica il volo
	 * @param data -> la data del volo 
	 */
	public void addVolo(volo v, String data) {
		

	}
	/* (3)
	 * 
	 */
	public void addPrenotazione(prenotazione P) {
		//TODO inserimento di una prenotazione: data prenotazione e volo (tramite ID ), inserire la prenotazione. Se il volo è pieno sollevare un eccezione
	}
	
	public void addPersonaGruppo(int id_prenotazione) {
		//TODO aggiunta di una persona in una prenotazione collettiva (passata tramite ID)
		// se non c'è posto throw new Exception("");
	}
	
	public void stampaVoli() {
		/*TODO scrittura su file dei voli + prenotazioni + costi, MA prima di stampare ordinano in base a:
		* - Ordine di costo	
		* - Ordine alfabetico di ID 
		* Fai 2 metodi 
		* magari fai una funzione che stampa sul .txt (che non può essere chiamata) e i 2 metodi che ordinano la chiamano-> this.stampa
		*/
		
		
	}
	
	public void ordinaCosto() {
		//TODO sistemare l'array delle prenotazioni in base al costo per i singoli voli
	
		
		this.stampaVoli();
	}
	
	public void ordinaID() {
		//TODO sistemare l'array delle prenotazioni in base all'ID( alfabetico ) per i singoli voli
	
		
		this.stampaVoli();
	}
	
	//E se fai con un metodo astratto ?
	
	// Se fai un metodo privato che cerca il char dovresti diversificarli in base all'origine e destinazione 
	// potresti fare che gli passi un " char di controllo ":
	//	- O, per la ricerca dell'origine
	//  - D, per la ricerca della destianzione
	//
	
	private void cercaChar(char x) {
		
		switch(x) {
		case 'O': 
			//for cercando i campi Origine dei voli
			//If cercato -> if posti !=0 -> Sytem.out id volo + posti liberi + data + ora
			
			break;
		case 'D': 
			//for cercando i campi Destianzione dei voli
			 break;
		} 
	}
	
	public void cercaVoloOrigine() {
		//TODO ricerca di un volo tramite sigle di origine o destinazione () che non sia ancora pieno
		
	}
	
	public void cercaVoloDestinazione() {
		
	}
	
	
	
}//end class GestorePrenotazioneVoli
 
 
 /*
  * 	int c=0;
		while((riga=ingresso.readLine())!=null) {
			String[]s=riga.split("-");
			if(s[0].equals("V")) {
				c++;
				System.out.println(c);
				System.out.println(s[2]);
				if(Integer.parseInt(s[2])==v.getID()) {
					//true se gli ID sono identici
					throw new Exception("Errore: Il volo è già presente nella lista (ID identici)");
				}
			}
		}
		riga=printWriter.printf("V-"+c+"-"+v.getID());
		//riga="V-"+c+"-"+v.getID();
  * 
  *
  */
