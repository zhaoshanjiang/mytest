package day_07Work5;

//编写一个程序的模拟班级学生的成绩库, 包含多项成绩,英语,数学,Java. 
//实现如下功能：
//1.可以修改某个学生的某项分数. 
//2.可以打印全班同学成绩
//要求使用集合来完成.
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
