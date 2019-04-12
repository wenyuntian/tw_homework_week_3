package practice08;

public class Person {
    private String name;
    private int age;
    private int id;

    public Person(int age, String name,  int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String introduce() {
        return String.format("My name is %s. I am %d years old.", this.name, this.age);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
}
