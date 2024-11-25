public class PaymentSystem {
    private PaymentMethod paymentMethod;
    private double amount;

    public PaymentSystem(PaymentMethod paymentMethod, double amount) {
        this.paymentMethod = paymentMethod;
        this.amount = amount;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void pay() {
        if (amount <= 0) {
            System.out.println("Неверный способ оплаты.");
            return;
        }
        paymentMethod.pay(amount);
    }

    public double setAmount(double v){
        return amount;
    }

    public void refund() {
        System.out.println("Возврат " + amount + " осуществлён.");
        // Логика возврата средств
    }
}
