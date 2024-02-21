package javaexercises;

import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class ConvertFahrenheitToCelsius {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperatur in Fahrenheit");
        double fah = sc.nextDouble();

       double cel = (fah-32)*5/9;
       System.out.println("temperature in Fahrenheit "+fah+"F"+"_>32temperature in Celsius : "+ cel+"degree C");


    }



}
