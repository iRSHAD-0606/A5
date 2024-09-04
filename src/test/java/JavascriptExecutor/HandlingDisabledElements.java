package JavascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisabledElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		js.executeScript("window.location=arguments[0]","https://www.instagram.com/");
		WebElement loginBTN = driver.findElement(By.xpath("//button[.='Log in']"));
		js.executeScript("arguments[0].removeAttribute('disabled','disabled')",loginBTN);
		Thread.sleep(3000);
		js.executeScript("arguments[0].click()",loginBTN);
		Thread.sleep(3000);
		String errorMSGE = driver.findElement(By.xpath("//div[@class='_ab2z']")).getText();
		System.out.println(errorMSGE);
		driver.quit();
	}

}
