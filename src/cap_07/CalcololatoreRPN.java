package cap_07;

import java.util.Stack;

public class CalcololatoreRPN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalcololatoreRPN a= new CalcololatoreRPN();
		System.out.println(a.valuta("6,5,4,3,2,*,+,-,/"));
	}

	
	public static double valuta(String expr) {
		String[] tokens=expr.split(",");
		Stack<Double> pila=new Stack<>();
		
		for(String t: tokens) {
			if(t.equals("*")||t.equals("+")||t.equals("-")||t.equals("/")) {
				//prendo gli ultimi due elementi 
				/* try {
					int e2=pila.pop();
					int e1=pila.pop();
				} */
				
				double e2= pila.pop();
				double e1= pila.pop();
				//faccio l'operazione
				switch(t) {
				case "*":pila.push(e1*e2); break;
				case "+":pila.push(e1+e2); break;
				case "-":pila.push(e1-e2); break;
				case "/":try{
					pila.push(e1/e2); 
					break;
					}catch(ArithmeticException ae) {
					System.out.println("divisione per 0");
					return -1;
						}//end-catch
					}//end-switch
				}//end-for
			
		/*	catch(EmptyStackerException e) {
				//lancio eccezione 
				 * throw new RuntimeException("troppi operatori");
			}
		*/	
			
			else {
					//è un numero
					pila.push(Double.parseDouble(t));
				}
			System.out.println("pila: "+pila);
			}
	return pila.pop();	
	
	/*
	if(pila.isEmpty()) {
		return result;
	}else {
		throw new RuntimeException("ci sono ancora numeri nella pila"+pila );
		} */
	
	
	}//fine main 
	
}//fine classe CalcololatoreRPN
