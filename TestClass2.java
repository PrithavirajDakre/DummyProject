

package TestPackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestClass2 {
	static WebDriver driver;
  @Test
  public static void main(String[] args)throws InterruptedException {
	  driver.get("https://www.google.com");
	  System.out.println();
	  Thread.sleep(5000);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("AAAAAAAAAAAAAAAAAA");
	  System.setProperty("webdriver.gecko.driver", "D:\\\\Selenium\\web driver\\geckodriver-v0.11.1-win64\\New\\geckodriver.exe");
	  driver = new FirefoxDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}



