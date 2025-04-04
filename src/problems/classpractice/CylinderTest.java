package problems.classpractice;

class Cylinder{
    public double radius;
    public double height;

    public double lidArea(){
        return Math.PI * radius * radius;
    }

    public double volume(){
        return lidArea() * height;
    }

    public double surfaceArea(){
        return 2 * Math.PI * radius * (radius + height);
    }
}

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.radius = 5.0;
        c.height = 10.0;
        System.out.println("The area of the cylinder is " + c.surfaceArea());
        System.out.println("The volume of the cylinder is " + c.volume());
        System.out.println("The lid area of the cylinder is " + c.lidArea());
    }
}
