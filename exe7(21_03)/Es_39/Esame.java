package Es_39;

public class Esame {
//CAMPI
	 String nome;
	 int voto;
	
//COSTRUTTORI
	 public Esame(String n, int v)throws Exception {
		 if(v<18||v>30) {
			 //Se il voto è minore di 18 o maggiore di 30 stampo errore
			 throw new Exception("Errore: voto non valido");
		 }else {
			 this.nome=n;
			 this.voto=v;
		 }
	 }
//METODI
	 
}//end class Esame
