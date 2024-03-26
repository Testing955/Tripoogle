package TripoogleTestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import TripooglePageObject.Loginfunctionality;
import TripoogleTestBase.BaseClass;

public class TC_003login extends BaseClass
{
@Test
public void verify_account_login()throws InterruptedException 
{
try
{
Loginfunctionality lf = new Loginfunctionality(driver);

lf.signupaccount();
Thread.sleep(5000);
lf.emailfield("hestabitt@gmail.com");
lf.passwordfield("Qwerty");
lf.loginfield();
}
catch(Exception e)
{
Assert.fail();
}
}
}
