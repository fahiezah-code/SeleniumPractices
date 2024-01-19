package javapractise;

public class MyClass {

    //fields - parameters - variables
    //constructors
    //method
    int i = 5;
    String str = "Hello World";

    public MyClass(){

    }
  public static void main(String[] args){
        MyClass myClass = new MyClass();
       myClass.stringCheck();
  }

  public void stringCheck(){
      str = str.concat(" !!");
     str = str.toUpperCase();
      System.out.println(str);
      str = str.substring(6, 11);
      System.out.println("substring : " + str);
     boolean flag = str.equalsIgnoreCase("world1");
     System.out.println(flag);

     str = "5";
     int i = Integer.parseInt(str);
     System.out.println(i);

     i = 6;
     str = String.valueOf(i);
      System.out.println(str);

  }
    public MyClass initialize(){
        i = 6;
        return this;

    }
}
