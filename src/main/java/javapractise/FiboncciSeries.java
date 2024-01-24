package javapractise;

public class FiboncciSeries {

    // 0 1 1 2 3 5 8 13 21 34 ( sum of 2 numbers = 3rd number)
    public static void main(String[] args) {

        int first = 0;
        int second = 1;
        int n = 20;

        for (int i=1; i<= n; i++){
            System.out.print(first+ " ");
             int third = first + second;
             first = second;
             second = third;
        }


    }
}
