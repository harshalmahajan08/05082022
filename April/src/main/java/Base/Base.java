package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public void openChromeBrowser() {
		//System.setProperty(null, null);
		WebDriverManager.chromedriver().setup();
		//WebDriver driver= new ChromeDriver();
	}

}
