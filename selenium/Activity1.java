import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[] args) {

        // Set path if not already in system PATH
        // System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/");



        System.out.println(driver.getTitle());	
        driver.findElement(By.linkText("About Us")).click();
        System.out.println("New Page Title "+driver.getTitle());

        driver.quit();
    }
}  