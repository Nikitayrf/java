package oop.seminar2.task1;

import java.util.HashMap;

public class GeoTreeSpouses implements GeoTree {
    HashMap<Node, Node> tree = new HashMap<>();

    @Override
    public void append(Person husbant, Person wife) {
        tree.put( new Node( husbant, Relationships.HUSBANT, wife ), new Node( wife, Relationships.WIFE, husbant ) );
    }

    @Override
    public String toString() {
        return "GeoTreeSpouses{" +
                "tree=" + tree +
                '}';
    }
}
