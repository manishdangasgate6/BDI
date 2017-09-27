package BDI_Tech.BDI_Tech;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Tech {
	String st = System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	@BeforeClass
	public void OpenBrowser() {

		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void CSRlogin_Logout() throws InterruptedException {

		driver.get("http://bdibeta.test.gate6.com/#/login");
		driver.findElement(By.name("username")).sendKeys("technician@lorem.com");
		driver.findElement(By.name("passwd")).sendKeys("Technician1");
		driver.findElement(By.xpath("//div[@class='card']//button[.='Login']")).click();
		Thread.sleep(5000);
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "http://bdibeta.test.gate6.com/#/dashboard");
		driver.findElement(By.xpath("//div[@class='text-right']//a[.='Logout']")).click();
		Thread.sleep(5000);
		String url1 = driver.getCurrentUrl();
		Assert.assertEquals(url1, "http://bdibeta.test.gate6.com/#/login");

	}

	@Test(priority = 2)
	public void AdminInvalidUserNamePassword() throws InterruptedException {

		driver.get("http://bdibeta.test.gate6.com/#/login");
		driver.findElement(By.name("username")).sendKeys("test@gate6.com");
		driver.findElement(By.name("passwd")).sendKeys("Test12345");
		driver.findElement(By.xpath("//div[@class='card']//button[.='Login']")).click();
		Thread.sleep(5000);
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "http://bdibeta.test.gate6.com/#/login");

	}
}
