package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_getting {

	public static void main(String[] args) {
		//manages chrome driver
				WebDriverManager.chromedriver().setup();
				//upcasting
				WebDriver driver=new ChromeDriver();
				//maximize the browser
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://www.amazon.in/");
				WebElement tooth=driver.findElement(By.xpath("//a[text()='Mobiles']"));
				System.out.println("Attribute: "+ tooth.getAttribute("class"));
				System.out.println("Attribute: "+ tooth.getTagName());
				driver.close();
				

	}

}
