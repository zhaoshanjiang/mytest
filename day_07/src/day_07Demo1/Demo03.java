package day_07Demo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 并发修改异常
 * 		 java.util.ConcurrentModificationException
 * 		 当迭代器正在迭代集合时，集合对象改变了集合的长度 就会报此异常
 * 
 * 定义一个存储字符串的集合，迭代集合，判断集合中如果有金莲这个元素就添加一个大郎
 */
public class Demo03 {
	public static void main(String[] args) {
Collection<String>c=new ArrayList<String>();
		c.add("柳岩");
		c.add("唐嫣");
		
		c.add("金莲");
		
		Iterator<String> it = c.iterator();
		while(it.hasNext()){
			String s = it.next();
			if(s.equals("金莲")){
				c.add("大朗");
			}
			System.out.println(s);
			
		}
	}

}
