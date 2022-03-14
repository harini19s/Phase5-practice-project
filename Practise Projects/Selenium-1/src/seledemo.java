import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seledemo {
	public static void main(String[] args){
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pavan Jr\\OneDrive\\Documents\\drivers-tools\\chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Pavan Jr\\OneDrive\\Documents\\drivers-tools\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Pavan Jr\\OneDrive\\Documents\\drivers-tools\\geckodriver.exe");
		//FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://www.instagram.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		driver.quit();
	}

}
