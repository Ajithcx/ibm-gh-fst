import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class Activity12{
    public static void main(String[] args) {
    	WebDriver driver=new FirefoxDriver();
    	driver.get("https://training-support.net/webelements/tables");
    	
    	System.out.println(driver.getTitle());
    	List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
    	System.out.println(rows.size());
    	List<WebElement> cols = driver.findElements(By.xpath("//table/thead/tr/th"));
    	System.out.println(cols.size());
    	List<WebElement> third = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
    	for (WebElement cell:third) {
    	System.out.println(cell.getText());
    	}
    	WebElement sec = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]"));
    	System.out.println(sec.getText());
    	
    	driver.quit();
    	
    }}