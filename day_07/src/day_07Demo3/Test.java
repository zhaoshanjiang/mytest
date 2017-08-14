package day_07Demo3;

import java.util.ArrayList;

public class Test {
public static void main(String[] args) {
	ArrayList<Integer>list=new ArrayList<Integer>();
	ArrayList<String>list2=new ArrayList<String>();
	show(list);
	show(list2);
	
}

public  static void show(ArrayList<?> list) {
	for(Object obj:list){
		System.out.println(obj);
	}
	
}
}
