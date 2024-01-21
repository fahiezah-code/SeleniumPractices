package javapractise;

abstract class Shape {

    String color;

    public Shape(String color){
        this.color = color;
    }

    // if don't give abstrat keyword, need to add body
     abstract double area();
     abstract String info();

    public String getColor(){
        return color;
    }


}
