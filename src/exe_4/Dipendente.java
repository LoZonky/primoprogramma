package exe_4;

//ES 24

public class Dipendente {
	//CAMPI
	String nome;
	double stipendio;
	
	//COSTRUTTORI
	public Dipendente(String name, double salary) {
		this.nome=name;
		this.stipendio=salary;
			}
	
	//METODI
	public String check_data() {
		return "Il dipendente "+this.nome+" ha uno stipendio di: "+this.stipendio;
	}
	
	public void IncreaseSalary(double increase) {
		this.stipendio=this.stipendio*(increase/100);
	}
	
	
}//fine classe
