package TestMaven.Project;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import TestMaven.Project2.TestChrome;

public class AppTest 
{
	public WebDriver driver;
	TestChrome objTestChrome=new TestChrome();
	public AppTest objAppTest= new AppTest(); ;
	Logger log = Logger.getLogger("Test2");
	


	@BeforeClass
	public void openChrome()
	{
		objTestChrome.openBrowser();
	}
	
	@AfterClass
	public void closeChrome()
	{
		objTestChrome.closeBrowser();
	}
	
	@Test(priority = 1)
	public void testABC()
	{
		for(int i =0; i<=3;i++)
		{
			System.out.println( "Hello World!" );
		}
	}

	@Test(priority = 2)
	public void loginFB()
	{
		driver.get("http://www.youtube.com");
		log.info("Opening Youtube page...");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement email = driver.findElement(By.xpath("//div[@id='search-input']"));
		email.sendKeys("jenkins pipeline tutorial");
		log.info("Search... ");
		
		 List<WebElement> ele = driver.findElements(By.xpath("//ul[@role='listbox']"
		 		+ "//li/descendant::div[@class='sbqs_c']")); 
		
		 for(WebElement element:ele)
		 {
			 String str = element.getText();
			 if(str.equals("jenkins pipeline tutorial"))
				 log.info("Click on.... " +str);
				 element.click();
		 }
		 
		/*WebElement pwd = driver.findElement(By.id("pass"));
		log.info("Enter password..");
		pwd.sendKeys("nikita07");

		WebElement login = driver.findElement(By.id("u_0_2"));
		log.info("Click on Login");
		login.click();*/
	}






















	/*   
	 * Create the test case
	 *
	 * @param testName name of the test case


    public AppTest( String testName )
    {
        super( testName );
    }


	 *//**
	 * @return the suite of tests being tested
	 *//*
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

	  *//**
	  * Rigourous Test :-)
	  *//*
    public void testApp()
    {
        assertTrue( true );
    }*/































}
