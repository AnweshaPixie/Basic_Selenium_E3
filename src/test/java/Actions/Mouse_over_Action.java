package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_over_Action {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//upcasting
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.snapdeal.com/");
		//address of Sign In
		WebElement signIn=driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
		//creating an object for actions class
		Actions a= new Actions(driver);
		a.moveToElement(signIn).perform();
		Thread.sleep(3000);
		//address of register
		driver.findElement(By.xpath("(//span[contains(text(),'Register')])[1]")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
