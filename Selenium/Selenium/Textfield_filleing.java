package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textfield_filleing 
{
	public static void main(String[] args) 
	{
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\onaga\\selenium jar\\chromedriver.exe");  
	      
	    WebDriver driver=new ChromeDriver();  
	      
	    driver.navigate().to("https://www.amazon.in/"); 
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes for mens");  
	          
	    driver.findElement(By.id("nav-search-submit-button")).click(); 
	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(400,640)"," ");  
	    
	    driver.findElement(By.id("low-price")).sendKeys("200");
	    driver.findElement(By.id("high-price")).sendKeys("1000");
	    driver.findElement(By.xpath("//*[@id=\"a-autoid-1\"]/span/input")).click();
	       
	    
	}

}
