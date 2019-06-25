package exe_4;

import java.util.ArrayList;

//ES 27
public class pesce {
	String id;
	int age;
	double profondita;

	
	public pesce(String id, int age, double profondita) {
		this.id=id;
		this.age=age;
		this.profondita=profondita;
	}
	public String toString() {
		return "id:"+id+" " +age+" "+" "+profondita;
	}

}
