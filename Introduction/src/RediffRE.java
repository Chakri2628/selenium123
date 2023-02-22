import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffRE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MY PC\\OneDrive\\Pictures\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("Instagram");
		driver.findElement(By.xpath("//input(contains[@name,'passwo']")).sendKeys("123456");
	}

}
