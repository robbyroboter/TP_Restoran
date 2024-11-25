import java.util.Date;

public class Inventory {
    private String itemName;
    private int quantity;

    public Inventory(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
    }

    public int checkStock() {
        return quantity;
    }

    public void restock(RestockStrategy strategy) {
        strategy.restock();
    }

    public String getItemName() {
        return itemName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
