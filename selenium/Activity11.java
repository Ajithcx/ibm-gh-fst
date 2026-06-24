import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class Activity11 {
    public static void main(String[] args) {
    	WebDriver driver=new FirefoxDriver();
    	driver.get(" https://training-support.net/webelements/keyboard-events");
    	System.out.println(driver.getTitle());
    	Actions biul =new Actions(driver);
    	biul.sendKeys("Sridhar playing sudoku").pause(1000).build().perform();
    	System.out.println(driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/h1")).getText());
    	driver.quit();
    		
    	
    	
    }
    	
    }