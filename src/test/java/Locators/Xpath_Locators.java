package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Locators {

	public static void main(String[] args) throws Throwable {
		//manages the driver
		WebDriverManager.chromedriver().setup();
		//upcasting
		WebDriver driver=new ChromeDriver();
		//maximizes the browser
		driver.manage().window().maximize();
		//enter the url 
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		//fetches the address of email textfield using Xpath attribute
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Anwesha");
		Thread.sleep(2000);
		//fetches the address of password textfield using Xpath contains attribute
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("Makeup");
		Thread.sleep(2000);
		//fetches the address of password link using xpath contains text
		driver.findElement(By.xpath("//a[contains(text(),'password')]")).click();
		Thread.sleep(3000);
		//fetches the address of cancel using xpath contains text
		driver.findElement(By.xpath("//a[contains(text(),'Cancel')]")).click();
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
