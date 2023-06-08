package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxevent 
{

	public static void main(String[] args)
	{
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\onaga\\selenium jar\\chromedriver.exe");  
      
    WebDriver driver=new ChromeDriver();  
      
    driver.navigate().to("https://demo.guru99.com/test/radio.html"); 
    driver.manage().window().maximize();
    
    WebElement ckb1 = driver.findElement(By.id("vfb-6-0"));
    ckb1.click();
    
   driver.findElement(By.xpath("//*[@id=\"vfb-6-1\"]")).click();
	}
    
}
