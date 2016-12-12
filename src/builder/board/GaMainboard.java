package builder.board;


/** 
 * 技嘉主板 
 */  
public class GaMainboard extends Mainboard {  
    public GaMainboard(){}  
  
    @Override  
    public Mainboard getMainboard() {  
        return new GaMainboard();  
    };  
      
     public String toString(){    
            return " GaMainboard ";    
        }    
}  