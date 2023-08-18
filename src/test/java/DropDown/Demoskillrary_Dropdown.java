package DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demoskillrary_Dropdown {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		//upcasting
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		//address of DropDown
		WebElement dropdown= driver.findElement(By.id("cars"));
		Select s= new Select(dropdown);
		s.selectByIndex(2);
		Thread.sleep(3000);
		s.selectByValue("99");
		Thread.sleep(3000);
		
		List<WebElement> values= s.getAllSelectedOptions();
		for (WebElement a:values) {
			System.out.println(a.getText());
		}
		Thread.sleep(3000);
		driver.close();
         
		

	}

}
