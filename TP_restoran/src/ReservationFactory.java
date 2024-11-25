import java.util.Date;

public class ReservationFactory {
    public Reservation createReservation(String type) {
        // В зависимости от типа возвращает новый объект резервирования.
        Date defaultTime = new Date(); // Пример текущей даты.
        int defaultPeople = 2; // Пример стандартного количества людей.

        switch (type.toLowerCase()) {
            case "vip":
                return new Reservation(defaultTime, defaultPeople, "VIP");
            case "banquet":
                return new Reservation(defaultTime, 20, "Banquet");
            default:
                return new Reservation(defaultTime, defaultPeople, "Standard");
        }
    }
}
