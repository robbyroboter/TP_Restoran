public class OnlinePayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Оплата в размере " + amount + " прошла онлайн.");
    }
}
