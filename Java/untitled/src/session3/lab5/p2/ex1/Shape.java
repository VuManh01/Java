package session3.lab5.p2.ex1;

public abstract class Shape {
    public String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}
