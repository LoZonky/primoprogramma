package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Country implements Comparable{
	String name;
	float area,popolazione;
	Country(String n, float s,float p){
		name=n;
		area=s;
		popolazione=p;
	}
	@Override
	public String toString() {
		return name+" "+area; 
	}
	
	
	@Override
	public int compareTo(Object o) {
		return new Float(this.area).compareTo(new Float(o.area));;
	}
}


class ComparatorByPopulation implements Comparator<Country> {
	@Override
	public int compare(Country o1, Country o2) {
		return Float.compare(o1.popolazione, o2.popolazione)
	}
}
public class UsoComparator {
	
	public static void main(String[] args) {
		List<Country> membriEU= new ArrayList<>();
		membriEU.add(new Country("Italia",300000,70));
		membriEU.add(new Country("Francia",200000,50));
		membriEU.add(new Country("Germania",1000000,100));
	System.out.println(membriEU);
		//ordinamento
		Collections.sort(membriEU);
		
		//Altro ordinamento rispetto la popolazione
		Collections.sort(membriEU);
	
	
	
	
	}//end main
}
