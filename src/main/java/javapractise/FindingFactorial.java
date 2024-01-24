package javapractise;

public class FindingFactorial {

    public static void main(String[] args){

        int n = 7;
        findFactorialnumber(n);
        //5! = 5*4*3*2*1 = 120
        //4! = 4*3*2*1 = 24
        //3! = 3*2*1 = 6

    }

    public static void findFactorialnumber(int n){
        // n = 4 , temp = n * n-1 ,
        int temp = n;
        System.out.print("Factorial number of "+ n +"!"+" is " +n);
        for (int i=n; i>1; i--){
               // if(i<=1){break;}
            System.out.print(" * "+ (i-1));

            temp  *= i-1;

        }
        System.out.print(" = "+temp);

    }
}
