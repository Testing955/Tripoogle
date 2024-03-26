package TripoogleTestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import TripooglePageObject.Signupfunctionality;
import TripoogleTestBase.BaseClass;

public class TC_002signup extends BaseClass {
    @Test
    public void verify_account_registration() throws InterruptedException {
        try {
            Signupfunctionality sf = new Signupfunctionality(driver);
            sf.signuphomepageclick();
            sf.signupinnerclick();
            sf.usernamefield(randomString());
            sf.emailfield(randomString() + "@yopmail.com");
            String password = randomAlphaNumeric();
            Thread.sleep(5000);
            sf.passwordfield(password);
            Thread.sleep(5000);
            sf.confirmpasswordfield(password);
            sf.signupbtn();
        } 
        catch (Exception e) 
        {
            Assert.fail();
        }
    }
}
