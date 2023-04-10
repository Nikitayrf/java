package oop.seminar3.task1;

public enum Relationships {
    PARENT( "Родители" ),
    WIFE( "Жена" ),
    HUSBANT( "Муж" ),
    BROTHER("Брат" ),
    SISTER("Сестра" ),
    FATHER("Отец"),
    SON("Сын"),
    CHILDREN( "Дети" );
    private String description;

    Relationships(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}