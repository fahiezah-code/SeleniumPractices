package javapractise;

public class FullTime extends Employee{

    @Override
     int salary() {
        return base + 20000;
    }

    void myMethod(){
        System.out.println("this method is from fulltime");
    }
    //this static method can't call with object
    // Static methods cannot be annotated with @Override, can not add anno @override

    static String destination(){
        return "Fulltime tester";
    }

}
