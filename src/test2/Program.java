package test2;

public class Program {
    public static void main(String[] args) {
        Contact c1 = new Contact( "petr", "123" );
        c1.addContact( "petr", "123" );
        System.out.println(c1);
    }
}
