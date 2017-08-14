package day_07Work5;

import java.util.ArrayList;
import java.util.Scanner;

import javax.jws.soap.SOAPBinding;

//实现如下功能：
//1.可以修改某个学生的某项分数. 
//2.可以打印全班同学成绩
//要求使用集合来完成.
public class Test {
	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<Student>();
		Student s = new Student("李四", 98.0, 78.5, 87.5);
		Student s1 = new Student("张三", 96.0, 79.5, 87.0);
		Student s2 = new Student("王五", 99.0, 90.5, 89.5);
		list.add(s);
		list.add(s1);
		list.add(s2);
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要修改学生的姓名:");
		String name = sc.nextLine();
		for (Student s4 : list) {
			String name2 = s4.getName();
			if (name2.equals(name)) {
				System.out.println("请输入要修改的科目:");
				String kemu = sc.nextLine();
				switch (kemu) {
				case "英语":
					System.out.println("请输入修改后的分数:");
					double h = sc.nextDouble();
					s4.setEnglish(h);

					break;
				case "数学":
					System.out.println("请输入修改后的分数:");
					double h1 = sc.nextDouble();
					s4.setMath(h1);

					break;
				case "Java":
					System.out.println("请输入修改后的分数:");
					double h2 = sc.nextDouble();
					s4.setJava(h2);

					break;

				default:
					System.out.println("请输入正确的科目:");
					break;
				}
				System.out.println("修改成功!");

				// System.out.println(s4);
				System.out.println("全班成绩为:");
				System.out.println("姓名\t" + "英语\t" + "数学\t" + "Java\t");
				System.out.println(s.getName() + "\t" + s.getEnglish() + "\t" + s.getMath() + "\t" + s.getJava());
				System.out.println(s1.getName() + "\t" + s1.getEnglish() + "\t" + s1.getMath() + "\t" + s1.getJava());
				System.out.println(s2.getName() + "\t" + s2.getEnglish() + "\t" + s2.getMath() + "\t" + s2.getJava());
				return;
			}
		}
		System.out.println("查无此人,重新输入!");
	}
}
