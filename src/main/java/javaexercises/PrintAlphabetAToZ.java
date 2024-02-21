package javaexercises;

public class PrintAlphabetAToZ {

    public static void main(String[] args){

        System.out.println("Alphabet A to Z");
        for(char i = 'A'; i<='Z'; i++){
            System.out.print(i);
        }

        char i;
        System.out.printf("The Alphabets from A to Z are: \n");
        for (i = 'A'; i <= 'Z'; i++)
        {
            System.out.printf( "%c",i);
        }
        System.out.println("\n");
        double k = 1.1;

        while(k<=15){
            System.out.printf("%.1f", k);
            System.out.print(" ");
            k++;
        }
    }


}
