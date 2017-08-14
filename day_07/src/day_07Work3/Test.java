package day_07Work3;

import java.util.ArrayList;

public class Test {
public static void main(String[] args) {
	caiPin cp=new caiPin("ÍÁ¶¹Ë¿",20.0,4);
	caiPin cp1=new caiPin("»Æ¹Ï",10.0,4);
	caiPin cp2=new caiPin("°×²Ë",2.0,3);
	ArrayList<caiPin>list=new ArrayList<caiPin>();
	list.add(cp);
	list.add(cp1);
	list.add(cp2);
	double sum = 0;
	for (int i = 0; i < list.size(); i++) {
		
		caiPin c=list.get(i);
		System.out.print(list.get(i).name);
		sum+=(c.price*c.number);
	}
	System.out.println();
	System.out.println(sum);
	
}
}
