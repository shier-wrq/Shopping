package label;

public class OrderProduct {
    private int id;
    private int num;
    private Order order;
    private Product product;
    private int productId;
    public OrderProduct(){

    }

    public OrderProduct(int id, int num, Order order, Product product, int productId) {
        this.id = id;
        this.num = num;
        this.order = order;
        this.product = product;
        this.productId = productId;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
}
