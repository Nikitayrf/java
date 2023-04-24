package oop.seminar7.task1.UI;

import oop.seminar7.task1.MVP.Model;
import oop.seminar7.task1.MVP.Presenter;
import oop.seminar7.task1.MVP.View;
import oop.seminar7.task1.Mathematics.Numbers;

public class app {
    Presenter<Numbers> p;
    View view;
    Model model;

    public app() {
        view = new View();
        model = new Numbers();
        p = new Presenter<>( new Numbers(), view );
    }

    public void menu() {
        System.out.print( "\033[H\033[J" );
        Numbers calc = p.chooseCalculator();
        Numbers calcNumber = p.setNumbers( calc );
        String result = p.chooseOperation( calcNumber );
        p.saveFile( result );
    }
}