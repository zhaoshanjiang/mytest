package day_07Demo3;

import java.util.ArrayList;

public class Test1 {
public static void main(String[] args) {
	ArrayList<Object>list4=new ArrayList<Object>();
	ArrayList<Animal>list=new ArrayList<Animal>();
	ArrayList<Cat>list2=new ArrayList<Cat>();
	ArrayList<Dog>list3=new ArrayList<Dog>();
	show(list);
//	show(list2);
//	show(list3);
	show(list4);
	
}

private static void show(ArrayList<? super Animal> list) {
	for(Object o:list){
		Animal a = (Animal)o;
		a.eat();
	}
	
}



}
