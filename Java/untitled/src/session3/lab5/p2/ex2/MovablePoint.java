package session3.lab5.p2.ex2;

interface Movable {
    public void moveUp();
    public void moveDown();
    public void moveLeft();
    public void moveRight();
}

public class MovablePoint implements Movable {
    private int x, y;

    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveUp() {
        y++;
    }

    @Override
    public void moveDown() {
        y--;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    @Override
    public String toString() {
        return "MovablePoint [x=" + x + ", y=" + y + "]";
    }

    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(0, 0);

        movablePoint.moveUp();
        System.out.println("Move up: " + movablePoint);

        movablePoint.moveRight();
        System.out.println("Move right: " + movablePoint);

        movablePoint.moveDown();
        System.out.println("Move down: " + movablePoint);

        movablePoint.moveLeft();
        System.out.println("Move left: " + movablePoint);
    }
}
