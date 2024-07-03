package day29_Handling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		//Select Specific checkbox
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//Select All checkboxes
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
//		for(int i=0;i<checkboxes.size();i++) {
//			checkboxes.get(i).click();
//		}
		
//		for(WebElement checkbox:checkboxes) {
//			checkbox.click();
//		}
		
		
		
		//Select Last 3 checkboxes-dyanmically
		//Total no of CB - How mnay to select CB = starting index
//		for(int i=4;i<checkboxes.size();i++) {
//			checkboxes.get(i).click();
//		}
		
		
		
		//select first 3 checkboxes
//		for(int i=0;i<3;i++) {
//			checkboxes.get(i).click();
//		}
		
		//Unselect the checkboxes which are already selected
		for(int i=0;i<3;i++) {
			checkboxes.get(i).click();
		}
		Thread.sleep(5000);
		
		for(int i=0;i<checkboxes.size();i++) {
			if(checkboxes.get(i).isSelected()) {
				checkboxes.get(i).click();
			}
			
		}
		
	}

}
