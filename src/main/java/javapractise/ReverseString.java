package javapractise;

public class ReverseString {


    public static void main(String[] args) {
        String str = "java is a good programming language";
       // makeReverseString(str);
       // makeReverseByBuffer(str);
        makeReverse(str);
    }

    //#1using StringBuffer class
    public static void makeReverseByBuffer(String str) {
        StringBuffer sb = new StringBuffer(str);
        String result = sb.reverse().toString();
        System.out.println(result);
    }

    public static void makeReverse(String str){
        String result = "";
        for(int i=str.length()-1; i>=0; i--){
            result = result+str.charAt(i);
        }
        System.out.println(result);

    }


    //making with array
    public static void makeReverseString(String str){
        //#2 add the given string from end of the string into array
       int strsize = str.length();
       String[] reveseString = new String[strsize];
        int j=0;
        for(int i=strsize-1; i>=0; i--){//
            {
                reveseString[j] = String.valueOf(str.charAt(i));
                j++;
            }

        }
        for (String ch :reveseString) {
            System.out.print(ch);
        }
    }

}
