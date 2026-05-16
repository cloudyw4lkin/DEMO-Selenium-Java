package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    private final By usernameField = By.name("username");
    private final By passwordField = By.name("password");
    private final By loginButton = By.cssSelector("button[type='submit']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void inputUsername(String username){
        super.type(usernameField, username);
    }

    public void inputPassword(String password){
        super.type(passwordField, password);
    }

    public void clickLoginButton(){
        super.click(loginButton);
    }
}
