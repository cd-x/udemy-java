package main.java.delta;

public class Point implements Comparable {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return String.format("x->%d, y-> %d", x, y);
    }

    @Override
    public int compareTo(Object o) {
        Point p = (Point) o;
        // sorting in ascending order
        if (x == p.x)
            return Integer.compare(y, p.y);
        return Integer.compare(x, p.x);
    }
}
