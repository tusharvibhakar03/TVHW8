package hw8;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

        public void main(String[] args) {

            Point first = new Point();

            Point second = new Point();

            first.setY(6);
            first.setX(9);

            second.setX(12);
            second.setY(3);

            System.out.println("distance from point 'first' to point 'second = " + first.distance(second));

        }


    public double distance() {
        return distance(0, 0);
    }
    public double distance(int x, int y) {
        System.out.println("this.x and this.y " + this.x + " " + this.y);

        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }

    public double distance(Point secondPoint) {

        return distance(secondPoint.x, secondPoint.y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


