package org.example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoClass extends BaseClass {


    @FindBy (xpath = "//header[@id=\"gh\"]/table/tbody/tr/td[1]")
    WebElement logo;
    public  boolean logoTest(){
        explicitlyWait(logo);
        if(logo.isDisplayed()){ return true;}else{return  false;}
    
    }
    public void logoClick(){
        logo.click();
    }
}
