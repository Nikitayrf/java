package oop.seminar3.task2;

public class Children extends Owner implements Communication{
    public Children(String name, int age) {
        super( name, age );
    }

    @Override
    public void meeting(Animals animal) {
                if (animal instanceof Cat) {
            System.out.println( "Phhhhhh phhhhh" );
        } else if (animal instanceof Dog) {
            System.out.println( "RRRRRR RRRRR" );
        }
    }

    @Override
    public void meeting(Person person) {
        if (person instanceof Men) {
            System.out.println("-Hi dad");
        }
    }

//    @Override
//    public void sayCommand(Animals a1) {
//        if (a1 instanceof Cat) {
//            System.out.println( "Phhhhhh phhhhh" );
//        } else if (a1 instanceof Dog) {
//            System.out.println( "RRRRRR RRRRR" );
//        }
//    }
}
