package day_07Demo2;

public class Test {
public static void main(String[] args) {
//	1.泛型类
	MyClass<String> mc=new MyClass<String>();
	mc.setS("柳岩");
	System.out.println(mc.getS());
	System.out.println("----------------------");
	MyClass<Integer> mc1=new MyClass<Integer>();
	mc1.setS(38);
	System.out.println(mc1.getS());
	System.out.println("----------------");
//	2.泛型方法
	mc.haha("abc","ab");
}
}
