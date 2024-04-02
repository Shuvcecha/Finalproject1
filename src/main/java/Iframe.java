import org.example.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Iframe extends BaseClass {
    @FindBy (css="[aria-label=\"Stay signed out\"]")
    WebElement stayoutButton;
    @FindBy (css  ="[class=\"ktLKi\"]")
    WebElement link;
    public String checkiframe(){
        driver.switchTo().frame("\"callout\"");
        explicitlyWait(stayoutButton);
        stayoutButton.click();
        driver.switchTo().defaultContent();
        link.click();
        return driver.getCurrentUrl();
    }
}
