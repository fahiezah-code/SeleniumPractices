package javapractise;

public class MySubClass extends MySuperClass{

    public MySubClass(){
        super("Constructor string");
        System.out.println("sub class constructor");
    }
    public void subClassMethod(){
        System.out.println("sub class method");
    }


}
