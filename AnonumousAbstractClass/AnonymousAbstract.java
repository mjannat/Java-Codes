package AnonumousAbstractClass;

public class AnonymousAbstract {
    public static void main(String[] args) {
        B obj = new B() {
            @Override
            public void print1() {
                System.out.println("Farmgate");
            }
        };
        obj.print1();
        obj.print2();
    }
}

abstract class B {
    public abstract void print1();

    public void print2() {
        System.out.println("Barishal");
    }
}