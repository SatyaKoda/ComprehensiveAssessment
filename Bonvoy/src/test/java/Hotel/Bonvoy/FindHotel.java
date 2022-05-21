package Hotel.Bonvoy;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindHotel {

	public static void main(String[] args) throws InterruptedException {

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
		
		//Entering the Destination
		driver.findElement(By.xpath("//input[@name='destinationAddress.destination']")).click();
		
		driver.findElement(By.xpath("//div[@class='StyledRecentListDiv-sc-ehhnnp culoKU']//ul//li[1]//a//span")).click();
		
		Thread.sleep(2000);
		
		//Selecting Check In
		driver.findElement(By.xpath("//div[@class='StyledAddDatesDiv-sc-cskd7x jSRmgM']//button[@class='hover-60']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='DayPicker-Day']//span[@class='DayPicker-Day-Cell']//span[@class='DayPicker-Day-value' and text()='20']")).click();
		
		//Selecting Check Out
		driver.findElement(By.xpath("//div[@class='DayPicker-Day']//span[@class='DayPicker-Day-Cell']//span[@class='DayPicker-Day-value' and text()='21']")).click();

		//Clicking on Done
		driver.findElement(By.xpath("//button[text()='Done']")).click();
		
		//Clicking find Hotels
		driver.findElement(By.xpath("//button[text()='Find Hotels']")).click();
		
		// closing the browser
		//driver.close();

	}

}