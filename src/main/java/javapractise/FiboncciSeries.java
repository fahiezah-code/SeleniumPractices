package javapractise;

public class FiboncciSeries {

    // 0 1 1 2 3 5 8 13 21 34 ( sum of 2 numbers = 3rd number)
    public static void main(String[] args) {

      //findFiboWithoutRecurrsion(5);
        System.out.println(fibWithRecursion(6));
    }
    public static void findFiboWithoutRecurrsion(int n){
        // f(5) =  0 1 1 2 3 --      .

        int first = 0;
        int second = 1;
        int third = 0;
        for(int i=1; i<=n; i++){
            third = first + second; //1
            first = second;
            second = third;
        }
        System.out.println(third);
    }
    public static int fibWithRecursion(int n){
        if(n<=1){
            return n;
        }else
            return fibWithRecursion(n-1)+fibWithRecursion(n-2);

    }




}
