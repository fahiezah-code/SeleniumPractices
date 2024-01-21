package javapractise;

public class CircleFromInterface implements Shapes {

    String color;
    double radius;

    public CircleFromInterface(String color, double radius){
        this.color = color;
        this.radius = radius;
    }

    @Override
    public String color() {
        return color;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public String info() {
        return "I am from interface : " + color() + " Circle my area is "+area();
    }
}
