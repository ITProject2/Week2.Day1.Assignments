package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class editLeadAssignment2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 WebElement userNameElement = driver.findElement(By.id("username"));
		 userNameElement.sendKeys("Demosalesmanager");
		 WebElement passwordElement = driver.findElement(By.id("password"));
		 passwordElement.sendKeys("crmsfa");
		 WebElement loginElement = driver.findElement(By.className("decorativeSubmit"));
		 loginElement.click();
		 WebElement crmsfaElement = driver.findElement(By.linkText("CRM/SFA"));
		 crmsfaElement.click();
		 WebElement leadsElement = driver.findElement(By.linkText("Leads"));
		 leadsElement.click();
		 WebElement createLeadsElement = driver.findElement(By.linkText("Create Lead"));
		 createLeadsElement.click();
		 WebElement companyNameElement = driver.findElement(By.id("createLeadForm_companyName"));
		 companyNameElement.sendKeys("Maersk GSC Chennai");
		 WebElement firstNameElement = driver.findElement(By.id("createLeadForm_firstName"));
		 firstNameElement.sendKeys("Danielle");
		 WebElement lastNameElement = driver.findElement(By.id("createLeadForm_lastName"));
		 lastNameElement.sendKeys("Rebello");
		 WebElement firstNameLocalElement = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		 firstNameLocalElement.sendKeys("Dani");
		 WebElement departmentFieldElement = driver.findElement(By.id("createLeadForm_departmentName"));
		 departmentFieldElement.sendKeys("Finance");		 
		 WebElement descriptionFieldElement = driver.findElement(By.id("createLeadForm_description"));
		 descriptionFieldElement.sendKeys("Senior Associate FinOps");		 
		 WebElement emailIdElement = driver.findElement(By.id("createLeadForm_primaryEmail"));
		 emailIdElement.sendKeys("dani.rebel@maersk.com");		 
		 WebElement stateElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		 Select dd = new Select(stateElement);
		 dd.selectByVisibleText("New York");
		 
		 WebElement createLeadButtonElement = driver.findElement(By.className("smallSubmit"));
		 createLeadButtonElement.click();
		 
		 WebElement editButtonElement = driver.findElement(By.linkText("Edit"));
		 editButtonElement.click();
		 
		 driver.findElement(By.id("updateLeadForm_description")).clear();
		 
		 WebElement importantNoteElement = driver.findElement(By.id("updateLeadForm_importantNote"));
		 importantNoteElement.sendKeys("Has a bond with company for 2 years");
		 
		 WebElement updateButtonElement = driver.findElement(By.className("smallSubmit"));
		 updateButtonElement.click();
		 
		 String title = driver.getTitle();
		 System.out.println(title);
		 
	}

}
