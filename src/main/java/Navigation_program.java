import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation_program {

	public static void main(String[] args) throws Throwable {
		//manages the drivers
		WebDriverManager.chromedriver().setup();
		//opens the url
		WebDriver driver=new ChromeDriver();
		//maximizes the browser
		driver.manage().window().maximize();
		//enters the url
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		//navigate to another url 
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(5000);
		//navigate to back page
		driver.navigate().back();
		Thread.sleep(5000);
		//navigate to forward page
		driver.navigate().forward();
		Thread.sleep(5000);
		//navigate to refresh the page 
		driver.navigate().refresh();
		Thread.sleep(5000);
		//close the application
		driver.close();

	}

}
