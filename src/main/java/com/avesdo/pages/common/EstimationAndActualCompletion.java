/**
 * 
 */
package com.avesdo.pages.common;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.avesdo.pages.AbstractPage;
import com.avesdo.utils.ConfigurationReader;

/**
 * @author Anil
 *
 */
public class EstimationAndActualCompletion extends AbstractPage {
	
	private static final Logger log = LogManager.getLogger(EstimationAndActualCompletion.class);
	
	public EstimationAndActualCompletion(WebDriver driver, ConfigurationReader configurationReader){
		this.driver = driver;
		this.configurationReader = configurationReader;
		scriptFile = "Closing.xlsx";
		sheetName = "Closing_EC";
		log.info("Update Estimation Completion dates on closing page with keywords from " + scriptFile + " sheet " + sheetName);
	}
	
	public boolean performEstimationCompletion() throws Exception{
		log.info("Perform update estimation completion date for all suits");
		return performOperation();
	}
	
	

}
