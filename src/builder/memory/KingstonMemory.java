package builder.memory;


/** 
 * 金士顿内存 
 */  
public class KingstonMemory extends Memory {  
    public KingstonMemory(){};  
    @Override  
    public Memory getMemory() {  
        return new KingstonMemory();  
    }  
      
     public String toString(){    
            return " KingstonMemory ";    
        }    
} 