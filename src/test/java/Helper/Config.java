package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Config {
	public static WebDriver driver;
	public static Actions action;
	public static void Confchrome() throws Exception{
		System.setProperty("webdriver.chrome.driver",Utils.getProperty("TestDriverPath"));
		
		driver = new ChromeDriver();
			
	}
	public static void MaximaseWindow() {
		driver.manage().window().maximize();
		
	}
public static void navigate(String url) {
	Config.driver.get(url);
	
}
public static void driverQuit() {
	driver.quit();
	
}

}
