package day21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;

/*
 TestCases:
 1) launch browser
 2) open url : https://demo.opencart.com/
 3) Validtae title- "Your Store"
 4) close browser
 */

public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch browser (chrome) or with webDriver
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
		//WebDriver driver = new ChromeDriver();
		
		// open url : https://demo.opencart.com/
		driver.get("https://demo.opencart.com/");
		
		//Validata title- "Your Store"
		//capture the title of web page
		String actual_title = driver.getTitle();
		if(actual_title.equals("Your Store")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
				
		//close browser
		driver.close();		

		
	}

}
