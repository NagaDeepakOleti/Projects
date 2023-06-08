package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioevent2
{
	public static void main(String[] args)
	{
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\onaga\\selenium jar\\chromedriver.exe");  
      
    WebDriver driver=new ChromeDriver();  
      
    driver.navigate().to("https://demo.guru99.com/test/radio.html"); 
    driver.manage().window().maximize();
    
    WebElement rd1 = driver.findElement(By.id("vfb-7-1"));
     if(rd1.isSelected())
     {
    	 rd1.clear();
     }
     else
     {
    	 rd1.click();
    	 System.out.println(rd1.isSelected());
     }
    
   }

}
