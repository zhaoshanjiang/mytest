package day_07Work2;

import java.util.ArrayList;

//请编写程序，将3个学生的信息存储到数组中，并遍历,数组，获取得到每一个学生信息
public class Test {

	public static void main(String[] args) {
		Student s = new Student("赵云", "18");
		Student s1 = new Student("黄忠", "17");
		Student s2 = new Student("典韦", "19");
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
