package basictest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\HP\\\\Downloads\\\\geckdriver\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.jqueryui.com");
		WebElement s = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/aside[1]/ul/li[2]/a"));
		Actions act = new Actions(driver);
		act.contextClick(s).perform();
	}

	
}
