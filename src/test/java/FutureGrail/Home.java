package FutureGrail;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;

public class Home {
	WebDriver driver;
	JavascriptExecutor js;

	@Test(priority = 0)
	public void siteLoading() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"__next\"]/div[1]/header/div[1]/div/div/figure/a/span/img")));
		driver.findElement(By.xpath("(//button)[1]")).click();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div[1]/main/div/div[2]/div[1]")));
	}

	@Test(priority = 1)	
	public void logIn() {

		driver.findElement(By.xpath("(//input)[1]")).sendKeys("jainul.fayazdeen@shaeryldatatech.com");
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("Potato@123");
		driver.findElement(By.cssSelector(".signin__Button-sc-16mxeir-10.gOdVUL")).click();

		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait2.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"__next\"]/div[1]/header/div[1]/div/div/figure/a/span/img")));

	}

	@Test(priority = 2)
	public void homePageBanner() {
		Assert.assertEquals(driver.findElement(By.xpath("(//span)[80]")).getText(),
				"Explore our extraordinary horological collection");
	}

	@Test(priority = 3)
	public void homePagePagescroll() {
		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(250,1150)");
	}

	@Test(priority = 4)
	public void coverValuesCards() throws AWTException, InterruptedException {
		Robot r = new Robot();

		r.mouseMove(226, 400);
		String trust = driver.findElement(By.xpath("(//p)[13]")).getText();
		trust.contains("We build lasting relationships with our community");

		r.mouseMove(560, 400);
		String authenticity = driver.findElement(By.xpath("(//p)[14]")).getText();
		authenticity.contains("providing complete peace of mind.");

		r.mouseMove(940, 400);
		String equality = driver.findElement(By.xpath("(//p)[15]")).getText();
		equality.contains("fixed-price and fractional offerings");

		r.mouseMove(1300, 400);
		String innovation = driver.findElement(By.xpath("(//p)[16]")).getText();
		innovation.contains("transfer and acquire new pieces with ease.");
	}

	@Test(priority = 5)
	public void ourOfferings() {
		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(240,900)");

		driver.findElement(By.xpath("(//div)[64]")).click();
		String museum = driver.findElement(By.xpath("(//p)[18]")).getText();
		museum.contains("the community's horological knowledge and experience.");

		driver.findElement(By.xpath("(//div)[65]")).click();
		String theVault = driver.findElement(By.xpath("(//p)[19]")).getText();
		theVault.contains("confidence in the security of their treasured watches.");

		driver.findElement(By.xpath("(//div)[66]")).click();
		String thePlatform = driver.findElement(By.xpath("(//p)[20]")).getText();
		thePlatform.contains("and provenance, in one convenient location.");
	}

	@Test(priority = 6)
	public void ourCollections() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(240,1200)");

		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("(//span)[98]"))).build().perform();
		driver.findElement(By.xpath("(//span)[98]")).getText();
		System.out.println("Total Pocket Watches:" + driver.findElement(By.xpath("(//span)[98]")).getText());

		a.moveToElement(driver.findElement(By.xpath("(//span)[101]"))).build().perform();
		driver.findElement(By.xpath("(//span)[101]")).getText();
		System.out.println("Total Wrist Watches:" + driver.findElement(By.xpath("(//span)[101]")).getText());

		a.moveToElement(driver.findElement(By.xpath("(//span)[104]"))).build().perform();
		driver.findElement(By.xpath("(//span)[104]")).getText();
		System.out.println("Total Clocks & Artifacts:" + driver.findElement(By.xpath("(//span)[104]")).getText());

	}

	@Test(priority = 7)
	public void visitOurMuseumVideo() throws InterruptedException {

		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(240,2030)");

		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div)[100]")));
//
//		for (int i = 0; i <= 1; i++) {
//			Actions a = new Actions(driver);
//			a.moveToElement(driver.findElement(By.xpath("(//div)[100]"))).click().build().perform();
//		}
//
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[7]/div[1]/div/div/video/source"))
//				.getAttribute("type");
//		Assert.assertEquals(
//				driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[7]/div[1]/div/div/video/source"))
//						.getAttribute("type"),
//				"video/mp4");
		//method 2
		//this is this the correct way to verify the video playing in java
		WebElement videoElement = driver.findElement(By.xpath("(//div)[100]"));
		
		boolean isVideoPlaying = (Boolean)((JavascriptExecutor) driver).executeScript("return argument[0].paused === false", videoElement);
		
		if (isVideoPlaying) {
			System.out.println("video is playing");
			
		}
		else {
			System.out.println("video is not playing");
			
		}

	}

	@Test(priority = 8)
	public void planYourVisit() {

	}

	@Test(priority = 9)
	public void meadia() {
		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(240,1900)");

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[9]/div/div/div[1]/div[1]/a/h2")).click();

		ArrayList<String> a = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(a.get(1));
		String currenturl = driver.getCurrentUrl();
		System.out.println("watchinversment advice:" + currenturl);
		driver.close();
		driver.switchTo().window(a.get(0));

		driver.findElement(By.xpath("(//a)[20]")).click();
		ArrayList<String> b = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(b.get(1));
		String currenturl1 = driver.getCurrentUrl();
		System.out.println("watchinversment advice:" + currenturl1);
		driver.close();
		driver.switchTo().window(b.get(0));

		driver.findElement(By.xpath("(//h4)[1]")).click();
		ArrayList<String> c = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(c.get(1));
		String currenturl2 = driver.getCurrentUrl();
		System.out.println("watchinversment advice:" + currenturl2);
		driver.close();
		driver.switchTo().window(c.get(0));

		driver.findElement(By.xpath("(//h4)[2]")).click();

		ArrayList<String> d = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(d.get(1));
		String currenturl3 = driver.getCurrentUrl();
		System.out.println("watchinversment advice:" + currenturl3);
		driver.close();
		driver.switchTo().window(d.get(0));

		driver.findElement(By.xpath("(//button)[2]")).click();

		WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1)[1]")));
		String currenturl4 = driver.getCurrentUrl();
		System.out.println(currenturl4);
		driver.navigate().back();
		String currenturl5 = driver.getCurrentUrl();
		System.out.println(currenturl5);
	}
	@Test(priority=10)
	
	public void stayConnected() throws InterruptedException {
		driver.findElement(By.xpath("(//button)[4]")).click();
//		String neMessage = driver.findElement(By.xpath("(//span)[179]")).getText();
//		System.out.println(neMessage);
		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(240,340)");
		Assert.assertEquals(driver.findElement(By.xpath("(//span)[179]")).getText(), "Enter valid email address");
		driver.findElement(By.cssSelector("#email")).sendKeys("jainul.fayazdeen@shaeryldatatech.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button)[4]")).click();
		
		
		WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='ErrorModal__Button-sc-14irxed-4 fgvgJw']")));
		
		String alertMessage = driver.findElement(By.cssSelector(".ErrorModal__Subhead-sc-14irxed-2.eSMhVg")).getText();
		System.out.println("Stay Connected Alert message for email subscription: "+alertMessage);
//		driver.switchTo().alert().accept();
		
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
