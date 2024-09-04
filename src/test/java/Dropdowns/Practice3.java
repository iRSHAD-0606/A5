package Dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement signin = driver.findElement(By.className("accountUserName"));
		Actions actions=new Actions(driver);
		actions.moveToElement(signin).perform();
		driver.findElement(By.xpath("//a[text()='login']")).click();
		driver.switchTo().frame("loginIframe");
		driver.findElement(By.id("userName")).sendKeys("98765432");
		Thread.sleep(3000);
		driver.findElement(By.id("close-pop")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.name("keyword")).sendKeys("toys");
		driver.findElement(By.className("searchformButton")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
