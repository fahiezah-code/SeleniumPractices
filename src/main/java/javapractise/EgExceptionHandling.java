package javapractise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLSyntaxErrorException;

public class EgExceptionHandling {

   public static void main(String[] args) {


       File file = new File("c://myfile.txt");
       FileReader fr= null;

       {
           try {
               fr = new FileReader(file);
           } catch (FileNotFoundException e) {
               //throw new RuntimeException(e);
               e.printStackTrace();
           }

           // try with resources option, then no need below finally code

           finally {
               try{
                   if(fr!=null){
                       fr.close();
                   }
               }catch (IOException e){
                   e.printStackTrace();

               }

           }


       }

       //if don't throw, below code will work
       System.out.println("after exception");

   }




}
