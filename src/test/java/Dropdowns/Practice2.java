package Dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dropdown = driver.findElement(By.id("cars"));
		Select select=new Select(dropdown);
		System.out.println("**** Drop down elements ****");
		List<WebElement> options = select.getOptions();
		for (WebElement e : options) {
			System.out.println(e.getText());
			select.selectByIndex(0);
			Thread.sleep(2000);
			select.selectByValue("90");
			Thread.sleep(2000);
			select.selectByVisibleText("INR 50 - INR 99 ( 1 )");
			Thread.sleep(2000);
			System.out.println("**** selected Options ****");
			List<WebElement> selectedOptions = select.getAllSelectedOptions();
			for (WebElement e1 : selectedOptions) {
				System.out.println(e1.getText());
				
			}
			System.out.println("first selected Options"+select.getFirstSelectedOption().getText());
			if(select.isMultiple())
			{
				select.deselectByIndex(0);
				Thread.sleep(2000);
				select.deselectByValue("90");
				Thread.sleep(2000);
				select.deselectByVisibleText("INR 50 - INR 99 ( 1 )");
				Thread.sleep(2000);
				
			}
			driver.quit();

			
		}
	}

}
