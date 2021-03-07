package com.demo.ProjectSalesforce.Testcases;

import org.testng.annotations.Test;

import com.demo.ProjectSalesforce.BusinesssMethods.Homepage;

public class TC001_VerifyOppurtunityName {

	@Test
	public void VerifyOppurtunityName() throws InterruptedException
	
	{
		Homepage hom = new Homepage();
		hom.VerifyOppurtunityName();
		
		
	}

}
