package builder.memory;


/** 
 * 宇瞻内存 
 */  
public class ApacerMemory extends Memory {  
    public ApacerMemory(){};  
    @Override  
    public Memory getMemory() {  
        // TODO Auto-generated method stub  
        return new ApacerMemory();  
    }  
      
    public String toString(){    
        return " ApacerMemory ";    
    }    
}  