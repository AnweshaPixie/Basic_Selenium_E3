package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verification_Type {

	public static void main(String[] args) {
		//manages the driver
		WebDriverManager.chromedriver().setup();
		//upcasting 
		WebDriver driver= new ChromeDriver();
		//maximizes the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//enter the url 
		driver.get("https://www.amazon.in/");
		WebElement yay=driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
		//isDisplayed()
		if(yay.isDisplayed()) {
			yay.sendKeys("susegad book");
		}
		else {
			System.out.println("element is not displayed");
		}
		WebElement Go=driver.findElement(By.xpath("//input[@value='Go']"));
		if(Go.isEnabled()) {
			Go.submit();
		}
		else {
			System.out.println("element is not enabled");
		}
		driver.close();

	}

}
