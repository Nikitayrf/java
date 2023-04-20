package oop.seminar6.task1.UI;

import oop.seminar6.task1.Core.MVP.View;

import java.util.Scanner;

public class ConsoleView implements View {
    Scanner in;

    public ConsoleView() {
        in = new Scanner( System.in );
    }
}
