package oop.seminar2.task1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Person {

    private String firstName;
    private int age;

    public Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }
}
