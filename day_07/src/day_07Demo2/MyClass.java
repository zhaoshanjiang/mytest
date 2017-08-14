package day_07Demo2;

public class MyClass <QQ>{
private QQ s;

public QQ getS() {
	return s;
}

public void setS(QQ s) {
	this.s = s;
}
public <MoMo>void haha(MoMo mm,QQ s){
	System.out.println(mm.getClass());
}
}
