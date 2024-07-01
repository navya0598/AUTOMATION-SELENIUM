package WebDriver_day28;

import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement searchresult = driver.findElement(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']"));
		List<WebElement> nestedLinks = searchresult.findElements(By.xpath(".//div"));
		System.out.println(nestedLinks.size());
		
		for(WebElement link:nestedLinks) {
			List<WebElement> links = link.findElements(By.tagName("a"));
			for(WebElement openLink:links) {
				openLink.click();
			}
				
		}
		Set<String> windowIDs =driver.getWindowHandles();
		System.out.println(windowIDs);
		for(String winid:windowIDs) {
			String title = driver.switchTo().window(winid).getTitle();
			if(title.equals("Selenium - Wikipedia")) {
				driver.close();
			}
		}
	}

}
