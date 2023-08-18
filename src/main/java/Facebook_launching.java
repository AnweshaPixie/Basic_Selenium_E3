import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_launching {

	public static void main(String[] args) throws Throwable {
		
		//Managing drivers
		WebDriverManager.chromedriver().setup();
        //opening the empty browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//entering the url
		driver.get("https://www.facebook.com/");
		//print the title
		System.out.println(driver.getTitle());
		//print the url
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(2000);
		//closing the window
		driver.close();
		
		
	}

}
