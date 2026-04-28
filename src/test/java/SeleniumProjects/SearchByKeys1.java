package SeleniumProjects;
import org.openqa.selenium.WebDriver;
//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchByKeys1 {
	public static void main(String[] args)throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
//		WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
//		searchBox.clear();
//		searchBox.sendKeys("macbook", Keys.ENTER);
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.id("twotabsearchtextbox")));
//		searchBox.sendKeys("macbook", Keys.ENTER);
		boolean Logo=driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
		System.out.println(Logo);
	}

}
