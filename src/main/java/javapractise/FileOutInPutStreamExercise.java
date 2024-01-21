package javapractise;

import java.io.*;

public class FileOutInPutStreamExercise {

    public static void main(String[] args) {

        String dirPath = "folder" + File.separator + "anotherfolder";

        // create file path
        File dir = new File(dirPath);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        File file = new File(dirPath + File.separator + "MyFile.txt");

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println(file.getName());
        System.out.println("My file path" + file.getAbsolutePath());
        System.out.println("file can write" + file.canWrite());

        //write text to file
        try {
            FileOutputStream os = new FileOutputStream(file);
            String str = "My String";
            os.write(str.getBytes());
            os.flush();
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Read file

        try {
            FileInputStream is = new FileInputStream(file);
            int i;
            while ((i = is.read()) != -1) {
                System.out.print((char) i);
            }
            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

      //  file.delete();


    }
}
