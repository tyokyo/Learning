package singleton.mysln;

public class HttpIO {
	private static HttpIO httpIO;
	public HttpIO() {
		// TODO Auto-generated constructor stub
	}
	public static HttpIO getInstance(){
		if (httpIO==null) {
			httpIO=new HttpIO();
		}
		return httpIO;
	}
}
