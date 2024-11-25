public class Card implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Оплата в размере " + amount + " осуществлена по карте.");
    }
}
