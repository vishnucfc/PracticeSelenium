package basictest;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class LocatorDemo {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\Downloads\\geckdriver\\geckodriver.exe");
	FirefoxDriver driver= new FirefoxDriver();
	
	
	driver.get("https://www.google.com");
	//driver.findElement(By.partialLinkText("Account")).click();
	//driver.findElement(By.xpath("/html/body/div[2]/header/div/div[3]/div[3]/div[2]/div/div[1]/div/a/span")).click();
	//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div[2]/div[1]/form/div/div/div/div[1]/input[1]")).click();
	//driver.findElement(By.cssSelector("#ap_email")).sendKeys("1234567890");
	
	
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea")).sendKeys("Kanye West");
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
	
	//driver.close();
	
}
}