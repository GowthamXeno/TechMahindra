
class A {
    public void show1() {
        System.out.println("From A");
    }
}

class B extends A {
    int b = 10;
    public void show2() {
        System.out.println("From B");
    }

}

class Hello {
    public static void main(String[] args) {
        A obj = new B();
        obj.show1();
        // System.out.println();
        System.out.println(obj);
        B obj1 = (B)obj;
        obj1.show2();
    }
}
