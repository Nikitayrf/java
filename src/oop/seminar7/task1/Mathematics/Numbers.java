package oop.seminar7.task1.Mathematics;

import oop.seminar7.task1.MVP.Model;

public class Numbers extends Model {

    public Numbers(double x, double y) {
        super.x = x;
        super.y = y;
    }

    public Numbers() {
        this( 0, 0 );
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Numbers compNum = (Numbers) obj;
        return super.x == compNum.x && super.y == compNum.y;
    }

    @Override
    public String toString() {
        return "Numbers{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
