package FutureGrail;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;

public class BNavigationBars {
	
	WebDriver driver;
	JavascriptExecutor js;
	
	@Test(priority = 0)
	public void siteLoading() {
		WebDriverWait wait9 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait9.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"__next\"]/div[1]/header/div[1]/div/div/figure/a/span/img")));
		driver.findElement(By.xpath("(//button)[1]")).click();
		WebDriverWait wait10 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait10.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div[1]/main/div/div[2]/div[1]")));
	}

	@Test(priority = 1)
	public void logIn() {

		driver.findElement(By.xpath("(//input)[1]")).sendKeys("jainul.fayazdeen@shaeryldatatech.com");
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("Potato@123");
		driver.findElement(By.cssSelector(".signin__Button-sc-16mxeir-10.gOdVUL")).click();

		WebDriverWait wait11 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait11.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"__next\"]/div[1]/header/div[1]/div/div/figure/a/span/img")));

	}
	
  @Test(priority=2)
  public void museum() throws InterruptedException {
	  
	  js = (JavascriptExecutor) driver;
	  js.executeScript("javascript:window.scrollBy(240,10000)");
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div[1]/footer/div[2]/div/div/div/div[1]/h5")));
	  //Thread.sleep(200);
	  //driver.findElement(By.cssSelector(".footercustomer__NavSection-sc-1iubs7b-9.iYnAcF a")).click();
      driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/footer/div[2]/div/div/div/div[1]/nav/ul/li[1]")).click();
	  String currenturl = driver.getCurrentUrl();
	  System.out.println("Museum page url :"+currenturl);
	  
  }
  
  @Test(priority=3)
  public void theVault() throws InterruptedException {
	  
	  js = (JavascriptExecutor) driver;
	  js.executeScript("javascript:window.scrollBy(240,10000)");
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div[1]/footer/div[2]/div/div/div/div[1]/h5")));
	  //Thread.sleep(200);
	  driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/footer/div[2]/div/div/div/div[1]/nav/ul/li[2]")).click();
	  String currenturl = driver.getCurrentUrl();
	  System.out.println("vault page url :"+currenturl);
	  
  }
  
  @Test(priority=4)
  public void services() throws InterruptedException {
	  
	  js = (JavascriptExecutor) driver;
	  js.executeScript("javascript:window.scrollBy(240,10000)");
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div[1]/footer/div[2]/div/div/div/div[1]/h5")));
	  //Thread.sleep(200);
	  driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/footer/div[2]/div/div/div/div[2]/nav/ul/li[1]")).click();
	  String currenturl = driver.getCurrentUrl();
	  System.out.println("services page url :"+currenturl);
	  
  }
  
  @Test(priority=5)
  public void events() throws InterruptedException {
	  
	  js = (JavascriptExecutor) driver;
	  js.executeScript("javascript:window.scrollBy(240,10000)");
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div[1]/footer/div[2]/div/div/div/div[1]/h5")));
	  //Thread.sleep(200);
	  driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/footer/div[2]/div/div/div/div[2]/nav/ul/li[2]")).click();
	  String currenturl = driver.getCurrentUrl();
	  System.out.println("event page url :"+currenturl);
	  
  }
  
  @Test(priority=6)
  public void media() throws InterruptedException {
	  
	  js = (JavascriptExecutor) driver;
	  js.executeScript("javascript:window.scrollBy(240,10000)");
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div[1]/footer/div[2]/div/div/div/div[1]/h5")));
	  //Thread.sleep(200);
	  driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/footer/div[2]/div/div/div/div[2]/nav/ul/li[3]")).click();
	  String currenturl = driver.getCurrentUrl();
	  System.out.println("media page url :"+currenturl);
	  
  }
  
  @Test(priority=7)
  public void aboutUs() throws InterruptedException {
	  
	  js = (JavascriptExecutor) driver;
	  js.executeScript("javascript:window.scrollBy(240,10000)");
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div[1]/footer/div[2]/div/div/div/div[1]/h5")));
	  //Thread.sleep(200);
	  driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/footer/div[2]/div/div/div/div[3]/nav/ul/li")).click();
	  String currenturl = driver.getCurrentUrl();
	  System.out.println("about us page url :"+currenturl);
	  
  }
  
  @Test(priority=8)
  public void tAndC() throws InterruptedException {
	  
	  js = (JavascriptExecutor) driver;
	  js.executeScript("javascript:window.scrollBy(240,10000)");
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div[1]/footer/div[2]/div/div/div/div[1]/h5")));
	  //Thread.sleep(200);
	  driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/footer/div[2]/div/div/div/div[4]/nav/ul/li[1]")).click();
	  String currenturl = driver.getCurrentUrl();
	  System.out.println("tAndC page url :"+currenturl);
	  
  } 
  
  @Test(priority=9)
  public void privacyPolicy() throws InterruptedException {
	  
	  js = (JavascriptExecutor) driver;
	  js.executeScript("javascript:window.scrollBy(240,10000)");
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div[1]/footer/div[2]/div/div/div/div[1]/h5")));
	  //Thread.sleep(200);
	  driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/footer/div[2]/div/div/div/div[4]/nav/ul/li[2]")).click();
	  String currenturl = driver.getCurrentUrl();
	  System.out.println("privacy Policy page url :"+currenturl);
	  
  } 
  
  @BeforeSuite
  public void beforeSuite() {
	  System.setProperty("webdriver.chrome.driver",
				"D:\\chrome driver\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://asn-uat.shaeryldatatech.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
  }

  @AfterSuite
  public void afterSuite() {
	  driver.quit();
  }

}
