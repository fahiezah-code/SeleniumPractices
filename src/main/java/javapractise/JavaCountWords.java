package javapractise;



import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class JavaCountWords {

    public static void main(String[] args) {

        String str = "I am learning learning java java programming";
        System.out.println("with StringTokennizer : "+countWordsStringTokennizer(str));
        System.out.println("with Split() : "+countWordsUsingSplit(str));
        System.out.println("not using any library : "+count(str));
        countWordUsingHashMap(str);


    }
    public static void countWordUsingHashMap(String sentence){

       String[] arr = sentence.split(" ");
       int count = 1;
       Map<String, Integer> map = new HashMap<String, Integer>();
       for (int i=0; i< arr.length; i++){
           if(!map.containsKey(arr[i])){
               map.put(arr[i],count);
           }else {
               map.put(arr[i],map.get(arr[i])+1);
           }
       }
       System.out.println("Using HashMap and Split()");
       //print the word and its count
        for (String x:map.keySet()) {
            System.out.println(x+" : "+map.get(x));
        }
    }

    //can use StringTokennizer for counting word
    public static int countWordsStringTokennizer(String sentence) {

        if (sentence == null || sentence.isEmpty()) {
            return 0;
        } else {
            StringTokenizer tokens = new StringTokenizer(sentence);
            return tokens.countTokens();
        }
    }
    //use Split()
    public static int countWordsUsingSplit(String input){
        if(input == null || input.isEmpty()){
            return 0;
        }else{
            String [] words = input.split("\\s+");
            return words.length;
        }
    }

    //find count without using split() and stringtokenizer()
    public static int count(String word){
        if(word == null || word.isEmpty()){
            return 0;
        }
        int wordCount = 0;
        boolean isWord = false;
        int endOfLine = word.length() - 1;

        char[] characters = word.toCharArray();

        for(int i=0; i<characters.length; i++){

            //if the char is a letter, word = true.
            if(Character.isLetter(characters[i]) && i != endOfLine){
                isWord = true;

                //if char isn't a letter and there have been letters before
                // counter goes up
            } else if (!Character.isLetter(characters[i]) && isWord) {
                wordCount++;
                isWord = false;
            //last word of String, if it doesn't end with a non letter
                //it wouldn't count without this
            } else if (Character.isLetter(characters[i]) && i == endOfLine) {
                wordCount++;
            }
        }
        return wordCount;
    }



}