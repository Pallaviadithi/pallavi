package JTC;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class GoogleTest  {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91990\\Downloads\\chromedriver_win32\\chromedriver.exe");
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		// Verifying the links
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http:www.google.com");
		//Thread.sleep(3000);
		Actions a1= new Actions(driver);
		// Thread.sleep(3000);
	a1.moveToElement(driver.findElement(By.linkText("Gmail"))).click().build().perform();
	
	driver.navigate().back();
		
	
	 
		// verifying Feeling lucky  button
		driver.get("http:www.google.com");
		
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);		// Thread.sleep(3000);
		Actions a= new Actions(driver);
		
		 
    a.moveToElement(driver.findElement(By.name("btnI"))).click().build().perform();
    
    
 
 //System.out.println("button is not enabled");
	 
	
	
	
	
	
	
	

	}

}
