package javapractise;

public class ExtractLastFourChar {

    public static void main(String[] args){
        String str = "www.erostrum.com";
        verifySubString(str);
    }

    public static void verifySubString(String str){

        String firstFour = str.substring(0,4);
        System.out.println(firstFour);
        String lastFour = str.substring(str.length()-4,str.length());
        System.out.println(lastFour);
        String website = str.substring(4,str.length()-4);
        System.out.println(website);
    }
}
