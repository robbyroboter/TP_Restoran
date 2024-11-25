public class PercentageDiscount implements Discount {
    private double percentage;

    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }
    public double apply() {
        System.out.println("Применяем скидку в процентах: " + percentage + "%");
        return percentage;
    }
}
