/**
 * 
 */
package com.avesdo.tests.pages;

import static com.avesdo.tests.utils.reports.ExtentTestManager.startTest;

import java.util.Objects;

import static com.avesdo.tests.utils.reports.ExtentManager.getExtentReports;
import static com.avesdo.tests.utils.reports.ExtentTestManager.getTest;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.avesdo.pages.common.BuyerSignDeal;
import com.avesdo.pages.common.ClosingIndividualUnit;
import com.avesdo.pages.common.ClosingUnitWithFilters;
import com.avesdo.pages.common.CreateContact;
import com.avesdo.pages.common.EstimationAndActualCompletion;
import com.avesdo.pages.common.LoginPage;
import com.avesdo.pages.common.PurchaserPage;
import com.avesdo.utils.ConfigurationReader;

/**
 * @author Anil
 *
 */
public class TestClosingPage extends BaseTest{
	
	public TestClosingPage(){
		
	}
	
	public TestClosingPage(WebDriver driver, ConfigurationReader configurationReader, String browserName){
		this.driver = driver;
		this.configurationReader = configurationReader;
		this.browserName = browserName;
	}
	
	@Test
	public boolean closingEstimatedAndActualCompletion() throws Exception{
		startTest("Perform Estimated and actual Completion " + this.browserName,"Estimation and actual Completion");
		boolean status = true;
		try{
			EstimationAndActualCompletion estimationCompletion = new EstimationAndActualCompletion(driver,configurationReader);
			status = estimationCompletion.performEstimationCompletion();
		}catch(Exception e){
			status = false;
			handleException(e);
		}
		return status;
	}
	
	@Test
	public boolean closingEstimatedAndActualCompletionIndividualUnit() throws Exception{
		startTest("Perform Estimated and actual Completion individual unit" + this.browserName,"Estimation and actual Completion");
		boolean status = true;
		try{
			ClosingIndividualUnit closingindividualunit = new ClosingIndividualUnit(driver,configurationReader);
			status = closingindividualunit.performEstimationCompletion();
		}catch(Exception e){
			status = false;
			handleException(e);
		}
		return status;
	}
	@Test
	public boolean closingEstimatedAndActualCompletionWithFilters() throws Exception{
		startTest("Perform Estimated and actual Completion of units by applying filters" + this.browserName,"Estimation and actual Completion");
		boolean status = true;
		try{
			ClosingUnitWithFilters closingindividualunit = new ClosingUnitWithFilters(driver,configurationReader);
			status = closingindividualunit.performEstimationCompletion();
		}catch(Exception e){
			status = false;
			handleException(e);
		}
		return status;
	}
	

}
