package final_mock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;

public class Vtiger {
	public static void main(String[] args) throws InterruptedException {
		
       System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		
       ChromeDriver driver=new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get("https://demo.vtiger.com/vtigercrm/index.php");
       driver.manage().window().maximize();
       driver.findElement(By.xpath("//button[text()='Sign in']")).click();
       driver.findElement(By.id("appnavigator")).click();
       driver.findElement(By.xpath("//span[text()=' SALES']")).click();


      Actions a=new Actions(driver);
       Thread.sleep(2000);
       WebElement e=driver.findElement(By.xpath("(//a[@title='Contacts'])[2]"));
       a.moveToElement(e).click().perform(); 	
	   driver.findElement(By.id("Contacts_listView_basicAction_LBL_ADD_RECORD")).click();
	    
       //driver.navigate().to("https://demo.vtiger.com/vtigercrm/index.php?module=Contacts&view=List&app=SALES");
	 //  driver.findElement(By.id("Contacts_listView_basicAction_LBL_ADD_RECORD")).click();
  
         driver.findElement(By.id("s2id_autogen1")).click();
	     driver.findElement(By.xpath("//div[text()='Mr.']")).click();
	     driver.findElement(By.id("Contacts_editView_fieldName_firstname")).sendKeys("vivek");
	     driver.findElement(By.id("Contacts_editView_fieldName_phone")).sendKeys("123456765");
	     
	     
	     driver.findElement(By.id("Contacts_editView_fieldName_mobile")).sendKeys("vivek");
	     driver.findElement(By.id("Contacts_editView_fieldName_homephone")).sendKeys("vivek");
	     driver.findElement(By.id("Contacts_editView_fieldName_otherphone")).sendKeys("123456765");
	     driver.findElement(By.id("Contacts_editView_fieldName_fax")).sendKeys("vivek");
	     driver.findElement(By.id("Contacts_editView_fieldName_birthday")).sendKeys("12-11-2020");
	     
	     driver.findElement(By.id("Contacts_editView_fieldName_lastname")).sendKeys("valvi");
	     driver.findElement(By.id("s2id_autogen3")).click();
	     driver.findElement(By.xpath("//div[text()='Cold Call']")).click();
	     driver.findElement(By.id("Contacts_editView_fieldName_title")).sendKeys("gatway");
	     driver.findElement(By.id("Contacts_editView_fieldName_department")).sendKeys("CS");
	     driver.findElement(By.id("Contacts_editView_fieldName_email")).sendKeys("vivek@12gmail.com");
	     driver.findElement(By.id("Contacts_editView_fieldName_assistant")).sendKeys("maya");
	     
	     JavascriptExecutor j=(JavascriptExecutor)driver;
	     Thread.sleep(2000);
	     j.executeScript("window.scrollBy(0,300)");
	     Thread.sleep(2000);
	     
	     driver.findElement(By.id("Contacts_editView_fieldName_secondaryemail")).sendKeys("valvi12@gmail.com");
	     //driver.findElement(By.cssSelector("input[id='Contacts_editView_fieldName_donotcall']")).click();
	     driver.findElement(By.xpath("(//input[@name='donotcall'])[2]")).click();
	     driver.findElement(By.id("s2id_autogen5")).click();
	     driver.findElement(By.xpath("//div[text()='Support Group']")).click();
	     driver.findElement(By.id("Contacts_editView_fieldName_assistantphone")).sendKeys("567465346");
	     driver.findElement(By.cssSelector("input[id='Contacts_editView_fieldName_emailoptout']")).click();
	     driver.findElement(By.cssSelector("input[id='Contacts_editView_fieldName_reference']")).click();
	     driver.findElement(By.cssSelector("input[id='Contacts_editView_fieldName_notify_owner']")).click();
	     /*customer portal details*/
	     driver.findElement(By.id("Contacts_editView_fieldName_portal")).click();
	     driver.findElement(By.id("Contacts_editView_fieldName_support_start_date")).clear();
	     driver.findElement(By.id("Contacts_editView_fieldName_support_start_date")).sendKeys("16-05-2023");
	     driver.findElement(By.id("Contacts_editView_fieldName_support_end_date")).clear();
	     driver.findElement(By.id("Contacts_editView_fieldName_support_end_date")).sendKeys("20-07-2023");
	     /**/
	     
	     Thread.sleep(2000);
	     j.executeScript("window.scrollBy(0,400)");
	     Thread.sleep(2000);
	     
	     driver.findElement(By.xpath("//textarea[@name='mailingstreet']")).sendKeys("solapur road of pune");
	     driver.findElement(By.id("Contacts_editView_fieldName_mailingpobox")).sendKeys("coo");
	     driver.findElement(By.id("Contacts_editView_fieldName_mailingcity")).sendKeys("pune");
	     driver.findElement(By.id("Contacts_editView_fieldName_mailingstate")).sendKeys("maharashtra");
	     driver.findElement(By.id("Contacts_editView_fieldName_mailingzip")).sendKeys("425414");
	     driver.findElement(By.id("Contacts_editView_fieldName_mailingcountry")).sendKeys("india");
	     Thread.sleep(2000);
	     j.executeScript("window.scrollBy(0,400)");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//textarea[@name='otherstreet']")).sendKeys("solapur road");
	     driver.findElement(By.id("Contacts_editView_fieldName_otherpobox")).sendKeys("fgd");
	     driver.findElement(By.id("Contacts_editView_fieldName_othercity")).sendKeys("pune");
	     driver.findElement(By.id("Contacts_editView_fieldName_otherstate")).sendKeys("maharashtra");
	     driver.findElement(By.id("Contacts_editView_fieldName_otherzip")).sendKeys("425414");
	     driver.findElement(By.id("Contacts_editView_fieldName_othercountry")).sendKeys("india");
	     
	     driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("mayahhgdh hhdk "
	     		+ "dggdh hhdjhf hhddj");
	     driver.findElement(By.xpath("//button[text()='Save']")).click(); 
	     driver.findElement(By.cssSelector("span[title='Atlas Jeniffer(admin)']")).click();
	     Actions a1=new Actions(driver);
	     WebElement ele=driver.findElement(By.partialLinkText("Sign Out"));
	     a1.moveToElement(ele).click().perform();
	     driver.close();
	}

}
