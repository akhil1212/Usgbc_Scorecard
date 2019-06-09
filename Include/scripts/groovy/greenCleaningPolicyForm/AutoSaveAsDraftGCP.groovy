package greenCleaningPolicyForm
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.configuration.RunConfiguration
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

class AutoSaveAsDraftGCP {
	
	@Given("User is on the Formv01 of Green Cleaning Policy form")
	public void user_is_on_the_Formv_of_Green_Cleaning_Policy_form() {
		
		WebUI.callTestCase(findTestCase('Test Cases/GreenCleaningPolicy/TC_NavigateToGCP'), null, FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("User will not modify any field on the Green Cleaning Policy form")
	public void user_will_not_modify_any_field_on_the_Green_Cleaning_Policy_form() {
		WebUI.delay(10)
	}
	
	@Then("User should not see saving of draft even after 10 seconds in Green Cleaning Policy form")
	public void user_should_not_see_saving_of_draft_even_after_seconds_in_Green_Cleaning_Policy_form() {
		WebUI.verifyElementNotPresent(findTestObject("Object Repository/GreenCleaningPolicy/span_Last draft saved on"),2)
	}
	
	static String dateTime
	@Given("User should be able to see Upload fle on Green Cleaning Policy form")
	public void user_should_be_able_to_see_Upload_fle_on_Green_Cleaning_Policy_form() {
		
		WebUI.click(findTestObject('Object Repository/GreenCleaningPolicy/Option1_GreenCleanPlcy/input_Option1_Radiobtn'))
		WebUI.delay(10)
//		WebUI.scrollToElement(findTestObject("Object Repository/GreenCleaningPolicy/button_Save"), 30)
//		dateTime = WebUI.getText(findTestObject("Object Repository/GreenCleaningPolicy/span_Last draft saved on"))
//		println "Save Date and Time "+dateTime

		WebUI.scrollToElement(findTestObject('Object Repository/GreenCleaningPolicy/Option1_GreenCleanPlcy/AddFile_UploadGreenCleaningPlcy_Option1/input_UploadGreenCleaningPlcy'), 0)
	}
	
	@When("User uploads any file on Green Cleaning Policy form")
	public void user_uploads_any_file_on_Green_Cleaning_Policy_form() {
		
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/MultipleFileDiffExt/ZZ.pdf'
		//WebUI.scrollToElement(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_siteplan/p_Upload a site plan with scal'), 30)
		println myPdffilePath
		
		WebUI.uploadFile(findTestObject('Object Repository/GreenCleaningPolicy/Option1_GreenCleanPlcy/AddFile_UploadGreenCleaningPlcy_Option1/input_UploadGreenCleaningPlcy'), myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/GreenCleaningPolicy/SpecialCircumstances/AddFile_UploadAddtionalDoc_SC/input_UploadAdditionalDoc_SC'), myPdffilePath)
		WebUI.delay(15)
	}
	
	@Then("User should not see saving of draft even after 10 seconds in GCP")
	public void user_should_not_see_saving_of_draft_even_after_seconds_in_GCP() {
	
		WebUI.verifyElementNotPresent(findTestObject("Object Repository/GreenCleaningPolicy/span_Last draft saved on"),2)
		
//		boolean isPresent = WebUI.verifyElementPresent(findTestObject('Object Repository/GreenCleaningPolicy/span_Last draft saved on'), 2)
//		println "No draft "+isPresent
//
//		String draft_time = WebUI.getText(findTestObject('Object Repository/GreenCleaningPolicy/span_Last draft saved on'))
//		println "Save Date and Time"+dateTime
//
//		println draft_time
//
//		WebUI.verifyMatch(dateTime, draft_time,false)

	}
	
	static String txt_Narrativedata = "Test Data for Narrative"
	@Given("User should be able to see the cleaning service narrative in Green Cleaning Policy form")
	public void user_should_be_able_to_see_the_cleaning_service_narrative_in_Green_Cleaning_Policy_form() {
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/GreenCleaningPolicy/CleaningService_EditorBox/p_CleaningService'), 5)
	}
	
	@When("User modifies the cleaning service narrative data in the Green Cleaning Policy form form and waits for 10 seconds")
	public void user_modifies_the_cleaning_service_narrative_data_in_the_Green_Cleaning_Policy_form_form_and_waits_for_seconds() {
		
		WebUI.setText(findTestObject('Object Repository/GreenCleaningPolicy/CleaningService_EditorBox/body_CS_EditorBox'),txt_Narrativedata)
		WebUI.delay(10)
	}
	
	static String narrative_draft
	@Then("User can see the draft is saved automatically with date and time for cleaning service narrative in Green Cleaning Policy form")
	public void user_can_see_the_draft_is_saved_automatically_with_date_and_time_for_cleaning_service_narrative_in_Green_Cleaning_Policy_form() {
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/GreenCleaningPolicy/span_Last draft saved on'),2)
		narrative_draft = WebUI.getText(findTestObject('Object Repository/GreenCleaningPolicy/span_Last draft saved on'))
		println narrative_draft
		println "Previous Time Checkbox"+dateTime
		WebUI.verifyNotMatch(dateTime, narrative_draft, false)
	}
	
	@Given("User should be able to see the Special Circumstances narrative in Green Cleaning Policy form")
	public void user_should_be_able_to_see_the_Special_Circumstances_narrative_in_Green_Cleaning_Policy_form() {
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/GreenCleaningPolicy/SpecialCircumstances/AddFile_UploadAddtionalDoc_SC/p_Upload any additional documentation that supports'), 5)
	}
	
	@When("User modifies the Special Circumstances narrative data in the Green Cleaning Policy form form and waits for 10 seconds")
	public void user_modifies_the_Special_Circumstances_narrative_data_in_the_Green_Cleaning_Policy_form_form_and_waits_for_seconds() {
		
		WebUI.setText(findTestObject('Object Repository/GreenCleaningPolicy/SpecialCircumstances/SC_EditorBox/body_SC_EditorBox'),txt_Narrativedata)
		WebUI.delay(10)
	}
	
	static String Spl_narrative_draft
	@Then("User can see the draft is saved automatically with date and time for Special Circumstances narrative in Green Cleaning Policy form")
	public void user_can_see_the_draft_is_saved_automatically_with_date_and_time_for_Special_Circumstances_narrative_in_Green_Cleaning_Policy_form() {
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/GreenCleaningPolicy/span_Last draft saved on'),2)
		Spl_narrative_draft = WebUI.getText(findTestObject('Object Repository/GreenCleaningPolicy/span_Last draft saved on'))
		println narrative_draft
		println "Previous Time Checkbox"+Spl_narrative_draft
		WebUI.verifyNotMatch(Spl_narrative_draft, narrative_draft, false)
	}
	
	
	@Given("User can see the Draft is saved automatically with date and time in Green Cleaning Policy form")
	public void user_can_see_the_Draft_is_saved_automatically_with_date_and_time_in_Green_Cleaning_Policy_form() {

		WebUI.verifyElementPresent(findTestObject("Object Repository/GreenCleaningPolicy/span_Last draft saved on"), 2)
	}

	@And("User can see the save button in Green Cleaning Policy form")
	public void user_can_see_the_save_button_in_Green_Cleaning_Policy_form() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/GreenCleaningPolicy/button_Save'), 2)
	}

	@When("User saves the Green Cleaning Policy form")
	public void user_saves_the_Green_Cleaning_Policy_form() {

		WebUI.click(findTestObject('Object Repository/GreenCleaningPolicy/button_Save'))
		WebUI.delay(10)
	}

	@Then("User verifies the form draft warning message is not retained in Green Cleaning Policy form")
	public void user_verifies_the_form_draft_warning_message_is_not_retained_in_Green_Cleaning_Policy_form() {

		WebUI.verifyElementNotPresent(findTestObject("Object Repository/GreenCleaningPolicy/div_Form drafted and not yet saved"), 2)

		String tableRow = GCP_PageObjectClass.tableRow_Xpath_GCP
		String tableId = GCP_PageObjectClass.tableId_Xpath_GCP
		String scrollTo = "Object Repository/GreenCleaningPolicy/Option1_GreenCleanPlcy/AddFile_UploadGreenCleaningPlcy_Option1/p_Upload the Green Cleaning Policy"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo)

		String tableRow1 = GCP_PageObjectClass.tableRow_Xpath_SplCircum_GCP
		String tableId1 = GCP_PageObjectClass.tableId_Xpath_SplCircum_GCP
		String scrollTo1 = "Object Repository/GreenCleaningPolicy/SpecialCircumstances/SC_EditorBox/p_Describe the circumstances limiting the project teams"

		new projectKeywords().deleteUploadedFiles(tableRow1, tableId1, scrollTo1)

		WebUI.delay(3)
	}
	
	@Given("User can see the radio button in Green Cleaning Policy form for Certified cleaning service")
	public void user_can_see_the_radio_button_in_Green_Cleaning_Policy_form_for_Certified_cleaning_service() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/input_Option 2_RadioBtn'), 30)
	}
	
	@When("User clicks on the radio button of Certified cleaning service and waits for 10 seconds")
	public void user_clicks_on_the_radio_button_of_Certified_cleaning_service_and_waits_for_10_seconds() {
		WebUI.scrollToElement(findTestObject('Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/input_Option 2_RadioBtn'), 10)
		WebUI.click(findTestObject('Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/input_Option 2_RadioBtn'))
		WebUI.delay(10)
	}

	@And("User can see the Clear draft in Green Cleaning Policy form")
	public void user_can_see_the_Clear_draft_in_Green_Cleaning_Policy_form() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/GreenCleaningPolicy/a_Clear draft'),2)
	}

	@And("User clicks on Clear draft in Green Cleaning Policy form")
	public void user_clicks_on_Clear_draft_in_Green_Cleaning_Policy_form() {

		WebUI.click(findTestObject('Object Repository/GreenCleaningPolicy/a_Clear draft'))
		WebUI.click(findTestObject("Object Repository/GreenCleaningPolicy/button_Yes"))
		WebUI.delay(5)
	}

	@Then("User can see the draft is cleared in Green Cleaning Policy form")
	public void user_can_see_the_draft_is_cleared_in_Green_Cleaning_Policy_form() {

		WebUI.verifyElementNotPresent(findTestObject("Object Repository/GreenCleaningPolicy/span_Last draft saved on"), 2)
	}

	//##################Logout and Login##############################
	static String draft_date_beforeLogout
	@Given("User can see the narrative in Green Cleaning Policy form")
	public void user_can_see_the_narrative_in_Green_Cleaning_Policy_form() {
		
		WebUI.scrollToElement(findTestObject('Object Repository/GreenCleaningPolicy/SpecialCircumstances/SC_EditorBox/p_Describe the circumstances limiting the project teams'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/GreenCleaningPolicy/SpecialCircumstances/SC_EditorBox/p_Describe the circumstances limiting the project teams'), 5)
	}
	
	@When("User modifies narrative data in Green Cleaning Policy form")
	public void user_modifies_narrative_data_in_Green_Cleaning_Policy_form() {

		WebUI.setText(findTestObject('Object Repository/GreenCleaningPolicy/SpecialCircumstances/SC_EditorBox/body_SC_EditorBox'),"Testing for Logout and Login")
		WebUI.delay(10)
		draft_date_beforeLogout = WebUI.getText(findTestObject("Object Repository/GreenCleaningPolicy/span_Last draft saved on"))
		println draft_date_beforeLogout
	}
	
	@And("User will logout from the Green Cleaning Policy form")
	public void user_will_logout_from_the_Green_Cleaning_Policy_form() {

		WebUI.click(findTestObject('Object Repository/GreenCleaningPolicy/div_Signout'))
		WebUI.click(findTestObject('Object Repository/GreenCleaningPolicy/a_Sign out'))
		WebUI.delay(2)

	}

	@Then("User logs in again to Green Cleaning Policy form")
	public void user_logs_in_again_to_Green_Cleaning_Policy_form() {

		
		String formName = "Object Repository/GreenCleaningPolicy/div_Green Cleaning Policy"
						   
		String formv01 = "Object Repository/GreenCleaningPolicy/a_Form (V01)"
		new projectKeywords().callNavigationTestCase(formName,formv01)
		//WebUI.delay(2)
	}

	@And("User should see the warning message is displayed with date and time at the top of the Green Cleaning Policy form")
	public void user_should_see_the_warning_message_is_displayed_with_date_and_time_at_the_top_of_the_Green_Cleaning_Policy_form() {

		boolean verifyWarningMsg = WebUI.verifyElementPresent(findTestObject('Object Repository/GreenCleaningPolicy/div_Form drafted and not yet saved'), 2)
		println "Warning Message ############### "+verifyWarningMsg
	}

	@And("User verifies draft version is not changed after logout and login in Green Cleaning Policy form")
	public void user_verifies_draft_version_is_not_changed_after_logout_and_login_in_Green_Cleaning_Policy_form() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/GreenCleaningPolicy/Last draft saved dateTime_warningDiv'), 2)
		String draft_date_afterLogin = WebUI.getText(findTestObject('Object Repository/GreenCleaningPolicy/Last draft saved dateTime_warningDiv'))
		WebUI.verifyMatch(draft_date_beforeLogout,draft_date_afterLogin,false)

		println "Before Logout "+draft_date_beforeLogout
		println "Now"+draft_date_afterLogin
		
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/GreenCleaningPolicy/a_Clear draft'))
		WebUI.click(findTestObject("Object Repository/GreenCleaningPolicy/button_Yes"))

	}

	@Then("User click on clear draft on the Green Cleaning Policy form")
	public void user_click_on_clear_draft_on_the_Green_Cleaning_Policy_form(){

		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/GreenCleaningPolicy/a_Clear draft'))
		WebUI.click(findTestObject("Object Repository/GreenCleaningPolicy/button_Yes"))
	}
}