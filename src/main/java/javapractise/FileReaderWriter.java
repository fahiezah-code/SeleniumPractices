package javapractise;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {

    public static void main(String[] args){

        //create new file
        File fl = new File("MyNotes.txt");

        if(!fl.exists()){
            try{
                fl.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        System.out.println(fl.getAbsolutePath());

        // write the notes to file
        try{
            FileWriter fwriter = new FileWriter(fl);
            fwriter.write("first line");
            fwriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }

        //Read file

        try{
            FileReader freader = new FileReader(fl);
            int i;
            while((i = freader.read()) != -1){
                System.out.print((char)i);;
            }
                freader.close();
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
