package day_07Work5;

import java.util.ArrayList;
import java.util.Scanner;

import javax.jws.soap.SOAPBinding;

//ʵ�����¹��ܣ�
//1.�����޸�ĳ��ѧ����ĳ�����. 
//2.���Դ�ӡȫ��ͬѧ�ɼ�
//Ҫ��ʹ�ü��������.
public class Test {
	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<Student>();
		Student s = new Student("����", 98.0, 78.5, 87.5);
		Student s1 = new Student("����", 96.0, 79.5, 87.0);
		Student s2 = new Student("����", 99.0, 90.5, 89.5);
		list.add(s);
		list.add(s1);
		list.add(s2);
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫ�޸�ѧ��������:");
		String name = sc.nextLine();
		for (Student s4 : list) {
			String name2 = s4.getName();
			if (name2.equals(name)) {
				System.out.println("������Ҫ�޸ĵĿ�Ŀ:");
				String kemu = sc.nextLine();
				switch (kemu) {
				case "Ӣ��":
					System.out.println("�������޸ĺ�ķ���:");
					double h = sc.nextDouble();
					s4.setEnglish(h);

					break;
				case "��ѧ":
					System.out.println("�������޸ĺ�ķ���:");
					double h1 = sc.nextDouble();
					s4.setMath(h1);

					break;
				case "Java":
					System.out.println("�������޸ĺ�ķ���:");
					double h2 = sc.nextDouble();
					s4.setJava(h2);

					break;

				default:
					System.out.println("��������ȷ�Ŀ�Ŀ:");
					break;
				}
				System.out.println("�޸ĳɹ�!");

				// System.out.println(s4);
				System.out.println("ȫ��ɼ�Ϊ:");
				System.out.println("����\t" + "Ӣ��\t" + "��ѧ\t" + "Java\t");
				System.out.println(s.getName() + "\t" + s.getEnglish() + "\t" + s.getMath() + "\t" + s.getJava());
				System.out.println(s1.getName() + "\t" + s1.getEnglish() + "\t" + s1.getMath() + "\t" + s1.getJava());
				System.out.println(s2.getName() + "\t" + s2.getEnglish() + "\t" + s2.getMath() + "\t" + s2.getJava());
				return;
			}
		}
		System.out.println("���޴���,��������!");
	}
}
