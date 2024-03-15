package javaexercises;

public class CheckIdentificationNumber {

    public static void main(String[] args){
        computeCheckDigit("3456");
    }

    public static int computeCheckDigit(String idnumber){
        char[] ch = idnumber.toCharArray();
        int sum = 0;
        int lastDigit = 0;
        int result = 0;
        //sum digit for even-position
      for(int i=0; i<ch.length; i++){
          if(i%2 == 0){
              sum += ch[i] - '0';
              // sum += '3' -> 86 - '0' -> 83;
            //  sum += Integer.parseInt(String.valueOf(ch[i]));
          }
      }

        System.out.println("Sum :"+sum); // 8
        sum = sum * 3; //  24
        for(int i=0; i<ch.length; i++){
            if(i%2 != 0){
                sum += ch[i] - '0';
               // sum += Integer.parseInt(String.valueOf(ch[i])); //34
            }
        }
        //take last digit
        String lsd = String.valueOf(sum);
        String t = String.valueOf(lsd.charAt(lsd.length()-1));
        lastDigit = Integer.parseInt(t);

        if(lastDigit != 0){
            result = 10 - lastDigit;
            System.out.println(result);
            return result;
        }else return 0;

    }
}
