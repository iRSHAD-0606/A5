package DemoApps_Qspiders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VeriBtnClicked {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebElement element = driver.findElement(By.id("btn3"));
		 
		 element.click();
		 String message = driver.findElement(By.xpath("//span[text()='You selected \"No\"']")).getText();
		 if(message.contains("You selected \"No\"")) 
			 System.out.println("Button clicked");
			 
		 else
			 System.out.println("Button not clicked");
		 Thread.sleep(3000);
		 driver.quit();
	}

}
