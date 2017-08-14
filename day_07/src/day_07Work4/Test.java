package day_07Work4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//a)使用迭代器进行遍历,要有泛型
//b)打印出三个手机对象的信息，比如颜色，品牌。
public class Test {
public static void main(String[] args) {
	Collection<Person> c=new ArrayList<Person>();
	Person p=new Person("华为","黑色");
	Person p1=new Person("中兴","白色");
	Person p2=new Person("魅族","蓝色");
	c.add(p);
	c.add(p1);
	c.add(p2);
	Iterator<Person> it = c.iterator();
	while(it.hasNext()){
		Person next = it.next();
		System.out.println(next.getBrand()+"..."+next.getCoclor());
	}
	
}
}
