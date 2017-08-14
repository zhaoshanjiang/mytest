package day_07Demo1;

import java.util.ArrayList;
import java.util.Collection;


//×îĞÂ°æ±¾¹ş¹ş¹ş¹ş¹ş¹ş¹ş
public class Demo01 {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("ÁøÑÒ");
		c.add("ÌÆæÌ");
		c.add("ÌÆæÌ");
		c.add("·¶±ù±ù");
		
		Object[] array = c.toArray();
		for (int i = 0; i < array.length; i++) {
			Object object = array[i];
			System.out.print(object);
		}
		boolean b = c.contains("·¶±ù±ù");
		System.out.println(b);
		System.out.println(c);
		c.remove("ÁøÑÒ");
		System.out.println(c);
		c.clear();
		System.out.println(c);
		System.out.println(c.isEmpty());
		
		System.out.println(c.size());
		

	}
}
