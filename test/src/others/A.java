package others;

public class A {
    public A() {
        System.out.println("The default constructor of A is invoked");
    }

    class B extends A {
        public B() {
            System.out.println("The default constructor of B is invoked");
        }
    }

//    public class C {
//        public void static main(String[] args) {
//            B b = new B();
//        }
//    }
}