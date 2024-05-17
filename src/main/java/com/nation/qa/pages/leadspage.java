package com.nation.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nation.qa.base.TestBaseNW;
import com.nation.qa.confiq.ConfiigurationDetails;

public class leadspage extends TestBaseNW
{
	@FindBy(xpath="//*[@id=\"mnLead\"]")
	WebElement LeadButton;
	
	@FindBy(xpath="(//input[@id='Search_Data'])[1]")
	WebElement SearchLeadByID;
	//Taken from configuration
	
	@FindBy(xpath="//input[@id='btnSearch']")
	WebElement SearchLeadButton;
	
	@FindBy(xpath="//a[normalize-space()='421345']")
	WebElement SelectSearchedLead;
	//Replace above no. with searched code
	
	@FindBy(xpath="//*[@id=\"tabEditLead\"]")
	WebElement EditLeadButton;
	
//This is for Shipper Information	
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement Name;
	public String NameText;
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement PrimaryEmail;
	public String EmailText;
	
	@FindBy(xpath="//input[@id='Phone1']")
	WebElement PrimaryPhone;
	public String PhoneText;
	
//This is for origine and Destination	
	@FindBy(xpath="//input[@id='OriginCity']")
	WebElement FromOriginCity;
	public String OriginCityText;
	
	@FindBy(xpath=" //input[@id='DestinationCity']")
	WebElement ToDestinationCity;
	public String DestinationCityText;
	
	@FindBy(xpath="//select[@id='OriginStateId']")
	WebElement FromOriginCityID;
	public String OriginCityIDText;
	
	@FindBy(xpath="//input[@id='OriginZip']")
	WebElement FromOriginZip;
	public String OriginCityZipText;
	
	@FindBy(xpath="//select[@id='DestinationStateId']")
	WebElement ToDestinationID;
	public String DestinationCityIDText;
	
	@FindBy(xpath="//input[@id='DestinationZip']")
	WebElement ToDestinationZip;
	public String DestinationCityZipText;
	
//This is for Shipping Details
	
	@FindBy(xpath="//input[@id='datepicker-autoclose']") //Estimated date
	WebElement ShippingDate;
	public String ShippingDateText;
	
	@FindBy(xpath="//select[@id='VehicleRun']")
	WebElement ShippingVehicalStatus;
	public String ShippingVehicalText;
	
	@FindBy(xpath="//select[@id='ddlShipVia']")
	WebElement ShippingVia;
	public String ShippingviaText;
	
//This is for load information-----
	
	@FindBy(xpath="//input[@name='Year_1']")  
	WebElement LoadYear;
	public String LoadYearText;
	
	@FindBy(xpath="//input[@id='Make_1']")
	WebElement LoadMake;
	public String LoadMakeText;
	
	@FindBy(xpath="//select[@id='Vehicle_1']")
	WebElement LoadVehical;
	public String LoadVehicalText;
	
//Save Lead Button
	@FindBy(xpath="//input[@id='btnSave']")
	WebElement SubmitBtn;
	
	
	public leadspage() 
	{
		PageFactory.initElements(driver, this);
		// he this keyword can be used to refer current class instance variable.		
	}
	
	public void NavigateToLeadspage() 
	{
		LeadButton.click();
		implicitewait();
		SearchLeadByID.sendKeys(ConfiigurationDetails.LeadID);
		SearchLeadButton.click();
		implicitewait();
		SelectSearchedLead.click();
		EditLeadButton.click();
	}
	
	public void DetailsOfLead() 
	{
		NameText=Name.getAttribute("value");
		System.out.println("Name Of Shiper"+"="+NameText);

	
		EmailText=PrimaryEmail.getAttribute("value");
		System.out.println("Email Of Shiper"+"="+EmailText);
		
	
		PhoneText=PrimaryPhone.getAttribute("value");
		System.out.println("Phone no Of Shiper"+"="+PhoneText);
		
	
		OriginCityText=FromOriginCity.getAttribute("value");
		System.out.println("Origin City of Shipment"+"="+OriginCityText);
		
		DestinationCityText=ToDestinationCity.getAttribute("value");
		System.out.println("Destination City of Shipment"+"="+DestinationCityText);
		
		
		 
		OriginCityIDText=FromOriginCityID.getAttribute("value");
		System.out.println("Origin City  ID of Shipment"+"="+OriginCityIDText);
	
	//	OriginCityZipText= FromOriginZip.getText();
	//	System.out.println("Origin City zip no. of Shipment"+"="+OriginCityZipText);
		
		DestinationCityIDText=ToDestinationID.getAttribute("value");
		System.out.println("Destination City ID of Shipment"+"="+DestinationCityIDText);
		
	//	DestinationCityZipText= ToDestinationZip.getAttribute("value");
	//	System.out.println("Destination Zip no.of Shipment"+"="+DestinationCityZipText);
		
		
		//This is for Shipping Details
		
		 //Estimated date
		
		 ShippingDateText= ShippingDate.getAttribute("value");
		 System.out.println("Estimsated Date of Shipment"+"="+ShippingDateText);
			
		
		 ShippingVehicalText=ShippingVehicalStatus.getAttribute("value");
		 System.out.println("Vehical Details of Shipment"+"="+ShippingVehicalText);
			
		
		 ShippingviaText=ShippingVia.getAttribute("value");
		 System.out.println("Shipping via text "+"="+ ShippingviaText);
			
		
	//This is for load information-----
		
		 LoadYearText=LoadYear.getAttribute("value");
		 System.out.println("Load year no.of Shipment"+"="+ LoadYearText);
			
		
		 LoadMakeText=LoadMake.getAttribute("value");
		 System.out.println("Load make of Shipment"+"="+LoadMakeText);
			
		
		 LoadVehicalText=LoadVehical.getAttribute("value");
		 System.out.println("Load vehical details of Shipment"+"="+LoadVehicalText);
			
	
	}
	
	//This is for save informaton
	
	public void SaveEditedLead() 
	
	{
		JavascriptExecutor ab1 = (JavascriptExecutor) driver;
		ab1.executeScript("window.scrollBy(0,700)");
		SubmitBtn.click();
	}
	
	
	
	
	
	
	
	
	
}
