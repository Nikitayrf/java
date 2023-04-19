package oop.seminar2.task2;

public class Program {
    public static void main(String[] args) {
        Owner o1 = new Owner( "OLeg", 55 );
        Cat c1 = new Cat( "Barsic", 2 );

        AnimalPersonCat amp1 = new AnimalPersonCat();
        amp1.sayCommand( o1, c1 );

        Dog d1 = new Dog( "Sharic", 3 );
        AnimalPersonDog amd1 = new AnimalPersonDog();
        amd1.sayCommand( o1, d1 );

        AnimalAnimalCatDog aacd1 = new AnimalAnimalCatDog();
        aacd1.communication( d1, c1 );

    }
}