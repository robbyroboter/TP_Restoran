import java.util.ArrayList;
import java.util.List;

public class CompositeDiscount implements Discount {
    private List<Discount> components = new ArrayList<>();

    public void add(Discount component) {
        components.add(component);
    }

    public void remove(Discount component) {
        components.remove(component);
    }

    @Override
    public double apply() {
        double totalDiscount = 0;
        for (Discount component : components) {
            totalDiscount += component.apply();
        }
        return totalDiscount;
    }
}
