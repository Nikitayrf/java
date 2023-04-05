package test2;

import java.util.HashMap;
import java.util.Map;

public class Contact implements View {
    public String name;
    public String num;
    Map<String, String> note = new HashMap<>();

    public Contact(String name, String num) {
        this.name = name;
        this.num = num;
    }

    public void addContact(String name, String num) {
        note.put( name, num );
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", num='" + num + '\'' +
                ", note=" + note +
                '}';
    }
}
