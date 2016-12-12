package builder.cpu;


/** 
 * Intel的cpu 
 */  
public class IntelCPU extends CPU {  
  
    public IntelCPU(){};  
      
    @Override  
    public CPU getCPU() {  
        // TODO Auto-generated method stub  
        return new IntelCPU();  
    }  
      
     public String toString(){    
            return " IntelCPU ";    
        }    
}  