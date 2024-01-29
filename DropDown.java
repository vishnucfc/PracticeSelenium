package basictest;
import org.openqa.selenium.*;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class DropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\Downloads\\geckdriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
		WebElement ddown= driver.findElement(By.xpath("//*[@id=\"how-select\"]"));
		
		Select sel = new Select(ddown);
		sel.selectByIndex(5);
		sel.selectByVisibleText("Internet");
		
		
	}
}
