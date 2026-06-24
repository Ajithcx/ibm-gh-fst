import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class Activity10 {
    public static void main(String[] args) {
    
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/mouse-events");
        System.out.println("Title of the page"+driver.getTitle());
        WebElement cargo=driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/div[1]/div[1]"));
        WebElement cargot=driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/div[1]/div[2]"));
        Actions builder =new Actions(driver);
        Action toperform =builder.click(cargo).moveToElement(cargot).contextClick(cargot).build();
        toperform.perform();
        String actionMessage = driver.findElement(By.id("result")).getText();
        System.out.println(actionMessage);
        WebElement src=driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/div[1]/div[3]"));
        WebElement target=driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/div[1]/div[4]"));
        Action toperform1=builder.doubleClick(src).contextClick(target).build();
        toperform1.perform();
        builder.click(driver.findElement(By.xpath("//div[@id='menu']/div/ul/li[1]"))).pause(5000).build().perform();
       
        actionMessage = driver.findElement(By.id("result")).getText();
        System.out.println(actionMessage);
        
        
        driver.quit();
}}