package session3.lab4;

public class TestCylinder {
    public static void main(String[] args){
        Cylinder cylinder = new Cylinder(21,"Red",10);
        System.out.println("Height: " + cylinder.getHeight());
        System.out.println("Area: " + cylinder.getArea());
        System.out.println("Volume: " + cylinder.getVolume());
    }
}
