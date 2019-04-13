package practice11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person implements Observer{
    private LinkedList<Klass> classes = new LinkedList<Klass>();
    private String message;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        this.classes = null;
    }

    public Teacher(int id, String name, int age, LinkedList classes) {
        super(id, name, age);
        this.classes = classes;
        for (Klass klass : this.classes) {
            klass.registerObserver(this);
        }
    }

    public void update(String message) {
        this.message = message;
        read();
    }

    public void read() {
        String printMessage = String.format("I am %s. I know %s", this.getName(), message);
        System.out.println(printMessage);
    }

    public String introduce() {
        String personIntroduce = super.introduce();

        if (this.classes == null) {
            return String.format("%s I am a Teacher. I teach No Class.", personIntroduce);
        }
        List classesNumber = this.getClassesNumber().stream()
                .map(i -> String.valueOf(i))
                .distinct()
                .collect(Collectors.toList());

        return String.format("%s I am a Teacher. I teach Class %s.", personIntroduce, String.join(", ", classesNumber));
    }

    public ArrayList<Integer> getClassesNumber() {
        ArrayList result = new ArrayList();
        for (Klass item : classes) {
            result.add(item.getNumber());
        }
        return result;
    }

    public boolean isTeaching(Student student) {
        ArrayList classesNumber = getClassesNumber();
        Klass studentKlass = student.getKlass();
        return classesNumber.contains(studentKlass.getNumber());
    }

    public String introduceWith(Student student) {
        Klass studentKlass = student.getKlass();
        String personIntroduce = super.introduce();
        ArrayList classesNumber = getClassesNumber();

        if (classesNumber.contains(studentKlass.getNumber())) {
            return String.format("%s I am a Teacher. I teach %s.", personIntroduce, student.getName());
        }
        return String.format("%s I am a Teacher. I don't teach %s.", personIntroduce, student.getName());
    }

    public LinkedList getClasses() {
        return classes;
    }
}
