public class FixedDiscount implements Discount {
    private double amount;

    public FixedDiscount(double amount) {
        this.amount = amount;
    }
    public double apply() {
        System.out.println("Применяем фиксированную скидку: " + amount);
        return amount;
    }
}
