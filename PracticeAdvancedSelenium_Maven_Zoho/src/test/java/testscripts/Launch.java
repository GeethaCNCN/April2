package testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Launch {

	 @Test
	 
	 public void launch() {
		 WebDriver driver = new EdgeDriver(); //baseClass
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://www.zoho.com/en-in/crm/"); //propertiesFile 
		 
		 driver.findElement(By.linkText("SIGN IN")).click();  //locators---> properties
		 driver.findElement(By.id("login_id")).sendKeys("geethacn.koppa@gmail.com"); //ExcelFile
		 driver.findElement(By.id("nextbtn")).click();  
		 driver.findElement(By.id("password")).sendKeys("Amm@54321"); //ExcelFile
		 driver.findElement(By.xpath("(//span[.='Sign in'])[2]")).click();
	 }
	 
	 

}
