package testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genericutility.BaseTest;

public class LaunchTest extends BaseTest {
	LaunchTest(String url) throws IOException {
		super(url);
		// TODO Auto-generated constructor stub  
	}

	@Test

	public void login() {
		 
		driver.findElement(By.linkText("SIGN IN")).click(); // locators---> properties
		driver.findElement(By.id("login_id")).sendKeys("geethacn.koppa@gmail.com"); // ExcelFile
		driver.findElement(By.id("nextbtn")).click();
		driver.findElement(By.id("password")).sendKeys("Amm@54321"); // ExcelFile
		driver.findElement(By.xpath("(//span[.='Sign in'])[2]")).click();
	}
}