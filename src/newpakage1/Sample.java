package newpakage1;
import org.openqa.selenium.Alert;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.NoSuchFrameException;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

 

public class Sample {

 

       public static void main(String[] args) throws InterruptedException {
DesiredCapabilities capabilities = DesiredCapabilities.firefox();
capabilities.setCapability("marionette", true);
              // TODO Auto-generated method stub

              //System.setProperty("webdriver.chrome.driver", "C:\\Users\\ext.cvelakaturichowd\\Downloads\\chromedriver_win32 (1)\\chromeDriver.exe");
              System.setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\Desktop\\Eclipse\\geckodriver-v0.10.0-win64\\geckodriver.exe");

              //ChromeOptions options = new ChromeOptions();

        //options.addArguments("start-maximized");

        //options.addArguments("disable-infobars");

        //options.addArguments("--disable-extensions");

              //WebDriver driver = new ChromeDriver(options);
              WebDriver driver = new FirefoxDriver();

              driver.manage().window().maximize();

              //driver.get("https://Bk5018128:Goody@123@syntelligence.syntelinc.com/Pages/default.aspx");

             

              driver.navigate().to("https://BK5018128:Goody@123@syntelligence.syntelinc.com/_windows/default.aspx?ReturnUrl=/Pages/default.aspx");

              //driver.get("http://Bk5018128:Goody@123@syntelligence.syntelinc.com");

              // https://syntelligence.syntelinc.com/_windows/default.aspx?ReturnUrl=/Pages/default.aspx

             

              //http://Bk5018128:Goody123@syntelligence.syntelinc.com/Pages/default.aspx

             

      

        
              driver.findElement(By.xpath("//a[@href='/_layouts/15/DMS/DMSMainPage.aspx']")).click();

              WebElement element = driver.findElement(By.xpath("//a[text()='Demand']"));

              Actions action = new Actions(driver);

              action.moveToElement(element).build().perform();

              driver.findElement(By.linkText("View Demand")).click();

              //WebElement element1 = driver.findElement(By.xpath("//input[@id='txtDemandID']"));

              //element1.sendKeys("abc");

 

              Thread.sleep(1000);

              try {

             

              WebElement button=driver.findElement(By.xpath("//*[@id=\"ctl00_PlaceHolderMain_myiframedems\"]")); 

               

              driver.switchTo().frame(button);

              Thread.sleep(1000);

              driver.findElement(By.xpath("//*[@id=\"txtDemandID\"]")).sendKeys("619882");

              Thread.sleep(1000);

              WebElement element1 = driver.findElement(By.xpath("//*[@id=\"btnSearch\"]"));

              action.moveToElement(element1).click().build().perform();

              Thread.sleep(2000);

              WebDriverWait wait = new WebDriverWait(driver, 10);

                     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"gvwViewDemandResult_btnUpdate_0\"]"))).submit();

              //driver.findElement(By.xpath("//*[@id=\"gvwViewDemandResult_btnUpdate_0\"]")).submit();

              //*[@id="gvwViewDemandResult_btnUpdate_0"]

              // WebElement element2 = driver.findElement(By.xpath("//*[@id=\"gvwViewDemandResult_btnUpdate_0\"]"));

              //action.moveToElement(element2).click().build().perform();

              //Thread.sleep(2000);

                    

              //driver.findElement(By.xpath("//*[@id=\"btnSearch\"]")).submit();

              //*[@id="btnSearch"]

              //*[@id="btnSearch"]

              }

              catch (NoSuchFrameException e)

                   {         

              System.out.println(e.getMessage());    

               

                   }

              driver.close();

       }

 

}

 

 
