package builder.cpu;


/** 
 * AMD的cpu  
 */  
public class AMDCPU extends CPU {  
  
    public AMDCPU(){};  
    @Override  
    public CPU getCPU() {  
        // TODO Auto-generated method stub  
        return new AMDCPU();  
    }  
      
     public String toString(){    
            return " AMDCPU ";    
        }    
  
}  