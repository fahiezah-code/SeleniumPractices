package javaexercises;

import java.util.*;

public class ArrayArrayListSet {

    public static void main(String[] args) {
        int[] arr = {3, 2, 34, 24, 26,26, 78, 34, 89, 23, 99};
        tryTreeSet(arr);
        //create array

        // > 20

        //create new arry,

        System.out.println(" ");
        //convert to ArrayList
        ArrayList<Integer> arlist = new ArrayList<>();
        ArrayList<Integer> arList1 = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if( i%2 ==0){
                arlist.add(arr[i]);
            }

        }
        //print out the arrayList
        for (int i : arlist) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        //put Arraylist to Set

        Set<Integer> hs = new LinkedHashSet<>();
        for (int a : arlist) {
            hs.add(a);
        }
        //printout hashsetList
        for(int k : hs){
            System.out.print( k+" ");
        }
    }

    //crate TreeSet --> which doesnt allow- duplicate, null, sorted

        public static void tryTreeSet(int[] arr){

            //TreeSet<Integer> ts = new TreeSet<>();
            TreeSet<Integer> ts = new TreeSet<>();
            for(int i=0; i<arr.length; i++){
                ts.add(arr[i]);
            }


            System.out.println("this is from treeset " +ts);

            Computer c = null;
            if(c == null) {
                 c =  new Computer("Dell");
            }


        }

        //create obj 1 time in a one function
        // check if the object is null or not
        // return the object


}
