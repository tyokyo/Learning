package model1.factory;

public class SmsSender implements Sender, model1.builder.Sender {  
    @Override  
    public void Send() {  
        System.out.println("this is sms sender!");  
    }  
}  