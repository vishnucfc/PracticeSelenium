package basictest;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class DropDownTwo {
	public static void main(String [] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\Downloads\\geckdriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		WebElement ddown= driver.findElement(By.xpath(""));
		Select sel=new Select(ddown);
		sel.selectByValue(null);
	}
}
