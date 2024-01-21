package javapractise;

public class Square extends Shape{
    double side;
    public Square(String color, double side) {
        super(color);
    }

    @Override
    double area() {
        return Math.pow(side,2);
    }

    @Override
    String info() {
        return "I am from abstract class :  " + super.color + " Square and area is "+ area();
    }
}
