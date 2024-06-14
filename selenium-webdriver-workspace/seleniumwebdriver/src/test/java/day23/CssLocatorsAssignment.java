package day23;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class CssLocatorsAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//tag class
		//driver.findElement(By.cssSelector(".form-control")).sendKeys("Laptops");
		
		//tag attributes
		//driver.findElement(By.cssSelector("[placeholder=\"Search\"]")).sendKeys("Mobiles");
		
		//tag class attributes
		driver.findElement(By.cssSelector(".form-control[placeholder='Search']")).sendKeys("Canon");
	
		}
	

}
