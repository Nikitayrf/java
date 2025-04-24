package oop.seminar1.task1;

public class Person {
    private String firstName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format( "%s", firstName );
    }
}