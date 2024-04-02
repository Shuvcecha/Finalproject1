import org.example.BaseClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestWindowhandle extends BaseClass {
    WindowHandling windowHandling;
    @BeforeMethod
    public void setup(){
        openBrowser("https://demoqa.com/browser-windows");
        windowHandling= PageFactory.initElements(BaseClass.driver,WindowHandling.class);
        driver.manage().window().maximize();
    }
   @AfterMethod
    public void quit(){
        closeBrowser();
   }
   @Test
    public void checkWindowHandaling(){
       String expected ="https://demoqa.com/sample";
       String actual=windowHandling.checkWindowhandle();
       Assert.assertEquals(actual,expected);
   }
}
