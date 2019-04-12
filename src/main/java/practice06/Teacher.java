package practice06;

public class Teacher extends Person {
    private int klass;

    public Teacher(String name, int age) {
        super(name, age);
        this.klass = 0;
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }
    public String introduce() {
        String personIntroduce = super.introduce();

        if(this.klass == 0) {
            return String.format("%s I am a Teacher. I teach No Class.", personIntroduce);
        }
        return String.format("%s I am a Teacher. I teach Class %d.", personIntroduce, this.klass);
    }

    public int getKlass() {
        return klass;
    }
}
