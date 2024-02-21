package javaexercises;

public class FindLargestSmallestNumber {

    public static void main(String[] args){

     int[] arr = new int[5];
     int array[] = {4,5,7,2,1,6,0,-3};
     int largest = 0;
       for(int i=0; i<array.length; i++){
           if(largest<array[i]){
               largest = array[i];
           }
       }
        System.out.println("largest number "+largest);

       int smallest= array[0];
       //find smallest
        for (int a :array) {
            if(smallest > a){
                smallest = a;
            }
        }
        System.out.println("smallest number " + smallest);



    }
}
