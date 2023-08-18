package Basic_Programs;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome_launching {

	public static void main(String[] args) {
		
		
		//manages the Chrome driver
		WebDriverManager.chromedriver().setup();
		
		//opening chrome browser
		ChromeDriver driver= new ChromeDriver();

	}

}
