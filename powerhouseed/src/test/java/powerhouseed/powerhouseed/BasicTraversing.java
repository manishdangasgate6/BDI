
package powerhouseed.powerhouseed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class BasicTraversing {
	// public WebDriver driver;

	public String st = System.setProperty("webdriver.chrome.driver", "D:\\FireFox\\chromedriver.exe");
	public WebDriver driver = new ChromeDriver();

	@Test(priority = 1)
	public void Chronicle() throws InterruptedException {
		driver.get("http://powerhouseed.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='nav-primary']/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id='apps']")).click();
		driver.findElement(By.xpath("//*[@id='drop']/li[1]/a")).click();
	}

	@Test(priority = 2)
	public void ChronicleNotes() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='nav-primary']/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id='apps']")).click();
		driver.findElement(By.xpath("//*[@id='drop']/li[2]/a")).click();
	}

	@Test(priority = 3)
	public void ChronicleU() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='nav-primary']/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id='apps']")).click();
		driver.findElement(By.xpath("//*[@id='drop']/li[3]/a")).click();

	}

	@Test(priority = 4)
	public void ESP() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='nav-primary']/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id='nav-primary']/ul/li[2]/a")).click();
		// *[@id='apps']
	}

	@Test(priority = 5)

	public void testimonials() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='testimonials']")).click();

	}

	@Test(priority = 6)

	public void about_us() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='about-us']")).click();

	}

	@Test(priority = 8)

	public void blog() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='blog']")).click();

	}

	@Test(priority = 7)

	public void contact_us() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='contact-us']")).click();

	}

	@BeforeTest
	public void beforeTest() {

		// driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
		// driver.quit();
	}
}