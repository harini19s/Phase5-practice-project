import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pavan Jr\\OneDrive\\Documents\\drivers-tools\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.manage().window().maximize();
		
//		loginFlow(driver);
		
		incorrectPasswordFlow(driver);
				
		
	}
	
	public static void loginFlow(WebDriver driver) {
		driver.get("https://www.phptravels.net/login");
		driver.findElement(By.name("email")).sendKeys("user@phptravels.com");
		driver.findElement(By.name("password")).sendKeys("demouser");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}
	
	public static void incorrectPasswordFlow(WebDriver driver) throws InterruptedException {
		String expectedErrorMessage = "Wrong credentials. try again!";
		driver.get("https://www.phptravels.net/login");
		driver.findElement(By.name("email")).sendKeys("user@phptravels.com");
		//enter incorrect password
		driver.findElement(By.name("password")).sendKeys("demo");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(500);
		String wrongCredentialsText = driver.findElement(By.className("alert-danger")).getText();
		System.out.println(wrongCredentialsText);
		Assert.assertEquals(wrongCredentialsText, expectedErrorMessage);
	}
	
	public static void getWalletBalance(WebDriver driver) {
		String walletText = driver.findElement(By.xpath("//div[contains(@class,'user_wallet')]/div/div/div[2]/h4")).getText();		
		String walletCurrency = walletText.split(" ")[0];
		String walletAmount = walletText.split(" ")[1];
		System.out.println("Wallet Currency: " + walletCurrency);
		System.out.println("Wallet Amount: " + walletAmount);
		Assert.assertEquals(walletAmount, "1500");
		Assert.assertEquals(walletCurrency, "USD");
	}

}