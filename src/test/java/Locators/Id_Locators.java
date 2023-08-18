package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Id_Locators {

	public static void main(String[] args) throws Throwable {
		//manages the drivers
		WebDriverManager.chromedriver().setup();
		//upcasting
		WebDriver driver=new ChromeDriver();
		//maximizing
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//entering the url 
		driver.get("https://www.amazon.in/");
		//fetching the address of search text box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mascara");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(5000);
		
		driver.close();
		
		
		
		

	}

}
