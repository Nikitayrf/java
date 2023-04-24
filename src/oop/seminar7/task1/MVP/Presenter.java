package oop.seminar7.task1.MVP;

import oop.seminar7.task1.Mathematics.CalculateComplex;
import oop.seminar7.task1.Mathematics.CalculateRational;
import oop.seminar7.task1.Mathematics.Numbers;

import java.io.File;
import java.io.FileWriter;

public class Presenter<T extends Numbers> {
    View view;
    Numbers model;

    public Presenter(T model, View view) {
        this.view = view;
        this.model = model;
    }

    public Numbers chooseCalculator() {
        Numbers calculator = null;
        String key = view.getString( "Выбирете калькулятор чисел: " +
                "1 - Комплексных " +
                "2 - Рациональных " );
        switch (key) {
            case "1" -> calculator = new CalculateComplex( 0, 0 );
            case "2" -> calculator = new CalculateRational( 0, 0 );
            default -> System.out.println( "Такой команды нет" );
        }
        return calculator;
    }

    public Numbers setNumbers(Numbers inputCalculator) {
        if (inputCalculator instanceof CalculateRational) {
            Double firstNumber = view.getDouble( "Введите 1-ое число x: " );
            inputCalculator.setX( firstNumber );

            Double secondNumber = view.getDouble( "Введите 2-ое чило y: " );
            inputCalculator.setY( secondNumber );
            return inputCalculator;
        } else if (inputCalculator instanceof CalculateComplex) {
            Double firstNumberRealPart = view.getDouble( "Введите вещественную часть 1-ого комплексного числа x: " );
            inputCalculator.setX( firstNumberRealPart );
            Double firstNumberImaginaryPart = view.getDouble( "Введите мнимую часть 1-ого комплексного числа w: " );
            inputCalculator.setW( firstNumberImaginaryPart );

            Double secondNumberRealPar = view.getDouble( "Введите вещественную часть 2-ого комплексного чило y: " );
            inputCalculator.setY( secondNumberRealPar );
            Double secondNumberImaginaryPart = view.getDouble( "Введите мнимую часть 2-ого комплексного числа z: " );
            inputCalculator.setZ( secondNumberImaginaryPart );
            return inputCalculator;
        }
        return inputCalculator;
    }

    public String chooseOperation(Numbers inputNum) {
        String result = "";
        if (inputNum instanceof CalculateRational inputNumRational) {
            String key = view.getString( "Выбирете арифметическую операцию: " +
                    "1 - сумма(+) " +
                    "2 - разность(-) " +
                    "3 - произведение(*) " +
                    "4 - деление(/) " );
            switch (key) {
                case "1" -> result = String.format( "Сумма чисел %.1f + %.1f = %.1f\n",
                        inputNum.getX(), inputNum.getY(), inputNumRational.sum() );
                case "2" -> result = String.format( "Разность чисел %.1f + %.1f = %.1f\n",
                        inputNum.getX(), inputNum.getY(), inputNumRational.diff() );
                case "3" -> result = String.format( "Произведение чисел %.1f + %.1f = %.1f\n",
                        inputNum.getX(), inputNum.getY(), inputNumRational.mult() );
                case "4" -> result = String.format( "Деление чисел %.1f + %.1f = %.1f\n",
                        inputNum.getX(), inputNum.getY(), inputNumRational.div() );
            }
        } else if (inputNum instanceof CalculateComplex inputNumComlex) {
            String key = view.getString( "Выбирете арифметическую операцию: " +
                    "1 - сумма(+) " +
                    "2 - разность(-) " +
                    "3 - произведение(*) " +
                    "4 - деление(/) " );
            switch (key) {
                case "1" -> result = String.format( "Сумма чисел %.1f + %.1fi и %.1f + %.1fi = %.1f + %.1fi\n",
                        inputNum.getX(), inputNum.getW(), inputNum.getY(), inputNum.getZ(), inputNumComlex.sum().getX(), inputNumComlex.sum().getY() );
                case "2" -> result = String.format( "Разность чисел %.1f + %.1fi и %.1f + %.1fi = %.1f + %.1fi\n",
                        inputNum.getX(), inputNum.getW(), inputNum.getY(), inputNum.getZ(), inputNumComlex.diff().getX(), inputNumComlex.diff().getY() );
                case "3" -> result = String.format( "Произведение чисел %.1f + %.1fi и %.1f + %.1fi = %.1f + %.1fi\n",
                        inputNum.getX(), inputNum.getW(), inputNum.getY(), inputNum.getZ(), inputNumComlex.mult().getX(), inputNumComlex.mult().getY() );
                case "4" -> result = String.format( "Деление чисел %.1f + %.1fi и %.1f + %.1fi = %.1f + %.1fi\n",
                        inputNum.getX(), inputNum.getW(), inputNum.getY(), inputNum.getZ(), inputNumComlex.div().getX(), inputNumComlex.div().getY() );
            }

        } else {
            System.out.println( "Такой команды нет" );
        }
        view.closingScanner();
        return result;
    }

    public void saveFile(String inputString) {
        try {
//            String pathProject = System.getProperty( "user.dir" );
            String pathProject = System.getProperty( "user.dir" );
            String pathFile = pathProject.concat( "/log_calculation.txt" );
            File file = new File( pathFile );

            if (file.createNewFile()) {
                System.out.println( "\nfile.created" );
                FileWriter fileWriter = new FileWriter( file, true );
                fileWriter.write( inputString );
                fileWriter.flush();
                fileWriter.close();
            } else {
                System.out.println( "\nfile.existed" );
                FileWriter fileWriter = new FileWriter( file, true );
                fileWriter.write( inputString );
                fileWriter.flush();
                fileWriter.close();
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            System.out.println( inputString );
        }
    }
}