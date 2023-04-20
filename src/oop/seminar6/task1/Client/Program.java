package oop.seminar6.task1.Client;

import oop.seminar6.task1.Mathematic.CalculateArea.CalculateComplex;
import oop.seminar6.task1.Mathematic.CalculateArea.CalculateRational;
import oop.seminar6.task1.UI.App;

public class Program {
    public static void main(String[] args) {
        CalculateComplex calcCompl1 = new CalculateComplex( 15, 37 );
        CalculateRational calcRation1 = new CalculateRational( 3, 30 );
        App.ButtonClick(calcCompl1);
    }
}