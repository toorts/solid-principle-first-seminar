package srp2.model;

public class Order {
    private final String clientName;
    private final String product;
    private final int quantity;
    private final int price;

    public Order(String clientName, String product, int quantity, int price) {
        this.clientName = clientName;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
