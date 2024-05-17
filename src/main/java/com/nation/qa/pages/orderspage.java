package com.nation.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.nation.qa.base.TestBaseNW;

public class orderspage extends TestBaseNW 
{
	public orderspage() 
	{
		PageFactory.initElements(driver, this);
		// he this keyword can be used to refer current class instance variable.		
	}

}
