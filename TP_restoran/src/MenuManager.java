import java.util.ArrayList;
import java.util.List;

public class MenuManager {
    private static MenuManager instance;
    private List<Dish> dishes;
    private List<Drink> drinks;

    private MenuManager() {
        dishes = new ArrayList<>();
        drinks = new ArrayList<>();
    }

    public static MenuManager getInstance() {
        if (instance == null) {
            instance = new MenuManager();
        }
        return instance;
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public void removeDish(Dish dish) {
        dishes.remove(dish);
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public void removeDrink(Drink drink) {
        drinks.remove(drink);
    }

    public List<Drink> getDrinks() {return drinks;}
}
