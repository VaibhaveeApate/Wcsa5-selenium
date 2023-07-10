package takesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ScreenShotWay5 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
		
		driver.get("https://www.instagram.com/");
		
		EventFiringWebDriver efw = new EventFiringWebDriver(driver);
		File scr = efw.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/screenshot5.jpg");
		Files.copy(scr, dest);

	}

}
