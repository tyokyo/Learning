package model.templateMethod;


/**
 *  An abstract class which can get content from a file or a HTTP URL 
 *  or other resource  
 *  模板方法模式
 *  解释一下模板方法模式，就是指：一个抽象类中，有一个主方法，再定义1…n个方法，
 *  可以是抽象的，也可以是实际的方法，定义一个类，继承该抽象类，重写抽象方法，
 *  通过调用抽象类，实现对子类的调用
 */
public abstract class AbstractRead {
    protected String resource;
    public void getContent() { // Template Method
        if(open()) {
            readContent();
            close();
        }
    }
    public void setResource(String s) {
        resource = s;
    }
    protected abstract boolean open();
    protected abstract void readContent();
    protected abstract void close();
}