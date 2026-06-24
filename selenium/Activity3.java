import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) {

        // Set path if not already in system PATH
        // System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/webelements/target-practice/");
        
        System.out.println(driver.getTitle());	
        
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password");
        driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/form/button")).click();
        System.out.println("New Page Title "+driver.getTitle());
        driver.quit();
       
    }
}   