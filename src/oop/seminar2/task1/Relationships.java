package oop.seminar2.task1;

public enum Relationships {
    PARENT( "Parent" ),
    WIFE( "Wife" ),
    HUSBANT( "Husbant" ),
    CHILDREN( "Children" );
    private String description;

    Relationships(String description) {
        this.description = description;
    }
}