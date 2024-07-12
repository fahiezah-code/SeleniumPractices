package javapractise;

public interface Shapes {

    int i = 5;

    //methods are by default abstract and public
    String color();
    double area();
    String info();

    //you can add method with default keyword, as of now implementation is not needed from other class
    default void defaultMetod() {
        System.out.println("default method");
    }

    //you can add method with static keyword,
    // as of now implementation is not needed from other class
    //can directly access from Main method
    static void staticMethod(){
        System.out.println("static method");
    }

}
