package others;

public abstract class Stage {
    public static void add(int a, int b){
        int c = a + b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        add(1,2);
    }

    public abstract void sum(int a, int b);
}
