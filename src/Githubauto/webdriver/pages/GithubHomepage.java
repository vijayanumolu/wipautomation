package Githubauto.webdriver.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class GithubHomepage {
  private WebDriver driver;

  /**
   * @param driver
   * @return 
   */
  public GithubHomepage(WebDriver driver) {
    super();
    this.driver = driver;
  }

  public void load() {
    driver.get("https://github.com/");
  }

  public GithubLoginPage singIn() {
    // driver.get("https://github.com/");
    WebElement linkElement = driver.findElement(By.linkText("Sign in"));
    linkElement.click();
    return new GithubLoginPage(driver);

  }



}