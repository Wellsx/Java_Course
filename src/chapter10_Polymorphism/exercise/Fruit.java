package chapter10_Polymorphism.exercise;

public class Fruit {

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int calories;

    public void makeJuice(){
        System.out.println("Juice is made!");
    }
}
