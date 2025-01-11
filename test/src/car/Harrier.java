package car;

public class Harrier extends Tata {
    @Override
    public void tyre(int count) {
        System.out.println(count);
    }

    @Override
    public void color(String color) {
        System.out.println(color);
    }

    public void ac(){
        System.out.println("ac");
    }
}
