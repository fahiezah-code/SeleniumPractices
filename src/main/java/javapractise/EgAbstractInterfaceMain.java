package javapractise;

public class EgAbstractInterfaceMain {

    public static void main(String[] args){
        Circle circle = new Circle("Red", 5);
        System.out.println(circle.info());

        Square sq = new Square("Blue", 7);
        System.out.println(sq.info());

        CircleFromInterface circleFromInterface = new CircleFromInterface("Purple", 3);
        System.out.println(circleFromInterface.info());

        SquarefromInterface squarefromInterface = new SquarefromInterface("white", 2);
        System.out.println(squarefromInterface.info());

        //can directly access static method under Interface
        Shapes.staticMethod();
        System.out.println(Shapes.i);
    }

}
