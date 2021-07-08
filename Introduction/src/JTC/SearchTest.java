package JTC;

//import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class SearchTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91990\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
WebDriver driver= new ChromeDriver();
 	
 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 driver.get("https:www.google.com");
 
 
  driver.manage().window().maximize();
 
 driver.findElement(By.name("q")).sendKeys("udemy courses");

 driver.findElement(By.xpath("//input[@value='Google Search']")).click();
 
  System.out.println( driver.getTitle());
  
  driver.findElement(By.xpath("//span[contains(@class,'Zu0yb')]")).click();
  //driver.findElement(By.name("q")).sendKeys("Selenium WebDriver"); 
  // Sign in to udemy 
  driver.findElement(By.xpath("//*[@id=\"udemy\"]/div[2]/div[2]/div[3]/div[7]/a")).click();
  driver.findElement(By.name("fullname")).sendKeys("Pallavi");
  driver.findElement(By.name("email")).sendKeys("pallavi.raghu0528@gmail.com");
  driver.findElement(By.name("password")).sendKeys("1234567");
  boolean b= driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
  System.out.println(b);
driver.findElement(By.name("submit")).click();

  String s=driver.getTitle();
  //WebElement s = driver.findElement(By.xpath("//div[contains(@class,'alert*')/div/div]"));
 // System.out.println(s.getText());
  
  
// WebElement s = driver.findElement(By.xpath("\\div[contains(@class,'alert*')]"))
 // validation( if user has already sign up then he will be redirected to login screen or else he will sign up
  if (s.equalsIgnoreCase("Sign up and start learning | Udemy"))
  {
	  driver.findElement(By.xpath("//*[@id=\"udemy\"]/div[1]/div[3]/div[1]/div/div/div[4]/a")).click();//login page
	  System.out.println("login to udemy course and start learn");
	  
	  
	  
	
  }
  else
  System.out.println("thank you  signing up udemy course");
  
  
//*[@id="udemy"]/div[1]/div[3]/div[1]/div/div/div[4]/a
  
  
   //driver.findElement(By.xpath("//div[contains(@class,'udlite-search*')]")).click();
   
   
   
  
/*List <WebElement> Autosuggest =driver.findElements(By.xpath("//*[@id='matches']"));
 for(WebElement opt:Autosuggest);
 {
	 if(opt.getText().equalsIgnoreCase("udemy"))
	 {
		 opt.click();
		 break;
	 }
 }*/
// Thread.sleep(3000);
 
 

	}

}
