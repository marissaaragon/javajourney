package problems.classpractice;

abstract class Shape{
    abstract public double area();
    abstract public double perimeter();
}

class Circle extends Shape{
    double radius;

    public double area(){
        return (Math.PI*radius*radius);
    }
    public double perimeter(){
        return (2*Math.PI*radius);
    }
}

class Rectangle extends Shape{
    double length;
    double width;

    public double area(){
        return length*width;
    }
    public double perimeter(){
        return 2*(length + width);
    }
}

public class Shapes {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        r.length = 10;
        r.width = 5;
        c.radius = 5;
        System.out.println("Rectangle: Area - " + r.area() + " Perimeter - " + r.perimeter());
        System.out.println("Circle: Area - " + c.area() + " Perimeter - " + c.area());
    }
}
