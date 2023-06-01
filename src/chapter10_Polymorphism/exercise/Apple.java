package chapter10_Polymorphism.exercise;

public class Apple extends Fruit {


    @Override
    public void makeJuice(){
        System.out.println("Apple juice is made!");
    }
    public void slice(){
        System.out.println("Sliced in half!");
    }

    public Apple(){
        setCalories(150);


    }
}
