import org.example.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayFashionPage extends BaseClass {
    @FindBy(xpath = "//div[@class=\"vl-flyout-nav evo\"]/ul[1]/li[7]/a")
    WebElement fashion;
    @FindBy(xpath = "//div[@class=\"dialog__cell\"]/section[1]/ul/li[1]/button")
    WebElement baby;
    @FindBy(xpath = "//li[@data-marko-key=\"@_wbind s0-17-12-0-1[0]-0-0-27[0]-0\"]/ul/li[2]")
    WebElement babyAndToddlerClothing;
    @FindBy(xpath = "//div[@class=\"content\"]/p[1]")
    WebElement footerTextOfBClothibgPage;
    @FindBy(xpath = "//li[@id=\"s0-17-12-0-1[0]-0-0-27[4]-0\"]")
    WebElement women;
    @FindBy(xpath = "//li[@id=\"s0-17-12-0-1[0]-0-0-27[4]-0\"]/ul[1]/li[2]")
    WebElement womenAccesories;
    @FindBy (xpath = "//div[@class=\"dialog__cell\"]/section[1]/ul/li[8]")
    WebElement handBagandAccesories;
    @FindBy (xpath = "//div[@class=\"dialog__cell\"]/section[1]/ul/li[14]")
    WebElement shoeandAccesories;
    @FindBy (xpath = "//div[@class=\"dialog__cell\"]/section[1]/ul/li[15]")
    WebElement sunglasses;

    @FindBy (xpath = "//div[@class=\"dialog__cell\"]/section[1]/ul/li[18]")
    WebElement wallet;
    @FindBy (xpath = "//div[@class=\"dialog__cell\"]/section[2]/ul/li[1]")
    WebElement luxuryWatch;
    @FindBy(xpath = "//div[@class=\"dialog__cell\"]/section[4]")
    WebElement luxuryBrand;



    public String checkFashionTittle() {
        fashion.click();
        return driver.getTitle();

    }

    public String checkBandTclothing() {
        fashion.click();
        explicitlyWait(baby);
        baby.click();
        explicitlyWait(babyAndToddlerClothing);
        babyAndToddlerClothing.click();
        return driver.getCurrentUrl();
    }
    public String checkBabySectionTittle(){
        fashion.click();
        explicitlyWait(baby);
        baby.click();
        return driver.getTitle();
    }
    public boolean checkFotterTextOfBClothing() {
        fashion.click();
        explicitlyWait(baby);
        baby.click();
        explicitlyWait(babyAndToddlerClothing);
        babyAndToddlerClothing.click();
        explicitlyWait(footerTextOfBClothibgPage);
        if (footerTextOfBClothibgPage.isEnabled()) {
            return true;
        } else {
            return false;
        }
    }
    public String checkWomenAccesories(){
        fashion.click();
        explicitlyWait(women);
        women.click();
        womenAccesories.click();
        return driver.getCurrentUrl();

    }
    public String CheckBagandAccesories(){
        fashion.click();
        explicitlyWait(women);
        women.click();
        womenAccesories.click();
        explicitlyWait(handBagandAccesories);
        handBagandAccesories.click();
        return driver.getCurrentUrl();
    }
    public String checkShoeandAccesories(){
        fashion.click();
        explicitlyWait(women);
        women.click();
        womenAccesories.click();
        explicitlyWait(shoeandAccesories);
        shoeandAccesories.click();
        return driver.getCurrentUrl();
    }
    public String checkSunglassesUrl(){
        fashion.click();
        explicitlyWait(women);
        women.click();
        womenAccesories.click();
        explicitlyWait(sunglasses);
        sunglasses.click();
        return driver.getCurrentUrl();


    }
    public String checkWalletUrl(){
        fashion.click();
        explicitlyWait(women);
        women.click();
        womenAccesories.click();
        explicitlyWait(wallet);
        wallet.click();
        return driver.getCurrentUrl();
    }
    public  String checkLuxuryWatch(){
        fashion.click();
        explicitlyWait(luxuryWatch);
        luxuryWatch.click();
        return driver.getCurrentUrl();
    }
    public boolean checkLuxuryBrand(){
        fashion.click();
        explicitlyWait(luxuryBrand);
        if(luxuryBrand.isDisplayed()){return true;
    } else{return false;}
}}


