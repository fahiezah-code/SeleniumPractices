package javaexercises;

public class IsStringRoatation {

    public static void main(String[] args){

        String str1 = "ABCD";
        String str2 = "CDAE";
       if(isRotation(str1,str2)){
           System.out.println("it is rotation");
       }else{
           System.out.println("it is not rotation");
       }
    }

    public static boolean isRotation(String str1, String str2){

        //ABCDABCD
     boolean value =(str1.length() == str2.length()) && ((str1+str1).indexOf(str2) !=-1);
        System.out.println(value);
        System.out.println((str1+str1).indexOf(str2));
     return value;

    }



}


