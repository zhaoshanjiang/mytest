package day_07Work4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//a)ʹ�õ��������б���,Ҫ�з���
//b)��ӡ�������ֻ��������Ϣ��������ɫ��Ʒ�ơ�
public class Test {
public static void main(String[] args) {
	Collection<Person> c=new ArrayList<Person>();
	Person p=new Person("��Ϊ","��ɫ");
	Person p1=new Person("����","��ɫ");
	Person p2=new Person("����","��ɫ");
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
