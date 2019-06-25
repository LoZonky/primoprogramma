package cap_07;

public class CatchFinally {

	public static void main(String[] args) {
	int	random=(int)Math.random();  //TODO
try {
	int u = 10/random.nextInt(5);
	System.out.println("ris è: "+ u);
	
}catch(){
	
}catch() {
	
}finally {
	//codice che viene eseguito sia con ecc che senza
	System.out.println("rientra");
}

	}//fine main

}
