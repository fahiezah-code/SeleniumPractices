package javapractise;

import java.util.*;


public class FindFirstNonRepeatedChar {

    public static void main(String[] args){

        String str = "swiss";
       // checkFirstNonRepeatedChar(str);//use HashMap only-not resolve problem
        //need to use linkedHashMap- which maintains insertion order
        VerifyFirstNonRepeatedChar(str);

    }

    public static void VerifyFirstNonRepeatedChar(String str){

        //***use linkedHashMap to maintain insertion order
        Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
        int count = 1;
        for (int i=0; i<str.length(); i++){
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),count);

            }else {
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
                System.out.println("map.values : "+map.values());

            }
        }

        for(Map.Entry<Character,Integer> entry: map.entrySet()){
                if(entry.getValue()==1){
                    System.out.println("The first non repeated character is : "+entry.getKey());
                    break;
                }
        }



    }


    public static void checkFirstNonRepeatedChar(String str){

        //change to char[]
        //put into hashmap
        //take only value 1, check the index of that char
        //print that char, which index is smallest

        char[] ch = str.toLowerCase().toCharArray();
        int count = 1;
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0; i<ch.length; i++){
            if(!map.containsKey(ch[i])){
                map.put((ch[i]), count);
            }else {
                map.put(ch[i], map.get(ch[i])+1);
            }
        }

        //how to pring only firt non repeat?
            for (Character sr:map.keySet()) {
            if(map.get(sr)==1){
                System.out.println(sr);
            }


        }






    }
}
