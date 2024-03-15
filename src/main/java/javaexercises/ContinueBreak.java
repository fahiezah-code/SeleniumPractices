package javaexercises;

public class ContinueBreak {

    public static void main(String[] args){

        int [] numbers = {10, 20, 30, 40, 5};
        for(int x : numbers ) {
            if (x == 30) {
                continue;
            }
            System.out.print("from x value"+x);
            System.out.print("\n");
        }
            for(int y : numbers){
                if(y == 20){
                    break;
                }
                System.out.println(y+ " "+ "Y value");
            }
        }

}

