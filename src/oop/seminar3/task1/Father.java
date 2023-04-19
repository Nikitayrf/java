package oop.seminar3.task1;

import lombok.Getter;

@Getter
public class Father extends Person {
    public Father(String firstName, int age) {
        super( firstName, age );
    }
}