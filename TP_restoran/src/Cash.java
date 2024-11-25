public class Cash implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Оплата в размере " + amount + " сделана наличными.");
    }
}
