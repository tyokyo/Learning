package unit.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionMain03 {
	public static void main(String[] args) {
		try {
			int[] data = new int[]{1,2,3};
			System.out.println(getDataByIndex(-1,data));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static int getDataByIndex(int index,int[] data) {
		if(index<0||index>=data.length)
			throw new ArrayIndexOutOfBoundsException("数组下标越界");
		return data[index];
	}
	public static String etx(){
		try {
	        FileInputStream inputStream = new FileInputStream("d:/a.txt");
	        int ch = inputStream.read();
	        System.out.println("aaa");
	        return "step1";
	    } catch (FileNotFoundException e) {
	        System.out.println("file not found"); 
	        return "step3";
	    } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
	        System.out.println("finally block");
	        return "finally";
	    }
		
	}
}