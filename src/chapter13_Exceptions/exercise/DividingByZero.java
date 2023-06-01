package chapter13_Exceptions.exercise;

public class DividingByZero {

    public static void main(String[] args){

        try{
            int c = 30/0;
        }catch(Exception e){
            System.out.println("Dividing by zero is not allowed.");
        }
        finally{
            System.out.println("Division is fun");
        }
    }


}
