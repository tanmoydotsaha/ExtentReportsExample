package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.logs.Log;

public class HomePage extends BasePage {
    /**
     * Constructor
     */
    public HomePage(WebDriver driver) {
        super(driver);
    }

    /**
     * Variables
     */
    String baseURL = "https://magento.softwaretestingboard.com/";

    /**
     * Web Elements
     */
    By signInButtonClass = By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]");

    /**
     * Page Methods
     */
    //Go to Homepage
    public HomePage goToN11() {
        Log.info("Opening N11 Website.");
        driver.get(baseURL);
        return this;
    }

    //Go to LoginPage
    public LoginPage goToLoginPage() {
        Log.info("Going to Login Page..");
        click(signInButtonClass);
        return new LoginPage(driver);
    }
}