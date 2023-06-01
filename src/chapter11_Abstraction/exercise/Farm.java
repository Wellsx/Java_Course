package chapter11_Abstraction.exercise;

public class Farm {

    public static void main(String[] args){
        Animal pig = new Pig();
        pig.makeSound();
        pig.eat();

        Duck duck = new Duck();
        duck.makeSound();
        duck.eat();
    }
}
