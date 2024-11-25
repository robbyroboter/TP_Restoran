public class SalesReport extends Report {
    public SalesReport(String startDate, String endDate) {
        super(startDate, endDate, "Sales Report");
    }

    public void generateReport() {
        System.out.println("Создание отчёта о продажах с " + startDate + " до " + endDate);
        // Логика для создания отчёта о продажах
    }
}
