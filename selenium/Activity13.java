import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class Activity13{
    public static void main(String[] args) {
    	WebDriver driver=new FirefoxDriver();
    	driver.get("https://training-support.net/webelements/drag-drop");
    	System.out.println(driver.getTitle());
    	Actions builder =new Actions(driver);
    	builder.dragAndDrop(driver.findElement(By.id( "ball")),driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/div[1]"))).build().perform();
    	if(driver.findElement(By.className("dropzone-text")).getText().equals("Dropped!")) {
         	System.out.println("Ball was dropped in Dropzone 1");
         
         }
    	builder.dragAndDrop(driver.findElement(By.id( "ball")),driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/div[2]"))).build().perform();
    	if(driver.findElement(By.className("dropzone-text")).getText().equals("Dropped!")) {
         	System.out.println("Ball was dropped in Dropzone2");
         
         }
    	driver.quit();
    	}}