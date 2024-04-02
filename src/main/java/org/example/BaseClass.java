package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static jdk.internal.org.jline.utils.InfoCmp.Capability.tab;

public class BaseClass {
    public static WebDriver driver;



    public void openBrowser(String url){
        driver= new ChromeDriver();
        driver.get(url);
    }
    public void  closeBrowser(){
        driver.quit();
    }
    public void explicitlyWait(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
}
public void dropdown(WebElement element,String text){
    Select select=new Select(element);
    select.selectByVisibleText(text);
}
public void actions(WebElement element){
    Actions actions= new Actions(driver);
    actions.moveToElement(element).perform();

}
public void implicitlywait(){

        driver.manage().timeouts().implicitlyWait(6, TimeUnit.MILLISECONDS);
}


}

