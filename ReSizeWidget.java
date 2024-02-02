package basictest;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class ReSizeWidget {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\HP\\\\Downloads\\\\geckdriver\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		 driver.get("https://www.jqueryui.com/resizable/");
		/* Set<String> s = driver.getWindowHandles();
		 Iterator<String> it= s.iterator();
		 String parentclass = it.next();
		 String childclass =it.next();
		 driver.switchTo().window(childclass); */
		  WebElement framewhite = driver.findElement(By.xpath("//*[@iid=\"content\"]/iframe"));
		 driver.switchTo().frame(framewhite);
		  WebElement framenigga = driver.findElement(By.id("resizable"));
		  driver.switchTo().frame(framenigga);
		  org.openqa.selenium.interactions.Actions act = new Actions(driver);
		  act.dragAndDropBy(framenigga, 300, 230).perform();
		  
		 
		
		
		
		
		
	}

}
