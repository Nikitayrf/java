package oop.seminar1.task1;

public class Program {
    public static void main(String[] args) throws Exception {
        Person alina = new Person("Alina", 50);
        Person vasya = new Person("Vasiy", 55);
        Person masha = new Person("Masha", 30);
        Person janya = new Person("Jenya", 20);
        Person oleg = new Person("Oleg", 15);
        Person igor = new Person( "Igor", 52 );

        GeoTree tree = new GeoTree();
        tree.append(alina, masha);
        tree.append(alina, janya);
        tree.append(vasya, janya);
        tree.append(vasya, oleg);
        tree.append( igor, masha );

        System.out.println(new Research( tree ).findChildren( vasya));
        System.out.println(new Research( tree ).findParent( masha ));

        Printer p1 = new Printer();
        p1.print("Print in console with class Printer -> " + new Research( tree ).findParent( masha ) );
        p1.saveFile(  new Research( tree ).findChildren( vasya));
    }
}
