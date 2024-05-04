package session3.lab5.p2.ex1;

public class TestShape {
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(2,20);
        rectangle.setColor("Blue");
        Triangle triangle = new Triangle(10,15);
        triangle.setColor("Red");
        System.out.println("Rectangle");
        System.out.println("Color: " + rectangle.getColor());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("===============");
        System.out.println("Triangle");
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Area: " + triangle.getArea());
    }
}
