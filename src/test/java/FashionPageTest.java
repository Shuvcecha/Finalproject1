import org.example.BaseClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FashionPageTest extends BaseClass {
    EbayFashionPage ebayFashionPage;
    @BeforeMethod
    public void setup(){
        openBrowser("https://www.ebay.com/");
        ebayFashionPage= PageFactory.initElements(BaseClass.driver,EbayFashionPage.class);
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void quit(){
        closeBrowser();
    }
    //testing fasion tittle
    @Test
    public void testFashionTittle(){
        String expected="Clothing, Shoes & Accessories for sale | eBay";
        String actual=ebayFashionPage.checkFashionTittle();
        Assert.assertEquals(actual,expected);
    }
    //verifying Baby and Toddler clothing option is working
    @Test
    public void testBandTClothing(){
        String expected="https://www.ebay.com/b/Baby-Toddler-Clothing/260019/bn_7116411604";
        String actual=ebayFashionPage.checkBandTclothing();
        Assert.assertEquals(actual,expected);
    }
    //verifying there is a tittle in baby and toddler clothing section
    @Test
    public void testBabySectionTittle(){
        String expected="Clothing, Shoes & Accessories for sale | eBay";
        String actual=ebayFashionPage.checkBabySectionTittle();
        Assert.assertEquals(actual,expected);
    }
    //testing the baby and toddler clothing section's footer text
    @Test
    public void testBClothingFooterText(){
       boolean expected= true;
       boolean actual=ebayFashionPage.checkFotterTextOfBClothing();
       Assert.assertEquals(actual,expected);
    }
    //testing women accesories section is working properly
    @Test
    public void testWomenAccesorries(){
        String expected="https://www.ebay.com/b/Womens-Accessories/4251/bn_1519247";
        String actual=ebayFashionPage.checkWomenAccesories();
        Assert.assertEquals(actual,expected);
    }
    //testing Hand bag section is working properly
    @Test
    public void testHandBag(){
        String expected="https://www.ebay.com/b/Womens-Handbag-Accessories/163570/bn_738883";
        String actual=ebayFashionPage.CheckBagandAccesories();
        Assert.assertEquals(actual,expected);

    }
    // testing Shoe and accesories section is working properly
    @Test
    public void testShoeandaccesories(){
        String expected="https://www.ebay.com/b/Womens-Shoe-Charms-Jewelry/150955/bn_1519204";
        String actual=ebayFashionPage.checkShoeandAccesories();
        Assert.assertEquals(actual,expected);
}
//testing sunglass option is working properly
@Test
    public void testSunglassesUrl(){
        String expected="https://www.ebay.com/b/Womens-Sunglasses-Sunglasses-Accessories/179247/bn_1519274";
        String actual=ebayFashionPage.checkSunglassesUrl();
        Assert.assertEquals(actual,expected);
}//testing wallet page is working properly
    @Test
    public void testWaletPageUrl(){
        String expected="https://www.ebay.com/b/Womens-Wallets/45258/bn_1521617";
       String actual=ebayFashionPage.checkWalletUrl();
        Assert.assertEquals(actual,expected);
}
//testing luxury watch section is working properly
@Test
    public void  testLuxuryWatch(){
        String actual="https://www.ebay.com/b/Luxury-Watches/31387/bn_36841947";
        String expected=ebayFashionPage.checkLuxuryWatch();
        Assert.assertEquals(actual,expected);
}
//verifying luxury brands are displayed
@Test
    public void testLuxuryBrands(){
        boolean expected=true;
        boolean actual=ebayFashionPage.checkLuxuryBrand();
        Assert.assertEquals(actual,expected);

}
}

