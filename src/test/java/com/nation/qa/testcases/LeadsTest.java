package com.nation.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.nation.qa.base.TestBaseNW;
import com.nation.qa.pages.leadspage;



public class LeadsTest extends TestBaseNW
{
	
	public leadspage LeadsPage;
	
	public LeadsTest()

	{
		super();

		// The 'super' keyword allows referencing the parent class or superclass
	}
	
	@BeforeClass
	public void setup() throws Exception 
	{
		System.out.println("Leads  Flow Testing Started");
		initialization1();
		LeadsPage=new leadspage();
		
	}
	
	@Test(priority = 1)
	public void Validate_By_Going_TO_lead_Page_and_Search_Lead_and_Print() throws Exception 
	{
		LeadsPage.NavigateToLeadspage();
		LeadsPage.DetailsOfLead();
	}
	
	public void Validate_By_Mandetory_Field_Not_Empty_and_Click_On_Save() 
	{
		Assert.assertFalse(LeadsPage.NameText.isEmpty(), "The First name is empty!");
		Assert.assertFalse(LeadsPage.EmailText.isEmpty(), "Email Text  is empty!");
		Assert.assertFalse(LeadsPage.PhoneText.isEmpty(), "The Phone no. is empty!");
		Assert.assertFalse(LeadsPage.OriginCityText.isEmpty(), "The Origin city  is empty!");
		Assert.assertFalse(LeadsPage.OriginCityIDText.isEmpty(), "The Origine city is empty!");
		Assert.assertFalse(LeadsPage.DestinationCityIDText.isEmpty(), "The Destination City ID is empty!");
		Assert.assertFalse(LeadsPage.DestinationCityText.isEmpty(), "The Destination City is empty!");
		
		Assert.assertFalse(LeadsPage.ShippingVehicalText.isEmpty(), "The Shipping Vehical name is empty!");		
		Assert.assertFalse(LeadsPage.ShippingDateText.isEmpty(), "The Shipping Date  is empty!");	
		Assert.assertFalse(LeadsPage.ShippingviaText.isEmpty(), "The Shipping via text  is empty!");
		Assert.assertFalse(LeadsPage.LoadYearText.isEmpty(), "The Load Year is empty!");
		Assert.assertFalse(LeadsPage.LoadMakeText.isEmpty(), "The Load Make is empty!");
		Assert.assertFalse(LeadsPage.LoadVehicalText.isEmpty(), "The load vehical is empty!");
		implicitewait();
		LeadsPage.SaveEditedLead();
	}

}
