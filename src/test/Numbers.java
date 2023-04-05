package test;

public abstract class Numbers implements Nums {
    private int num;

    public Numbers(int num) {
        this.num = num;
    }
    @Override
    public void sum(int n1, int n2) {
        System.out.println(n1 + n2);
    }
}
