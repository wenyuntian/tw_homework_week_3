package practice10;


public class Student extends Person{
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public String introduce() {
        String personIntroduce = super.introduce();
        Student leader = klass.getLeader();
        if(leader != null) {
            Boolean isSamePerson = this.getId() == klass.getLeader().getId();
            if(isSamePerson) {
                return String.format("%s I am a Student. I am Leader of Class %d.", personIntroduce, this.klass.getNumber());
            }
        }
        return String.format("%s I am a Student. I am at Class %d.", personIntroduce, this.klass.getNumber());
    }

    public Klass getKlass() {
        return klass;
    }
}
