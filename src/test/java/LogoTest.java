import org.example.BaseClass;
import org.example.LogoClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LogoTest extends BaseClass {
    LogoClass logoClass;
    @BeforeMethod
    public void Setup (){
        openBrowser ("https://www.ebay.com/");
        driver.manage().window().maximize();
        logoClass= PageFactory.initElements(BaseClass.driver,LogoClass.class);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

    }
    @AfterMethod
    public void quit(){
     closeBrowser();
    }
    //testing if logo is displayed
    @Test
    void testLogo(){
        boolean expected = true;
        boolean actual=logoClass.logoTest();
        Assert.assertEquals(actual,expected);

    }
    //testing if logo is clickable
    @Test
    void testLogoClick(){
        String actual= "https://www.ebay.com/";
        logoClass.logoClick();
        String expected=driver.getCurrentUrl();
        Assert.assertEquals(actual,expected);
    }


}
