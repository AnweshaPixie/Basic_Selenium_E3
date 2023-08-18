package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_Locators {

	public static void main(String[] args) throws Throwable {
		// manage the drivers
		WebDriverManager.chromedriver().setup();
		//upcasting 
		WebDriver driver=new ChromeDriver();
		//maximizes the browser
		driver.manage().window().maximize();
		//entering the url 
		driver.get("https://www.facebook.com/");
		//fetch the address of the username textfield
		driver.findElement(By.id("email")).sendKeys("anwesha");
		Thread.sleep(3000);
		//fetch the address of the password textfield
		driver.findElement(By.name("pass")).sendKeys("awesome123");
		Thread.sleep(3000);
		//address of LinkText method
		driver.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
