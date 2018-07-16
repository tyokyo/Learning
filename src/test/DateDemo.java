package test;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;

public class DateDemo {

	public DateDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		Date aDate = DateUtils.addDays(date, 4);
		String dateString=DateFormatUtils.format(aDate, "yyyy-MM-dd HH:mm:ss");

		String str1 = "abc";
		String str = "abc";
		String str2 = new String("abc");

		System.out.println(str1 == str2);
		System.out.println(str1 ==str );

		System.out.println(str1.equals(str2));
	}

}
