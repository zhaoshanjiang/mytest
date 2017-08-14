package day_07Work1;
//a)定义类：Cat，包含以下成员：
//成员属性(私有)：
//	名称：
//	颜色：
//	年龄：
//构造方法：
//	无参
//	全参
//成员方法：
//	1).get/set方法；
//	2).重写toString()方法；内部打印所有属性的值；
public class Cat {
private String name;
private String color;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
private int age;
public Cat(String name, String color, int age) {
	super();
	this.name = name;
	this.color = color;
	this.age = age;
}
public Cat() {
	super();
	
}
public String toString(){
	return name+"..."+color+"..."+age;
	
}
}
