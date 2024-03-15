package javaexercises;

public class TryCatchFinallyOrder {

    public static void main(String[] args) {
        System.out.println(tryCatch());

    }

    public static int tryCatch(){
        try{
            System.out.println(10/0);
            return 1;

        }catch(Exception ex){
            return 2;
        }finally {
            System.exit(0);//here itself will terminate(can stop finally to execute)
            return 3;
        }


    }

}
