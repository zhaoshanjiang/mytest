package day_07Demo1;

import java.util.ArrayList;
import java.util.Collection;


//���°汾��������������
public class Demo01 {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("����");
		c.add("����");
		c.add("����");
		c.add("������");
		
		Object[] array = c.toArray();
		for (int i = 0; i < array.length; i++) {
			Object object = array[i];
			System.out.print(object);
		}
		boolean b = c.contains("������");
		System.out.println(b);
		System.out.println(c);
		c.remove("����");
		System.out.println(c);
		c.clear();
		System.out.println(c);
		System.out.println(c.isEmpty());
		
		System.out.println(c.size());
		

	}
}
