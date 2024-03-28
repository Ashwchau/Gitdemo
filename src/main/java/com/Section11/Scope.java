package Section11;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Give the count of the links on the page
		System.setProperty("webdriver.chrome.driver", "C:/Users/Ashwchau/OneDrive - Capgemini/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ "");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));//Listing Webdriver Scope
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		//3
		WebElement coloumndriver = footerdriver.findElement(By.xpath("//tbody/tr/td[1]/ul[1]"));
		System.out.println(coloumndriver.findElements(By.tagName("a")).size());
		//4 Click  on each link in the column and check if the page are opening 
		for (int i = 1; i < coloumndriver.findElements(By.tagName("a")).size(); i++) {

			String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);

			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000L);

		} // opens all the tabs
		Set<String> abc = driver.getWindowHandles();// 4
		Iterator<String> it = abc.iterator();

		while (it.hasNext()) {

			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	}

}
