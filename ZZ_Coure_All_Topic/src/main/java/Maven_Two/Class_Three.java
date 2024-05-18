package Maven_Two;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class_Three {
	@Test(groups = "Two")
	public static void Open_browser_Three()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.quit();
	}
	

}
