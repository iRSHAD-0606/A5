package Pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLoginTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		FbLoginPage login=new FbLoginPage(driver);
		login.setEmail("AVJFK@gmail");
		login.setPassword("d24534");
		login.clickLogin();
		Thread.sleep(2000);
		driver.quit();
		
				
	}

}
