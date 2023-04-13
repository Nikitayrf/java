package oop.seminar4;

public abstract class Shield implements Protection {
    private static int protection;
    protected static int number;
    private String name;

    static {
        number = 0;
        protection = 0;
    }

    public Shield(int protection, String name) {
        this.protection = protection;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getProtection() {
        return protection;
    }

    public int protection() {
        return protection;
    }
}
