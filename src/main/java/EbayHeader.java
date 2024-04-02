import org.example.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.text.html.CSS;
import java.util.List;

public class EbayHeader extends BaseClass {
    @FindBy (xpath = "//header[@id=\"gh\"]")
    WebElement header;
    @FindBy (css = "[_sp=\"m570.l3188\"]")
    WebElement dailyDeals;
    @FindBy (css = "[_sp=\"m570.l1528\"]")
    WebElement sell;
    @FindBy(xpath = "//header[@role=\"banner\"]//a")
    List<WebElement> headerLinks;
    @FindBy(css = "[class=\"gh-cart-icon\"]")
    WebElement curtbutton;
    @FindBy(id = "gh-shop-a")
    WebElement shopbyCategory;
    @FindBy (css = "[_sp=\"m570.l3413\"]")
    WebElement electronics;
    @FindBy (css = "[title=\"My eBay\"]")
    WebElement myEbay;
    @FindBy (css = "[_sp=\"m570.l47010\"]")
    WebElement buyAgain;
    @FindBy (css = "[_sp=\"m570.l3410\"]")
    WebElement motors;
    @FindBy (xpath = "//select[@aria-label=\"Select a category for search\"]")
    WebElement searchByCategory;
    @FindBy(css = "[class=\"btn btn-prim gh-spr\"]")
    WebElement searchButton;

    public boolean checkHeader() {
        if (header.isDisplayed())
        {return true;} else {return false;}
    }

    public void checkDailyDeals() {
        dailyDeals.click();
    }

    public void checkSell(){
        sell.click();
    }

    public Integer checkHeaderLinks() {
        return headerLinks.size();
    }

    public void cartCheck(){
        explicitlyWait(curtbutton);
        curtbutton.click();
    }


    public String checkShopbyCategory(){
        shopbyCategory.click();
        explicitlyWait(electronics);
        electronics.click();
        return driver.getCurrentUrl();
    }

    public String checkMyEbayactions() {
        actions(myEbay);
        explicitlyWait(buyAgain);
        buyAgain.click();
        return driver.getCurrentUrl();

    }


    public String checkMotorTitle(){
        shopbyCategory.click();
        explicitlyWait(motors);
        motors.click();
        return driver.getTitle();
    }

public String checkSearchByCategory(){
dropdown(searchByCategory,"Crafts");
searchButton.click();
return driver.getCurrentUrl();

}
public String checkTravelOptionInSearchByCategory(){
    dropdown(searchByCategory,"Travel");
    searchButton.click();
    return  driver.getCurrentUrl();
}


    }





