package builder.cpu;

public class CKTCpu extends CPU {
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "CKT-Cpu";
	}
	private CKTCpu(){}
	@Override
	public CPU getCPU() {
		// TODO Auto-generated method stub
		return new CKTCpu();
	}

}
