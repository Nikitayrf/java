package oop.seminar2.task1;

public enum Relationships {
    PARENT( "Parents" ),
    WIFE( "Жена" ),
    HUSBANT( "Муж" ),
    CHILDREN( "Children" );
    private String description;

    Relationships(String description) {
        this.description = description;
    }
}