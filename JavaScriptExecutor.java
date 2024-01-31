package basictest;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class JavaScriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\HP\\\\Downloads\\\\geckdriver\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//printing title
		
		String script = "return document.title;";
		String title = (String) js.executeScript(script);
		System.out.println(title);
		
		//clicking buttons
		
		driver.switchTo().frame("iframeResult");
		js.executeScript("myFunction()");
		driver.switchTo().alert().accept();
		
		//scroll
		driver.navigate().to("https://w3schools.com");
		WebElement s = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[14]/div/p/a"));
		js.executeScript("arguments[0].scrollIntoView(true);", s);
		
		
		
	}

}
