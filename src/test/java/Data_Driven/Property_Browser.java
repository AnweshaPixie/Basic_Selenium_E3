package Data_Driven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Property_Browser {

	public static void main(String[] args) throws Throwable {
		//create an object for properties class
				Properties p=new Properties();
				//create an object for physical file 
				FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\Data.properties");
				//loading fis
				p.load(fis);
				String url= p.getProperty("url");
				String brow=p.getProperty("browser");
				
				WebDriver driver;
				if(brow.equals("chrome")) {
					WebDriverManager.chromedriver().setup();
					driver= new ChromeDriver();
				}
				else {
					WebDriverManager.firefoxdriver().setup();
					driver= new FirefoxDriver();
				}
				driver.manage().window().maximize();
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			    driver.get(url);

	}

}
