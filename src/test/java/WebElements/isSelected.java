package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class isSelected {

	public static void main(String[] args) {
		//manages chrome driver
		WebDriverManager.chromedriver().setup();
		//upcasting
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		//address of new account
		driver.findElement(By.linkText("Create new account")).click();
		//address of radio button
		WebElement radiobutton= driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
		if (radiobutton.isSelected()) {
			System.out.println("radiobutton selected.");
		}
		else {
			System.out.println("fail");
		}
		driver.close();
	}

}
