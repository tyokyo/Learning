package builder.board;

/** 
 * 华硕主板 
 */  
public class AsusMainboard extends Mainboard {  
    public AsusMainboard(){};  
    @Override  
    public Mainboard getMainboard() {  
        // TODO Auto-generated method stub  
        return new AsusMainboard();  
    }  
      
    public String toString(){    
        return " AsusMainboard ";    
    }    
}  