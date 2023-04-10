package oop.seminar3.task1;

import lombok.Getter;

@Getter
public class Children extends Person {
    public Children(String firstName, int age) {
        super( firstName, age );
    }
}