import java.util.List;

public class Client implements OrderStatusObserver {
    private String name;
    private String contactInfo;

    public Client(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public Order createOrder() {
        // Создаёт новый заказ (пустой на начальном этапе).
        return new Order();
    }

    @Override
    public void update(String status) {
        System.out.println("Клиент " + name + " оповещён: статус заказа обновлён до " + status);
    }

    public void getMenu(MenuManager menu)
    {
        System.out.println("Меню:");
        for (Dish dish : menu.getDishes()) {
            System.out.println("- " + dish.getName() + " ($" + dish.getCost() + ")");
        }
        for (Drink drink : menu.getDrinks()) {
            System.out.println("- " + drink.getName() + " ($" + drink.getCost() + ")");
        }
    }

    public void confirmReservation(Reservation reservation) {
        System.out.println("Резервирование подтверждено: " + reservation);
    }

}
