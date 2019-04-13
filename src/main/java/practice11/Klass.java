package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass implements Observerable {
    private int number;
    private Student leader;
    private ArrayList studentList = new ArrayList();

    private List<Observer> list;
    private String message;

    public Klass(int number) {
        list = new ArrayList<Observer>();
        this.number = number;
    }

    @Override
    public void registerObserver(Observer o) {

        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if(!list.isEmpty())
            list.remove(o);
    }

    //遍历
    @Override
    public void notifyObserver() {
        for(int i = 0; i < list.size(); i++) {
            Observer oserver = list.get(i);
            oserver.update(message);
        }
    }

    public void setInfomation(String s) {
        this.message = s;
        //消息更新，通知所有观察者
        notifyObserver();
    }


    public void assignLeader(Student student) {
        if (this.studentList.contains(student)) {
            setInfomation(String.format("%s become Leader of Class %d.", student.getName(), this.getNumber()));
            this.leader = student;
        }
        else {
            System.out.println("It is not one of us.");
        }
    }

    public void appendMember(Student student) {
        setInfomation(String.format("%s has joined Class %d.", student.getName(), this.getNumber()));
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
