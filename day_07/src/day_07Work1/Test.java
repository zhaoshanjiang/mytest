package day_07Work1;

import java.util.ArrayList;
import java.util.Iterator;


public class Test {
public static void main(String[] args) {
	ArrayList<Cat>list=new ArrayList<Cat>();
	Cat c1=new Cat("Сè","��ɫ",1);
	Cat c2=new Cat("��è","��ɫ",2);
	Cat c3=new Cat("��è","��ɫ",5);
	Cat c4=new Cat("��è","��ɫ",6);
	list.add(c1);
	list.add(c2);
	list.add(c3);
	list.add(c4);
	Object[] array = list.toArray();
	for (int i = 0; i < array.length; i++) {
		Object object = array[i];
		System.out.println(object);
	}
	System.out.println("------------------------");
	Iterator<Cat> it = list.iterator();
	while(it.hasNext()){
		Cat next = it.next();
		System.out.println(next);
	}
	System.out.println("--------------------------");
	for(Cat c5:list){
		System.out.println(c5);
	}
}
}
