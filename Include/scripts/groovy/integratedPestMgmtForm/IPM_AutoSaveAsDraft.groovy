package integratedPestMgmtForm
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
import integratedPestMgmtForm.IPM_PageObjectClass


class IPM_AutoSaveAsDraft {
	/**
	 * Verifying the functionalities of the AutoSaveAsDraft in the Integrated Pest Management Form --- Started
	 */

	@Given("User is on the Integrated Pest Management form")
	public void user_is_on_the_Integrated_Pest_Management_form() {

		WebUI.callTestCase(findTestCase('Test Cases/IntegratedPestManagement/TC_NavigateToIPM'), null, FailureHandling.STOP_ON_FAILURE)
	}

	@When("User will not modify any field on the Integrated Pest Management form")
	public void user_will_not_modify_any_field_on_the_Integrated_Pest_Management_form() {

		WebUI.delay(10)
	}

	@Then("User should not see saving of draft even after 10 seconds in Integrated Pest Management form")
	public void user_should_not_see_saving_of_draft_even_after_seconds_in_Integrated_Pest_Management_form() {

		WebUI.verifyElementNotPresent(findTestObject("Object Repository/LightPollutionReduction/Autosave/span_Last draft saved on"),2)
	}



	@Given("User should be able to see the textbox in Integrated Pest Management form")
	public void user_should_be_able_to_see_the_textbox_in_Integrated_Pest_Management_form() {

		boolean txt_Percent = WebUI.verifyElementPresent(findTestObject("Object Repository/IntegratedPestMgmt/Option_IPMService/Input_IntegratedPMService"), 30)
		println "The text is present or not "+txt_Percent
	}

	static String txt_dataIPM
	@When("User modifies the textbox value in the Integrated Pest Management form form and waits for 10 seconds")
	public void user_modifies_the_textbox_value_in_the_Integrated_Pest_Management_form_form_and_waits_for_seconds() {
		txt_dataIPM = "Checking the text box for auto save as draft with date and time 0877667"
		WebUI.setText(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMService/Input_IntegratedPMService'),txt_dataIPM)
		WebUI.delay(10)
	}

	static String textBox_draft
	@Then("User can see the draft is saved automatically with date and time for change in textbox in Integrated Pest Management form")
	public void user_can_see_the_draft_is_saved_automatically_with_date_and_time_for_change_in_textbox_in_Integrated_Pest_Management_form() {

		boolean isPresent = WebUI.verifyElementPresent(findTestObject("Object Repository/LightPollutionReduction/Autosave/span_Last draft saved on"), 2)
		println "draft Present "+isPresent

		textBox_draft = WebUI.getText(findTestObject("Object Repository/LightPollutionReduction/Autosave/span_Last draft saved on"))
		println textBox_draft
	}

	static String txt_SpecialCircumstances = "Test Data for Narrative"
	@Given("User should be able to see the narrative in Integrated Pest Management form")
	public void user_should_be_able_to_see_the_narrative_in_Integrated_Pest_Management_form() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedPestMgmt/SpecialCircumstances/SC_EditorBox/P_SC_EditorBox'), 5)
	}

	@When("User modifies the narrative data in the Integrated Pest Management form form and waits for 10 seconds")
	public void user_modifies_the_narrative_data_in_the_Integrated_Pest_Management_form_form_and_waits_for_seconds() {

		WebUI.setText(findTestObject('Object Repository/IntegratedPestMgmt/SpecialCircumstances/SC_EditorBox/Body_SC_EditorBox'),txt_SpecialCircumstances)
		WebUI.delay(10)
	}

	static String narrative_draft_time
	@Then("User can see the draft is saved automatically with date and time for narrative in Integrated Pest Management form")
	public void user_can_see_the_draft_is_saved_automatically_with_date_and_time_for_narrative_in_Integrated_Pest_Management_form() {

		WebUI.verifyElementPresent(findTestObject("Object Repository/LightPollutionReduction/Autosave/span_Last draft saved on"),2)
		narrative_draft_time = WebUI.getText(findTestObject("Object Repository/LightPollutionReduction/Autosave/span_Last draft saved on"))
		println "Cuurent Time Narrative "+ narrative_draft_time
		println "Previous Time TextBox "+textBox_draft
		WebUI.verifyNotMatch(textBox_draft, narrative_draft_time, false)
	}


	//static String dateTime
	@Given("User should be able to see Upload file on Integrated Pest Management form")
	public void user_should_be_able_to_see_Upload_file_on_Integrated_Pest_Management_form() {

		WebUI.scrollToElement(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMService/AddFile_IntegratedPestMngnt/Input_AddFile'), 2)
	}

	@When("User uploads any file on Integrated Pest Management form")
	public void user_uploads_any_file_on_Integrated_Pest_Management_form() {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/MultipleFileDiffExt/ZZ.pdf'
		WebUI.uploadFile(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMService/AddFile_IntegratedPestMngnt/Input_AddFile'),myPdffilePath )
		WebUI.uploadFile(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMService/AddFile_GreenPro/Input_AddFile'), myPdffilePath)

		WebUI.delay(15)
	}

	@Then("User should not see saving of draft even after {int} seconds in Integrated Pest Management")
	public void user_should_not_see_saving_of_draft_even_after_seconds_in_Integrated_Pest_Management(Integer int1) {

		boolean isPresent = WebUI.verifyElementPresent(findTestObject("Object Repository/LightPollutionReduction/Autosave/span_Last draft saved on"), 2)
		println "Is draft present "+isPresent

		String draft_time = WebUI.getText(findTestObject("Object Repository/LightPollutionReduction/Autosave/span_Last draft saved on"))
		println "The current draft time is "+draft_time

		println "The old draft time is "+narrative_draft_time

		WebUI.verifyMatch(narrative_draft_time, draft_time,false)
	}

	@Given("User can see the Draft is saved automatically with date and time in Integrated Pest Management form")
	public void user_can_see_the_Draft_is_saved_automatically_with_date_and_time_in_Integrated_Pest_Management_form() {

		WebUI.verifyElementPresent(findTestObject("Object Repository/LightPollutionReduction/Autosave/span_Last draft saved on"), 2)
	}

	@And("User can see the save button in Integrated Pest Management form")
	public void user_can_see_the_save_button_in_Integrated_Pest_Management_form() {

		WebUI.verifyElementPresent(findTestObject("Object Repository/IntegratedPestMgmt/Save_Btn"), 2)
	}

	@When("User saves the Integrated Pest Management form")
	public void user_saves_the_Integrated_Pest_Management_form() {

		WebUI.click(findTestObject("Object Repository/IntegratedPestMgmt/Save_Btn"))
		WebUI.delay(10)
	}

	@Then("User verifies the form draft warning message is not retained in Integrated Pest Management form")
	public void user_verifies_the_form_draft_warning_message_is_not_retained_in_Integrated_Pest_Management_form() {

		WebUI.verifyElementNotPresent(findTestObject("Object Repository/LightPollutionReduction/Autosave/div_Form drafted and not yet saved"), 2)

		String tableRow = IPM_PageObjectClass.tableRow_Xpath_IPM_ServiceContract
		String tableId = IPM_PageObjectClass.tableId_Xpath_IPM_ServiceContract
		String scrollTo = "Object Repository/IntegratedPestMgmt/Option_IPMService/AddFile_IntegratedPestMngnt/p_IntegratedPestMngnt"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo)

		String tableRow1 = IPM_PageObjectClass.tableRow_Xpath_GreenPro_Certification
		String tableId1 = IPM_PageObjectClass.tableId_Xpath_GreenPro_Certification
		String scrollTo1 = "Object Repository/IntegratedPestMgmt/Option_IPMService/AddFile_GreenPro/p_AddFile"

		new projectKeywords().deleteUploadedFiles(tableRow1, tableId1, scrollTo1)

		WebUI.delay(3)
	}

	@Given("User can see the radio button in Integrated Pest Management form for In house IPM program")
	public void user_can_see_the_radio_button_in_Integrated_Pest_Management_form_for_in_house_ipm_program() {

		//WebUI.scrollToElement(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMProgram/Input_Option1_RadioBtn'), 10)
		WebUI.verifyElementPresent(findTestObject("Object Repository/IntegratedPestMgmt/Option_IPMProgram/Input_Option1_RadioBtn"), 30)


	}

	@When("User clicks on the radio button of In house IPM program and waits for 10 seconds")
	public void user_clicks_on_the_radio_button_of_in_house_ipm_program_and_waits_for_10_seconds() {
		WebUI.scrollToElement(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMProgram/Input_Option1_RadioBtn'), 10)
		WebUI.click(findTestObject("Object Repository/IntegratedPestMgmt/Option_IPMProgram/Input_Option1_RadioBtn"))
		WebUI.delay(10)
	}

	@And("User can see the Clear draft in Integrated Pest Management form")
	public void user_can_see_the_Clear_draft_in_Integrated_Pest_Management_form() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/LightPollutionReduction/Autosave/a_Clear draft'),2)
	}

	@And("User clicks on Clear draft in Integrated Pest Management form")
	public void user_clicks_on_Clear_draft_in_Integrated_Pest_Management_form() {

		WebUI.click(findTestObject('Object Repository/LightPollutionReduction/Autosave/a_Clear draft'))
		WebUI.click(findTestObject("Object Repository/LightPollutionReduction/FixtureShielding/button_Yes"))
		WebUI.delay(5)
	}

	@Then("User can see the draft is cleared in Integrated Pest Management form")
	public void user_can_see_the_draft_is_cleared_in_Integrated_Pest_Management_form() {

		WebUI.verifyElementNotPresent(findTestObject("Object Repository/LightPollutionReduction/Autosave/span_Last draft saved on"), 2)
	}


	//##################Logout and Login##############################
	static String draft_date_beforeLogout
	@Given("User can see the narrative in Integrated Pest Management form")
	public void user_can_see_the_narrative_in_Integrated_Pest_Management_form() {
		//WebUI.callTestCase(findTestCase('Test Cases/IntegratedPestManagement/TC_NavigateToIPM'), null, FailureHandling.STOP_ON_FAILURE)
		//WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/IntegratedPestMgmt/SpecialCircumstances/SC_EditorBox/P_SC_EditorBox'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedPestMgmt/SpecialCircumstances/SC_EditorBox/P_SC_EditorBox'), 5)
	}

	@When("User modifies narrative data in Integrated Pest Management form")
	public void user_modifies_narrative_data_in_Integrated_Pest_Management_form() {

		WebUI.setText(findTestObject('Object Repository/IntegratedPestMgmt/SpecialCircumstances/SC_EditorBox/Body_SC_EditorBox'),"Testing for Logout and Login")
		WebUI.delay(10)
		draft_date_beforeLogout = WebUI.getText(findTestObject("Object Repository/LightPollutionReduction/Autosave/span_Last draft saved on"))
		println draft_date_beforeLogout
	}

	@And("User will logout from the Integrated Pest Management form")
	public void user_will_logout_from_the_Integrated_Pest_Management_form() {

		WebUI.click(findTestObject('Object Repository/LightPollutionReduction/Autosave/div_Signout'))
		WebUI.click(findTestObject('Object Repository/LightPollutionReduction/Autosave/a_Sign out'))
		WebUI.delay(2)

	}

	@Then("User logs in again to Integrated Pest Management form")
	public void user_logs_in_again_to_Integrated_Pest_Management_form() {

		//WebUI.callTestCase(findTestCase('Test Cases/IntegratedPestManagement/TC_NavigateToIPM'), null, FailureHandling.STOP_ON_FAILURE)
		String formName = "Object Repository/IntegratedPestMgmt/Navigation/div_Integrated Pest Management"
						   
		String formv01 = "Object Repository/IntegratedPestMgmt/Navigation/a_Form (V01)"
		new projectKeywords().callNavigationTestCase(formName,formv01)
		//WebUI.delay(2)
	}

	@And("User should see the warning message is displayed with date and time at the top of the Integrated Pest Management form")
	public void user_should_see_the_warning_message_is_displayed_with_date_and_time_at_the_top_of_the_Integrated_Pest_Management_form() {

		boolean verifyWarningMsg = WebUI.verifyElementPresent(findTestObject('Object Repository/LightPollutionReduction/Autosave/div_Form drafted and not yet saved'), 2)
		println "Warning Message ############### "+verifyWarningMsg
	}

	@And("User verifies draft version is not changed after logout and login in Integrated Pest Management form")
	public void user_verifies_draft_version_is_not_changed_after_logout_and_login_in_Integrated_Pest_Management_form() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/LightPollutionReduction/Autosave/Last draft saved dateTime_warningDiv'), 2)
		String draft_date_afterLogin = WebUI.getText(findTestObject('Object Repository/LightPollutionReduction/Autosave/Last draft saved dateTime_warningDiv'))
		WebUI.verifyMatch(draft_date_beforeLogout,draft_date_afterLogin,false)

		println "Before Logout "+draft_date_beforeLogout
		println "Now"+draft_date_afterLogin
		
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/LightPollutionReduction/Autosave/a_Clear draft'))
		WebUI.click(findTestObject("Object Repository/LightPollutionReduction/FixtureShielding/button_Yes"))

	}

	@Then("User click on clear draft on the Integrated Pest Management form")
	public void user_click_on_clear_draft_on_the_Integrated_Pest_Management_form(){

		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/LightPollutionReduction/Autosave/a_Clear draft'))
		WebUI.click(findTestObject("Object Repository/LightPollutionReduction/FixtureShielding/button_Yes"))
	}

	/**
	 * Verifying the functionalities of the AutoSaveAsDraft in the Integrated Pest Management Form --- Ended
	 */
}