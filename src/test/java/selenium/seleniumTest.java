package selenium;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class seleniumTest {
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "E:/tools/geckodriver.exe");
		driver = new FirefoxDriver();

	}
	
	
	@Test
	public void urlTest() {
		driver.get("https://www.baidu.com/");
		String actual =driver.getCurrentUrl();
		assertEquals("https://www.baidu.com/", actual);
	}
	@Test
	public void searchTest() {
		driver.get("https://www.baidu.com/");
		driver.findElement(By.id("kw")).sendKeys("nodejs");
		driver.findElement(By.id("su")).click();
		
	}
	@Test
	public void clickTest() {
		driver.get("https://www.baidu.com/");
		driver.findElement(By.id("virus-2020")).click();
	}
	@Test
	public void hoverTest() {
		driver.get("https://www.baidu.com/");
		WebElement mouse = driver.findElement(By.linkText("…Ë÷√"));
		new Actions(driver).moveToElement(mouse).perform();
		driver.findElement(By.linkText("À—À˜…Ë÷√")).click();
		
		
	}

	@After
	public void setDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

}
