package WebElements;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getting_Type {

	public static void main(String[] args) {
		//manages the driver
				WebDriverManager.chromedriver().setup();
				//upcasting 
				WebDriver driver= new ChromeDriver();
				//maximizes the browser
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				//enter the url 
				driver.get("https://www.amazon.in/");
				WebElement yay=driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
				//fetching the coordinates
				Point coordinates=yay.getLocation();
				System.out.println("X and Y coordinates of search text field are below");
				System.out.println(coordinates.getX());
				System.out.println(coordinates.getY());
				Dimension size= yay.getSize();
				System.out.println("width and height of search text field are below");
				System.out.println(size.getWidth());
				System.out.println(size.getHeight());
				driver.close();
				
				
				

	}

}
