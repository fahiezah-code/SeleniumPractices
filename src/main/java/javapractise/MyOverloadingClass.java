package javapractise;

public class MyOverloadingClass {

    //method overloading
    public void myMethod1(String str){
        System.out.println(str);
    }
    //same method name, diff number of input parameters
    public void myMethod1(String str, int i){
        System.out.println(str + i);
    }
    public void myMethod1(int i){
        System.out.println( i);
    }
}
