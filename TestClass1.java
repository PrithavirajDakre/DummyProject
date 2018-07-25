package TestPackage1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;




//import org.apache.log4j.xml.DOMConfigurator;
//updated for Github




import org.apache.commons.codec.binary.Base32;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.json.StaticInitializerCoercer;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.apache.log4j.BasicConfigurator;

public class TestClass1 {
	   System.out.println("Change for GitHub");
	   System.out.println("Change for GitHub2");
	   System.out.println("Change for GitHub3");
	   System.out.println("Change for GitHub4");
	//static Logger Log = LogManager.getLogger(TestClass1.class.getName());
	static WebDriver driver;
	
	@Test
	public static void main(String[] args) throws InterruptedException, IOException {
		System.out.println("I am coming my friend - Automation");
		//System.setProperty("webdriver.gecko.driver", "D:\\\\Selenium\\web driver\\geckodriver-v0.11.1-win64\\New\\geckodriver.exe");
		System.setProperty("webdriver.ie.driver", "D:\\Selenium\\web driver\\IEDriverServer_x64_3.0.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		/*BasicConfigurator.configure();
		System.out.println(TestClass1.class.getName());
	    driver= new FirefoxDriver();
	Log.info("This is simple log");*/
		 
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		Thread.sleep(2000);
		driver.close();
		
		 
	   /* 
 
	    Actions builder = new Actions(driver);
	    builder.click(driver.findElement(By.id("photo"))).build().perform();
	    Thread.sleep(5000);
	    
	    
 
	    Runtime.getRuntime().exec("D:\\Selenium\\AutoIt\\TestScript.exe");*/
		
		/*Runtime.getRuntime().exec("D:\\Selenium\\AutoIt\\TestScript.exe");
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.findElement(By.id("photo")).submit();
		Thread.sleep(5000);
		System.out.println("Browse button clicked");*/
		
		
		
		//System.out.println(driver.getWindowHandle());
		//driver.switchTo().window(driver.getWindowHandle());
		
		//System.out.println("Uploaded Photo");
		
		/*WebElement element = driver.findElement(By.id("menu-item-33")); 
		Actions builder = new Actions(driver);
		
		builder.moveToElement(element).perform();
		Thread.sleep(2000);
		WebElement subElement = driver.findElement(By.xpath("//*[@id='menu-item-36']/a"));
		
		builder.moveToElement(subElement).click().perform();
		Thread.sleep(2000);*/
		
		// Actions
		/*driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.dhtmlx.com/docs/products/dhtmlxTree/index.shtml");
		System.out.println("Url entered");
	
		
		WebElement from = driver.findElement(By.xpath("//*[@id='treebox1']//table/tbody/tr[3]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr/td[4]/span"));
		System.out.println("1st element");
		WebElement To = driver.findElement(By.xpath("//*[@id='treebox2']//table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
		System.out.println("2nd element");
		Actions builder =new Actions(driver);
		System.out.println("Action object created");
		
		Action dragDrop = builder.clickAndHold(from).moveToElement(To).release().build();
		System.out.println("Buider creadted");
		dragDrop.perform();
		System.out.println("operation performed");
		
		System.out.println("Moved folder");*/
		
		//iFrame
		/* driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");
		
		List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
		
		for(WebElement iframeN : iframes)
		{
			System.out.println(iframeN);
		}
		
		System.out.println("Number of iframes"+iframes.size());
		
		
		
		
		driver.switchTo().frame(iframes.get(1));
		driver.findElement(By.xpath("//*[@class='detail-entry']/p[1]/a/img")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(0);
		System.out.println("Switched to frame 1");
		Thread.sleep(2000);
	
		driver.findElement(By.name("firstname")).sendKeys("Prithvi");
		System.out.println("Firstname entered");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("Dakre");
		System.out.println("Lastname entered");
		Thread.sleep(2000);*/
		
		//Alert	
		/*driver.get("http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/");
		Thread.sleep(2000);
		driver.findElement(By.xpath(("//*[@id='content']/p[4]/button"))).click();
		Thread.sleep(2000);
		Alert SimpleAlert = driver.switchTo().alert();
		System.out.println("1.    "+SimpleAlert.getText());
		SimpleAlert.dismiss();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(("//*[@id='content']/p[8]/button"))).click();
		Thread.sleep(2000);
		System.out.println("2.    "+SimpleAlert.getText());
		SimpleAlert.accept();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(("//*[@id='content']/p[11]/button"))).click();
		Thread.sleep(2000);
		System.out.println("3.    "+SimpleAlert.getText());
		SimpleAlert.sendKeys("Alert Accepted");
		SimpleAlert.accept();*/
		
		
		//  Switch
		/*driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		
		String Handle1 = driver.getWindowHandle();
		System.out.println(Handle1);
		
		driver.findElement(By.xpath("//*[@id='content']/p[4]/button")).click();
		
		System.out.println("New message window clicked");*/
		
		
		
		/*Set<String> Handles = driver.getWindowHandles();
		
		for(String handle: Handles)
		{
			System.out.println(handle);
			if(!(handle.equals(Handle1)))
			{
				System.out.println("Switched Window"+handle);
				driver.switchTo().window(handle);
				Thread.sleep(5000);
				driver.close();
				
			}
		}*/
		
		
		/*driver.get("http://toolsqa.com/selenium-webdriver/choosing-effective-xpath/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//img[contains(@src,'Profile')]")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//img[starts-with(@alt,'Ask')]")).click();*/
		//Thread.sleep(5000);
		/* // Table
		driver.get("http://toolsqa.wpengine.com/automation-practice-table/");
		
		String city = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[2]")).getText();
		System.out.println(city);
		driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[6]")).click();
		
		*/
		
		/*//Multiple Select
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		Thread.sleep(50000);
		WebElement element = driver.findElement(By.name("selenium_commands"));
		Select select = new Select(element);
		Thread.sleep(5000);
		select.selectByIndex(0);
		Thread.sleep(5000);
		select.deselectByIndex(0);
		Thread.sleep(5000);
		
		select.selectByVisibleText("Switch Commands");
		Thread.sleep(5000);
		select.deselectByVisibleText("Switch Commands");
		
		List<WebElement> list = select.getOptions();
		
		for(WebElement elements:list)
		{
			System.out.println(elements.getText());
			
			
		}
		
		select.selectByIndex(1);
		Thread.sleep(5000);
		select.selectByIndex(3);
		Thread.sleep(5000);
		select.selectByIndex(4);
		Thread.sleep(5000);
		
		select.deselectAll();
		Thread.sleep(5000);
		*/
		
		//Dropdown 
		
		/*driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		WebElement DDelement = driver.findElement(By.id("continents"));
		
		Select selected = new Select(DDelement);
		
		selected.selectByIndex(0);
		Thread.sleep(5000);
		
		selected.selectByVisibleText("Africa");
		Thread.sleep(5000);
		
		List<WebElement> list = selected.getOptions();
		
		for(WebElement element: list)
		{
			System.out.println(element.getText());
			
			if(element.getText().equals("Antartica"))
			{
				System.out.println("*****"+element.getText()+"*******");
				element.click();
			}
		}*/
		
		/*driver.navigate().to("Https://www.google.com/");
		System.out.println("Google Opened");
		WebElement ele = driver.findElement(By.id("lst-ib"));
		System.out.println("Search box Determined");
		String x = "Ipl";
		System.out.println("Java saved in x variable");
		ele.sendKeys(x);
		Thread.sleep(5000);
		System.out.println("Java entered");
		List<WebElement> elements = driver.findElements(By.tagName("input"));
		System.out.println(elements.size());
		driver.findElement(By.id("hplogo")).click();
		for(WebElement element:elements)
		{
			//System.out.println(element.getAttribute("value"));
			if(element.getAttribute("value").equalsIgnoreCase("Google Search"))
			{
				System.out.println("Inside loop");
				
				element.submit();
			}
		}*/
		//Thread.sleep(5000);
		//driver.close();
		
	System.out.println("Completed");
	}

}
