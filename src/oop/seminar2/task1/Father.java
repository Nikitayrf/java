package oop.seminar2.task1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Father extends Person {
    public Father(String firstName, int age) {
        super( firstName, age );
    }
}