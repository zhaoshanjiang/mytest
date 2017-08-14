package day_07Demo1;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.text.SimpleAttributeSet;

public class Test {
	public static void main(String[] args) throws ParseException {
		Date d=new Date();
		String s="1949-10-01";
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		Date d1=df.parse(s);
		System.out.println(d1.getTime());
		
	}
}
