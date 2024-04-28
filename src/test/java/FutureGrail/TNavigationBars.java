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

public class TNavigationBars {
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

	@Test(priority = 2)
	public void tnAuction() throws InterruptedException {

		driver.findElement(By.xpath("(//a)[2]")).click();
		Thread.sleep(100);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"auction-container\"]/div[1]/a")));
		String currenturl = driver.getCurrentUrl();
		System.out.println("Auction url: " + currenturl);
	}

	@Test(priority = 3)
	public void tnmuseum() throws InterruptedException {

		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a)[3]")).click();
		Thread.sleep(100);
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".left-content")));
		String currenturl1 = driver.getCurrentUrl();
		System.out.println("Museum url: " + currenturl1);
	}

	@Test(priority = 4)
	public void tnvault() throws InterruptedException {

		driver.findElement(By.xpath("(//a)[4]")).click();
		Thread.sleep(100);
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait2.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[3]/section[1]/div/p")));
		String currenturl2 = driver.getCurrentUrl();
		System.out.println("The Vault url: " + currenturl2);
	}

	@Test(priority = 5)

	public void tnservices() throws InterruptedException {
		driver.findElement(By.xpath("(//a)[5]")).click();
		Thread.sleep(100);
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait3.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div[1]/main/div/div[1]/div/p")));

		String Currenturl3 = driver.getCurrentUrl();
		System.out.println("Services url: " + Currenturl3);

	}

	@Test(priority = 6)

	public void tnaboutUs() throws InterruptedException {

		driver.findElement(By.xpath("(//a)[6]")).click();
		Thread.sleep(100);
		WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait4.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"__next\"]/div[1]/main/section[1]/div[2]/div/article[1]/p")));

		String Currenturl4 = driver.getCurrentUrl();
		System.out.println("About Us url: " + Currenturl4);

	}

	@Test(priority = 7)

	public void tnMoreEvent() throws InterruptedException {

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/header/div[1]/div/div/div[1]/nav/ul/li[6]/div"))
				.click();
		driver.findElement(By.xpath("(//a)[7]")).click();
		Thread.sleep(100);
		WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait5.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div[1]/main/div/div/div[1]/div/h1")));

		String Currenturl5 = driver.getCurrentUrl();
		System.out.println("Event url: " + Currenturl5);

	}

	@Test(priority = 8)

	public void tnMedia() throws InterruptedException {

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/header/div[1]/div/div/div[1]/nav/ul/li[6]/div"))
				.click();
		driver.findElement(By.xpath("(//a)[8]")).click();
		Thread.sleep(100);
		WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait5.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div[1]/main/section/div[1]/div/div[1]/h1")));

		String Currenturl6 = driver.getCurrentUrl();
		System.out.println("Media url: " + Currenturl6);

	}

	@Test(priority = 9)

	public void tnFaq() throws InterruptedException {

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/header/div[1]/div/div/div[1]/nav/ul/li[6]/div"))
				.click();
		driver.findElement(By.xpath("(//a)[9]")).click();
		Thread.sleep(100);
		WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait5.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[2]/div/p")));

		String Currenturl7 = driver.getCurrentUrl();
		System.out.println("FAQ url: " + Currenturl7);

	}

	@Test(priority = 10)

	public void tnMAboutUs() throws InterruptedException {

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/header/div[1]/div/div/div[1]/nav/ul/li[6]/div"))
				.click();
		driver.findElement(By.xpath("(//a)[10]")).click();
//	WebDriverWait wait6 = new WebDriverWait(driver, Duration.ofSeconds(20));
//	wait6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div[1]/main/section[1]/div[2]/div/article[1]/h1")));
//	driver.findElement(By.xpath("(//a)[10]")).click();
		Thread.sleep(100);
		WebDriverWait wait7 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait7.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"__next\"]/div[1]/main/section[1]/div[2]/div/article[1]/h4")));

		String Currenturl8 = driver.getCurrentUrl();
		System.out.println("About US url: " + Currenturl8);

	}


@Test(priority = 11)

public void favoutiter() {
	
	driver.findElement(By.cssSelector("div[class='headercustomer__CntrlFlex-sc-1x6v4wz-22 SdwCV'] span")).click();
	WebDriverWait wait8 = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait8.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".myFavourite__Head-sc-1uof3mc-2.jzJvuV")));
	
	String Currenturl9 = driver.getCurrentUrl();
	System.out.println("My Favourites url: "+Currenturl9);
	
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
