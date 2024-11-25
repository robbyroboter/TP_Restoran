import java.util.ArrayList;
import java.util.List;

public class LoyaltyCard {
    private String level;
    private CompositeDiscount discounts;

    public LoyaltyCard(String level) {
        this.level = level;
        this.discounts = new CompositeDiscount();
    }

    public void addDiscount(Discount discount) {
        discounts.add(discount);
    }

    public void removeDiscount(Discount discount) {
        discounts.remove(discount);
    }

    public double applyDiscount() {
        return discounts.apply();
    }

    public String getLevel() {
        return level;
    }
}
