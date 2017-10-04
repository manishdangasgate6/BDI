package BDI_CSR.BDI_CSR;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DebugTest {

	String st = System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	@BeforeClass
	public void OpenBrowser() {

		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void Client_InvalidName() throws InterruptedException {

		driver.get("http://bdibeta.test.gate6.com/#/login");
		driver.findElement(By.name("username")).sendKeys("csr@lorem.com");
		driver.findElement(By.name("passwd")).sendKeys("Csr11111");
		driver.findElement(By.xpath("//div[@class='card']//button[.='Login']")).click();
		// ----------------------login----------------------

		Thread.sleep(5000);
		driver.findElement(By.xpath("//h4[@class='title']//button[text()='Add Clients']")).click();

		driver.findElement(By.name("fname")).sendKeys("JG^&*&*^&*^");

		driver.findElement(By.name("mname")).sendKeys("JG^&*&*^&*^");

		driver.findElement(By.name("lname")).sendKeys("JG^&*&*^&*^");

		driver.findElement(By.name("dob")).sendKeys("09/05/2017");

		driver.findElement(By.name("driverlicense")).sendKeys("345ddfdfd46445w78");

		driver.findElement(By.name("address")).sendKeys("501-502");

		driver.findElement(By.name("address2")).sendKeys("New road");
		Thread.sleep(2000);
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

		driver.findElement(By.name("email")).sendKeys("tefAuto@gate6.com");
		JavascriptExecutor jseDown1 = (JavascriptExecutor) driver;
		jseDown1.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		WebElement text1 = driver.findElement(By.xpath("//div[@class='container']/div[3]/div[3]"));
		String hello1 = text1.getText();

		System.out.println(hello1);

		Assert.assertEquals("Please fill required fields", hello1);

	}

	@Test(priority = 2)
	public void NewClientInvalidLicence() throws InterruptedException {
		driver.get("http://bdibeta.test.gate6.com/#/addclients");

		driver.findElement(By.name("fname")).sendKeys("Rakesh");

		driver.findElement(By.name("mname")).sendKeys("Kumar");

		driver.findElement(By.name("lname")).sendKeys("bijoriya");

		driver.findElement(By.name("dob")).sendKeys("09/05/2017");

		driver.findElement(By.name("driverlicense")).sendKeys("invalid&*^%^&%");

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
		Thread.sleep(2000);
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

		driver.findElement(By.name("email")).sendKeys("tefAuto@gate6.com");
		JavascriptExecutor jseDown1 = (JavascriptExecutor) driver;
		jseDown1.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		WebElement text1 = driver.findElement(By.xpath("//div[@class='container']/div[3]/div[3]"));
		String hello1 = text1.getText();

		System.out.println(hello1);

		Assert.assertEquals("Please fill required fields", hello1);
	}

	@Test(priority = 3)
	public void NewClientInvalidZIP() throws InterruptedException {
		driver.get("http://bdibeta.test.gate6.com/#/addclients");

		driver.findElement(By.name("fname")).sendKeys("Rakesh");

		driver.findElement(By.name("mname")).sendKeys("Kumar");

		driver.findElement(By.name("lname")).sendKeys("bijoriya");

		driver.findElement(By.name("dob")).sendKeys("09/05/2017");

		driver.findElement(By.name("driverlicense")).sendKeys("345ddfdfd46445w78");

		driver.findElement(By.name("address")).sendKeys("501-502");

		driver.findElement(By.name("address2")).sendKeys("New road");
		Thread.sleep(2000);
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

		driver.findElement(By.name("zip")).sendKeys("3454&");

		driver.findElement(By.name("contact")).sendKeys("9523654152");

		driver.findElement(By.name("email")).sendKeys("tefAuto@gate6.com");
		JavascriptExecutor jseDown1 = (JavascriptExecutor) driver;
		jseDown1.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		WebElement text1 = driver.findElement(By.xpath("//div[@class='container']/div[3]/div[3]"));
		String hello1 = text1.getText();

		System.out.println(hello1);

		Assert.assertEquals("Please fill required fields", hello1);
	}

	@Test(priority = 4)
	public void NewClientInvalidPhone() throws InterruptedException {
		driver.get("http://bdibeta.test.gate6.com/#/addclients");

		driver.findElement(By.name("fname")).sendKeys("Rakesh");

		driver.findElement(By.name("mname")).sendKeys("Kumar");

		driver.findElement(By.name("lname")).sendKeys("bijoriya");

		driver.findElement(By.name("dob")).sendKeys("09/05/2017");

		driver.findElement(By.name("driverlicense")).sendKeys("345ddfdfd46445w78");

		driver.findElement(By.name("address")).sendKeys("501-502");

		driver.findElement(By.name("address2")).sendKeys("New road");
		Thread.sleep(2000);
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

		driver.findElement(By.name("contact")).sendKeys("3454&");

		driver.findElement(By.name("email")).sendKeys("tefAuto@gate6.com");
		JavascriptExecutor jseDown1 = (JavascriptExecutor) driver;
		jseDown1.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		WebElement text1 = driver.findElement(By.xpath("//div[@class='container']/div[3]/div[3]"));
		String hello1 = text1.getText();

		System.out.println(hello1);

		Assert.assertEquals("Please fill required fields", hello1);
	}

	@Test(priority = 5)
	public void NewClientInvalidEmail() throws InterruptedException {
		driver.get("http://bdibeta.test.gate6.com/#/addclients");

		driver.findElement(By.name("fname")).sendKeys("Rakesh");

		driver.findElement(By.name("mname")).sendKeys("Kumar");

		driver.findElement(By.name("lname")).sendKeys("bijoriya");

		driver.findElement(By.name("dob")).sendKeys("09/05/2017");

		driver.findElement(By.name("driverlicense")).sendKeys("345ddfdfd46445w78");

		driver.findElement(By.name("address")).sendKeys("501-502");

		driver.findElement(By.name("address2")).sendKeys("New road");
		Thread.sleep(2000);
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

		driver.findElement(By.name("email")).sendKeys("(*&*(&*(&*(");
		JavascriptExecutor jseDown1 = (JavascriptExecutor) driver;
		jseDown1.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		WebElement text1 = driver.findElement(By.xpath("//div[@class='container']/div[3]/div[3]"));
		String hello1 = text1.getText();

		System.out.println(hello1);

		Assert.assertEquals("Please fill required fields", hello1);
	}

	@Test(priority = 6)
	public void NewInvalidDOB() throws InterruptedException {

		driver.get("http://bdibeta.test.gate6.com/#/addclients");

		driver.findElement(By.name("fname")).sendKeys("Rakesh");

		driver.findElement(By.name("mname")).sendKeys("Kumar");

		driver.findElement(By.name("lname")).sendKeys("bijoriya");

		driver.findElement(By.name("dob")).sendKeys("876*&^");

		driver.findElement(By.name("driverlicense")).sendKeys("345ddfdfd46445w78");

		driver.findElement(By.name("address")).sendKeys("501-502");

		driver.findElement(By.name("address2")).sendKeys("New road");
		Thread.sleep(2000);
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

		driver.findElement(By.name("email")).sendKeys("tefAuto@gate6.com");
		JavascriptExecutor jseDown1 = (JavascriptExecutor) driver;
		jseDown1.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		WebElement text1 = driver.findElement(By.xpath("//div[@class='container']/div[3]/div[3]"));
		String hello1 = text1.getText();

		System.out.println(hello1);

		Assert.assertEquals("Please fill required fields", hello1);

	}

	// ---------------------------Invalid Court Info-------------------
	@Test(priority = 7)
	public void CourtInvalidEmail() throws InterruptedException {

		driver.get("http://bdibeta.test.gate6.com/#/addclients");

		driver.findElement(By.name("fname")).sendKeys("Rakesh");

		driver.findElement(By.name("mname")).sendKeys("Kumar");

		driver.findElement(By.name("lname")).sendKeys("bijoriya");

		driver.findElement(By.name("dob")).sendKeys("09/05/2017");

		driver.findElement(By.name("driverlicense")).sendKeys("345ddfdfd46445w78");

		driver.findElement(By.name("address")).sendKeys("501-502");

		driver.findElement(By.name("address2")).sendKeys("New road");
		Thread.sleep(2000);
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

		driver.findElement(By.name("email")).sendKeys("tefAuto@gate6.com");
		JavascriptExecutor jseDown1 = (JavascriptExecutor) driver;
		jseDown1.executeScript("window.scrollBy(0,1000)", "");
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
		EditablePhone.sendKeys("ghhjg@jgjh.com");

		WebElement EditableEmail = driver.findElement(By.name("courtemail"));
		EditableEmail.clear();
		EditableEmail.sendKeys("^&**(OH");

		JavascriptExecutor jseDown2 = (JavascriptExecutor) driver;
		jseDown2.executeScript("window.scrollBy(0,1000)", "");

		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		WebElement text1 = driver.findElement(By.xpath("//div[@class='container']/div[3]/div[3]"));
		String hello1 = text1.getText();

		System.out.println(hello1);

		Assert.assertEquals("Please fill required fields", hello1);

	}

	@Test(priority = 8)
	public void CourtInvalidContactNumber() throws InterruptedException {

		driver.get("http://bdibeta.test.gate6.com/#/addclients");

		driver.findElement(By.name("fname")).sendKeys("Rakesh");

		driver.findElement(By.name("mname")).sendKeys("Kumar");

		driver.findElement(By.name("lname")).sendKeys("bijoriya");

		driver.findElement(By.name("dob")).sendKeys("09/05/2017");

		driver.findElement(By.name("driverlicense")).sendKeys("345ddfdfd46445w78");

		driver.findElement(By.name("address")).sendKeys("501-502");

		driver.findElement(By.name("address2")).sendKeys("New road");
		Thread.sleep(2000);
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

		driver.findElement(By.name("email")).sendKeys("tefAuto@gate6.com");
		JavascriptExecutor jseDown1 = (JavascriptExecutor) driver;
		jseDown1.executeScript("window.scrollBy(0,1000)", "");
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
		EditablePhone.sendKeys("*^&*^&*^*&^*");

		WebElement EditableEmail = driver.findElement(By.name("courtemail"));
		EditableEmail.clear();
		EditableEmail.sendKeys("test@test12.com");

		JavascriptExecutor jseDown2 = (JavascriptExecutor) driver;
		jseDown2.executeScript("window.scrollBy(0,1000)", "");

		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		WebElement text1 = driver.findElement(By.xpath("//div[@class='container']/div[3]/div[3]"));
		String hello1 = text1.getText();

		System.out.println(hello1);

		Assert.assertEquals("Please fill required fields", hello1);

	}
}
