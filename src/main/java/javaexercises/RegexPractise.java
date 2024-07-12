package javaexercises;



import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractise {

    public static void main(String[] args) {
//^[A-Za-z0-9._]+@[A-Za-z0-9]+\.[A-Za-z]{3}$
        Pattern pt = Pattern.compile("^[A-Za-z0-9]+@[A-Za-z]+\\.[a-z]{3}$");
        Matcher matcher = pt.matcher("khuhji@gmail.com");
        boolean flag = matcher.find();
        System.out.println(flag);

    }
}
