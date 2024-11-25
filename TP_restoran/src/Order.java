import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private List<Dish> dishes;
    private List<Drink> drinks;
    private Date creationTime;
    private String status;
    private List<OrderStatusObserver> observers;

    public Order() {
        this.dishes = new ArrayList<>();
        this.drinks = new ArrayList<>();
        this.creationTime = new Date();
        this.status = "Pending";
        this.observers = new ArrayList<>();
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public List<Drink> getDrinks() {return drinks;}

    public void setStatus(String status) {
        this.status = status;
        notifyClient();
    }

    public void registerObserver(OrderStatusObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(OrderStatusObserver observer) {
        observers.remove(observer);
    }

    public void notifyClient() {
        for (OrderStatusObserver observer : observers) {
            observer.update(status);
        }
    }
}
