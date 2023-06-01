package chapter13_Exceptions;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String args[]) {

        //createNewFile();
        numbersExceptionHandling();
        //createNewFileRethrow();
    }

    public static void createNewFile() {
        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
        } catch (Exception e) {
            System.out.println("Directory does not exist.");
            e.printStackTrace();
        }
    }

    // add throws <exception> to header to not handle the exception
    public static void createNewFileRethrow() throws IOException{
        File file = new File("resources/nonexistent.txt");
        file.createNewFile();

    }
    public static void numbersExceptionHandling() {
        File file = new File("resources/numbers.txt");

        //code that can potentially throw an exception
        // adding resource to try block () closes it automatically when try block is done
        // no need for a finally clause to close
        try(Scanner fileReader = new Scanner(file);) {
            while (fileReader.hasNext()) {
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        }
        // catch to handle the exception, use | to add more exceptions to block
        catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        }
        //finally clause executed after try and after any catch even if catch doesnt execute
        /*finally{
            fileReader.close();

        }*/
    }
}