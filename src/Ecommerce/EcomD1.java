package Ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utils.BaseBrow;

public class EcomD1 extends BaseBrow {
	@Test(priority = 1)
	public void MobileLogin() {
		String url = driver.getCurrentUrl();
		System.out.println("Guru Ecommerce Page title is :" + url);
		// Verifycation
		if (url.equals("http://live.guru99.com/index.php/")) {
			System.out.println("Guru Ecommorce  page passed.....");
		} else {
			System.out.println("Guru Ecommerce page not valid....");
		}

		driver.findElement(By.xpath("//a[contains(text(),'Mobile')]")).click();
		String title = driver.getTitle();
		System.out.println("Page title After clicking:" + title);
		// Verification
		if (title.equals("Mobile")) {
			System.out.println("Page tilte verified after clicking the mobile ");
		} else {
			System.out.println("Page tilte not verified after clicking the mobile");
		}
		// Dropdown by selecting mobile order

		Select dropdown = new Select(driver.findElement(By.xpath("//select[@title='Sort By']")));
		dropdown.selectByVisibleText("Name");
		// Verification
		String Url = driver.getCurrentUrl();
		if (Url.equals("http://live.guru99.com/index.php/mobile.html?dir=asc&order=name")) {
			System.out.println("Page title verified after dropdown...");
		} else {
			System.out.println("Page title not verified after dropdown...");
		}
		String Price = driver.findElement(By.xpath("//span[@id='product-price-1']")).getText();
		System.out.println("Price Of Xperia Mobile :" + Price);
	}

	@Test(priority = 2)
	public void Xperia() {
		driver.findElement(By.xpath("//a[@title='Sony Xperia']")).click();
		String Actual = driver.findElement(By.xpath("//span[@id='product-price-1']")).getText();
		String Xprice = driver.findElement(By.xpath("//span[@id='product-price-1']")).getText();
		System.out.println("Price of Moblie...:" + Xprice);
	}

}
