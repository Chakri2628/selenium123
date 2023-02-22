
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;


public class Chrome3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MY PC\\OneDrive\\Pictures\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com");
System.out.println(driver.getTitle());

System.out.println(driver.getCurrentUrl());
driver.get("https://login.salesforce.com/");
driver.findElement(By.name("username")).sendKeys("Hello");
driver.findElement(By.id("password")).sendKeys("12345678");
driver.findElement(By.xpath("//*[@id='Login']")).click();
System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText()); 
	}   

}
