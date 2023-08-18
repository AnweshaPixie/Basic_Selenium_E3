package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider {

	@org.testng.annotations.DataProvider
	
	public Object[][] getData(){
		Object[][] a= new Object[3][2];
		a[0][0]="adfgadfg";
		a[0][1]="poo";
		
		a[1][0]="adfga7dfg";
		a[1][1]="pooh";
		
		a[2][0]="adf122gadfg";
		a[2][1]="poro";
		
		return a;
		}
	@Test(dataProvider="getData")
	public void demo(String username,String pwd) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
		driver.close();
	}
	
}
