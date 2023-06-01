/*
You're going to create an object-oriented coin toss game — this project will consist of three classes.
The first class is Coin.
It should contain a field called side, encapsulation, constant variables for heads and tails, a method called flip(),
which randomly chooses heads or tails and assigns that value to side.
 */
package chapter13_Exceptions.exercise;

import java.util.Random;

public class Coin {

    private static String side;

    public static String heads = "Heads";
    public static String tails = "Tails";


    public static String flip(){
        Random random = new Random();
        int head = random.nextInt(2);
        if (head == 0){
            setSide(heads);
        } else{
            setSide(tails);
        }
        return getSide();
}

    public static String getSide() {
        return side;
    }

    public static void setSide(String side) {
        Coin.side = side;
    }
}

