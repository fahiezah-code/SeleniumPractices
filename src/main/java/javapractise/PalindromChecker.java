package javapractise;

public class PalindromChecker {

    public static void main(String[] args){
        String str = "nitin"; // even number - puttup?
       // checkPalindrome(str);
       boolean result = isPalindrome(str);
       System.out.println(str+ " IsPalinDrome : " +  result);


    }
//using recursion

    public static boolean isPalindrome(String str){

        if(str ==  null){
            return false;
        }
        if (str.length() <= 1) {
            return true; // empty and only 1 chr also palindrome
        }

        String first = str.substring(0,1);
        String last = str.substring(str.length()-1,str.length());
        if(!first.equals(last)){
            return false;
        }else {
            return isPalindrome(str.substring(1,str.length()-1)); // pass iti
        }

    }

    public static void checkPalindrome(String str){
        //check length string- must be odd // can be even?
        //if reverse string is equal orignal str,


            StringBuffer buffer = new StringBuffer(str);
            String rev = buffer.reverse().toString();
            if(rev.equals(str)){
                System.out.println("this is Palindrome");
            }else {
                System.out.println("this is not Palindrome");
            }
        }


}
