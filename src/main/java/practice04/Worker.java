package practice04;

public class Worker extends Person{

    public Worker(String name, int age) {
        super(name, age);
    }

    public String introduce() {
        return String.format("%s I am a Worker. I have a job.", super.introduce(), this.getName(), this.getAge());
    }
}
