package FutureGrail;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class VideosVerification {
	WebDriver driver;
	
  @Test
  public void visitOurMuseum() {
	 String video = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[7]/div[1]/div/div/video/source")).getAttribute("type");
	 
	 System.out.println(video);
	  
	 
  }
  @BeforeSuite
	public void beforeSuite() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\chrome driver\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
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