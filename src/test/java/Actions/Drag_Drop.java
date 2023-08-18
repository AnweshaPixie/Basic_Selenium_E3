package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_Drop {

	public static void main(String[] args) throws Throwable {
		//Managing drivers
				WebDriverManager.chromedriver().setup();
		        //opening the empty browser
				WebDriver driver=new ChromeDriver();
				//maximize the browser
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
				//entering the url
				driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
				Thread.sleep(3000);
				//address of block 1 
				WebElement Block1=driver.findElement(By.xpath("//h1[text()='Block 1']"));
				//address of block 4
				WebElement Block4=driver.findElement(By.xpath("//h1[text()='Block 4']"));
				Actions a= new Actions(driver);
				a.dragAndDrop(Block1, Block4).perform();
				Thread.sleep(3000);
				driver.close();

	}

}
