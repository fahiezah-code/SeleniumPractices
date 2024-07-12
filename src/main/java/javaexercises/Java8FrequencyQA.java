package javaexercises;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8FrequencyQA {

    public static void main(String[] args) {

        String input = "ilovejavatechie";
        int value = 1;
        HashMap<Character,Integer> hmap = new HashMap<>();
        char[] charr = input.toCharArray();
        for(char ch : charr){
            if(hmap.containsKey(ch)){
                hmap.put(ch,hmap.get(ch)+1);
            }else{
                hmap.put(ch,value);
            }
        }
        List<Character> duplicateElements = new ArrayList<>();
        for(char i : hmap.keySet()){
            if(hmap.get(i)>1){

                duplicateElements.add(i);
            }
        }
        System.out.println(duplicateElements);
       // System.out.println(hmap);



        Set s=hmap.entrySet();
        Iterator i=s.iterator();
        while(i.hasNext()){
            Map.Entry m= (Map.Entry) i.next();
            System.out.println(""+m.getKey()+" "+ m.getValue());
        }

        //Java 8

//1. find char ocurrance count
    Map<String,Long> map =  Arrays.stream(input.split(""))
              .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
      //  System.out.println(map);

        //2. find duplicate element
       List<String> ls = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                        .entrySet().stream()
                        .filter(x -> x.getValue()>1)
                                .map(Map.Entry::getKey)
                                        .collect(Collectors.toList());
      //  System.out.println(ls);
//Find first non-repeat element

        String firstNonRepeatElement = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x-> x.getValue() == 1)
                .findFirst().get().getKey();
        System.out.println("first non repeat element"+firstNonRepeatElement);
//*****if we use here hashmap ->it doesn't store as per preserve order,
// then can't first non repeat char correctly, so need to use LinkedHashMap which stores as per preserved order

        List<String> ele = new ArrayList<>();
        ele.add("Element1");
        ele.add("Element2");
        ele.add("Element3");

        ele.stream()
                .map(in -> in.toUpperCase())
                .map(in -> in.toLowerCase());

        ele.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);



        //find longest string in an array

        String[] strArray = {"Java","microservices","techie","Springboot"};
      String longestString = Arrays.stream(strArray)
               .reduce((word1,word2) -> word1.length()>word2.length()?word1:word2)
               .get();
        System.out.println("Longest string"+longestString);

        int[] numbers ={1,32,11,24,56,32,45,32};
        List<String> stringList = Arrays.stream(numbers)
                .boxed()
                .map(sr -> sr+"")
                .filter(sr ->sr.startsWith("2"))
                .collect(Collectors.toList());
        System.out.println("start with 2 "+stringList);

        //String.join

       List<String> nos = Arrays.asList("1","2","3","4","5");

       String result =String.join("-",nos);
        System.out.println("with delimiter: "+result);

        //skip & limit method in usecase --> print 2 to 9 only from 1 to 10
        IntStream.rangeClosed(1,10)
                .skip(1)
                .limit(8)
                .forEach(System.out::print);

    }




    }

