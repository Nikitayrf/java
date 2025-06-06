package oop.seminar3.task1;


import java.util.HashMap;

public class Repository<T extends Person> {
    private HashMap<Node, Node> ds;
    private String name;

    public Repository(String name) {
        this.ds = new HashMap<>();
        this.name = name;
    }

    public void append(T p1, Relationships re, T p2) {
        switch (re) {
            case FATHER -> ds.put( new Node( p1, re, p2 ), new Node( p2, Relationships.SON, p1 ) );
            case SON -> ds.put( new Node( p1, re, p2 ), new Node( p2, Relationships.FATHER, p1 ) );
            case WIFE -> ds.put( new Node( p1, re, p2 ), new Node( p2, Relationships.HUSBAND, p1 ) );
            case HUSBAND -> ds.put( new Node( p1, re, p2 ), new Node( p2, Relationships.WIFE, p1 ) );
            case BROTHER -> ds.put( new Node( p1, re, p2 ), new Node( p2, Relationships.SISTER, p1 ) );
            case SISTER -> ds.put( new Node( p1, re, p2 ), new Node( p2, Relationships.BROTHER, p1 ) );
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<Node, Node> getDs() {
        return ds;
    }

    public void setDs(HashMap<Node, Node> ds) {
        this.ds = ds;
    }

    @Override
    public String toString() {
        return String.format( "%s", ds );
    }
}