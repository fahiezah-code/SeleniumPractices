package javapractise;

public class FindLargestSmallestNumber {

    public static void main(String[] args){

        int[] arr = {5, 6, 3, 25, 234, 7,2};
        verifyLargestSmallestNumber(arr);
        // compare value with 0 and 1 index
       // find smallest
        // if (5<6) smallest - 5 , largest 6
        // if (5<3) smallest - 3 ,
        // if (3<25) - 3
        // if (3<234) - 3
        //if (3<7) - 3
        //if (3<2) - 2
    }

    public static void verifyLargestSmallestNumber(int[] arr){

        int smallest = arr[0];
        int largest = arr[0];

        for (int i=1; i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            } else if (arr[i]<smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("smallest number is "+ smallest);
        System.out.println("largest number is "+ largest);
    }
}
