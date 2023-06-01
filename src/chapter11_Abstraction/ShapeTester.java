package chapter11_Abstraction;

public class ShapeTester {

    public static void main(String[] args){
        //cant instantiate shape have to use subclass rectangle
        Shape rectangle = new Rectangle(5,7);
        rectangle.print();
        System.out.println(rectangle.calculateArea());
    }
}
