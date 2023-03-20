package SeminarTasks.Seminar5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class homework5 {
    public static void main(String[] args) {
        Map<Integer, List<String>> stats = new HashMap<>();
        String text = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";
        String[] list = text.split( " " );
        for (String item: list) {
            if (!stats.containsKey( item.length() )) {
                stats.put( item.length(), new ArrayList<>( List.of( item ) ) );
            }
            else { stats.get(item.length()).add( item ); }
        }

        for (var item : stats.entrySet()) {
            List<String> printW = item.getValue();
            for (String s : printW) { System.out.print( s + " " ); }
            System.out.println();
        }
    }
}
