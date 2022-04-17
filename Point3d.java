import java.util.Scanner;
import java.util.Vector;

public class Point3d extends Point {
    public Point3d() {
    };

    private double z;

    public Point3d(double x, double y, double z) {
        super();
        this.z = z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    @Override
    public void set(String name) {
        super.set(name);
        System.out.printf("Nhap vao toa do z cua diem %s:", name);
        z = sc.nextDouble();
    }

    @Override
    public void show() {
        super.show();
        System.out.printf(", %.1f)", z);
        System.out.println();
    }

    public void LineThrough3Points(Point3d a, Point3d b) {
        Vector<Double> vt1 = new Vector<>();
        vt1.add((double) (a.getX() - this.getX()));
        vt1.add((double) (a.getY() - this.getY()));
        vt1.add((double) (a.getZ() - this.getZ()));
        Vector<Double> vt2 = new Vector<>();
        vt2.add((double) (b.getX() - this.getX()));
        vt2.add((double) (b.getY() - this.getY()));
        vt2.add((double) (b.getZ() - this.getZ()));
        Vector<Double> vtpt = new Vector<>();
        double x = (vt1.get(1) * vt2.get(2)) - (vt1.get(2) * vt2.get(1));
        double y = (vt1.get(2) * vt2.get(0)) - (vt1.get(0) * vt2.get(2));
        double z = (vt1.get(0) * vt2.get(1)) - (vt1.get(1) * vt2.get(0));
        vtpt.add(x);
        vtpt.add(z);
        vtpt.add(y);
        double c = (vtpt.get(0) * (-this.getX())) + (vtpt.get(1) * (-this.getY())) + (vtpt.get(2) * (-this.getZ()));
        System.out.println("Phuong trinh mat phang di qua 3 diem la: " + x +
                "x + " + y + "y + " + z +
                "z + " + c + " = 0.");
    }
    public static void ptmatphang(Point3d a, Point3d b, Point3d c)
    {
        Vector<Double> ab = new Vector<>();
        ab.add((double) (b.getX() - a.getX()));
        ab.add((double) (b.getY() - a.getY()));
        ab.add((double) (b.getZ() - a.getZ()));
        
        Vector<Double> bc = new Vector<>();
        bc.add((double) (c.getX() - b.getX()));
        bc.add((double) (c.getY() - b.getY()));
        bc.add((double) (c.getZ() - b.getZ()));
    
        Vector<Double> vtpt = new Vector<>();
        double x = (ab.get(1) * bc.get(2)) - (ab.get(2) * bc.get(1));
        double y = (ab.get(2) * bc.get(0)) - (ab.get(0) * bc.get(2));
        double z = (ab.get(0) * bc.get(1)) - (ab.get(1) * bc.get(0));

        vtpt.add(x);
        vtpt.add(y);
        vtpt.add(z);

        double hesotudo = -((x * (a.getX())) + (y * (a.getY())) + (z * (a.getZ())));

        System.out.println("Phuong trinh mat phang di qua 3 diem la: " + x +
                "x + " + y + "y + " + z +
                "z + " + hesotudo + " = 0.");
    }
    public static boolean kiemtramatphang(Point3d a, Point3d b, Point3d c, Point3d d)
    {
        Vector<Double> ab = new Vector<>();
        ab.add((double) (b.getX() - a.getX()));
        ab.add((double) (b.getY() - a.getY()));
        ab.add((double) (b.getZ() - a.getZ()));
        
        Vector<Double> bc = new Vector<>();
        bc.add((double) (c.getX() - b.getX()));
        bc.add((double) (c.getY() - b.getY()));
        bc.add((double) (c.getZ() - b.getZ()));
    
        Vector<Double> vtpt = new Vector<>();
        double x = (ab.get(1) * bc.get(2)) - (ab.get(2) * bc.get(1));
        double y = (ab.get(2) * bc.get(0)) - (ab.get(0) * bc.get(2));
        double z = (ab.get(0) * bc.get(1)) - (ab.get(1) * bc.get(0));

        vtpt.add(x);
        vtpt.add(y);
        vtpt.add(z);

        double hesotudo = -((x * (a.getX())) + (y * (a.getY())) + (z * (a.getZ())));

        if(d.getX() * x + d.getY() * y + d.getZ() * z + hesotudo == 0)
            return true;
        else 
            return false;
    }
}