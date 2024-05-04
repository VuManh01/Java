package session3.lab5.p2.ex3;

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(1, 1, 1, 1);
        System.out.println("Original Point: (" + movablePoint.x + ", " + movablePoint.y + ")");
        movablePoint.moveUp();
        System.out.println("After moving up: (" + movablePoint.x + ", " + movablePoint.y + ")");
        movablePoint.moveDown();
        System.out.println("After moving down: (" + movablePoint.x + ", " + movablePoint.y + ")");
        movablePoint.moveLeft();
        System.out.println("After moving left: (" + movablePoint.x + ", " + movablePoint.y + ")");
        movablePoint.moveRight();
        System.out.println("After moving right: (" + movablePoint.x + ", " + movablePoint.y + ")");

        System.out.println("==============");

        MovableCircle movableCircle = new MovableCircle(1, 1, 1, 1, 2);
        System.out.println("Original Point: (" + movableCircle.center.x + ", " + movableCircle.center.y + ")");
        movableCircle.moveUp();
        System.out.println("After moving up: (" + movableCircle.center.x + ", " + movableCircle.center.y + ")");
        movableCircle.moveDown();
        System.out.println("After moving down: (" + movableCircle.center.x + ", " + movableCircle.center.y + ")");
        movableCircle.moveLeft();
        System.out.println("After moving left: (" + movableCircle.center.x + ", " + movableCircle.center.y + ")");
        movableCircle.moveRight();
        System.out.println("After moving right: (" + movableCircle.center.x + ", " + movableCircle.center.y + ")");
    }
}
