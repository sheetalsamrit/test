import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Testthinkbridge {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "/Users/sheetal/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		
		driver.get("https://jt-dev.azurewebsites.net/#/SignUp");
		
		//Validate that the dropdown has "English" and "Dutch"
		WebElement Choose_language = driver.findElement(By.xpath("//*[@id=\"language\"]/div[1]/span/span[2]"));
		Choose_language.click();
		WebElement languages= driver.findElement(By.xpath("//*[@id=\"language\"]/ul"));
		System.out.println("Languages are:\n" + languages.getText());
		 
	    // Input in "Full Name"	
		WebElement full_name= driver.findElement(By.xpath("//*[@id=\"name\"]"));
		full_name.sendKeys("Sheetal Vaibhav Samrit");
		
	    // Input in "Organization Name"	
		WebElement organization_name= driver.findElement(By.xpath("//*[@id=\"orgName\"]"));
		organization_name.sendKeys("Sheetal Samrit");
		
	    // Input in "Email"	
		WebElement Email= driver.findElement(By.xpath("//*[@id=\"singUpEmail\"]"));
		Email.sendKeys("sheetal@ranium.in");
		
	    // Check I agree to "Terms and Condition"
	//	Thread.sleep(50000);
	//	WebElement Terms_and_Conditions= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/div/section/div[1]/form/fieldset/div[4]/label/a"));
	//	Terms_and_Conditions.click();
		
		Thread.sleep(90000);
	    WebElement agree= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/div/section/div[1]/form/fieldset/div[4]/label/span"));
		agree.click();
		
	    // Click on "get started Button"	
		WebElement Get_Started = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/div/section/div[1]/form/fieldset/div[5]/button"));
		Get_Started.click();
	    System.out.println("A welcome email has been sent. Please check your email.");
		
	   // Validate Email received
		
		//ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	   // driver.switchTo().window(tabs.get(1)); //switches to new tab
	   // driver.get("https://www.facebook.com");
	
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	    System.out.println(driver.getTitle());
	    Actions act = new Actions(driver);
	    act.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
	    driver.get("https://mail.google.com/mail/");
	    
	    WebElement Emaill= driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
		Emaill.sendKeys("sheetal@ranium.in");
		
		WebElement Next= driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"));
		Next.click();
		Thread.sleep(50000);
		WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
		password.sendKeys("Samrit@20");
		
		WebElement Next1= driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span"));
		Next1.click();
		
		
		Thread.sleep(90000);
		WebElement Email1=driver.findElement(By.xpath("//*[@id=\":1q\"]/span/span"));
		Email1.click();
		 String t = "Please Complete JabaTalks Account";
		if ( driver.getPageSource().contains("Please Complete JabaTalks Account")){
	         System.out.println("Text: " + t+ " An Email has been recieved. ");
	      } else {
	         System.out.println("Text: " + t + " An email has not been recieved. ");
	      }	
		
        }}
	
	

	
