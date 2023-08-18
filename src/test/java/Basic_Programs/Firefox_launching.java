package Basic_Programs;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Firefox_launching {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		
		FirefoxDriver driver=new FirefoxDriver();

	}

}
