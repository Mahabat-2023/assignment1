package models;

import java.util.List;
import java.util.ArrayList;

public class Shape {

    private final List<Point> vertices = new ArrayList<>();

    public void addPoint(Point point) {
        vertices.add(point);
    }

    public double getPerimeter() {
        if (vertices.size() < 2) return 0;

        double sum = 0;
        Point prev = vertices.getLast();

        for (Point current : vertices) {
            sum += prev.distance(current);
            prev = current;
        }
        return sum;
    }

    public double getLongestSide() {
        if (vertices.size() < 2) return 0;

        double max = 0;
        Point prev = vertices.getLast();

        for (Point current : vertices) {
            double len = prev.distance(current);
            if (len > max) {
                max = len;
            }
            prev = current;
        }
        return max;
    }

    public double getAverageSide() {
        if (vertices.isEmpty()) return 0;
        return getPerimeter() / vertices.size();
    }
}
