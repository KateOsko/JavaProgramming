package day28_05_24_2022;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {
    public static void main(String[] args) throws FileNotFoundException {


//    Thread.sleep(3000);
//    FileInputStream fileInputStream = new FileInputStream("path");

        System.out.println("Before I read the File");
        waitFor(3);
        readFromFile("path");
        System.out.println("After I read the File");

    }

    public static void waitFor(int second)  {
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public static void readFromFile(String path) throws FileNotFoundException {

        // Option 1 with try catch
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException is handled");
        }

        // Option 2 create throws
        FileInputStream fileInputStream = new FileInputStream(path);
    }

}
