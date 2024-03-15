package javaexercises;

public class FirstHalfLowerSecondHalfUpperCase {

    public static void main (String[] args){

        String str = "This is testing this is testing";
        String lowerCase = "";
        String upperCase = "";

        int mid = str.length()/2;

        for(int i=0; i<str.length(); i++){
            if(i<mid){
              // lowerCase += str.toLowerCase().charAt(i); //what is the difference below?
                lowerCase = lowerCase + Character.toLowerCase(str.charAt(i));

            }else {
                upperCase += str.toUpperCase().charAt(i);
            }
        }
        System.out.println(lowerCase+upperCase);

    }
}
