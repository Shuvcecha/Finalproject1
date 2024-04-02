import org.example.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class EbayFooter extends BaseClass {
  @FindBy (xpath = "//footer[@id=\"glbfooter\"]")
    WebElement footer;
  @FindBy (xpath = "//footer[@id=\"glbfooter\"]/div[2]/table/tbody/tr/td[4]/h3[1]")
    WebElement aboutEbay;
  @FindBy (css = "[_exsp=\"m571.l2935\"]")
    WebElement announcement;
  @FindBy (xpath = "//footer[@id=\"glbfooter\"]/div[3]/table/tbody/tr/td/ul/li[7]")
    WebElement affliates;
  @FindBy (xpath = "//footer[@id=\"glbfooter\"]/div[3]/table/tbody/tr/td/ul/li[5]")
  WebElement sellerCenter;
  @FindBy (xpath = "//footer[@id=\"glbfooter\"]//a[@class=\"thrd gf-bar-a\"]")
    List<WebElement>footerlinks;
  @FindBy(xpath = "//button[@aria-label=\"Help, opens dialogs\"]")
    WebElement helpAndContact;
  @FindBy (xpath = "//td[@class=\"gf-legal\"]/a[4]")
  WebElement paymentTerms;
  @FindBy (xpath = "class=\"gf-legal\"")
  WebElement copyrightText;
  public boolean checkFooter(){
      if(footer.isDisplayed()){return true;
  }else{return false;}

}

  public String checkAboutEbay(){
      explicitlyWait(aboutEbay);
      aboutEbay.click();
      return driver.getCurrentUrl();
  }

      public boolean checkAnnouncement(){
      explicitlyWait(announcement);
      if (announcement.isEnabled()){return true;}else
      {return false;}
      }

      public String checkAffliates(){
          explicitlyWait(affliates);
          affliates.click();
          return driver.getCurrentUrl();
      }
      public void checkSellerCenter(){
      explicitlyWait(sellerCenter);
      sellerCenter.click();
}
public Integer howManyLinkTest(){
      return footerlinks.size();

}
public boolean checkHelpandContactButton() {
    explicitlyWait(helpAndContact);
    if (helpAndContact.isEnabled()) {
        return true;
    } else {
        return false;
    }
}
public String checkFooterText() {
    explicitlyWait(footer);
    return footer.getText();

}
public void checkFooterLinks() {
        for (WebElement link : footerlinks) {
            String tabs = Keys.chord(Keys.CONTROL, Keys.ENTER);
            link.sendKeys(tabs);
        }

    }
    public String checkPayementsTerms(){
      paymentTerms.click();
      return driver.getCurrentUrl();
    }

    public String checkCopyrightText(){
      explicitlyWait(copyrightText);
      return copyrightText.getText();

    }

}

