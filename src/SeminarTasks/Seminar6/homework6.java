package SeminarTasks.Seminar6;

import java.util.Arrays;
import java.util.HashSet;

import static SeminarTasks.Seminar6.Person.moreTwentyYears;
import static SeminarTasks.Seminar6.Person.teska;

public class homework6 {
    public static void main(String[] args) {
        Person p1 = new Person("Ivan", "Ivanov", 34, "men", 100);
        Person p2 = new Person("Petr", "Petrov", 30, "men", 200);
        Person p3 = new Person("Petr", "Petersenian", 32, "men", 200);
        Person p4 = new Person("Maria", "Sidorova", 20, "women", 300);
        Person p5 = new Person("Irina", "Artemieva", 25, "women", 234);
        Person p6 = new Person("Andrey", "Ivanov", 18, "men",  432);
        Person p7 = new Person("Ivan", "Kozlov", 30, "men", 534);

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