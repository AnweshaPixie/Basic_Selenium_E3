package DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_DropDown {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		//upcasting
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		//address of DropDown
		WebElement dropDown=driver.findElement(By.id("searchDropdownBox"));
		//Handling this drop down
		Select s=new Select(dropDown);
		s.selectByIndex(8);
		Thread.sleep(3000);
		s.selectByValue("search-alias=beauty");
		Thread.sleep(3000);
		s.selectByVisibleText("Books");
		Thread.sleep(3000);
		System.out.println(s.isMultiple());
		
		//fetching the options into console
		List<WebElement> values= s.getOptions();
		for (WebElement a:values) {
		System.out.println(a.getText());
		}
		
		
		
	}

}
