package Hotel.Bonvoy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
	@Test
	public void test1() throws InterruptedException {
	//public static void main(String[] args) throws InterruptedException {
		// setting the driver executable
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mindsdet301\\Downloads\\chromedriver.exe");

		// Initiating your chromedriver
		WebDriver driver = new ChromeDriver();

		// Applied wait time
		Thread.sleep(2000);
		// maximize window
		driver.manage().window().maximize();

		// open browser with desried URL
		driver.get("https://www.marriott.com/default.mi");

		// Entering the Destination
		driver.findElement(By.xpath("//input[@name='destinationAddress.destination']")).click();

		driver.findElement(By.xpath("//div[@class='StyledRecentListDiv-sc-ehhnnp culoKU']//ul//li[1]//a//span"))
				.click();

		Thread.sleep(2000);

		// Selecting Check In
		driver.findElement(By.xpath("//div[@class='StyledAddDatesDiv-sc-cskd7x jSRmgM']//button[@class='hover-60']"))
				.click();

		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"//div[@class='DayPicker-Day']//span[@class='DayPicker-Day-Cell']//span[@class='DayPicker-Day-value' and text()='20']"))
				.click();

		// Selecting Check Out
		driver.findElement(By.xpath(
				"//div[@class='DayPicker-Day']//span[@class='DayPicker-Day-Cell']//span[@class='DayPicker-Day-value' and text()='21']"))
				.click();

		// Clicking on Done
		driver.findElement(By.xpath("//button[text()='Done']")).click();

		// Clicking find Hotels
		driver.findElement(By.xpath("//button[text()='Find Hotels']")).click();

		// closing the browser
		// driver.close();

		Assert.assertTrue(true);

		}
		@Test
		public void test2() throws InterruptedException {
		// setting the driver executable
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\mindsdet301\\Downloads\\chromedriver.exe");

		// Initiating your chromedriver
		WebDriver driver1 = new ChromeDriver();

		// Applied wait time
		Thread.sleep(2000);
		// maximize window
		driver1.manage().window().maximize();

		// open browser with desried URL
		driver1.get("https://www.marriott.com/default.mi");
		WebElement ele = driver1.findElement(By.xpath("//span[text()='My Trips']"));
		Actions actions = new Actions(driver1);

		// Clicking on My Trips
		actions.click(ele);

		Assert.assertTrue(true);

		}
		@Test
		public void test3() throws InterruptedException {
		// setting the driver executable
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\mindsdet301\\Downloads\\chromedriver.exe");

		// Initiating your chromedriver
		WebDriver driver2 = new ChromeDriver();

		// Applied wait time
		Thread.sleep(2000);
		// maximize window
		driver2.manage().window().maximize();

		// open browser with desried URL
		driver2.get("https://www.marriott.com/default.mi");

		// Clicking on Sign in or Join
		//driver2.findElement(By.xpath("//span[@class='ham-header__top-nav-txt icon-arrow-down pr-3 d-none d-md-block t-font-inverse-xs']")).click();

		// Thread.sleep(1000);
		

		//driver2.findElement(By.xpath("//button[@data-description='Sign In']")).click();

		// CLicking on Forgot Password
		//driver2.findElement(By.xpath("//a[@href='/forgotPassword.mi']")).click();
		
		//getting special offers
		driver2.findElement(By.xpath("//span[text()='Special Offers']")).click();

		/*
		 * //Switching windows // It will return the parent window name as a String
		 * String parent=driver.getWindowHandle();
		 * 
		 * System.out.println(parent);
		 * 
		 * Set<String>s=driver.getWindowHandles();
		 * 
		 * // Now iterate using Iterator Iterator<String> I1= s.iterator();
		 * 
		 * while(I1.hasNext()) {
		 * 
		 * String child_window=I1.next();
		 * 
		 * 
		 * if(!parent.equals(child_window)) { driver.switchTo().window(child_window);
		 * 
		 * System.out.println(driver.switchTo().window(child_window).getCurrentUrl());
		 * 
		 * //driver.close(); }
		 * 
		 * } //switch to the parent window driver.switchTo().window(parent);
		 */
		Assert.assertTrue(true);
	}
}