package utilities;

public class ExtentReportManager {

	private static ExtentReports extent;
	
	public static ExtentReports getReportInstance() {
		if(extent == null) {
			ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("target/extent-reports.html");
			extent= new ExtentReports();
            extent.attachReporter(htmlReporter);
		}
		return extent;
	}
}
