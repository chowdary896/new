package newpakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\hp\\Desktop\\Eclipse\\geckodriver-v0.10.0-win64\\.exe");
		WebDriver driver = new InternetExplorerDriver();	
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		driver.findElement(By.id("lst-ib")).sendKeys("Tirupathi");

	}
}
