import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MY PC\\OneDrive\\Pictures\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		/*driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Name");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12345678");
driver.findElement(By.xpath("//button[@type='submit']")).click();*/
		
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Name");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("123456");
		driver.findElement(By.cssSelector("button[name='login']")).click();
	}

}
