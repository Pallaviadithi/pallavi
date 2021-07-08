package tests;
import locators.Gmail;
import locators.HomePage;
import keywords.Urls;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertSame;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class googleSearch extends Gmail  {
	
	public WebDriver driver;
	public String   baseUrl="http:www.google.com";
		
	
	
	
 @Test (priority=1)
  public void VerifyLinks()
  {
	
	driver.findElement(By.linkText(Gmail_link)).click();
    String title=driver.getTitle();	  
	Assert.assertEquals(title, Gmaillink);
	driver.navigate().back();
	driver.findElement(By.linkText(Image_link)).click();
	String title1=driver.getTitle();

	Assert.assertEquals(title1, imagetext);
	
  } 
  
	 @Test (priority=0)
   
   public void VerifyGooglepage()
   {
	    
	    driver.manage().window().maximize();
	    String Homepage =driver.getTitle();
	    Assert.assertTrue(true, Homepage);
	    
	  } 
	    
	    
   
	@ Test (priority=3)
	 public void VerifySearch() {
		 driver.get(baseUrl);
		 
		  driver.findElement(By.name("q")).sendKeys("udemy courses");
		  driver.findElement(By.xpath(GoogleSearchbutton)).click();	
			 
		  System.out.println( driver.getTitle());	  
		  driver.findElement(By.xpath(Udemy_link)).click();	
			 
		  
	}   

 @Test(enabled =true, priority=0)
		   
		   public  void InvalidSearchText() {
			 
			   
			    driver.findElement(By.name("q")).click();
				driver.findElement(By.name("q")).sendKeys(";DNSFMBDSH");			
				driver.findElement(By.cssSelector(GoogleSearchbutton1)).click();
				
			    String errormsg =driver.findElement(By.xpath(Error_msg)).getText();
			  
			     System.out.println(errormsg);
			   	 		   
		   }  
		
	
 
 @Test (priority=5)
  public void link() {
	     
	       driver.navigate().refresh();
	 // Sign in
	       driver.findElement(By.linkText(GmailSignIn)).click();
	     	       driver.findElement(By.xpath(G_Email)).sendKeys("pallaviraghu0528@gmail.com");	
	     
         } 

 
  @Test (priority=2)
  public void VerifyFeelingLuckyButton()
  {
	     
	    driver.findElement(By.name("q")).click();
		driver.findElement(By.cssSelector(FeelingLuckyButton)).click();
  } 
	
	 @Test (priority=6)
	  public void Languagelinks()
	  {
		    driver.findElement(By.linkText(Kannada_link)).click();
	        String Expectedtext =driver.findElement(By.cssSelector(FeelingLuckyButton)).getAttribute("value");
        	//String Actualtext="ನಾನು ಅದೃಷ್ಟಶಾಲಿ";
		    
	        Assert.assertEquals(Actualtext, Expectedtext);
	        System.out.println("Kannada language is dispalyed");
	        driver.findElement(By.linkText(English_link)).click();
		
	  }
  @Test (priority=7)
  void LinkCount()
	  {
		 List  <WebElement>linkText= driver.findElements(By.xpath("//div[@id='SIvCob']//a"));		 
		 int LinkCount =linkText.size();		
		 System.out.println(LinkCount);
	       
	  } 
   
   
	  
  
  @BeforeMethod
  public void beforeMethod() {
		
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\91990\\Downloads\\chromedriver_win32\\chromedriver.exe");

		 driver= new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 driver.get(baseUrl);
		 
		 
  }

  @AfterMethod
  public void afterMethod() {
	  
	 driver.close();
  }


}
