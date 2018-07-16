package singleton.mysln;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dir = "";
		File[] f = new File(dir).listFiles();
		for (File file : f) {
			String name =file.getName().toLowerCase();
			if (name.endsWith("png")||name.endsWith("jpg")) {

			}
		}
	}

}
