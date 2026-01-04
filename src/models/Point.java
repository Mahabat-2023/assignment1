package models;

public class Point {

    private final double coordX;
    private final double coordY;

    public Point(double coordX, double coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public double distance(Point target) {
        double dx = coordX - target.coordX;
        double dy = coordY - target.coordY;
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return String.format("[%.2f ; %.2f]", coordX, coordY);
    }
}
