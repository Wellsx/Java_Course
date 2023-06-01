package chapter6_Classes_Objects;

public class Rectangle {

    private double length;
    private double width;
    //default constructor
    public Rectangle(){
        length = 0;
        width = 0;
    }
    //constructor with known parameters
    public Rectangle(double length, double width){
        this.length = length; // can be set this way
        setWidth(width);
    }
    //getter
    public double getLength(){
        return length;
    }
    //setter
    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    public double calculateArea(){
        return length * width;
    }
}
