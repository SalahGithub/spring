package report;

public class ReportService {
	private ReportGenerator reportGenerator = new HtmlReportGenerator();
	
	public void generateAnualReport(int year){
		String[][] statistics = null;
		//gather statistcis here
		reportGenerator.generate(statistics);
	}
	
	public void generateMonthlyReport(int year, int month){
		String[][] statistics = null;
		//gather statistcis here
		reportGenerator.generate(statistics);
	}
	
	public void generateDailyReport(int year, int month, int day){
		String[][] statistics = null;
		//gather statistcis here
		reportGenerator.generate(statistics);
	}
}
