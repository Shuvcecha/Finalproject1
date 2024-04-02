import org.example.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Set;

public class WindowHandling extends BaseClass {
    @FindBy (css= "[id=\"tabButton\"]")
    WebElement newTab;

   public String checkWindowhandle(){
       newTab.click();
       String currentTab= driver.getWindowHandle();
       Set<String> allTab = driver.getWindowHandles();
       for(String i:allTab){if (currentTab!=i){
               driver.switchTo().window(i);

       }
       }
       return driver.getCurrentUrl();
       }
       }