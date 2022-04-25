import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {   
        Scanner sc = new Scanner(System.in);
        double x, y, z;
        Point3d a = new Point3d();
        Point3d b = new Point3d();
        Point3d c = new Point3d();
        Point3d d = new Point3d();

        System.out.print("Moi nhap vao diem A: ");        
        x = sc.nextDouble();
        a.setX(x);
        y = sc.nextDouble();
        a.setY(y);
        z = sc.nextDouble();
        a.setZ(z);

        System.out.print("Moi nhap vao diem B: ");        
        x = sc.nextDouble();
        b.setX(x);
        y = sc.nextDouble();
        b.setY(y);
        z = sc.nextDouble();
        b.setZ(z);

        System.out.print("Moi nhap vao diem C: ");        
        x = sc.nextDouble();
        c.setX(x);
        y = sc.nextDouble();
        c.setY(y);
        z = sc.nextDouble();
        c.setZ(z);

      System.out.print("Moi nhap vao diem D: ");        
        x = sc.nextDouble();
        d.setX(x);
        y = sc.nextDouble();
        d.setY(y);
        z = sc.nextDouble();
        d.setZ(z);
            a.LineThrough3Points(b,c);
        

    if(Point3d.kiemtramatphang(a, b, c, d) == true)
           System.out.println("Diem d thuoc mat phang!");
        else
            System.out.println("Diem d khong thuoc mat phang!");


    }
}
