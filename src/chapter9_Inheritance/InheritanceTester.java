package chapter9_Inheritance;

public class InheritanceTester {

    public static void main(String[] args){

        Employee employee = new Employee();

        Rectangle rectangle = new Rectangle();
        rectangle.print();

        Square square = new Square();
        square.print();

        Mother mom = new Mother();
        mom.setName("Test");

        System.out.println(mom.getName() + " is a " + mom.getGender());
    }
}
