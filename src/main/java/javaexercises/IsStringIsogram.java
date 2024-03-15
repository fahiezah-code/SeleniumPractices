package javaexercises;

import java.util.HashSet;
import java.util.Set;

public class IsStringIsogram {

    public static void main(String[] args){

        System.out.println(isIsogram("codede"));

    }

    public static boolean isIsogram(String str){

       char[] chArr = str.toCharArray();
        boolean isIso = true;
        Set<Character> setCha = new HashSet<Character>();
        for(char c : chArr){
            if(setCha.contains(c)){
               isIso = false;
            }else {
                setCha.add(c);
            }
        }
        return isIso;
    }

}
