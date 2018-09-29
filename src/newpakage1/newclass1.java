package newpakage1;
//import java.util.concurrent.TimeUnit;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class newclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println("Hello chowdary");		
System.setProperty("webdriver.ie.driver", "C:\\Users\\hp\\Desktop\\Eclipse\\IEDriverServer_Win32_3.8.0\\IEDriverServer.exe");
WebDriver driver = new InternetExplorerDriver();	
driver.manage().window().maximize();
//driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
driver.get("http://www.apsrtconline.in/oprs-web/");
driver.findElement(By.id("fromPlaceName")).sendKeys("Tirupathi");
driver.findElement(By.id("toPlaceName")).sendKeys("Hyderabad");
WebElement webElement = driver.findElement(By.id("txtJourneyDate"));//You can use xpath, ID or name whatever you like
webElement.sendKeys(Keys.TAB);
//driver.switchTo().frame(0);
driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//driver.findElement(By.id("ui-datepicker-div")).click();
driver.findElement(By.id("txtJourneyDate")).click();
driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
driver.findElement(By.xpath(".//*[@class='ui-datepicker-group ui-datepicker-group-first']")).click();
//driver.findElement(By.id("ui-state-default"));
//webElement.sendKeys(Keys.TAB);


WebElement dateWidget = driver.findElement(By.id("ui-datepicker-div"));
List<WebElement> rows=dateWidget.findElements(By.tagName("tr"));
List<WebElement> columns=dateWidget.findElements(By.tagName("td"));

for (WebElement cell: columns){
 //Select 13th Date 
 if (cell.getText().equals("29")){
 cell.findElement(By.linkText("29")).click();
 break;
 }
}
driver.findElement(By.id("searchBtn")).click();


	}
}
