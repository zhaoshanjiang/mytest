package day_07Demo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * ��ǿforѭ�� Ψһ������ �������ϻ�����
 * for(�����д洢Ԫ�ص���������  ������:Ҫ�����ļ���){
 * 
 * }
 */
public class Demo04 {
public static void main(String[] args) {
	Collection <String>c=new ArrayList<String>();
	c.add("����");
	c.add("����");
	c.add("�Ʋ�");
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
