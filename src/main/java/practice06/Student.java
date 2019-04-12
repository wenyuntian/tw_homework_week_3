package practice06;

public class Student extends Person{
    private int klass;

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public String introduce() {
        String personIntroduce = super.introduce();

        return String.format("%s I am a Student. I am at Class %d.", personIntroduce, this.klass);
    }

    public int getKlass() {
        return klass;
    }
}
