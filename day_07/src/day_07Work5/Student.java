package day_07Work5;

//��дһ�������ģ��༶ѧ���ĳɼ���, ��������ɼ�,Ӣ��,��ѧ,Java. 
//ʵ�����¹��ܣ�
//1.�����޸�ĳ��ѧ����ĳ�����. 
//2.���Դ�ӡȫ��ͬѧ�ɼ�
//Ҫ��ʹ�ü��������.
public class Student {
	private String name;
	private double english;
	private double math;
	private double Java;
	public Student(String name, double english, double math, double java) {
		super();
		this.name = name;
		this.english = english;
		this.math = math;
		Java = java;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getEnglish() {
		return english;
	}
	public void setEnglish(double english) {
		this.english = english;
	}
	public double getMath() {
		return math;
	}
	public void setMath(double math) {
		this.math = math;
	}
	public double getJava() {
		return Java;
	}
	public void setJava(double java) {
		Java = java;
	}

	
}
