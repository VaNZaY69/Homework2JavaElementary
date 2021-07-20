package com.vanzay;

public class Task2Circle {
    Task2Point center;
    double radius;

    public Task2Circle(Task2Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public boolean containsPoint(Task2Point point) {
        double distance = center.distanceTo(point);
        return distance <= radius;
    }
}
