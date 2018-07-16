package singleton.mysln;

public class FileIO {
	private static FileIO fileIO=new FileIO();
	public FileIO() {
		// TODO Auto-generated constructor stub
	}
	public static FileIO getInstance(){
		return fileIO;
	}
}
