package javaexercises;

import javapractise.Employee;

import java.util.HashMap;

public class FrequencyCount {
    public static void main(String[] args) {
        //i am bee
        //a->1
        //b->1
        //m->1
        //e->2
        //i->1

        // loop each char
        // put into  HM
        // value ++ if there is aldy key
        //else -> put into hp with value 1
        //print key and value

        HashMap<String, Integer> hmap = new HashMap<>();
        hmap.put("Orange", 5);
        hmap.put("Apple", 4);
        hmap.put("Blueberry", 10);
        hmap.put("Mango", 7);
        hmap.put("Durian", 3);
        for (String ch : hmap.keySet()) {
            System.out.println(ch + "-->" + hmap.get(ch));
        }

    }

    public static void countChar(String str) {
        int value = 1;
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, value);
            }
        }
    }


    enum Level {
        BEGINNER,
        INTER,
        ADVANCED,

    }

    public static void printlevel(Level e) {
        if (e == Level.BEGINNER) {
            System.out.println("Level - Interm..");
        } else if (e == Level.ADVANCED) {
            System.out.println("Level - Interm..");
        } else if (e == Level.BEGINNER) {
            System.out.println("Level - Interm..");
        } else {
            //
        }
    }
}
