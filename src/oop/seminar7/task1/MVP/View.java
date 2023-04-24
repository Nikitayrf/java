package oop.seminar7.task1.MVP;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner( System.in );

    public String getString(String title) {
        System.out.printf( "%s\n", title );
        return in.next();
    }

    public Double getDouble(String title) {
        System.out.printf( "%s\n", title );
        return in.nextDouble();
    }

    public void closingScanner() {
        in.close();
    }
}
