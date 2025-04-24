package oop.seminar1.task1;


import java.util.HashMap;


public class GeoTree {
    private HashMap<Node, Node> tree = new HashMap<>();
    public void append(Person parent, Person children) {
        tree.put(new Node( parent, Relationships.PARENT, children ), new Node( children, Relationships.CHILDREN, parent ));
    }

    public HashMap<Node, Node> getTree() {
        return tree;
    }

    public void setTree(HashMap<Node, Node> tree) {
        this.tree = tree;
    }

    @Override
    public String toString() {
        return "GeoTree{" +
                "treeKey=" + tree.keySet() +
                '}';
    }
}