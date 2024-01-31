package basictest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\HP\\\\Downloads\\\\geckdriver\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://extendsclass.com/text-compare.html");
		 WebElement sourcetextarea = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[3]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[9]/pre/span"));
		Actions act =new Actions(driver);
		act.keyDown(sourcetextarea, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		WebElement targetarea =driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[4]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[8]/pre/span"));
		act.keyDown(targetarea,Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
			
		
		
		
		
		
		
		
	}

}
