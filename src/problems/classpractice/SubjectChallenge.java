package problems.classpractice;

class Subject{
    private String name;
    private int id;
    private int maxMarks;
    private int marksObtained;

    public Subject(String name, int id, int maxMarks, int marksObtained){
        this.name = name;
        this.id = id;
        this.maxMarks = maxMarks;
        this.marksObtained = marksObtained;
    }

    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public int getMaxMarks(){
        return maxMarks;
    }
    public int getMarksObtained(){
        return marksObtained;
    }
    public void setMarksObtained(int marksObtained){
        this.marksObtained = marksObtained;
    }
    public void setMaxMarks(int maxMarks){
        this.maxMarks = maxMarks;
    }

    public String toString()
    {
        return"\n SubjectID: "+id+"\n Name: "+name+"\n MarksObtained: "+marksObtained;
    }

}

public class SubjectChallenge {
    public static void main(String[] args){
       Subject subjects[] = new Subject[3];
       subjects[0] = new Subject("Maths", 101, 100, 80);
       subjects[1] = new Subject("Science", 102, 100, 90);
       subjects[2] = new Subject("English", 103, 100, 70);

       for (Subject s : subjects){
           System.out.println(s);
       }
    }
}
