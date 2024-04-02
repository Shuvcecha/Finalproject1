import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import java.io.File;

public class ExtentManager {
    private static ExtentReports extent;
    public static ExtentReports creatInstance(String file){
    ExtentHtmlReporter htmlreporter=new ExtentHtmlReporter(file);
    extent=new ExtentReports();
    extent.attachReporter(htmlreporter);
    return extent;

    }
}
