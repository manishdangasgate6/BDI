package BDI_CSR.BDI_CSR;

import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CSRTest {

	String st = System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	@BeforeClass
	public void OpenBrowser() {

		driver.manage().window().maximize();
	}

	// @Test(priority = 1)
	// public void AdminInvalidUserNamePassword() throws InterruptedException {
	//
	// driver.get("http://bdibeta.test.gate6.com/#/login");
	// driver.findElement(By.name("username")).sendKeys("test@gate6.com");
	// driver.findElement(By.name("passwd")).sendKeys("Test12345");
	// driver.findElement(By.xpath("//div[@class='card']//button[.='Login']")).click();
	// Thread.sleep(5000);
	// String URL = driver.getCurrentUrl();
	// Assert.assertEquals(URL, "http://bdibeta.test.gate6.com/#/login");
	//
	// }
	//
	// @Test(priority = 2)
	// public void CSRlogin_Logout() throws InterruptedException {
	//
	// driver.get("http://bdibeta.test.gate6.com/#/login");
	// driver.findElement(By.name("username")).sendKeys("csr@lorem.com");
	// driver.findElement(By.name("passwd")).sendKeys("Csr11111");
	// driver.findElement(By.xpath("//div[@class='card']//button[.='Login']")).click();
	// Thread.sleep(5000);
	// String URL = driver.getCurrentUrl();
	// Assert.assertEquals(URL, "http://bdibeta.test.gate6.com/#/clients");
	// driver.findElement(By.xpath("//div[@class='text-right']//a[.='Logout']")).click();
	// Thread.sleep(5000);
	// String url1 = driver.getCurrentUrl();
	// Assert.assertEquals(url1, "http://bdibeta.test.gate6.com/#/login");
	//
	// }
	@Test(priority = 2)
	public void CSRAddNewClient() throws InterruptedException {

		driver.get("http://bdibeta.test.gate6.com/#/login");
		driver.findElement(By.name("username")).sendKeys("csr@lorem.com");
		driver.findElement(By.name("passwd")).sendKeys("Csr11111");
		driver.findElement(By.xpath("//div[@class='card']//button[.='Login']")).click();
		// -----------------login---------------

		Thread.sleep(5000);
		driver.findElement(By.xpath("//h4[@class='title']//button[text()='Add Clients']")).click();
		driver.findElement(By.name("fname")).sendKeys("Rakesh");
		driver.findElement(By.name("mname")).sendKeys("Kumar");
		driver.findElement(By.name("lname")).sendKeys("bijoriya");
		driver.findElement(By.name("dob")).sendKeys("09/05/2017");
		driver.findElement(By.name("driverlicense")).sendKeys("3456tfst12345w78");
		driver.findElement(By.name("address")).sendKeys("501-502");
		driver.findElement(By.name("address2")).sendKeys("New road");
		Thread.sleep(5000);
		driver.findElement(By.name("state")).click();

		if (!driver
				.findElement(By.xpath(
						"//div[@class='container']/div[1]/div[1]/div[1]/div/div[5]/div[1]/div/select//option[6]"))
				.isSelected()) {
			driver.findElement(
					By.xpath("//div[@class='container']/div[1]/div[1]/div[1]/div/div[5]/div[1]/div/select//option[6]"))
					.click();
		}
		Thread.sleep(5000);
		driver.findElement(By.name("city")).click();

		if (!driver
				.findElement(By.xpath(
						"//div[@class='container']/div[1]/div[1]/div[1]/div/div[5]/div[2]/div/select//option[15]"))
				.isSelected()) {
			driver.findElement(
					By.xpath("//div[@class='container']/div[1]/div[1]/div[1]/div/div[5]/div[2]/div/select//option[15]"))
					.click();
		}

		driver.findElement(By.name("zip")).sendKeys("25415");
		driver.findElement(By.name("contact")).sendKeys("9523654152");
		driver.findElement(By.name("email")).sendKeys("testAuto@gate6.com");
		// -------------------Offenders Information------------------------

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(2000);
		driver.findElement(By.name("installdaterequest")).sendKeys("09/28/2017");
		driver.findElement(By.xpath("//label[@for='preferredinstallmethod2']")).click();
		// driver.findElement(By.xpath("//label[@for='preferredinstallmethod1']")).click();

		driver.findElement(By.name("locId"));
		if (!driver
				.findElement(By.xpath(
						"//div[@class='container']/div[1]/div[1]/div[2]/div/div[2]/div[2]/div/select//option[3]"))
				.isSelected()) {
			driver.findElement(
					By.xpath("//div[@class='container']/div[1]/div[1]/div[2]/div/div[2]/div[2]/div/select//option[3]"))
					.click();
		}

		driver.findElement(By.name("leaseTerm")).click();
		if (!driver
				.findElement(By.xpath(
						"//div[@class='container']/div[1]/div[1]/div[2]/div/div[3]/div[1]/div/select//option[5]"))
				.isSelected()) {
			driver.findElement(
					By.xpath("//div[@class='container']/div[1]/div[1]/div[2]/div/div[3]/div[1]/div/select//option[5]"))
					.click();
		}

		driver.findElement(By.name("fee")).sendKeys("2000");
		driver.findElement(By.xpath("//label[@for='eligible1']"));

		driver.findElement(By.xpath("//div[@class='container']/div[2]/div/div/div/textarea")).sendKeys("Note test");

		// -----------------------Installation----------------------

		Thread.sleep(2000);
		JavascriptExecutor jseUp = (JavascriptExecutor) driver;
		jseUp.executeScript("window.scrollBy(0,-1000)", "");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class='card']/div/div[1]/div[1]/div/select")).click();

		if (!driver
				.findElement(By.xpath(
						"//div[@class='container']/div[1]/div[2]/div[1]/div/div/div[1]/div[1]/div/select//option[8]"))
				.isSelected()) {
			driver.findElement(By.xpath(
					"//div[@class='container']/div[1]/div[2]/div[1]/div/div/div[1]/div[1]/div/select//option[8]"))
					.click();
		}

		driver.findElement(By.xpath("//div[@class='row']/div[2]/div[1]/div/div/div[1]/div[2]/div/input"))
				.sendKeys("Selenium");
		;
		driver.findElement(By.xpath("//div[@class='container']/div[1]/div[2]/div[1]/div/div/div[1]/div[3]/div/input"))
				.sendKeys("Automation");
		driver.findElement(By.xpath("//div[@class='container']/div[1]/div[2]/div[1]/div/div/div[1]/div[4]/div/input"))
				.sendKeys("java");
		driver.findElement(By.xpath("//div[@class='container']/div[1]/div[2]/div[1]/div/div/div[2]/div[1]/div/input"))
				.sendKeys("20");
		driver.findElement(By.xpath("//div[@class='container']/div[1]/div[2]/div[1]/div/div/div[2]/div[2]/div/input"))
				.sendKeys("251425");
		driver.findElement(By.xpath("//div[@class='container']/div[1]/div[2]/div[1]/div/div/div[2]/div[3]/div/input"))
				.sendKeys("AZ08 2255");
		driver.findElement(
				By.xpath("//div[@class='container']/div[1]/div[2]/div[1]/div/div/div[3]/div[1]/div/div[2]/label"))
				.click();
		driver.findElement(By.xpath("//div[@class='container']/div[1]/div[2]/div[1]/div/div/div[3]/div[2]/div/input"))
				.sendKeys("Test account");

		// -----------------------------Car Information-------------------------------

		JavascriptExecutor jseDown = (JavascriptExecutor) driver;
		jseDown.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(2000);
		driver.findElement(By.name("courtpo")).sendKeys("NewOne");
		driver.findElement(By.name("juridictionid")).click();
		if (!driver
				.findElement(By.xpath(
						"//div[@class='container']/div[1]/div[2]/div[2]/div/div[1]/div[2]/div/select//option[2]"))
				.isSelected()) {
			driver.findElement(
					By.xpath("//div[@class='container']/div[1]/div[2]/div[2]/div/div[1]/div[2]/div/select//option[2]"))
					.click();

		}
		WebElement Editable1 = driver.findElement(By.name("courtname"));
		Editable1.clear();
		Editable1.sendKeys("test1");

		driver.findElement(By.name("courtnotes")).sendKeys("hello");

		WebElement EditablePhone = driver.findElement(By.name("courtphone"));
		EditablePhone.clear();
		EditablePhone.sendKeys("8541236547");

		WebElement EditableEmail = driver.findElement(By.name("courtemail"));
		EditableEmail.clear();
		EditableEmail.sendKeys("test@test12.com");
		JavascriptExecutor jseDown1 = (JavascriptExecutor) driver;
		jseDown1.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		//driver.findElement(By.name("submit")).click();

		
	}
	
	@AfterClass
	 public static boolean isAlertPresent(ChromeDriver wd) {
	        try {
	            wd.switchTo().alert();
	            return true;
	        } catch (NoAlertPresentException e) {
	            return false;
	        }
	    }

}
