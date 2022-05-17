package HotelWebsite.Marriott;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FollowOnFacebook {
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
				
				//Clicking on My Trips
				driver.findElement(By.xpath("//span[@class='icon-facebook']")).click();
				
	}

}

