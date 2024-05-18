package Test_NG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Sample_TestNG {

//	@Test(priority = 1 , description = "This is My Test Case 1" , groups = "This is My B Group")
//	public void Open_Browser_One ()
//	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//        ChromeDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.google.com/");
//        driver.quit();
//	}
//	
//	@Test(priority = 2, description = "This is My Test Case 2" , groups = "This is My B Group")
//	public void Open_Browser_Two ()
//	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//        ChromeDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.google.com/");
//        driver.quit();
//	}
//	
//	
//	@Test(groups = "This is My A Group")
//	public void Open_Browser_Three ()
//	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//        ChromeDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.google.com/");
//        driver.quit();
//
//        
//	}
//	
//	@Test(groups = "This is My A Group")
//	public void Open_Browser_Four ()
//	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//        ChromeDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.google.com/");
//        driver.quit();
//
//	}
//	
//	@Test( enabled = false, invocationCount = 10)
//	public void Open_Browser_Five ()
//	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//        ChromeDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.google.com/");
//        driver.quit();
//	}
//	
//	@Test(dependsOnGroups = "This is My A Group")
//	public void Open_Browser_Six ()
//	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//        ChromeDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.google.com/");
//	}
	
	
//	@Test(dependsOnMethods = "Open_Browser_Nine")
//	public void Open_Browser_Seven ()
//	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//        ChromeDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.google.com/");
//        driver.quit();
//	}
//	
//	@Test(dependsOnMethods = "Open_Browser_Nine")
//	public void Open_Browser_Eight ()
//	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//        ChromeDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.google.com/");
//        driver.quit();
//	}
//	
//	@Test 
//	public void Open_Browser_Nine ()
//	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//        ChromeDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.google.com/");
//        driver.quit();
//	}
//	
	public void Open_Browser_Ten ()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
	}
}
