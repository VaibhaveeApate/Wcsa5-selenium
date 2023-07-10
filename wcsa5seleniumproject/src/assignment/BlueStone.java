package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStone {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//launch the browser
		WebDriver driver=new ChromeDriver();
		//maximize browser 
		driver.manage().window().maximize();
		//apply implicit
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"confirmBtn\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ember3\"]/div[2]")).click();
		Thread.sleep(2000);
	}

}
