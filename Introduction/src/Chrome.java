
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;


public class Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MY PC\\OneDrive\\Pictures\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com");
System.out.println(driver.getTitle());

System.out.println(driver.getCurrentUrl());
//System.out.println(driver.getPageSource());
driver.navigate().to("http://www.facebook.com");
driver.findElement(By.id("email")).sendKeys("9032858157");
driver.findElement(By.name("pass")).sendKeys("ruthless007");
driver.findElement(By.cssSelector("div._6Itg")).click(); 

/*driver.findElement(By.linkText("Forgotten password?")).click();*/
//driver.navigate().back();
//driver.navigate().forward();
//driver.quit(); 
//driver.close();
	}   

}
