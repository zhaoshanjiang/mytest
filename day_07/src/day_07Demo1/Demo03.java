package day_07Demo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * �����޸��쳣
 * 		 java.util.ConcurrentModificationException
 * 		 �����������ڵ�������ʱ�����϶���ı��˼��ϵĳ��� �ͻᱨ���쳣
 * 
 * ����һ���洢�ַ����ļ��ϣ��������ϣ��жϼ���������н������Ԫ�ؾ����һ������
 */
public class Demo03 {
	public static void main(String[] args) {
Collection<String>c=new ArrayList<String>();
		c.add("����");
		c.add("����");
		
		c.add("����");
		
		Iterator<String> it = c.iterator();
		while(it.hasNext()){
			String s = it.next();
			if(s.equals("����")){
				c.add("����");
			}
			System.out.println(s);
			
		}
	}

}
