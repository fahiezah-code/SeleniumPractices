package javaexercises;

public class PrintStartRow {

    public static void main(String[] args){
        printStars(5);

    }

    public static void printStars(int row){

        for(int i=row; i>0; i--){
            for(int j=0; j<i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println( );
        }

    }


}
