package factory;

import java.io.FileInputStream;
import java.util.Properties;
//抽象工厂模式(Abstract Factory)：
//提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类
public class AbstractFactory{    
    public static void main(String args[])throws Exception{    
        Properties p = new Properties();    
        p.load(new FileInputStream("1.properties"));    
        String str = p.getProperty("Student");    
        PersonFactory ps = PersonFactory.getInstance(str);    
        ps.producePerson();  
    }    
}  
