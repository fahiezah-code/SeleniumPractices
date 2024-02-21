package javaexercises;

import java.sql.SQLOutput;

public class ReverseString {

    public static void main(String[] args){
        reverseWord(" Hello world welcome");
        reverseCharacters("are you ok?");
    }

    public static void reverseWord(String sentence){


       String[] str = sentence.split("\\s");

        String reverse = " ";
        for(int i= str.length-1; i>=0; i-- ){
             reverse = reverse + str[i]+" ";
        }
        System.out.println(reverse);
    }
    public static void reverseCharacters(String sentence){

        String str2 = sentence.replaceAll("\\s","");
        System.out.println(str2);
        String str = " ";

        for(int i = str2.length()-1; i>=0; i--){
            str +=String.valueOf(str2.charAt(i));
        }
        System.out.println(str);
    }
}
