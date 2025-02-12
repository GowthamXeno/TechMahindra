enum Laptop {
    MacBook(100), DellXPS(200), Surface(2000), Hp(1);

    int price;

    Laptop(int price) {
        this.price = price;
    }
}

public class EnumExample {
    public static void main(String[] args) {
        Laptop l = Laptop.MacBook;
        System.out.println(l.ordinal());
        l.price = 3000;
        System.out.println(l.ordinal());
    }
}
