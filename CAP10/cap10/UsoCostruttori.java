package cap10;

//bytecode di A1 e A2 sono equivalenti 
class A1{}

class A2{
	//COSTRUTTORI
	A2(){}
	
}

class B1 extends A1{
	//COSTRUTTORI
	B1(){} //va bene che non c'è super, perchè java lo traduce in automatico ===> equivale a scrivere: B1(){super();}
}
class C{
	C(int c){}
}

class D extends _C{
	D(){}
}

class D2 extends C{
	D2(){super();}
}
public class UsoCostruttori {

}
