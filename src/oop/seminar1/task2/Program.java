package oop.seminar1.task2;

public class Program {
    public static void main(String[] args) {
        Person person = new Person( "Petr" );
        Cat cat = new Cat( "Barsic" );
        System.out.println(person.sayKiskis( cat ));
        System.out.println(person.sayStop( cat ));
    }
}
