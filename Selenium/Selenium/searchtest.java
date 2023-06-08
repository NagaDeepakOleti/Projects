package Selenium;
import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  

public class searchtest {
	public static void main(String[] args)
	{
	 // System Property for Chrome Driver   
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\onaga\\selenium jar\\chromedriver.exe");  
      
         // Instantiate a ChromeDriver class.     
    WebDriver driver=new ChromeDriver();  
      
       // Launch Website  
    driver.navigate().to("http://www.google.com/");  
    
    // Click on the search text box and send value  
    driver.findElement(By.id("APjFqb")).sendKeys("Amazon");  
          
    // Click on the search button  
    driver.findElement(By.name("btnK")).click();  
        

}
}  
