package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radioevent1 
{

	public static void main(String[] args)
	{
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\onaga\\selenium jar\\chromedriver.exe");  
      
    WebDriver driver=new ChromeDriver();  
      
    driver.navigate().to("https://demo.guru99.com/test/radio.html"); 
    driver.manage().window().maximize();
    
    driver.findElement(By.id("vfb-7-1")).click();
}
}
