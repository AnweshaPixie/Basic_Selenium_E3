package POM_Usage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.FB_Loginpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class fb_Login {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		//creating an object for pom class 
		FB_Loginpage fbLogin= new FB_Loginpage(driver);
		fbLogin.emailTextField("Anwesha");
		fbLogin.passwordTextField("Sumi");
		fbLogin.loginButton();
		driver.findElement(By.xpath("//a[text()='Cancel']")).click();
		
		
		

	}

}
