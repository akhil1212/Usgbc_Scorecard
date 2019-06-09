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
import java.text.DateFormat
import java.text.SimpleDateFormat


class DeleteLightPollutionReduction {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@When("User deletes the uploaded files of shielding information for each luminaire")
	public void user_deletes_the_uploaded_files_of_shielding_information_for_each_luminaire() {

		String xpath_Shielding_Information="//*[@id='shieldingInfoUpload_files']/table/tbody/tr"
		int row_Count = (new projectKeywords()).countRowsPerPage(xpath_Shielding_Information)

		if (row_Count > 0){

			WebUI.scrollToElement(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_shielding information/p_Upload shielding information'), 30)

			for (int k = row_Count; k>=1; k--){
				TestObject	 delete = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="shieldingInfoUpload_files"]/table/tbody/tr['+k+']/td[5]/a[2]/i', true)
				WebUI.delay(1)
				WebUI.switchToFrame(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/iframe'), 5)
				WebUI.click(delete)
				WebUI.delay(2)
				WebUI.switchToDefaultContent()
				WebUI.click(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/button_Yes'))
			}
		}
	}

	@Then("User can see all the shielding information for each luminaire files are deleted")
	public void user_can_see_all_the_shielding_information_for_each_luminaire_files_are_deleted() {

		/*	WebUI.refresh()
		 WebUI.waitForPageLoad(2)*/
		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_shielding information/Table_shielding information'), 30)
	}

	@When("User deletes the uploaded files of site plan, with scale and any related site features")
	public void user_deletes_the_uploaded_files_of_site_plan_with_scale_and_any_related_site_features() {

		String xpath_Site_Plan="//*[@id='sitePlanUpload_files']/table/tbody/tr"
		int row_Count = (new projectKeywords()).countRowsPerPage(xpath_Site_Plan)

		if (row_Count > 0){

			WebUI.scrollToElement(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_siteplan/p_Upload a site plan with scal'), 30)

			for (int k = row_Count; k>=1; k--){
				TestObject	 delete = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="sitePlanUpload_files"]/table/tbody/tr['+k+']/td[5]/a[2]/i', true)
				WebUI.delay(1)
				WebUI.switchToFrame(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/iframe'), 5)
				WebUI.click(delete)
				WebUI.delay(2)
				WebUI.switchToDefaultContent()
				WebUI.click(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/button_Yes'))
			}
		}
	}

	@Then("User can see all the site plan, with scale and any related site features files are deleted")
	public void user_can_see_all_the_site_plan_with_scale_and_any_related_site_features_files_are_deleted() {

		/*	WebUI.refresh()
		 WebUI.waitForPageLoad(2)*/
		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_siteplan/Table_siteplan'), 30)
	}

	@When("User deletes the uploaded files of special circumstances for fixture shielding in LPR")
	public void user_deletes_the_uploaded_files_of_special_circumstances_for_fixture_shielding_in_LPR() {
		String xpath_Special_Circum="//*[@id='splCircumstancesDocs_files']/table/tbody/tr"
		int row_Count = (new projectKeywords()).countRowsPerPage(xpath_Special_Circum)

		if (row_Count > 0){

			WebUI.scrollToElement(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_SpecialCircumstances/p_Upload any additional docume'), 30)

			for (int k = row_Count; k>=1; k--){
				TestObject	 delete = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="splCircumstancesDocs_files"]/table/tbody/tr['+k+']/td[5]/a[2]/i', true)
				WebUI.delay(1)
				WebUI.switchToFrame(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/iframe'), 5)
				WebUI.click(delete)
				WebUI.delay(2)
				WebUI.switchToDefaultContent()
				WebUI.click(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/button_Yes'))
			}
		}
	}

	@Then("User can see the special circumstances for fixture shielding in LPR files deleted")
	public void user_can_see_the_special_circumstances_for_fixture_shielding_in_LPR_files_deleted() {
		/*	WebUI.refresh()
		 WebUI.waitForPageLoad(2)*/
		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_SpecialCircumstances/Table_additionaldoc'), 30)
		WebUI.delay(2)
		WebUI.click(findTestObject("Object Repository/LightPollutionReduction/FixtureShielding/a_Clear draft"))
		WebUI.click(findTestObject("Object Repository/LightPollutionReduction/FixtureShielding/button_Yes"))
	}


	/**
	 * Delete table Site lighting measurements in Option 2 LPR
	 */


	DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss a");
	int count,x,k
	@Given("User should be in Perimeter Measurements")
	public void user_should_be_in_Perimeter_Measurements() {
		WebUI.callTestCase(findTestCase('Test Cases/LightPollutionReduction/TC_NavigateToLPR'), null, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject("Object Repository/LightPollutionReduction/PremierMeasurements/input_Option2.Perimeter Measurements"))
	}

	@When("User deletes the rows for Site lighting measurements except mandatory fields")
	public void user_deletes_the_rows_for_Site_lighting_measurements_except_mandatory_fields() {

		count = findTestData("LightPollutionReduction/TBL_SiteLighting").getRowNumbers()
		WebUI.delay(2)

		x = count+1

		WebUI.switchToFrame(findTestObject('Object Repository/LightPollutionReduction/PremierMeasurements/iframe'), 5)
		Date siteLighting  = new Date()
		String siteLightingStart= dateFormat.format(siteLighting)
		println "Deleteing Site Lighting Table starting : "+siteLightingStart

		for(def row=x; row > 1 ; row--) {
			WebUI.delay(1)
			k=row
			//*[@id="credit-form"]/div[3]/div[2]/div/table/tbody/tr[2]/td[5]/a[2]/i
			TestObject minus = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//div[@id="credit-form"]/div[3]/div[2]/div/table/tbody/tr['+k+']/td[5]/a[2]/i', true)
			WebUI.scrollToElement(minus, 30)
			WebUI.click(minus)
			WebUI.delay(1)
		}
		WebUI.switchToDefaultContent()

		Date dateSiteLighting  = new Date()
		String siteLightingEnd= dateFormat.format(dateSiteLighting)
		println "Deleteing Site Lighting Table end : "+siteLightingEnd
	}

	@Then("User can see all the rows are deleted except the mandatory fields in Site lighting measurements")
	public void user_can_see_all_the_rows_are_deleted_except_the_mandatory_fields_in_Site_lighting_measurements() {

		WebUI.switchToFrame(findTestObject('Object Repository/LightPollutionReduction/PremierMeasurements/iframe'), 5)
		TestObject measurementID = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="credit-form"]/div[3]/div[2]/div/table/tbody/tr[2]/td[1]/input', true)
		WebUI.verifyElementNotPresent((measurementID), 30)
		WebUI.switchToDefaultContent()

		WebUI.verifyElementPresent(findTestObject('Object Repository/LightPollutionReduction/PremierMeasurements/input_measurementid'), 30)

		WebUI.scrollToElement(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Saveform/btn_Save'),30)

		WebUI.click(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Saveform/btn_Save'))

		//	WebUI.delay(5)
	}
}