package SeleniumFrameWork;
import base.BaseTest;
import pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest {
	@Test
    public void testLogin() {

        LoginPage lp = new LoginPage(driver);

        lp.login("tomsmith", "SuperSecretPassword!");

        Assert.assertTrue(lp.getMessage().contains("You logged into a secure area"));
	    }
	}
	
	

