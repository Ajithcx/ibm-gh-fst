import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.List;

public class Activityamazon {

    public static void main(String[] args) {

        // Initialize driver
    	WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {
            // Open Amazon
            driver.get("https://www.amazon.in");

            // Search for product
            driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 17 pro ");
            driver.findElement(By.id("nav-search-submit-button")).click();

            // Get all search result items
            List<WebElement> products = driver.findElements(
                    By.xpath("//div[@data-component-type='s-search-result']")
            );

            // Check if at least 4 results exist
            if (products.size() >= 4) {

                WebElement fourthProduct = products.get(3);

                try {
                    // Extract price
                    String whole = fourthProduct.findElement(
                            By.name("")
                    ).getText();

                    String fraction = fourthProduct.findElement(
                            By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/span/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[1]/div[1]/div[1]/a/span/span[1]")
                    ).getText();

                    System.out.println("4th Product Price: ₹" + whole + "." + fraction);

                } catch (Exception e) {
                    System.out.println("Price not available for 4th product");
                }

            } else {
                System.out.println("Less than 4 products found.");
            }

        } finally {
            // Close browser
            driver.quit();
        }
    }
}
