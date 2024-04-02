import org.example.BaseClass;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EbayFooterTest extends BaseClass {
    EbayFooter ebayFooter;
    @BeforeMethod
    void setUp(){
        openBrowser("https://www.ebay.com/");
        ebayFooter= PageFactory.initElements(BaseClass.driver,EbayFooter.class);
        driver.manage().window().maximize();
    }
    @AfterMethod
    void quit(){
        closeBrowser();
    }
    // testing the footer is displayed
    @Test
    void testEbayFooter(){
        boolean expected=true;
        boolean actual=ebayFooter.checkFooter();
        Assert.assertEquals(actual,expected);
    }
    //testing aboutEbay section is working
    @Test
    void testAboutEbay(){
        String expected="https://www.ebay.com/";
        String actual=ebayFooter.checkAboutEbay();
        Assert.assertEquals(actual,expected);
    }
    //testing announcement is displayed
    @Test
    void testCheckAnnouncement(){
        boolean expected= true;
        boolean actual=ebayFooter.checkAnnouncement();
        Assert.assertEquals(actual,expected);
    }
    //testing affliates is working properly
    @Test
    void testAffliates(){
        String expected="https://partnernetwork.ebay.com/";
        String actual=ebayFooter.checkAffliates();
        Assert.assertEquals(actual,expected);
    }
    //testing seller center is working properly
    @Test
    void testSellerCenter(){
        String expected="";
        ebayFooter.checkSellerCenter();
        String actual=driver.getCurrentUrl();
        Assert.assertEquals(actual,expected);
    }
    //testing how many footer links are there
    @Test
    void testFooterLinks(){
        Integer actual=9;
        Integer expected=ebayFooter.howManyLinkTest();
        Assert.assertEquals(actual,expected);

    }
    // testing if help button is available
    @Test
    void testHelpandContactButton(){
        boolean expected=true;
        boolean actual=ebayFooter.checkHelpandContactButton();
        Assert.assertEquals(actual,expected);
    }
    //testing is there eBay companies in the footer
    @Test
    void testCheckFooterText(){
        String actual=ebayFooter.checkFooterText();
        Assert.assertTrue(actual.contains("eBay companies"));

    }
    // testing all the links are working
    @Test
    void testAllLinks(){
        ebayFooter.checkFooterLinks();
    }
    //testing payments term option is working
    @Test
   void testPaymentsTerms(){
        String expected="https://pages.ebay.com/payment/2.0/terms.html";
        String actual=ebayFooter.checkPayementsTerms();
        Assert.assertEquals(actual,expected);
}
//checking copyright text is displaying correctly
   @Test
        void testcopyrighttext(){
        String expected="Copyright © 1995-2024 eBay Inc. All Rights Reserved";
        String actual=ebayFooter.checkCopyrightText();
        Assert.assertEquals(actual,expected);
   }
}


