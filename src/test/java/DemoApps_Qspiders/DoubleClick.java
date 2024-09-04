package DemoApps_Qspiders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/button/buttonDouble?sublist=2");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement element = driver.findElement(By.id("btn28"));
		Actions actions=new Actions(driver);
		actions.doubleClick(element).perform();
		String message = driver.findElement(By.xpath("//span[text()='You selected \"5\"']")).getText();
		if(message.contains("You selected \"5\""))
			System.out.println("Double click performed");
		else
			System.out.println("Double click not performed");
		Thread.sleep(3000);
		driver.quit();
				
		
	}

}
