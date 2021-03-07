package com.demo.ProjectSalesforce.BusinesssMethods;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class Homepage {
	
	
	public void VerifyOppurtunityName() throws InterruptedException
	{
	
	//Setting system properties of ChromeDriver
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	ChromeDriver driver = new ChromeDriver(options);
	
	driver.manage().window().maximize();
	Actions action = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	//Login 
	driver.get("https://login.salesforce.com");
	Thread.sleep(1000);
	
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("mercury.bootcamp@testleaf.com");
	
	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("Bootcamp$123");
	
	WebElement login = driver.findElement(By.id("Login"));
	login.click();
	System.out.println("User sucessfully Logged In");
	Thread.sleep(5000);
	
	
	//Clicking on Toggle Menu 
	WebElement togglemenu = driver.findElement(By.xpath("(//div[contains(@class,'tooltipTrigger tooltip-trigger')]//div)[3]"));
	js.executeScript("arguments[0].click();", togglemenu);
	Thread.sleep(3000);
	System.out.println("Toggle Menu sucessfully selected");
	
	WebElement viewall = driver.findElement(By.xpath("//lightning-button[@class='slds-button slds-p-horizontal--small']//button[1]"));
	js.executeScript("arguments[0].click();", viewall);	
	Thread.sleep(1000);
	System.out.println("Viewall hyperlink sucessfully selected");
	
	// Selecting Sales Tab
	WebElement sales = driver.findElement(By.xpath("//p[text()='Sales']"));
	action.moveToElement(sales).click().build().perform();
	Thread.sleep(6000);
	System.out.println("SALES hyperlink sucessfully selected");
	
	//Click on the Opportunity tab 
	WebElement Opportunity = driver.findElement(By.xpath("(//span[text()='Opportunities'])[1]"));
	js.executeScript("arguments[0].click();", Opportunity);	
	Thread.sleep(2000);
	System.out.println("Opportunity Tab sucessfully selected");
	
	//Clicking New button
	WebElement New = driver.findElement(By.xpath("(//a[@href='javascript:void(0);']//div)[3]"));
    New.click();
	Thread.sleep(4000);
	System.out.println("New Tab sucessfully selected");
	
	//Entering Opportunity Name 
	WebElement oppname = driver.findElement(By.xpath("(//label[contains(@class,'label inputLabel')]/following-sibling::input)[3]"));
	oppname.sendKeys("Salesforce Automation by LAKSHMAN");
	Thread.sleep(3000);
	System.out.println(" Opportunity Name sucessfully Entered");
	
	//Selecting close date
	WebElement closedate = driver.findElement(By.xpath("//div[@class='form-element']//input[1]"));
	closedate.click();
	Thread.sleep(1000);
	
	WebElement datevalue = driver.findElement(By.xpath("//td[@data-datevalue='2021-03-31']//span[1]"));
	datevalue.click();	
	Thread.sleep(1000);
	System.out.println("closedate sucessfully selected");
	
	//Selecting stage 
	WebElement stageicon = driver.findElement(By.xpath("//a[@data-interactive-lib-uid='11']"));
	stageicon.click();	
	Thread.sleep(1000);
	System.out.println("closedate sucessfully selected");
	WebElement option = driver.findElement(By.xpath("//a[@title='Perception Analysis']"));
	option.click();
	Thread.sleep(3000);
	System.out.println("Perception Analysis sucessfully selected");	
	
	//Selecting save button
	WebElement savebtn = driver.findElement(By.xpath("(//span[text()='Save'])[2]"));
	savebtn.click();
	System.out.println("Perception Analysis sucessfully selected");	
	Thread.sleep(3000);
	
	String title = driver.getTitle();
	System.out.println("Actual title =" +title);
	
//	Assert.assertEquals(title, "Salesforce Automation by LAKSHMAN ");
//	System.out.println("Title sucessfully Matched");	
	
	
	}
	

}
