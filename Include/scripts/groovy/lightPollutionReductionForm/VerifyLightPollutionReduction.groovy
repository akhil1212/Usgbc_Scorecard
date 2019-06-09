package lightPollutionReductionForm
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

import leedOnlineKeywords.projectKeywords

class VerifyLightPollutionReduction {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	String fileName
	@Given("User has to see the table of uploaded files on shielding information for each luminaire")
	public void user_has_to_see_the_table_of_uploaded_files_on_shielding_information_for_each_luminaire() {

		WebUI.callTestCase(findTestCase('Test Cases/LightPollutionReduction/TC_NavigateToLPR'), null, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject("Object Repository/LightPollutionReduction/FixtureShielding/input_Select one of the following_selectedOption"))
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_shielding information/Table_shielding information'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_shielding information/Table_shielding information'), 30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table of shielding information for each luminaire")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_shielding_information_for_each_luminaire() {

		String xpath_Shielding_Information="//*[@id='shieldingInfoUpload_files']/table/tbody/tr"
		int count = (new projectKeywords()).countRowsPerPage(xpath_Shielding_Information)
		println "Count in table : "+count

		for(def row=1;row<=count ;row++){
			int k=row
			WebUI.switchToFrame(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/iframe'), 5)
			TestObject name = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="shieldingInfoUpload_files"]/table/tbody/tr['+k+']/td[1]', true)
			//	println "File name is : "+fileName

			fileName = WebUI.getText(name)
			println "File name in the table is : "+ fileName
			println "Excel Entering"

			String excelFileName =(new projectKeywords()).CompareExcel(fileName,"UploadedData/UploadedFileNames","FileNames")
			println "File name in the excel is : "+ excelFileName
			WebUI.switchToDefaultContent()
			WebUI.verifyMatch(excelFileName, fileName, false)
		}
	}


	@Given("User has to see the table of uploaded files on site plan, with scale and any related site features")
	public void user_has_to_see_the_table_of_site_plan_with_scale_and_any_related_site_features() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_siteplan/Table_siteplan'), 30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table of site plan, with scale and any related site features")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_site_plan_with_scale_and_any_related_site_features() {

		String xpath_Site_Plan="//*[@id='sitePlanUpload_files']/table/tbody/tr"
		int count = (new projectKeywords()).countRowsPerPage(xpath_Site_Plan)
		println "Count in table : "+count

		for(def row=1;row<=count ;row++){
			int k=row
			WebUI.switchToFrame(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/iframe'), 5)
			TestObject name = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="sitePlanUpload_files"]/table/tbody/tr['+k+']/td[1]', true)
			//	println "File name is : "+fileName

			fileName = WebUI.getText(name)
			println "File name in the table is : "+ fileName
			println "Excel Entering"

			String excelFileName =(new projectKeywords()).CompareExcel(fileName,"UploadedData/UploadedFileNames","FileNames")
			println "File name in the excel is : "+ excelFileName
			WebUI.switchToDefaultContent()
			WebUI.verifyMatch(excelFileName, fileName, false)
		}
	}

	@Given("User has to see the table of uploaded files on special circumstances for fixture shielding in LPR")
	public void user_has_to_see_the_table_of_special_circumstances_for_fixture_shielding_in_LPR() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_SpecialCircumstances/Table_additionaldoc'), 30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table of special circumstances for fixture shielding in LPR")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_special_circumstances_for_fixture_shielding_in_LPR() {

		String xpath_Special_Circum="//*[@id='splCircumstancesDocs_files']/table/tbody/tr"
		int count = (new projectKeywords()).countRowsPerPage(xpath_Special_Circum)
		println "Count in table : "+count

		for(def row=1;row<=count ;row++){
			int k=row
			WebUI.switchToFrame(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/iframe'), 5)
			TestObject name = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="splCircumstancesDocs_files"]/table/tbody/tr['+k+']/td[1]', true)
			//	println "File name is : "+fileName

			fileName = WebUI.getText(name)
			println "File name in the table is : "+ fileName
			println "Excel Entering"

			String excelFileName =(new projectKeywords()).CompareExcel(fileName,"UploadedData/UploadedFileNames","FileNames")
			println "File name in the excel is : "+ excelFileName
			WebUI.switchToDefaultContent()
			WebUI.verifyMatch(excelFileName, fileName, false)
		}
	}
}