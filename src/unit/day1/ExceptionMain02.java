package unit.day1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionMain02 {
	public static void main(String[] args) {
		String str = new ExceptionMain02().openFile();
		System.out.println(str);

	}
	public String openFile() {
		try {
			FileInputStream inputStream = new FileInputStream("d:/a.txt");
			int ch = inputStream.read();
			System.out.println("aaa");
			return "step1";
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
			return "step2";
		}catch (IOException e) {
			System.out.println("io exception");
			return "step3";
		}finally{
			System.out.println("finally block");
			//return "finally";
		}
	}
}