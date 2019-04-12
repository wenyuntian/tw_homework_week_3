package practice05;

public class Worker extends Person{
    public Worker(String name, int age) {
        super(name, age);
    }

    public String introduce() {
        String personIntroduce = super.introduce();
        return String.format("%s I am a Worker. I have a job.", personIntroduce, this.getName(), this.getAge());
    }
}
