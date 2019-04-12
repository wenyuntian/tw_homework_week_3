package practice10;

import java.util.ArrayList;

public class Klass {
    private int number;
    private Student leader;
    private ArrayList studentList = new ArrayList();

    public Klass(int number) {
        this.number = number;
    }

    public void assignLeader(Student student) {
        if (this.studentList.contains(student)) {
            this.leader = student;
        }
        else {
            System.out.println("It is not one of us.");
        }
    }

    public void appendMember(Student student) {
        studentList.add(student);
    }

    public int getNumber() {
        return number;
    }

    public Student getLeader() {
        return leader;
    }
    public  String getDisplayName() {
        return String.format("Class %d", getNumber());
    }
}
