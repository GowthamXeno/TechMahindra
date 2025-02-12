abstract class A {
    A() {
        System.out.println("From Contructor");
    }

    abstract void show();

    void drive() {
        System.out.println("Driving");
    }
}

public class AbtractExample {
    public static void main(String[] args) {
        A obj = new A() {
            void show() {
                System.out.println("Hello ");
            }
        };

        obj.show();
        obj.drive();

    }
}

interface AA{
    void showww();
}


