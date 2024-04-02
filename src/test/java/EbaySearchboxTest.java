import org.example.BaseClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class EbaySearchboxTest extends BaseClass {
    EbaySearchbox ebaysearchbox;

    @BeforeMethod
        public void setup(){
        openBrowser("https://www.ebay.com/");
        driver.manage().window().maximize();
        ebaysearchbox= PageFactory.initElements(BaseClass.driver,EbaySearchbox.class);

    }
    @AfterMethod
        public void quit(){
        closeBrowser();
    }//verify customer can enter text in searchBox
    @Test
    void testsearchboxText(){
        String key="Books";
        ebaysearchbox.searchProduct(key);
        String actual=driver.getCurrentUrl();
        Assert.assertTrue(actual.contains("Books"));
    }
    //verify searchButton is working properly
     @Test
     void testsearchbuttonClick(){
     String actual="https://www.ebay.com/n/all-categories?_from=R40&_trksid=p2540003.m570.l1313&_nkw=&_sacat=0";
       ebaysearchbox.searchbuttonClick();
         String expected=driver.getCurrentUrl();
                 Assert.assertEquals(actual,expected);
}//verify if you search for "watch" it will take you the correct url
@Test
    void testSearchBox(){
        String key="Watch";
        ebaysearchbox.checkSearchBox(key);
        String actual="https://www.ebay.com/sch/i.html?_from=R40&_trksid=p4432023.m570.l1313&_nkw=Watch&_sacat=0";
        String expected=driver.getCurrentUrl();
        Assert.assertEquals(actual,expected);
}
}

