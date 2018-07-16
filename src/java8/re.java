package java8;

import java.io.File;

public class re {

	public re() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*// Old file  
		File oldFile = new File("D:\\67\\20180611_14_56_05\\chensiyu.jpg\\safdsafasad.png");  
		// new file  
		File newFile = new File("D:\\67\\20180611_14_56_05\\chensiyu.jpg\\saf.png");  
		 renameTo() return boolean value 
	    It return true if rename operation is successful 
		   
		boolean flag = oldFile.renameTo(newFile);  
		if (flag) {  
			System.out.println("File renamed successfully");  
		} else {  
			System.out.println("Rename operation failed");  
		}  */
		String locations="[104.047516,30.653913]";
		String locationsplit=locations.replace("\n", "").replace("[","").replace("]", "");
		String[] locationArray=locationsplit.split(",");
		System.out.println("["+locationArray[0]+"]");
		System.out.println("["+locationArray[1]+"]");
		double lat = Double.parseDouble(locationArray[1]);
		
	}

}
