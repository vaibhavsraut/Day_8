package com.day8;

import java.util.Objects;

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Line {
    Point startPoint, endPoint;

    Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    double calculateLength() {
        int x1 = startPoint.x;
        int y1 = startPoint.y;
        int x2 = endPoint.x;
        int y2 = endPoint.y;

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    boolean equals(Line otherLine) {
        return startPoint.equals(otherLine.startPoint) && endPoint.equals(otherLine.endPoint);
    }

    int compareTo(Line otherLine) {
        double thisLength = calculateLength();
        double otherLength = otherLine.calculateLength();

        if (thisLength < otherLength) {
            return -1;
        } else if (thisLength > otherLength) {
            return 1;
        } else {
            return 0;
        }
    }
}

public class LineComparisonProgram {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program on Master Branch\n");

        Point point1 = new Point(1, 2);
        Point point2 = new Point(4, 6);

        Line line1 = new Line(point1, point2);
        Line line2 = new Line(new Point(3, 5), new Point(6, 9));

        System.out.println("Length of Line 1: " + line1.calculateLength());
        System.out.println("Length of Line 2: " + line2.calculateLength());

        System.out.println("Line 1 equals Line 2: " + line1.equals(line2));

        int comparisonResult = line1.compareTo(line2);
        if (comparisonResult < 0) {
            System.out.println("Line 1 is shorter than Line 2");
        } else if (comparisonResult > 0) {
            System.out.println("Line 1 is longer than Line 2");
        } else {
            System.out.println("Line 1 is equal in length to Line 2");
        }
    }
}
