package javaexercises;

public class SwapNumbers {

    public static void main(String[] args){
       swapNumbers(20, 40);
       swapNumberWithoutUsingThridVar(30, 45);
    }

    public static void swapNumbers(int x, int y){

        int firstNumber = x;
        int secondNumber = y;
        int temp;
        System.out.println("Before swapping\n x = "+x+", y = "+y);
        temp = x;
        x = y;
        y = temp;

        System.out.println("After swapping\n x= " + x +", y= "+ y);

    }
    public static void swapNumberWithoutUsingThridVar(int a,int b){
        // a = 8, b = 3;
        int firstNum = a;
        int secondNum = b;
        System.out.println("Before swapping\n firstNumber= " + firstNum +", SecondNumber= "+ secondNum);
        firstNum = a+b;
        secondNum = firstNum - b;
        firstNum = firstNum - secondNum;
        System.out.println("After swapping\n firstNumber= " + firstNum +", SecondNumber= "+ secondNum);
    }
}
