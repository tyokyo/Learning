package model1.builder;

public class Test {  
	  
    public static void main(String[] args) {  
        Builder builder = new Builder();  
        builder.produceMailSender(10);  
        builder.produceSmsSender(3);
        builder.send();
    }  
}  