package problems.classpractice;

class Rectangle{
    private double length;
    private double width;

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public void setLength(double l){
        if (l >= 0){
            this.length = l;
        }else{
            length = 0;
        }

    }

    public void setWidth(double w){
        if (w >= 0){
            this.width = w;
        }else{
            length = 0;
        }
    }

    public double findArea(){
        return length * width;
    }

    public double findPerimeter(){
        return 2*(length + width);
    }

    public boolean isSquare(){
        return length == width;
    }
}

public class Rectangle1{


    public static void main(String[] args){
        Rectangle r = new Rectangle();
        r.setLength(5.0);
        r.setWidth(10.0);
        System.out.println("The area of the rectangle is " + r.findArea());
        System.out.println("The perimeter of the rectangle is " + r.findPerimeter());
        System.out.println("Is the rectangle a square? " + r.isSquare());
    }
}
