public abstract class Report {
    protected String startDate;
    protected String endDate;
    protected String reportType;

    public Report(String startDate, String endDate, String reportType) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.reportType = reportType;
    }

    public abstract void generateReport();
}
