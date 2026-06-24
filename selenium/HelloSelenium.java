import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloSelenium {
  public static void main(String[] args) {
    // Create a new instance of the Firefox driver
    WebDriver driver = new FirefoxDriver();
    
    // Open the browser
    driver.get("https://slides.com/chandrak/ibm-fst-selenium-v6?token=irANQsKN#/12/1");

    // Perform testing and assertions
    System.out.println(driver.getTitle());
    // Close the browser
    // Feel free to comment out the line below
    // so it doesn't close too quickly
    driver.quit();
  }
}