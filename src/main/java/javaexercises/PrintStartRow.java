package javaexercises;

public class PrintStartRow {

    public static void main(String[] args){
        printStars(5);

    }

    public static void printStars(int row){

        for(int i=0; i<row; i++){
            for(int j=0; j<row; j++) {
                System.out.print("*" + " ");
            }
            System.out.println( );
        }

    }


}
