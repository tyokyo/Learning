package builder.pc;

import builder.computer.Computer;

public class Director {  
	private ComputerBuilder builder;     
	public Director(ComputerBuilder builder) {     
		this.builder = builder;     
	}    
	public Computer construct() {     
		return builder.getComputer();    
	}     
}  
