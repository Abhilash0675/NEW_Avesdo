package com.avesdo.pages.common;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.avesdo.pages.AbstractPage;
import com.avesdo.utils.ConfigurationReader;

public class ClosingIndividualUnit extends AbstractPage {
private static final Logger log = LogManager.getLogger(EstimationAndActualCompletion.class);
	
	public ClosingIndividualUnit(WebDriver driver, ConfigurationReader configurationReader){
		this.driver = driver;
		this.configurationReader = configurationReader;
		scriptFile = "Closing.xlsx";
		sheetName = "Closing_individual_unit";
		log.info("Update Estimation Completion dates on closing page for individual unit with keywords from " + scriptFile + " sheet " + sheetName);
	}
	
	public boolean performEstimationCompletion() throws Exception{
		log.info("Perform update estimation completion date for individual suits");
		return performOperation();
	}

}
