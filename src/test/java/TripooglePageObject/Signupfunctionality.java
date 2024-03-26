package TripooglePageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Signupfunctionality extends BasePage
{
WebDriver driver;
public Signupfunctionality(WebDriver driver)
{
super(driver);
this.driver=driver;
}
@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/div[3]/div[2]/a/a")
WebElement lnkSignuphomepage;
@FindBy(xpath="//*[@id=\"__next\"]/div/div/div[2]/div/div/div/div[1]/div/div/div/div[2]/p/a")
WebElement lnkSignupinner;
@FindBy(xpath="//input[@placeholder='Enter your Name']")
WebElement txtUsernamefield;
@FindBy(xpath="//input[@placeholder='Enter your Email ID']")
WebElement txtemailfield;
@FindBy(xpath="//input[@placeholder='Create a password']")
WebElement txtpasswordfield;
@FindBy(xpath="//input[@placeholder='Confirm Password']")
WebElement txtconfirmpasswordfield;
@FindBy(xpath="//button[normalize-space()='SignUp']")
WebElement btnsingup;
public void signuphomepageclick()
{
lnkSignuphomepage.click();
}
public void signupinnerclick()
{
lnkSignupinner.click();
}
public void usernamefield(String uname)
{
txtUsernamefield.sendKeys(uname);
}
public void emailfield(String efield)
{
txtemailfield.sendKeys(efield);
}
public void passwordfield(String pfield)
{
txtpasswordfield.sendKeys(pfield);
}
public void confirmpasswordfield(String pcfield)
{
txtconfirmpasswordfield.sendKeys(pcfield);
}
public void signupbtn()
{
btnsingup.click();
}
}
