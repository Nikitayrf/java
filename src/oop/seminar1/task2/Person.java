package oop.seminar1.task2;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
    public String sayKiskis(Cat cat) {

        return cat.kiskis();
    }
    public String sayStop(Cat cat) {
        return cat.ph();
    }
}
