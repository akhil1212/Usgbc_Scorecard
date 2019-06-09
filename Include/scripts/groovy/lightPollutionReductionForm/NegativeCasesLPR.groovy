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
import com.kms.katalon.core.configuration.RunConfiguration
import groovy.io.FileType

class NegativeCasesLPR {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	@Given("User should be Fixture Shielding option")
	public void user_should_be_Fixture_Shielding_option() {

		WebUI.callTestCase(findTestCase('Test Cases/LightPollutionReduction/TC_NavigateToLPR'), null, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject("Object Repository/LightPollutionReduction/FixtureShielding/input_Select one of the following_selectedOption"))
		WebUI.delay(2)
	}

	@When("User clicks on save button without entering any data")
	public void user_clicks_on_save_button_without_entering_any_data(){

		WebUI.scrollToElement(findTestObject("Object Repository/LightPollutionReduction/FixtureShielding/Saveform/btn_Save"), 30)
		WebUI.click(findTestObject("Object Repository/LightPollutionReduction/FixtureShielding/Saveform/btn_Save"))
	}

	@Then("An error message saying Please fix the highlighted errors will be displayed")
	public void an_error_message_saying_please_fix_the_highlighted_errors_will_be_displayed(){

		WebUI.delay(2)
		boolean str =	WebUI.verifyTextPresent("Please fix the highlighted errors.", false)
		println "###########" + str
		WebUI.delay(2)
	}

	@When("User uploads a file which is greater than 100mb of shielding information for each luminaire (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_shielding_information_for_each_luminaire_MBfile_pdf(String Shielding_Info) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+Shielding_Info
		println ("######################"+ myPdffilePath)
		//WebUI.switchToFrame(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/iframe'), 5)


		WebUI.scrollToElement(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_shielding information/p_Upload shielding information'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_shielding information/Addfile_shielding information/input_file'), myPdffilePath)
		//WebUI.switchToDefaultContent()
	}

	@Then("An error message saying Maximum allowed file size is 100 MB only will be displayed")
	public void an_error_message_saying_Maximum_allowed_file_size_is_MB_only_will_be_displayed() {
		WebUI.delay(2)
		boolean str =	WebUI.verifyTextPresent("Maximum allowed file size is 100 MB only.", false)
		println "###########" + str
	}

	@When("User uploads a file of shielding information for each luminaire (.*)")
	public void user_uploads_a_file_of_shielding_information_for_each_luminaire_MBWordfile_doc(String Shielding_Info) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+Shielding_Info
		println ("######################"+ myPdffilePath)
		//WebUI.switchToFrame(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/iframe'), 5)
		//WebUI.scrollToElement(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_shielding information/p_Upload shielding information'), 30)
		WebUI.delay(2)
		WebUI.uploadFile(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_shielding information/Addfile_shielding information/input_file'), myPdffilePath)
		//WebUI.switchToDefaultContent()
	}

	@Then("User clicks on save while the file is uploading")
	public void user_clicks_on_save_while_the_file_is_uploading() {

		WebUI.scrollToElement(findTestObject("Object Repository/LightPollutionReduction/FixtureShielding/Saveform/btn_Save"), 30)
		WebUI.click(findTestObject("Object Repository/LightPollutionReduction/FixtureShielding/Saveform/btn_Save"))
	}

	@And("An error message saying Please wait running actions to complete will be displayed")
	public void an_error_message_saying_Please_wait_running_actions_to_complete_will_be_displayed() {
		WebUI.delay(2)
		boolean str =	WebUI.verifyTextPresent("Please wait running actions to complete.", false)
		println "###########" + str
		WebUI.delay(2)
	}

	@When("User uploads a file which is greater than 100mb for site plan with scale and any related site features (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_for_site_plan_with_scale_and_any_related_site_features_MBfile_pdf(String Site_Plan) {
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+Site_Plan
		println ("######################"+ myPdffilePath)
		//WebUI.switchToFrame(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/iframe'), 5)
		WebUI.scrollToElement(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_siteplan/p_Upload a site plan with scal'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_siteplan/Addfile_siteplan/input_siteplan'), myPdffilePath)
		//WebUI.switchToDefaultContent()
	}

	@When("User uploads a file for site plan with scale and any related site features (.*)")
	public void user_uploads_a_file_for_site_plan_with_scale_and_any_related_site_features_MBWordfile_doc(String Site_Plan) {
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+Site_Plan
		println ("######################"+ myPdffilePath)
		//WebUI.switchToFrame(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/iframe'), 5)
		WebUI.delay(2)
		WebUI.uploadFile(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_siteplan/Addfile_siteplan/input_siteplan'), myPdffilePath)
		//WebUI.switchToDefaultContent()
	}

	@When("User uploads a file which is greater than 100mb of special circumstances for fixture shielding in Light Pollution Reduction (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_special_circumstances_for_fixture_shielding_in_Light_Pollution_Reduction_MBfile_pdf(String Spl_Circ) {
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+Spl_Circ
		println ("######################"+ myPdffilePath)
		//WebUI.switchToFrame(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/iframe'), 5)
		WebUI.scrollToElement(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_SpecialCircumstances/p_Upload any additional docume'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_SpecialCircumstances/Addfile_SpecialCicumstances/input_additional'), myPdffilePath)
		//WebUI.switchToDefaultContent()
	}

	@When("User uploads a file of special circumstances for fixture shielding in Light Pollution Reduction (.*)")
	public void user_uploads_a_file_of_special_circumstances_for_fixture_shielding_in_Light_Pollution_Reduction_Spl_Circ(String Spl_Circ) {
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+Spl_Circ
		println ("######################"+ myPdffilePath)
		//WebUI.switchToFrame(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/iframe'), 5)
		WebUI.delay(2)
		WebUI.uploadFile(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_SpecialCircumstances/Addfile_SpecialCicumstances/input_additional'), myPdffilePath)
		//WebUI.switchToDefaultContent()
	}

	@And("User clicks on clear draft and confirms")
	public void user_clicks_on_clear_draft_and_confirms(){
		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/LightPollutionReduction/FixtureShielding/a_Clear draft"))
		WebUI.click(findTestObject("Object Repository/LightPollutionReduction/FixtureShielding/button_Yes"))
		WebUI.delay(2)
	}
}