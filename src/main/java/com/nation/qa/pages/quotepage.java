package com.nation.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.nation.qa.base.TestBaseNW;

public class quotepage extends TestBaseNW
{
	public quotepage() 
	{
		PageFactory.initElements(driver, this);
		// he this keyword can be used to refer current class instance variable.		
	}
	
}
