package basictest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckBox {
		public static void main(String[] args) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\Downloads\\geckdriver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.sugarcrm.com/request-demo");
			driver.manage().window().maximize();
			
			
			driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
			WebElement from=  driver.findElement(By.id("doi0"));
			from.click();
			System.out.println(from.getTagName());
			System.out.println(driver.getCurrentUrl());
			
			
			
			
			
			
		}
}
