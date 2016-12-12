package builder.pc;

import builder.board.AsusMainboard;
import builder.computer.Computer;
import builder.cpu.IntelCPU;
import builder.memory.KingstonMemory;


/** 
 * 联想计算机Builder 
 */  
public class LenoveComputerBuilder implements ComputerBuilder {  
	private Computer lenoveComputer=null;    
	public LenoveComputerBuilder(){    
		lenoveComputer=new Computer();    
	}    

	@Override  
	public void buildCPU() {  
		lenoveComputer.setCpu(new IntelCPU());  
	}  

	@Override  
	public void buildMemory() {  
		lenoveComputer.setMemory(new KingstonMemory());  
	}  

	@Override  
	public void buildMainboard() {  
		lenoveComputer.setMainboard(new AsusMainboard());  
	}  

	@Override  
	public Computer getComputer() {  
		buildCPU();    
		buildMemory();    
		buildMainboard();    
		return lenoveComputer;  
	}  

}  