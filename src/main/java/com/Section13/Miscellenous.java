package Section13;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class Miscellenous {

public static void main(String[] args) throws IOException {
	// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	//	driver.manage().deleteCookieNamed("sessionKey");
	//click on any link
		//login page- verify login url
		driver.get("http://google.com");
		File src=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\ashwini\\screenshot.png"));	
	}

}


