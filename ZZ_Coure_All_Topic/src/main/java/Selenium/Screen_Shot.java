package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screen_Shot {
	
	@Test
	public static void Open_browser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        
      //  File My_Screen_Shot = driver.getScreenshotAs(OutputType.FILE);
   //     FileUtils.copyFile(My_Screen_Shot, new File ("Sc.png"));
        
          File Screen_Shot = driver.getScreenshotAs(OutputType.FILE);
          FileUtils.copyFile(Screen_Shot, new File("Vimal.png"));
	}
	
	
	
	
	
	

}
