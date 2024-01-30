package basictest;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\HP\\\\Downloads\\\\geckdriver\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.singaporeair.com/en_UK/in/home#/book/bookflight");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath{("/html/body/div[2]/div[4]/sia-header/div[2]/sia-cookie/div/div/div/div[2]/button")).click();
		
		//WebElement rad=
				driver.findElement(By.id("redeemFlights")).click();
		//rad.click();
		//System.out.println(rad.isSelected());
		
		
		
		
		
		
		
		}

}
