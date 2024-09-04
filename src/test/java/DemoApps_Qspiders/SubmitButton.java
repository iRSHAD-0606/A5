package DemoApps_Qspiders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitButton {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/button/buttonSubmit?sublist=3");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//label[@for=\"prob2\"]")).click();
		driver.findElement(By.xpath("//button[@id=\"btn41\"]")).click();
		String res=driver.findElement(By.xpath("(//section[@class=\"ms-4\"])[1]")).getText();
		System.out.println(res);
		driver.quit();
		
	}

}
