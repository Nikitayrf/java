package oop.seminar1.task1;

import java.util.HashMap;

public class Research {
    HashMap<Node, Node> tree;

    public Research(GeoTree geoTree) {
        
        tree = geoTree.getTree();
    }

    public String findChildren(Person person) {
        StringBuilder result = new StringBuilder();
        for (Node t : tree.keySet()) {
            if (t.person1.getFirstName() == person.getFirstName()) {
                result.append(t.person2).append(" ");
            }
        }
        return String.format("Children %s : %s", person, result);
    }

    public String findParent(Person person) {
        StringBuilder result = new StringBuilder();
        for (Node t : tree.values()) {
            if (t.person1.getFirstName() == person.getFirstName()) {
                result.append(t.person2).append(" ");
            }
        }
        return String.format("Parent %s : %s", person, result);
    }

    @Override
    public String toString() {
        return "Research{" +
                "tree=" + tree +
                '}';
    }
}