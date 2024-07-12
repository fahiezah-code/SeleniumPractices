package javaexercises;

public class Palindrome {

    public static void main(String[] args) {

        checkPalindrome("madams");
    }

    public static void checkPalindrome(String text) {

        //String B = "";
        StringBuilder B = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
          //  B += text.charAt(i);
            B.append(text.charAt(i));
        }

        if (text.equals(B.toString())) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }

}
