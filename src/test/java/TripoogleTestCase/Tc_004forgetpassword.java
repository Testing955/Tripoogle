package TripoogleTestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import TripooglePageObject.Forgotpassword;
import TripoogleTestBase.BaseClass;

public class Tc_004forgetpassword extends BaseClass
{
@Test
public void verify_forget_password()
{
try
{
Forgotpassword fp = new Forgotpassword(driver);
fp.login();
fp.frpwd();
fp.enteremail("hestabitt@gmail.com");
fp.restpwd();
}
catch(Exception e)
{
Assert.fail();
}
}

}
