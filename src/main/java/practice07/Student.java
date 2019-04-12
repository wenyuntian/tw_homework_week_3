package practice07;

public class Student extends Person{
    private Klass klass;

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public String introduce() {
        String personIntroduce = super.introduce();

        return String.format("%s I am a Student. I am at Class %d.", personIntroduce, this.klass.getNumber());
    }

    public Klass getKlass() {
        return klass;
    }
}
