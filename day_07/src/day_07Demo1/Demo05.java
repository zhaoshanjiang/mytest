package day_07Demo1;


import java.util.ArrayList;
import java.util.Iterator;

public class Demo05 {
	

	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
//		list.add("ÁøÑÒ");
//		list.add("ÌÆæÌ");
//		int[] arr = { 12, 14, 17, 19 };
//		list.add(arr);
//		Iterator<Object> it = list.iterator();
//		while (it.hasNext()) {
//
//			Object obj = it.next();
//			String s=(String)obj;
//			System.out.println(obj);
//		}
		System.out.println("-----------------");
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("abc");
		list2.add("bcd");
//		list2.add(10);
		Iterator<String> it2 = list2.iterator();
		while(it2.hasNext()){
			String name = it2.next();
			System.out.println(name);
		}
		

	}
}
