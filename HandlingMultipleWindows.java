package basictest;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class HandlingMultipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\\\Users\\\\HP\\\\Downloads\\\\geckdriver\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.salesforce.com");
		driver.findElement(By.xpath("/html/body/main/div[2]/section/div[1]/article/div[2]/div/pbc-button[2]/a")).click();
		Set <String> windows= driver.getWindowHandles();
		System.out.println(windows);
		Iterator <String> iterator=windows.iterator();
		String parentWindow = iterator.next();
		String childWindow = iterator.next();
		driver.switchTo().window(childWindow);
		System.out.print(driver.getCurrentUrl());
		//driver.findElement(By.xpath("//*[@id=\"UserFirstName-lYBG\"]")).sendKeys("Vishnu");
		/*driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div/div/div/form/div[1]/div/div[2]/div/div/input")).sendKeys("Shankar");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div/div/div/form/div[2]/div/div[1]/div/div/select")).sendKeys("Manager");
		driver.findElement(By.xpath("//*[@id=\"UserEmail-vdv1\"]")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div/div/div/form/div[3]/div/div[1]")).sendKeys("Abcd");
		WebElement d= driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div/div/div/form/div[3]/div/div[2]/div/div/select"));
		Select sel = new Select(d);
		sel.selectByIndex(3); */
		
		
		
	}

}
