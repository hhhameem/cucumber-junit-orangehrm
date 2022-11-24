package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(name = "username")
    public WebElement usernameInput;
    @FindBy(name = "password")
    public WebElement passwordInput;
    @FindBy(css = "[type=submit]")
    public WebElement submitBtn;
    @FindBy(className = "oxd-alert-content-text")
    public WebElement alertText;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void doLogin(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        submitBtn.click();
    }

}
