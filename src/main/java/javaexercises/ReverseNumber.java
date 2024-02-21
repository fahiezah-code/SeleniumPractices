package javaexercises;

public class ReverseNumber {

    public static void main(String[] args){

        //System.out.println(reverseNum(532));
        reverseNumber(245565);

    }

    public static int reverseNum(int number) {
        //convert int to string
        String str = String.valueOf(number);
        //validate if there is "-", put this "-" into new str
        //loop the string from the end
        //take last char, put into new string
        StringBuilder sb = new StringBuilder();
        for(int i=str.length()-1; i>=0; i--){
            sb.append(str.charAt(i));
        }
        return Integer.parseInt(sb.toString());

    }

    // reverse number by divinding the number by 10
    public static void reverseNumber(int number) {
      //take last digit -> %10
        //loop till num!=0 --> num/10
        //reverse rev*10 + last digit
        int digit;
        int reverse = 0;
        while(number != 0){
            digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        System.out.println(reverse);


    }



}
