package oop.seminar1.task2;

public class Program {
    public static void main(String[] args) {
        Person p1 = new Person( "Petr" );
        Cat c1 = new Cat( "Barsic" );
        System.out.println(p1.sayKiskis( c1 ));
        System.out.println(p1.sayStop( c1 ));
    }
}
