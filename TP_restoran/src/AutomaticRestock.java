public class AutomaticRestock implements RestockStrategy {
    @Override
    public void restock() {
        System.out.println("Автоматическое пополнение запасов в зависимости от их нехватки.");
    }
}
