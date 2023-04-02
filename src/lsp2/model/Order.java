package lsp2.model;

public class Order implements Orderable {
    private final int price;
    private final int quantity;

    public Order(int quantity, int price) {
        this.price = price;
        this.quantity = quantity;
    }

    public int getAmount() {
        return quantity * price;
    }

    @Override
    public String toString() {
        return String.format("���������� = %d, ���� = %d", quantity, price);
    }
}
