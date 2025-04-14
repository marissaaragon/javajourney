package problems.threadpractice;

class Whiteboard{
    String text;
    int numOfStudents;
    int count = 0;

    public void attendance(){
        numOfStudents++;
    }

    synchronized public void write(String t) {
        System.out.println("Teacher is Writing " + t);
        while (count != 0)
            try {
                wait();
            } catch (Exception e) {
            }
        text = t;
        count = numOfStudents;
        notifyAll();
    }

    synchronized public String read()
    {
        while(count==0)
            try{wait();}catch(Exception e){}

        String t=text;
        count--;
        if(count==0)
            notify();
        return t;
    }
}

class Teacher extends Thread{
    Whiteboard wb;

    String[] notes ={"Java is a language", "It is OOP", "It supports threads", "end"};

    public Teacher(Whiteboard w){
        wb = w;
    }

    public void run(){
        for (int i = 0; i<notes.length; i++){
            wb.write(notes[i]);
        }
    }

}

class Student extends Thread{
    Whiteboard wb;
    String name;

    public Student(String n, Whiteboard w){
        name = n;
        wb = w;
    }

    public void run(){
         String text;
         wb.attendance();

         do{
             text = wb.read();
             System.out.println(name + " is reading " + text);
             System.out.flush();
         }while (!text.equals("end"));
    }
}

public class Classroom {
    public static void main(String[] args){
        Whiteboard wb = new Whiteboard();
        Teacher t = new Teacher(wb);

        Student s1 = new Student("1. John", wb);
        Student s2 = new Student("2. Harry", wb);
        Student s3 = new Student("3. Jake", wb);
        Student s4 = new Student("4. Tom", wb);

        t.start();
        s1.start();
        s2.start();
        s3.start();
        s4.start();


    }
}
