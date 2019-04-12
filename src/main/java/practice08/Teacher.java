package practice08;

public class Teacher extends Person{
    private Klass klass;

    public Teacher(int age, String name, int id) {
        super(age, name, id);
        this.klass = null;
    }

    public Teacher(int age, String name, int id, Klass klass) {
        super(age, name, id);
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
