package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//upcasting
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index?overview-summary.html");
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.xpath("(//a[text()='org.openqa.selenium'])[1]")).click();
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("(//span[text()='WebDriver'])[1]")).click();
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("(//a[text()='Help'])[1]")).click();
		

	}

}
