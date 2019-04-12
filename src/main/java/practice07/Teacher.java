package practice07;

public class Teacher extends Person{
    private Klass klass;

    public Teacher(String name, int age) {
        super(name, age);
        this.klass = null;
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }
    public String introduce() {
        String personIntroduce = super.introduce();

        if(this.klass == null) {
            return String.format("%s I am a Teacher. I teach No Class.", personIntroduce);
        }
        return String.format("%s I am a Teacher. I teach Class %d.", personIntroduce, this.klass.getNumber());
    }
    public String introduceWith(Student student) {
        Klass studentKlass = student.getKlass();
        String personIntroduce = super.introduce();

        if(studentKlass.getNumber() == this.klass.getNumber()) {
            return String.format("%s I am a Teacher. I teach Jerry.", personIntroduce);
        }
        return String.format("%s I am a Teacher. I don't teach Jerry.", personIntroduce);
    }

    public Klass getKlass() {
        return klass;
    }
}
