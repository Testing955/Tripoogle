package TripooglePageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginfunctionality extends BasePage
{
WebDriver driver;
public Loginfunctionality(WebDriver driver)
{
super(driver);
}
@FindBy(xpath="//a[@href='/login']")
WebElement lnksignup;
@FindBy(xpath="//input[@placeholder='Email ID']")
WebElement txtEmail;
@FindBy(xpath="//input[@placeholder='Password']")
WebElement txtPassword;
@FindBy(xpath="//button[normalize-space()='login']")
WebElement btnlogin;
public void signupaccount()
{
lnksignup.click();
}
public void emailfield(String email)
{
txtEmail.sendKeys(email);
}
public void passwordfield(String password)
{
txtPassword.sendKeys(password);
}
public void loginfield()
{
btnlogin.click();
}
}
