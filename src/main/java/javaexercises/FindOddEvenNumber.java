package javaexercises;

public class FindOddEvenNumber {

    public static void main(String[] args){

        findOddEvenNum(109);
    }

    public static void findOddEvenNum(int number){

        if(number%2 ==0 ){
            System.out.println("number is Even number: "+ number);
        }else {
            System.out.println("number is Odd number: "+number);
        }

    }
}
