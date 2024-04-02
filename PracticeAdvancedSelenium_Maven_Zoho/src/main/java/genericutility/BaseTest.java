package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import utilityMethods.UtilityMethods;

public class BaseTest {

	public static WebDriver driver;

	public static Properties p = new Properties();
	public static FileInputStream fis;

	public static UtilityMethods pUtil = new UtilityMethods();

public 	BaseTest(String url) throws IOException {
		String URL = pUtil.getDataFrmPropertyFile("url");

	}

	// @Parameters("browser")

	@Test
	public void browser(String bname) throws IOException {

		if (bname.contains("edge")) {

			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/register");
			driver.quit();
		} else if (bname.contains("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/register");
			driver.quit();

		} else if (bname.contains("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/register");
			driver.quit();
		}

	}

	@Test

	public void close() {
		driver.quit();
	}

}
