import java.util.Scanner;
import java.util.Vector;

public class Point {
    public Point() {
    };

    Scanner sc = new Scanner(System.in);
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void set(String name) {
        System.out.printf("Nhap vao toa do x cua diem %s:", name);
        x = sc.nextDouble();
        System.out.printf("Nhap vao toa do y cua diem %s:", name);
        y = sc.nextDouble();
    }

    public void show() {
        System.out.printf("(%.1f, %.1f", x, y);

    }

    public boolean isCollinear(Point a, Point b) {
        double t = this.x * (a.y - b.y) +
                a.x * (b.y - this.y) +
                b.x * (this.y - a.y);
        if (t == 0)
            return true;
        else
            return false;
    }

    public double distance(Point a) {
        double distance = 0;
        distance = Math.sqrt(Math.pow(this.x - a.x, 2.0) + Math.pow(this.y - a.y, 2.0));
        return distance;
    }

    public void LineThrough2Points(Point a) {
        Vector<Double> vtpt = new Vector<>();
        vtpt.add((double) (this.y - a.y));
        vtpt.add((double) (a.x - this.x));
        double c = (vtpt.get(0) * (-this.x)) + (vtpt.get(1) * (-this.y));

        System.out.println("Phuong trinh duong thang di qua 2 diem la: " + vtpt.get(0) +
                " x + " + vtpt.get(1) + " y + " + c +
                " = 0");
    }
}
