package unit.day1;

import java.io.File;
import java.io.IOException;

public class EeceptionMain01 {
	public static void main(String[] args) {
		try {
			createFile();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void createFile() throws IOException{
		File file = new File("d:/a.txt");
		if(!file.exists()){
			file.createNewFile();
		}
	}
}