package FutureGrail;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;

public class TheVault {
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
	public void theVault() {
		driver.findElement(By.xpath("(//a)[4]")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[3]/section[1]/div/p")));
	}

	@Test(priority = 3)

	public void vaultSwitchtabs() {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[3]/section[1]/div/section[1]/div[1]/div[1]"))
				.click();
		String sdb = driver.findElement(By.xpath("(//p)[13]")).getText();
		sdb.contains("and accessibility is tailored to fit your busy lifestyle.");

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[3]/section[1]/div/section[1]/div[1]/div[2]"))
				.click();
		String cm = driver.findElement(By.xpath("(//p)[13]")).getText();
		cm.contains("Trust us to manage your valuable watch collection.");

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[3]/section[1]/div/section[1]/div[1]/div[3]"))
				.click();
		String aav = driver.findElement(By.xpath("(//p)[13]")).getText();
		aav.contains("our team is here to provide you with reliable and trustworthy information.");

	}

	@Test(priority = 4)

	public void hIT() {
		WebElement git = driver
				.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[3]/section[2]/div[2]/div[1]/article[1]"));

		Actions a = new Actions(driver);
		a.moveToElement(git).build().perform();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement hoveredElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"__next\"]/div[1]/main/div[3]/section[2]/div[2]/div[1]/article[1]/p")));

		if (hoveredElement.isDisplayed()) {
			System.out.println("Mouse-over image is displayed successfully.");
		} else {
			System.out.println("Mouse-over image is not displayed");

		}

	}

	@Test(priority = 5)
	public void r() {
		WebElement r = driver
				.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[3]/section[2]/div[2]/div[1]/article[2]"));
		Actions a = new Actions(driver);
		a.moveToElement(r).build().perform();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement hoveredElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"__next\"]/div[1]/main/div[3]/section[2]/div[2]/div[1]/article[2]")));

		if (hoveredElement.isDisplayed()) {
			System.out.println("Mouse-over image is displayed successfully.");

		} else {
			System.out.println("Mouse-over image is not displayed");
		}
	}

	@Test(priority = 6)
	public void ypa() {
		WebElement ypa = driver
				.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[3]/section[2]/div[2]/div[1]/article[3]"));
		Actions a = new Actions(driver);
		a.moveToElement(ypa).build().perform();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement hoveredElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"__next\"]/div[1]/main/div[3]/section[2]/div[2]/div[1]/article[3]")));

		if (hoveredElement.isDisplayed()) {
			System.out.println("Mouse-over image is displayed successfully.");

		} else {
			System.out.println("Mouse-over image is not displayed");

		}

	}
	
	@Test(priority = 7)
	public void tyv () {
		WebElement tyv = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[3]/section[2]/div[2]/div[1]/article[4]"));
		
		Actions a = new Actions(driver);
		a.moveToElement(tyv).build().perform();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement mouseHover = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[3]/section[2]/div[2]/div[1]/article[4]")));
		
		if (mouseHover.isDisplayed()) {
			System.out.println("Mouse-over image is displayed successfully.");
			
		}
		else {
			System.out.println("Mouse-over image is not displayed");
		}
		
	}
	
	@Test(priority=8)
	
	public void scheduleanAppointmtnt() {
		
		
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
