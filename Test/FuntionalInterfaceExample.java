
@FunctionalInterface
interface Demo {
    void add(int a, int b);
}

class FuntionalInterfaceExample {
    public static void main(String[] args) {
        Demo obj = new Demo() {
        public void add(int a, int b) {
        System.out.println(a + b);
        }
        };
        obj.add(1, 2);

        Demo obj1 = (a,b) -> {
            System.out.println(a + b);
        };
        obj1.add(1, 2);

        Demo obj2 = (a,b) -> System.out.println(a + b);
        obj2.add(1, 2);

        // Demo obj2 = (a,b) -> a+b;
        // obj2.add(1, 2);
    }
}
