package chapter10_Polymorphism.exercise;

public class Banana extends Fruit {

    public void peel(){
        System.out.println("Peeled!");
    }
    @Override
    public void makeJuice(){
        System.out.println("Banana juice is made!");
    }

    public Banana(){
        setCalories(250);
    }
}
