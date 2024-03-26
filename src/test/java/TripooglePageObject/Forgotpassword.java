package TripooglePageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Forgotpassword extends BasePage
{
WebDriver driver;
public Forgotpassword(WebDriver driver)
{
super(driver);
}
@FindBy(xpath="//a[@href='/login']")
WebElement lnksignup;
@FindBy(xpath="//a[normalize-space()='Please click here to reset']")
WebElement lnkfp;
@FindBy(xpath="//*[@id=\"__next\"]/div/div/div[2]/div/div/div/div[1]/div/div/div/div[2]/form/div/div/label/input")
WebElement txtemail;
@FindBy(xpath="//button[normalize-space()='RESET PASSWORD']")
WebElement lnkresetemail;
public void login()
{
lnksignup.click();
}
public void forgetpwd()
{
lnkfp.click();
}
public void frpwd()
{
lnkfp.click();
}
public void enteremail(String email)
{
txtemail.sendKeys(email);
}
public void restpwd()
{
lnkresetemail.click();
}
}
