package SeminarTasks.Seminar6;

import java.util.Arrays;
import java.util.HashSet;

import static SeminarTasks.Seminar6.Person.moreTwentyYears;
import static SeminarTasks.Seminar6.Person.teska;

public class homework6 {
    public static void main(String[] args) {
        Person p1 = new Person(); p1.firstName = "Ivan"; p1.lastName = "Ivanov"; p1.age = 34; p1.gender = "men"; p1.id = 100;
        Person p2 = new Person(); p2.firstName = "Petr"; p2.lastName = "Petrov"; p2.age = 30; p2.gender = "men"; p2.id = 200;
        Person p3 = new Person(); p3.firstName = "Petr"; p3.lastName = "Petersenian"; p3.age = 32; p3.gender = "men"; p3.id = 200;
        Person p4 = new Person(); p4.firstName = "Maria"; p4.lastName = "Sidorova"; p4.age = 20; p4.gender = "women"; p4.id = 300;
        Person p5 = new Person(); p5.firstName = "Irina"; p5.lastName = "Artemieva"; p5.age = 25; p5.gender = "women"; p5.id = 234;
        Person p6 = new Person(); p6.firstName = "Andrey"; p6.lastName = "Ivanov"; p6.age = 18; p6.gender = "men"; p6.id = 432;
        Person p7 = new Person();
        p7.firstName = "Ivan";
        p7.lastName = "Kozlov";
        p7.age = 30;
        p7.gender = "men";
        p7.id = 534;

        System.out.println(p1);  // fn:Ivan ln:Ivanov age:34 gender:men id:100

        System.out.println(p1 == p2);  // false
        System.out.println(p1.equals( p2 ));  // false
        System.out.println(p2.equals( p3 ));  // true

        HashSet<Person> persons = new HashSet<Person>( Arrays.asList(p1, p2, p3, p4, p5, p6, p7) );

        teska(persons);

        moreTwentyYears( persons );
    }
}

/*
Создать класс Person.
У класса должны быть поля:
1. Имя (String)
2. Фамилия (String)
3. Возраст (продумать тип)
4. Пол
5*. Придумать свои собственные поля

Для этого класса
1. Реализовать методы toString, equals и hashCode.
2*. Придумать собственные методы и реализовать их

В мейне создать массив Person'ов. В цикле отобрать Person'ов старше 20 лет и вывести их на экран.
 */