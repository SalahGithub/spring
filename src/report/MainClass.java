package report;

public class MainClass {

	public static void main(String[] args) {
		ReportService rs = new ReportService();
		rs.generateAnualReport(2018);
		rs.generateMonthlyReport(2018, 8);
		rs.generateDailyReport(2018, 8, 22);
	}
}
