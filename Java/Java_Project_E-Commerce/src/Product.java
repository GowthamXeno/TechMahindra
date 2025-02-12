public class Product {
    private int productId;
    private String Product_Name;
    private long price;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProduct_Name() {
        return Product_Name;
    }

    public void setProduct_Name(String product_Name) {
        this.Product_Name = product_Name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Product() {
    }

    public Product(int productId, String product_Name, long price) {
        this.productId = productId;
        this.Product_Name = product_Name;
        this.price = price;
    }

    public static void DisplayProductDetails(Product product){
        System.out.println("Product ID : "+product.getProductId());
        System.out.println("Product Name : "+product.getProduct_Name());
        System.out.println("Product Price : "+product.getPrice());
    }
}
