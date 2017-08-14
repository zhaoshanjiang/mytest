package day_07Work4;

//请编写程序，存储3个手机对象到ArrayList集合中
//a)使用迭代器进行遍历,要有泛型
//b)打印出三个手机对象的信息，比如颜色，品牌。
public class Person {
	private String brand;
	private String coclor;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String brand, String coclor) {
		super();
		this.brand = brand;
		this.coclor = coclor;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCoclor() {
		return coclor;
	}

	public void setCoclor(String coclor) {
		this.coclor = coclor;
	}
}
