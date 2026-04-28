package SeleniumProjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestcase {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com");
//		String title=driver.getTitle();
//		if(title.equals(driver.getTitle())) {
//			System.out.println("Testing passed");
//		}else {
//			System.out.println("Testing failed");
//		}
//		driver.close();

	}

}
