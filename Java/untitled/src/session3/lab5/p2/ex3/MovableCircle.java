package session3.lab5.p2.ex3;

public class MovableCircle implements Movable{
        public MovablePoint center;
        public int radius;

        public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
            this.center = new MovablePoint(x, y, xSpeed, ySpeed);
            this.radius = radius;
        }

        @Override
        public void moveUp() {
            center.moveUp();
            center.y += radius;
        }

        @Override
        public void moveDown() {
            center.moveDown();
            center.y -= radius;
        }

        @Override
        public void moveLeft() {
            center.moveLeft();
            center.x -= radius;
        }

        @Override
        public void moveRight() {
            center.moveRight();
            center.x += radius;
        }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
