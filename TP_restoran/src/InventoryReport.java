public class InventoryReport extends Report {
    public InventoryReport(String startDate, String endDate) {
        super(startDate, endDate, "Inventory Report");
    }

    @Override
    public void generateReport() {
        System.out.println("Создание отчёта по инвентаризации с " + startDate + " до " + endDate);
        // Логика для создания отчёта об инвентаре
    }
}
