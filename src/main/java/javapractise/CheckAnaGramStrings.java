package javapractise;

import java.util.Arrays;

public class CheckAnaGramStrings {

    public static void main(String[] args) {

        String str1 = "race";
        String str2 = "care";
        checkAnaGram(str1,str2);

        //check length of 2 strings
        //change to lowercase, char Array
        //sort both array
        //2arrays are equal?
    }

    public static void checkAnaGram(String str1, String str2){

        if(str1.length() == str2.length())
        {
            char[] ch1 = str1.toLowerCase().toCharArray();
            char[] ch2 = str2.toLowerCase().toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            if(Arrays.equals(ch1,ch2)){
                System.out.println("given strings are Anagram");
            }else{
                System.out.println("given strings are not Anagram");
            }
        }
        else {
            System.out.println("given strings are not Anagram");
        }

    }

}
