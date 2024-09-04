package Dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement allDropdowns = driver.findElement(By.id("searchDropdownBox"));
		Select select=new Select(allDropdowns);
		select.selectByIndex(11);
		Thread.sleep(3000);
		select.selectByValue("search-alias=jewelry");
		Thread.sleep(3000);
		select.selectByVisibleText("Electronics");
		Thread.sleep(3000);
		List<WebElement> options = select.getOptions();
		for (WebElement opt : options) {
			System.out.println(opt.getText());
			
		}
		if(select.isMultiple())
			System.out.println("Multi select");
		else
			System.out.println("single select");
		driver.quit();
	}

}
