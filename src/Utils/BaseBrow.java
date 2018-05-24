package Utils;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class BaseBrow {
	public WebDriver driver;

	@BeforeTest
	public void BrowserOpen() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Enter Url
		driver.get("http://live.guru99.com/index.php/");
	}

	@AfterTest
	public void CloseBrowser() {
		try {
			driver.close();

			Runtime.getRuntime().exec("taskkill /F /IM FirefoxDriverServer.exe");

		} catch (Exception anException) {
			anException.printStackTrace();
		}
	}
}
