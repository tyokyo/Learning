package singleton.mysln;

public class NetIO {
	private static NetIO netIO;
	public NetIO() {
		// TODO Auto-generated constructor stub
	}
	public static NetIO getInstance(){
		if (netIO==null) {
			synchronized (NetIO.class) {
				if (netIO==null) {
					netIO=new NetIO();
				}
			}
		}
		return netIO;
	}

}
