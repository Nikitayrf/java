package SeminarTasks.Seminar3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class homework3 {
    public static void main(String[] args) {
        // 1. Дан список ArrayList<Integer> целых чисел. Удалить из него нечетные числа.
        ArrayList<Integer> randomList = randomArraylist();
        System.out.println( "ArrayList before removal : " + randomList );
        randomList.removeIf( s -> s % 2 == 0 );
        System.out.println( "ArrayList after removal : " + randomList + "\n" );

        /* 2. Дан список ArrayList<String>. Удалить из него все строки, которые являются числами
        Пример: ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
        Результат: ["string", "s", "my_value"]
         */
        ArrayList<String> list = new ArrayList<>( List.of( "string", "s", "5", "10", "-12", "my_value", "-rt" ) );
        System.out.println( "ArrayList before removal : " + list );
        removeDigit( list );
        System.out.println( "ArrayList after removal : " + list );
    }
    static ArrayList<Integer> randomArraylist() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) { list.add(new Random().nextInt(1, 10)); };
        return list;
    }
    static void removeDigit(ArrayList<String> inputList) {
        Iterator<String> stringsList = inputList.iterator();
        while (stringsList.hasNext()) {
            String s = stringsList.next();
            if (s.charAt( 0 ) == '-' && Character.isDigit( s.charAt( 1 ))) {
                stringsList.remove();
            } else if (Character.isDigit( s.charAt( 0 ))) {
                stringsList.remove();
            }
        }
    }
}
