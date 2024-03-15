package javaexercises;

public class FindMinssingNumberinArray {


    public static void main(String[] args){

        int[] arr = new int[] {1,2,3,4,5,6,7,8,10};

        //total sum = (n*(n+1))/2
        int totalsum = (10*11)/2;

        //actual sum = sum by loop
        int actualSum = 0;
      for(int i=0; i<arr.length; i++){
          actualSum += arr[i];
      }

      int missnum = totalsum - actualSum;
        System.out.println(missnum);

    }
}


