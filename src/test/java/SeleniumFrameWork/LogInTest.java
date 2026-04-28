package SeleniumFrameWork;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogInTest {
	 @Test
	    public void testLogin() {
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();

	        driver.get("https://the-internet.herokuapp.com/login");

	        driver.findElement(org.openqa.selenium.By.id("username")).sendKeys("tomsmith");
	        driver.findElement(org.openqa.selenium.By.id("password")).sendKeys("SuperSecretPassword!");
	        driver.findElement(org.openqa.selenium.By.cssSelector("button[type='submit']")).click();

	        String text = driver.findElement(org.openqa.selenium.By.id("flash")).getText();

	        Assert.assertTrue(text.contains("logged"));

	        driver.quit();
	    }
	}
	
	

