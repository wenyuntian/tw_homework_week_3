package practice08;

public class Student extends Person{
    private Klass klass;

    public Student(int age, String name, int id, Klass klass) {
        super(age, name, id);
        this.klass = klass;
    }

    public String introduce() {
        String personIntroduce = super.introduce();
        Boolean isSamePerson = this.getId() == klass.getLeader().getId();

        if(isSamePerson) {
            return String.format("%s I am a Student. I am Leader of Class %d.", personIntroduce, this.klass.getNumber());
        }
        return String.format("%s I am a Student. I am at Class %d.", personIntroduce, this.klass.getNumber());
    }

    public Klass getKlass() {
        return klass;
    }
}
