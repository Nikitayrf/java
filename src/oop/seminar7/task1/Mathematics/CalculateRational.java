package oop.seminar7.task1.Mathematics;

public class CalculateRational extends Numbers implements Calculating<Double> {

    public CalculateRational(double x, double y) {
        super( x, y );
    }

    @Override
    public Double sum() {
        return x + y;
    }

    @Override
    public Double diff() {
        return x - y;
    }

    @Override
    public Double mult() {
        return x * y;
    }

    @Override
    public Double div() {
        return x / y;
    }

    @Override
    public String toString() {
        return "CalculateRational{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}