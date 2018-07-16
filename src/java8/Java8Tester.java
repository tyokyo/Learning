package java8;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Java8Tester {
	public static void main(String args[]){
		Java8Tester tester = new Java8Tester();

		// 类型声明
		MathOperation addition = (int a, int b)->a + b;

		// 不用类型声明
		MathOperation subtraction = (a, b) -> a - b;

		// 大括号中的返回语句
		MathOperation multiplication = (int a, int b) -> { return a * b; };

		// 没有大括号及返回语句
		MathOperation division = (int a, int b) -> a / b;

		System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
		System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
		System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
		System.out.println("10 / 5 = " + tester.operate(10, 5, division));

		// 不用括号
		GreetingService greetService1 = message ->
		System.out.println("Hello " + message);

		// 用括号
		GreetingService greetService2 = (message) ->
		System.out.println("Hello " + message);

		greetService1.sayMessage("Runoob");
		greetService2.sayMessage("Google");


		//------------------
		List<String> names = new ArrayList<String>();

		names.add("Google");
		names.add("Runoob");
		names.add("Taobao");
		names.add("Baidu");
		names.add("Sina");
		
		names.forEach(System.out::println);
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);  
		IntSummaryStatistics stats = numbers  
		          .stream()  
		          .mapToInt((x) -> x)  
		          .summaryStatistics();  
		
		String s = "d\\"+"1111111";
		new File(s).mkdirs();
		System.out.println("List中最大的数字 : " + stats.getMax());  
		System.out.println("List中最小的数字 : " + stats.getMin());  
		System.out.println("所有数字的总和   : " + stats.getSum());  
		System.out.println("所有数字的平均值 : " + stats.getAverage());
		File f = new File("facetoken");
		if (f.isDirectory()&&f.exists()) {
			
		}else{
			f.mkdirs();
		}
		String picture="${facetoken_search}";
		File pictureFile=new File(picture);
		String name = pictureFile.getName();
		String preivew= "";
		preivew.replaceAll("preview_", "");
		f.getName();
	}
	// 更好的办法
	public static void filter(List names, Predicate condition) {
		names.stream().filter((name) -> (condition.test(name))).forEach((name) -> {
			System.out.println(name + " ");
		});
	}
	interface MathOperation {
		int operation(int a, int b);
	}

	interface GreetingService {
		void sayMessage(String message);
	}

	private int operate(int a, int b, MathOperation mathOperation){
		return mathOperation.operation(a, b);
	}

	
}