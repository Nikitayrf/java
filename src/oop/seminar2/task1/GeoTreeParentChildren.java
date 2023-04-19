package oop.seminar2.task1;

public class GeoTreeParentChildren implements GeoTree {
    @Override
    public void append(Person parent, Person children) {
        tree.put( new Node( parent, Relationships.PARENT, children ), new Node( children, Relationships.CHILDREN, parent ) );
    }

    @Override
    public String toString() {
        return "GeoTreeImp{" +
                "tree=" + tree +
                '}';
    }
}