package problems.classpractice;

class StudentCreate {
    public String name;
    public String course;
    public int mark1,mark2,mark3;

    public int total(){
        return mark1+mark2+mark3;
    }

    public int average(){
        return total()/3;
    }

    public char grade(){
        if(average() >= 90){
            return 'A';
        }else if(average() >= 80){
            return 'B';
        }else if(average() >= 70){
            return 'C';
        }else if(average() >= 60){
            return 'D';
        }else{
            return 'F';
        }
    }
}

public class Student {
    public static void main(String[] args) {
        StudentCreate s1 = new StudentCreate();
        s1.name = "Marissa";
        s1.course = "Math";
        s1.mark1 = 90;
        s1.mark2 = 80;
        s1.mark3 = 70;
        System.out.println("Name: " + s1.name);
        System.out.println("Course: " + s1.course);
        System.out.println("Total: " + s1.total());
        System.out.println("Average: " + s1.average());
        System.out.println("Grade: " + s1.grade());
    }
}
