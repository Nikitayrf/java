package oop.seminar3.task2;

public interface Communication<T extends Animals, E extends Person> {
    public void meeting(T animal);
    public void meeting(E person);
}