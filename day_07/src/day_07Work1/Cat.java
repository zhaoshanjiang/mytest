package day_07Work1;
//a)�����ࣺCat���������³�Ա��
//��Ա����(˽��)��
//	���ƣ�
//	��ɫ��
//	���䣺
//���췽����
//	�޲�
//	ȫ��
//��Ա������
//	1).get/set������
//	2).��дtoString()�������ڲ���ӡ�������Ե�ֵ��
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
