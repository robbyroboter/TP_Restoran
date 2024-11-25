public class LoyaltyProgram {
    private Client client;
    private double pointsBalance;

    public LoyaltyProgram(Client client) {
        this.client = client;
        this.pointsBalance = 0;
    }

    public void addPoints(double points) {
        if (points > 0) {
            pointsBalance += points;
            System.out.println("Добавлено " + points + " баллов. Общий счёт: " + pointsBalance);
        }
    }

    public void deductPoints(int points) {
        if (points > 0 && points <= pointsBalance) {
            pointsBalance -= points;
            System.out.println("Вычтено " + points + " баллов. Осталось: " + pointsBalance);
        } else {
            System.out.println("Недостаточно баллов.");
        }
    }
}
