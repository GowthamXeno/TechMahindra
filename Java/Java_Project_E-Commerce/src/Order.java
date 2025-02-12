import java.util.*;

public class Order {
    private int orderId;
    private long totalPrice;
    private Customer customer;
    private List<Product> productlist;

    Order(int orderId,Customer customer,List<Product> product){
        this.orderId = orderId;
        this.customer = customer;
        this.productlist = product;
        System.out.println("==============================");
        ShowDetails();

    }

    private void ShowDetails(){
        int totalPrice = 0;
        System.out.println("Customer ID : "+customer.getCustomerId());
        System.out.println("Customer Name : "+customer.getName());
        System.out.println("Purchased Items : ");
        System.out.println("-------------------------------");
        for(Product product : productlist){
            totalPrice += (int)product.getPrice();
            Product.DisplayProductDetails(product);
        System.out.println("-------------------------------");
        }
        System.out.println("The Total Price : "+totalPrice);
        System.out.println("===============================");
    }




}
