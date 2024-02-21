package javaexercises;

import java.util.Scanner;

public class PrintInputFromScanner {

    public static void main(String[] args){
     readUserInfo();

    }

    public static void readUserInfo(){

        Scanner sca = new Scanner(System.in);
        System.out.println("Enter your name");
        String yourname = sca.nextLine();

        System.out.println("Enter your salary");
        int yourSalary = sca.nextInt();

        System.out.println("Enter your age");
        int yourAge = sca.nextInt();

        System.out.println("Your info are as below: ");
        System.out.println(yourname + " "+yourAge +" "+ yourSalary);

    }
}
