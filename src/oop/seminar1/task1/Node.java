package oop.seminar1.task1;

public class Node {
    Person person1;
    Relationships re;
    Person person2;
    public Node(Person person1, Relationships re, Person person2) {
        this.person1 = person1;
        this.re = re;
        this.person2 = person2;
    }

    @Override
    public String toString() {
        return String.format( "%s %s %s", person1, re, person2);
    }
}