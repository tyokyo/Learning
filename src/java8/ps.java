package java8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ps {

	public ps() {
		// TODO Auto-generated constructor stub
	}
	public static void readData(String file,ArrayList<String> parameter) {
		//BufferedReader是可以按行读取文件  
		System.out.println(file);
		try {
			FileInputStream inputStream = new FileInputStream(file);  
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));  

			String str = null;  
			while((str = bufferedReader.readLine()) != null)  
			{  
				parameter.add(str);
			}  
			//close  
			inputStream.close();  
			bufferedReader.close(); 
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String folderDir = "D:/Menfolk0612_50/20180614_17_14_12/";
		File[] files=new File(folderDir).listFiles();
		for (File f : files) {
			ArrayList<String> video = new ArrayList<String>();
			ArrayList<String> picture = new ArrayList<String>();
			ArrayList<String> confidence = new ArrayList<String>();
			String folder = f.getAbsolutePath()+File.separator;
			readData(folder+"video.txt", video);
			readData(folder+"picture.txt", picture);
			readData(folder+"confidence.txt", confidence);
			System.out.println(video.toString());
			System.out.println(picture.toString());
			System.out.println(confidence.toString());

			for (int i = 0; i < video.size(); i++) {
				String videoString =video.get(i).replaceAll(".mp4", "");
				String confidenceString = confidence.get(i);
				String pictureString = picture.get(i);
				File file = new File(folder+pictureString);
				File newFile  = new File(folder+String.format("%s-%s%s", videoString,confidenceString,".jpg"));

				boolean flag = file.renameTo(newFile);
				if (flag) {  
					System.out.println("File renamed successfully");  
				} else {  
					System.out.println("Rename operation failed");  
				}  
			}
		}
	}
}
