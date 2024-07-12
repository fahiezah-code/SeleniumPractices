package javaexercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class exam {

    public static void main(String[] args) {

    }

    public static int countStudents(List<Integer> height) {

        ArrayList<Integer> sorted = new ArrayList<>(height);
        Collections.sort(sorted);
       sorted.ensureCapacity(3);
        int count = 0;
        for(int i=0; i<height.size(); i++){
            if(sorted.get(i) !=height.get(i)){
                count++;
            }

        }
        return count;


    }

}
