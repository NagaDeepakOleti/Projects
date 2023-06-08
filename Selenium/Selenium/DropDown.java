package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown 
{
	public static void main(String[] args) throws InterruptedException 
	{
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\onaga\\selenium jar\\chromedriver.exe");  
	      
	    WebDriver driver=new ChromeDriver();  
	      
	    driver.navigate().to("https://trytestingthis.netlify.app/"); 
	    driver.manage().window().maximize();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(400,640)"," ");  
	    
	    WebElement dlp=driver.findElement(By.name("option"));
	   Select drp= new Select(dlp);
	   drp.selectByIndex(2);
	   Thread.sleep(2000);
	   drp.selectByValue("option 3");
	   Thread.sleep(2000);
	}

}
