import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args) {

        // Set path if not already in system PATH
        // System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/webelements/login-form/");



        System.out.println(driver.getTitle());	
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.className("svelte-1pdjkmx")).click();
        System.out.println("New Page Title "+driver.getTitle());

        driver.quit();
    }
}   