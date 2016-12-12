package builder.pc;

import builder.computer.Computer;

/** 
 * 计算机Builder 
 */  
public interface ComputerBuilder {  
    public void buildCPU();    
    public void buildMemory();    
    public void buildMainboard();    
    public Computer getComputer();   
}  
