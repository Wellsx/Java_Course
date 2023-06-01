package chapter10_Polymorphism.exercise;

public class Market {

    public static void main(String[] args){

        Apple apple = new Apple();
        apple.getCalories();
        apple.slice();
        apple.makeJuice();
        serve(apple);
        System.out.println(apple.getCalories() + " kcal");

        Banana banana = new Banana();
        banana.peel();
        banana.makeJuice();
        serve(banana);
        System.out.println(banana.getCalories() + " kcal");

    }

    public static void serve(Fruit fruit){
        if (fruit instanceof Apple){
            System.out.println("Here is your apple juice!");
        } else if (fruit instanceof Banana) {
            System.out.println("Here is your banana juice!");
        }
    }
}
