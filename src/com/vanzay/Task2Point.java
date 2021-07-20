package com.vanzay;


public class Task2Point {
    public static final Task2Point ORIGIN = new Task2Point(0, 0);

    double x;
    double y;

    public Task2Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceToOrigin() {
        return distanceTo(ORIGIN);
    }

    public double distanceTo(Task2Point point) {
        double dx = point.x - x;
        double dy = point.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return "[" + x + "," + y + "]";
    }
}
