package problems.classpractice;

class Cylinder{
    private double radius;
    private double height;

    public Cylinder(){
        radius = 1.0;
        height = 1.0;
    }

    public void setDimensions(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setHeight(double height){
        this.height = height;
    }

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
        c.setDimensions(3.0, 4.0);
        System.out.println("The area of the cylinder is " + c.surfaceArea());
        System.out.println("The volume of the cylinder is " + c.volume());
        System.out.println("The lid area of the cylinder is " + c.lidArea());
    }
}
