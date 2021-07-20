package com.vanzay;

public class Task2PointList {
    private Task2Point[] points = new Task2Point[0];

    public void add(Task2Point point) {
        Task2Point[] tmp = new Task2Point[points.length + 1];
        tmp[tmp.length - 1] = point;
        System.arraycopy(points, 0, tmp, 0, points.length);
        points = tmp;
    }

    public Task2Point get(int index) {
        return points[index];
    }

    public int size() {
        return points.length;
    }
}
