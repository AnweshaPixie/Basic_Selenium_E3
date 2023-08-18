package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Right_Click {

	public static void main(String[] args) throws Throwable {
		//Managing drivers
		WebDriverManager.chromedriver().setup();
        //opening the empty browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		//entering the url
		driver.get("https://www.amazon.in/");
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		//creating object for actions class
		Actions a= new Actions(driver);
		a.contextClick(search).perform();
		Thread.sleep(3000);
		driver.close();

	}

}
