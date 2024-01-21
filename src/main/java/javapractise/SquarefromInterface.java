package javapractise;

public class SquarefromInterface implements Shapes {
    String color;
    double radius;

    SquarefromInterface(String color, double radius){
        this.color = color;
        this.radius = radius;
    }
    @Override
    public String color() {
        return color;
    }

    @Override
    public double area() {
        return Math.pow(radius,2);
    }

    @Override
    public String info() {
        return "I am from Interface : " + color()+ " Square and area is "+area();
    }
}
