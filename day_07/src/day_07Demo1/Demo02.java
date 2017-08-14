package day_07Demo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo02 {
public static void main(String[] args) {
	Collection<String> c=new ArrayList<String>();
	c.add("ÌÆæÌ");
	c.add("ÁøÑÒ");
	Iterator<String> it = c.iterator();
	while(it.hasNext()){
		String s = it.next();
		System.out.println(s);}
		System.out.println("--------------------------");
		Collection<Person>c1=new ArrayList<Person>();
		 c1.add(new Person("ÁøÑÒ","38250"));
		 c1.add(new Person("ÌÆæÌ","888888"));
		 Iterator<Person> it1 = c1.iterator();
		 while(it1.hasNext()){
			 Person p = it1.next();
			 System.out.println(p.getName()+"...."+p.getId());
		 }
		 
	}
}

