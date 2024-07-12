package javaexercises;

import java.util.HashMap;

public class Anagrams {

    public static void main(String[] args) {

    }
    public static void checkAnagrams(String a, String b){

        HashMap<Character,Integer> hp1 = new HashMap<>();
        for(int i=0; i<a.length(); i++){
            char c = a.charAt(i);
            if(hp1.containsKey(c)){
                hp1.put(c,hp1.get(c)+1);
            }else {
                hp1.put(c,1);
            }
        }

    }
}
