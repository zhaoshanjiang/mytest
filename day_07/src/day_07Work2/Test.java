package day_07Work2;

import java.util.ArrayList;

//���д���򣬽�3��ѧ������Ϣ�洢�������У�������,���飬��ȡ�õ�ÿһ��ѧ����Ϣ
public class Test {

	public static void main(String[] args) {
		Student s = new Student("����", "18");
		Student s1 = new Student("����", "17");
		Student s2 = new Student("��Τ", "19");
//		ArrayList<Student> list = new ArrayList<>();
//		list.add(s);
//		list.add(s1);
//		list.add(s2);
//		System.out.println(list.size());
		Student[]arr={s,s1,s2};
//		Student[]arr1=new Student[3];
//		arr[0]=s;
//		arr[0]=s1;
//		arr[0]=s2;
		
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].name+"..."+arr[i].age);
			
		}
		

	}

}
