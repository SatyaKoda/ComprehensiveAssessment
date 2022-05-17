package HotelWebsite.Marriott;

//import java.util.Iterator;
//import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPassword {

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
		
		//Clicking on Sign in or Join
		//driver.findElement(By.xpath("//span[@class='ham-header__top-nav-txt icon-arrow-down pr-3 d-none d-md-block t-font-inverse-xs']")).click();
		
		//Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@data-description='Sign In']")).click();
		
		//CLicking on Forgot Password
		driver.findElement(By.xpath("//a[@href='/forgotPassword.mi']")).click();
		
		/*
		//Switching windows
		// It will return the parent window name as a String
		String parent=driver.getWindowHandle();
		
		System.out.println(parent);

		Set<String>s=driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{

		String child_window=I1.next();


		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);

		System.out.println(driver.switchTo().window(child_window).getCurrentUrl());

		//driver.close();
		}

		}
		//switch to the parent window
		driver.switchTo().window(parent);
		*/
	}

}
