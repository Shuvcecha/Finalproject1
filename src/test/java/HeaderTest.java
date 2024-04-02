import org.example.BaseClass;
import org.openqa.selenium.devtools.v116.cachestorage.model.Header;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HeaderTest extends BaseClass {
    EbayHeader ebayHeader;

    @BeforeMethod
    void Setup() {
        openBrowser("https://www.ebay.com./");
        driver.manage().window().maximize();
        ebayHeader = PageFactory.initElements(BaseClass.driver, EbayHeader.class);
    }

    @AfterMethod
    void quit() {
        closeBrowser();
    }

    //if header is displayed
    @Test
    void testcheckHeader() {
        boolean expected = true;
        boolean actual = ebayHeader.checkHeader();
        Assert.assertEquals(actual, expected);

    }

    //verify dailyDeals Button is working
    @Test
    void testDailyDeals() {
        String expected = "https://www.ebay.com/deals";
        ebayHeader.checkDailyDeals();
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, expected);
    }
//verify sell button is working
    @Test
    void testCheckSell() {
        String expected = "https://www.ebay.com/sl/sell";
        ebayHeader.checkSell();
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, expected);
    }
    //verify  thereis equal or more than  6 links present
@Test
    void testHeaderLinksize(){
        Integer actual=ebayHeader.checkHeaderLinks();
        Assert.assertTrue(actual<=78);
}
//Check after clicking curtButton the url contains "www.ebay.com"
@Test
    void testcurtButton(){
        String expected="https://www.ebay.com/splashui/captcha?ap=1&appName=orch&ru=https%3A%2F%2Fcart.ebay.com%2F&iid=c7067f17-2f82-4acf-85cb-d6686e6d9083&iim=eNzEuMo&iia=WATk3LjLr&iiz=MqxMxLjc5Wld";
        ebayHeader.cartCheck();
        String actual=driver.getCurrentUrl();
        Assert.assertTrue(actual.contains("www.ebay.com"));

}
//verify shop by category is working properly
@Test
    void testShopbyCategory(){
        String expected="https://www.ebay.com/b/Electronics/bn_7000259124";
        String actual=ebayHeader.checkShopbyCategory();
        Assert.assertEquals(actual,expected);
}
//verify myEbay dropdown is working properly
@Test
    void testmyEbayAction(){
        String actual="https://www.ebay.com/mye/buyagain";
        String expected=ebayHeader.checkMyEbayactions();
        Assert.assertEquals(actual,expected);
}
//verify Motor section's tittle is accurate
@Test
    void testCheckMotorTitle(){
        String expected="eBay Motors: Auto Parts and Vehicles | eBay";
        String actual=ebayHeader.checkMotorTitle();
        Assert.assertEquals(actual,expected);
}
//testing searchByCategory is working properly
@Test
    void testCheckSearchButtonCategory(){
        String expected="https://www.ebay.com/b/Art-Craft-Supplies/14339/bn_1851051";
        String actual=ebayHeader.checkSearchByCategory();
        Assert.assertEquals(actual,expected);
}
//verify in searchByCategory option's "Travel" subcategory is working properly
@Test
    void testTravelOption(){
        String expected="https://www.ebay.com/b/Travel/3252/bn_1848525";
        String actual=ebayHeader.checkTravelOptionInSearchByCategory();
}
    }


