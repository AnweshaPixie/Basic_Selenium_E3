package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSS_Selector {

	public static void main(String[] args) throws Throwable {
		// manage the drivers
				WebDriverManager.chromedriver().setup();
				//upcasting 
				WebDriver driver=new ChromeDriver();
				//maximizes the browser
				driver.manage().window().maximize();
				//entering the url 
				driver.get("https://www.facebook.com/");
				Thread.sleep(3000);
				//fetch the address of the email textfield
				driver.findElement(By.cssSelector("input[type='text']")).sendKeys("anwesha");

	}

}
