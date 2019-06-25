package exe_4;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsoleInputManager in=new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		acquario a=new acquario("pippo");
		pesce dio=new pesce("ss",19,43);
		a.ins_pesce(dio);
		out.println(a);
		a.delete("ss");
		out.println(a);
	
	}

}
