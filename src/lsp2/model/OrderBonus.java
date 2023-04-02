package lsp2.model;

public class OrderBonus implements Orderable {
    private final int quantity;
    private final int price;

    public OrderBonus(int quantity, int price) {
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public int getAmount() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("���������� = %d, ���� = %d, ������ 100%%", quantity, price);
    }
}
