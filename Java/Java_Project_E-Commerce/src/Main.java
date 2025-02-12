import java.util.*;

public class Main{
    public static void main(String [] args){
        Customer customer = new Customer(1001,"XenO", 8888888888L);
        Product product1 = new Product(404,"Dell Laptop",49000L);
        Product product2 = new Product(405,"iphone",50000L);
        Product product3 = new Product(406,"SkyBag",4900L);

        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        Order order1 = new Order(101,customer,productList);

    }
}