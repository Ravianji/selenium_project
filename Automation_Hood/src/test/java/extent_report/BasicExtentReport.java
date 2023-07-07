package extent_report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BasicExtentReport {
	public static void main(String[] args) {
		ExtentReports extentreport=new ExtentReports();
		ExtentSparkReporter reporter =new ExtentSparkReporter("./reports/abc.html");
		extentreport.attachReporter(reporter);
		
		
		ExtentTest logger=extentreport.createTest("TestCase_01");
		//logger.pass("this test is passed");
		logger.log(Status.PASS,"this test is passed");
		
		ExtentTest logger1= extentreport.createTest("TestCase_02");
		//logger.fail("This test ids fail");
		logger.log(Status.FAIL,"this test is fail");
		
		ExtentTest logger2= extentreport.createTest("TestCase_03");
		//logger.fail("This test ids fail");
		//logger.log(Status.FAIL,"this test is fail");
		
		
		
		extentreport.flush();
	}

}
