package unit.day1;

public class Test{
	public static void main(String args[])
	{
		String str1 = "abc";
		String str = "abc";
		String str2 = new String("abc");

		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println(str == str1);
		
		System.out.println(Integer.MAX_VALUE);
		double w = 6.0;
		double h = 4.9;
		System.out.println(h-w);
		char ascii=98;
		System.out.println(ascii);
		
		System.out.println(String.format("am instrument -w -r %1$s %2$s %3$s", "aaa",
                             "bb","c"));
		System.out.println(String.format("%1$s 您%2$s", "某某","!"));
		System.out.println(String.format("%1$,f", 1234567890.123456789));//转换结保留默认数位3位数字用,隔
	}
}