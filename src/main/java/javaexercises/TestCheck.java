package javaexercises;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCheck {

    public static void main(String[] args){

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<5; i++){
            arr.add(i);
        }
       Iterator<Integer> it = arr.iterator();
        while(it.hasNext()){
           int i =  it.next();
        }
    }

}
