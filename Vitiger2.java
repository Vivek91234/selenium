package final_mock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Vitiger2 {
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
	       WebElement e=driver.findElement(By.xpath("(//span[text()=' Services'])[1]"));
	       a.moveToElement(e).click().perform(); 	
		   driver.findElement(By.id("Services_listView_basicAction_LBL_ADD_RECORD")).click();
//
		     driver.findElement(By.id("Services_editView_fieldName_discontinued")).click();
		     driver.findElement(By.id("Services_editView_fieldName_servicename")).sendKeys("vivek");
		     driver.findElement(By.id("s2id_autogen1")).click();
		     driver.findElement(By.xpath("//div[text()='Hours']")).click();
		  
		     driver.findElement(By.id("Services_editView_fieldName_website")).sendKeys("google.com");
		     driver.findElement(By.id("Services_editView_fieldName_qty_per_unit")).sendKeys("500");
		     driver.findElement(By.id("s2id_autogen3")).click();
		     driver.findElement(By.xpath("//div[text()='Support']")).click();
		     driver.findElement(By.id("s2id_autogen5")).click();
		     driver.findElement(By.xpath("//div[text()='Support Group']")).click();
		     driver.findElement(By.id("Services_editView_fieldName_sales_start_date")).sendKeys("12-11-2020");
		     driver.findElement(By.id("Services_editView_fieldName_sales_end_date")).sendKeys("12-11-2022");
		     driver.findElement(By.id("Services_editView_fieldName_start_date")).sendKeys("12-11-2020");
		     driver.findElement(By.id("Services_editView_fieldName_expiry_date")).sendKeys("12-11-2022");
		     /**/
		     driver.findElement(By.id("Services-editview-fieldname-unit_price")).sendKeys("20000");
		     driver.findElement(By.id("Services_editView_fieldName_commissionrate")).sendKeys("50");
		     driver.findElement(By.id("tax1_check")).click();
		     driver.findElement(By.id("tax2_check")).click();
		     driver.findElement(By.id("tax3_check")).click();
		     driver.findElement(By.id("Services_editView_fieldName_purchase_cost")).sendKeys("30000");
		     /**/
		     JavascriptExecutor j=(JavascriptExecutor)driver;
		     Thread.sleep(2000);
		     j.executeScript("window.scrollBy(0,300)");
		     Thread.sleep(2000);
		     driver.findElement(By.id("Services_editView_fieldName_description")).sendKeys("dd "
		     		+ "dd ff gggggg gggggggggg");
		     
		     driver.findElement(By.xpath("//button[text()='Save']")).click(); 
		     Thread.sleep(3000);
		    // driver.findElement(By.cssSelector("span[title='Atlas Jeniffer(admin)']")).click();
		     driver.findElement(By.xpath("(//span[@title='Atlas Jeniffer(admin)'])[1]")).click();
		     Actions a1=new Actions(driver);
		     WebElement ele=driver.findElement(By.partialLinkText("Sign Out"));
		     a1.moveToElement(ele).click().perform();
		     driver.close();

	}

}
