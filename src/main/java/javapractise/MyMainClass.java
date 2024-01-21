package javapractise;

import org.checkerframework.checker.units.qual.C;

public class MyMainClass {

    public static void main(String[] args){

        MySubClass subclass = new MySubClass();
        subclass.superClassMethod();
        System.out.println(subclass.superstr);

        //runt time poly morphism:
        Employee e = new FullTime();
        System.out.println("Fulltime salary : "+e.salary());


        // only after created fulltime obj, can call his method
        FullTime ft1 = new FullTime();
        FullTime ft2 = new FullTime();
        FullTime ft3 = new FullTime();
        ft1.myMethod();

        Contractor ct1 = new Contractor();
        Contractor ct2 = new Contractor();

        Partime pt1 = new Partime();
        Partime pt2 = new Partime();

        Employee[] em = {ft1,ft2,ft3,ct1,ct2,pt1, pt2};
        int emsize = em.length;
        System.out.println("number of total employees : "+ emsize);
        //count how many fulltime obj & contractors

        // loop employee array one by one
        // check if the type of employe obj at index i
        // if the type is ft, increment ft counter type of object , if ft1 instanceOf FullTimeEmployee
        // if the type is cc, increment cc counter
        // print ft counter
        // print cc counter
        int ftcount = 0;
        int ccount = 0;
        int ptCount = 0;

        for (Employee employee : em) {
            if (employee instanceof FullTime) {
                ftcount++;
            } else if (employee instanceof Contractor) {
                ccount++;
            }else if (employee instanceof Partime){
                ptCount ++;
            }
        }


        System.out.println("number of fulltime employee"+ ftcount);
        System.out.println("number of contractor employee"+ ccount);
        System.out.println("number of partime employee"+ ptCount);


        e = new Contractor();
        System.out.println("Constractor salary : "+e.salary());

        //static method can call by only with class name (hiding method)
        System.out.println(Employee.destination());
        System.out.println(FullTime.destination());
        System.out.println(Contractor.destination());

        //method overloading
        MyOverloadingClass myOverloadingClass = new MyOverloadingClass();
        System.out.println("Overloading methods are below : ");
        myOverloadingClass.myMethod1(5);
        myOverloadingClass.myMethod1("my string");
        myOverloadingClass.myMethod1("my string & integer :"+ 5);

    }
}
