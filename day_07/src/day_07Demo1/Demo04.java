package day_07Demo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 增强for循环 唯一的作用 遍历集合或数组
 * for(集合中存储元素的数据类型  变量名:要遍历的集合){
 * 
 * }
 */
public class Demo04 {
public static void main(String[] args) {
	Collection <String>c=new ArrayList<String>();
	c.add("柳岩");
	c.add("唐嫣");
	c.add("黄渤");
//	Iterator<String> it = c.iterator();
//	while(it.hasNext()){
//		String s = it.next();
//		System.out.println(s);
//	}
	System.out.println("------------------------------");
	for (String s:c) {
		System.out.println(s);
	}
}
}
