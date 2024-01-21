package javapractise;

public class Contractor extends Employee{

    int salary(){
        return base + 10000;
    }
    static String destination(){
        return "Contractor tester";
    }
}
