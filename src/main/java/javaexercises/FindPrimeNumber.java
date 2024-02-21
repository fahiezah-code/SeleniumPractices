package javaexercises;

public class FindPrimeNumber {

    //a whole number greater than 1 that cannot be exactly divided
    // by any whole number other than itself and 1 (e.g. 2, 3, 5, 7, 11).

    public static void main(String[] args) {
        findPrimeNum(9);

    }

    public static void findPrimeNum(int num) {
        //   num>1
        //   num/anynumber != 0
        boolean flag = false;
        for (int i = 2; i <= num/2; i++) { // 4
            if (num%i == 0) {
                flag = true;
               // System.out.println(flag);
              //  break;
            }
        }

        if(flag == false){
            System.out.println("this is prime number: " + num);
        }else {
            System.out.println("this is not prime number : "+num);
        }

    }
}