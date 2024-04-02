import org.example.BaseClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class iframetest extends BaseClass {
    Iframe iframe;
    public void setup(){
        openBrowser("https://www.google.com/");
        iframe= PageFactory.initElements(BaseClass.driver,Iframe.class);
        driver.manage().window().maximize();
    }
    public void quit(){
        closeBrowser();
    }
    @Test
    void testIframe(){
        String expected="";
        String actual=iframe.checkiframe();
        Assert.assertEquals(actual,expected);
    }

}
