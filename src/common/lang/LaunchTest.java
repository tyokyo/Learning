package common.lang;

import org.apache.commons.lang3.ObjectUtils;

public class LaunchTest {

	public LaunchTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj = new Object();
		String str = "i love this city";
		obj=str;
		String objToString=ObjectUtils.toString(obj);
		System.out.println(objToString);
	}

}
