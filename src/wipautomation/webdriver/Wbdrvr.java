package wipautomation.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Wbdrvr {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.setProperty("webdriver.gecko.driver",
        "C:\\Users\\vijay\\Downloads\\geckodriver-v0.14.0-win64//geckodriver");
    WebDriver driver = new FirefoxDriver();     
    driver.navigate().to("https://github.com/");
    String appTitle = driver.getTitle();
    System.out.println("Application title is :: " + appTitle);
    driver.quit();
  }

}
