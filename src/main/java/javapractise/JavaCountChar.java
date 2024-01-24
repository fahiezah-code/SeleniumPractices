package javapractise;

import java.util.HashMap;
import java.util.Map;

public class JavaCountChar {

    public static void main(String[] args){
        String str = "Java is object oriented language";
        //replace length -> jv is object oriented lnguge
       // countChar(str);
        countCharbyHM(str);

    }

    public static void countChar(String sentence){
        int result =sentence.length()- sentence.replace("a","").length();
        System.out.println(result);
    }

    public static void countCharbyHM(String sentence){
      String str = sentence.toLowerCase();
        int count = 1;
        char[] ch = str.toCharArray();
        Map<Character,Integer> mp = new HashMap<Character, Integer>();
        for(int i=0; i<ch.length; i++){

            if(!mp.containsKey(ch[i])) {
                if(Character.isWhitespace(ch[i]))
                {
                    continue;
                }
                mp.put(ch[i],count);

            }else
                mp.put(ch[i],mp.get(ch[i])+1);
        }
        //print char and its count
        for (Character x : mp.keySet()) {
            System.out.println(x+" : "+ mp.get(x));
        }

        }


    }




