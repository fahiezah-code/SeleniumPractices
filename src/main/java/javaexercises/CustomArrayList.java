package javaexercises;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CustomArrayList extends ArrayList {


    @Override
    public boolean add(Object o) {
        if(this.contains(o)){
            return true;
        }else {
            return super.add(o);
        }
    }

    public static void main(String[] args) {
        CustomArrayList cusArr = new CustomArrayList();
        cusArr.add(1);
        cusArr.add(2);
        cusArr.add(1);
        cusArr.add(1);
        System.out.println(cusArr);

        Set<Integer> set = new HashSet<>();
    }
}
