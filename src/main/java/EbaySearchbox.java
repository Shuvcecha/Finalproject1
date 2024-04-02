import org.example.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySearchbox extends BaseClass {


    @FindBy (css = "[class=\"gh-tb ui-autocomplete-input\"]")
    WebElement searchBox;
    @FindBy (xpath = "//input[@value=\"Search\"]")
    WebElement searchButton;
public void searchProduct(String searchKeys){
    explicitlyWait(searchBox);
    searchBox.sendKeys(searchKeys, Keys.ENTER);
}
void searchbuttonClick() {
    explicitlyWait(searchButton);
    searchButton.click();

}
public void checkSearchBox(String searchKeys){
    implicitlywait();
    searchBox.sendKeys(searchKeys,Keys.ENTER);
}


}
