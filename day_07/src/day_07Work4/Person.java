package day_07Work4;

//���д���򣬴洢3���ֻ�����ArrayList������
//a)ʹ�õ��������б���,Ҫ�з���
//b)��ӡ�������ֻ��������Ϣ��������ɫ��Ʒ�ơ�
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
