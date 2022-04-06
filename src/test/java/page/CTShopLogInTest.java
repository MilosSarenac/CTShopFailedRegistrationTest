package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class CTShopLogInTest extends BaseTest {
    public CTShopLogInTest() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = ".ub-emb-close")
    WebElement reklamaXButton;
    @FindBy(id = "firstname")
    WebElement imeInputField;
    @FindBy(id = "lastname")
    WebElement prezimeInputField;
    @FindBy(id = "email_address")
    WebElement emailInputField;
    @FindBy(id = "is_subscribed")
    WebElement checkInButton;
    @FindBy(id = "password")
    WebElement passwordInputField;
    @FindBy(id = "confirmation")
    WebElement confrimPasswordInputField;
    @FindBy(xpath = "//*[contains(text(),'Pošalji')]")
    WebElement posaljiButton;
    @FindAll({
            @FindBy(css = ".alert.alert-succes")
    })private List<WebElement> uspesnaRegistracija;
    @FindAll({
            @FindBy(css = ".alert.alert-warning")
    })private List<WebElement> neuspesnaRegistracija;
    @FindBy(css = ".ub-emb-close")
    WebElement reklama2XButton;


    //u slucaju da ima reklama
    public CTShopLogInTest reklamaXButtonClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(reklamaXButton)).click();
        return this;
    }
    public CTShopLogInTest imeInputFieldSendKeys(String ime){
        wdWait.until(ExpectedConditions.visibilityOf(imeInputField)).sendKeys(ime);
        return this;
    }
    public CTShopLogInTest prezimeInputFieldSendKeys(String prezime){
        wdWait.until(ExpectedConditions.visibilityOf(prezimeInputField)).sendKeys(prezime);
        return this;
    }
    public CTShopLogInTest emailInputFieldSendKeys(String email){
        wdWait.until(ExpectedConditions.visibilityOf(emailInputField)).sendKeys(email);
        return this;
    }
    public CTShopLogInTest checkInButtonUnchecked(){
        wdWait.until(ExpectedConditions.visibilityOf(checkInButton));
        if (checkInButton.isSelected()){
            checkInButton.click();
        }
        return this;
    }
    public CTShopLogInTest passwordInputFieldSendKeys(String pasword){
        wdWait.until(ExpectedConditions.visibilityOf(passwordInputField)).sendKeys(pasword);
        return this;
    }
    public CTShopLogInTest confrimPasswordInputFieldSendKeys(String confirm){
        wdWait.until(ExpectedConditions.visibilityOf(confrimPasswordInputField)).sendKeys(confirm);
        return this;
    }
    public CTShopLogInTest posaljiButtonClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(posaljiButton)).click();
        return this;
    }
    public CTShopLogInTest skrollPage(){
        js.executeScript("window.scrollBy(0,500)");
        return this;
    }

    public int uspesnaRegistracijaBrojac(){
        return uspesnaRegistracija.size();
    }
    public int neuspesnaRegistracijaBrojac(){
        return neuspesnaRegistracija.size();
    }
    //u slucaju da ima reklama
    public CTShopLogInTest reklama2XButtonClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(reklama2XButton)).click();
        return this;
    }


}
