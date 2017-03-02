package com.wip.training.exc7;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GithuBLogin {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String username = "name@gmail.com";
    String passwd = "password";
    
    
    System.setProperty("webdriver.gecko.driver", "/Users/vijay/Downloads/geckodriver");     
    WebDriver driver = new FirefoxDriver();
    driver.get("https://github.com/");
    driver.findElement(By.linkText("Sign in")).click();
    driver.get("https://github.com/login");
    WebElement signin = driver.findElement(By.name("login"));
    signin.click();
    signin.sendKeys(username);
    WebElement password = driver.findElement(By.name("password"));
    password.click();
    password.sendKeys(passwd);
    driver.findElement(By.name("commit")).click();    
  }
  }

