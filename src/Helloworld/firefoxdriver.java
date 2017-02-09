package Helloworld;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Webdriver driver  = new firefoxdriver();
		driver.navigate().to("http://google.com");
		String appTitle = driver.getTitle();
		System.out.println("Application title is :: "+appTitle);
		driver.quit();
	}

}
