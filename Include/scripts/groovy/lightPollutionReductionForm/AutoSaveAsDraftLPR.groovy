package lightPollutionReductionForm
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


class AutoSaveAsDraftLPR {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */


	//#####################Scenario: Verifying formdraft is not saved if no change in the form
	@Given("User is on the Formv01 of Light Polluton Reduction form")
	public void user_is_on_the_Formv_of_Light_Polluton_Reduction_form() {
		/*WebUI.callTestCase(findTestCase('Test Cases/SmokeTest/TC_Usgbc_Login'), null, FailureHandling.STOP_ON_FAILURE)
		 WebUI.click(findTestObject('Object Repository/LightPolutionReduction/div_Light Pollution Reduction'))
		 WebUI.click(findTestObject('Object Repository/LightPolutionReduction/span_(V01)'))
		 //WebUI.click(findTestObject("Object Repository/LightPolutionReduction/input_Select one of the following_selectedOption"))
		 */
		WebUI.callTestCase(findTestCase('Test Cases/LightPollutionReduction/TC_NavigateToLPR'), null, FailureHandling.STOP_ON_FAILURE)
		//dateTimeValue.

	}

	@When("User will not modify any field on the Light Polluton Reduction form")
	public void user_will_not_modify_any_field_on_the_Light_Polluton_Reduction_form() {
		WebUI.delay(10)
	}

	@Then("User should not see saving of draft even after 10 seconds in Light Polluton Reduction form")
	public void user_should_not_see_saving_of_draft_even_after_seconds_in_Light_Polluton_Reduction_form() {
		//	WebUI.verifyElementNotPresent(findTestObject('Object Repository/LightPollutionReduction/a_Clear draft'), 2)
		//WebUI.verifyElementNotPresent(findTestObject('Object Repository/LightPollutionReduction/Autosave/a_Clear draft'),1)
		WebUI.verifyElementNotPresent(findTestObject("Object Repository/LightPollutionReduction/Autosave/span_Last draft saved on"),2)

	}

	static String dateTime
	//############Scenario: Verifying form draft is not saved if upload files in the form############
	@Given("User should be able to see Upload fle on Light Polluton Reduction form")
	public void user_should_be_able_to_see_Upload_fle_on_Light_Polluton_Reduction_form() {
		WebUI.click(findTestObject("Object Repository/LightPollutionReduction/FixtureShielding/input_Select one of the following_selectedOption"))
		WebUI.delay(10)
		dateTime = WebUI.getText(findTestObject("Object Repository/LightPollutionReduction/Autosave/span_Last draft saved on"))
		println "Save Date and Time "+dateTime


	}



	@When("User uploads any file on Light Polluton Reduction form")
	public void user_uploads_any_file_on_Light_Polluton_Reduction_form() {


		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/MultipleFileDiffExt/ZZ.pdf'
		//WebUI.scrollToElement(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_siteplan/p_Upload a site plan with scal'), 30)
		println myPdffilePath
		WebUI.scrollToElement(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_shielding information/Addfile_shielding information/input_file'), 2)
		WebUI.uploadFile(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_shielding information/Addfile_shielding information/input_file'),myPdffilePath )
		WebUI.uploadFile(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_siteplan/Addfile_siteplan/input_siteplan'), myPdffilePath)

		WebUI.delay(15)

	}

	@Then("User should not see saving of draft even after 10 seconds")
	public void user_should_not_see_saving_of_draft_even_after_seconds() {
		//WebUI.verifyElementNotPresent(findTestObject('Object Repository/LightPollutionReduction/Autosave/a_Clear draft'), 2)
		boolean isPresent = WebUI.verifyElementPresent(findTestObject("Object Repository/LightPollutionReduction/Autosave/span_Last draft saved on"), 2)
		println "No draft "+isPresent

		String draft_time = WebUI.getText(findTestObject("Object Repository/LightPollutionReduction/Autosave/span_Last draft saved on"))
		println "Save Date and Time"+dateTime

		println draft_time

		WebUI.verifyMatch(dateTime, draft_time,false)



	}

	@Given("User should be able to see the checkbox in Light Polluton Reduction form")
	public void user_should_be_able_to_see_the_checkbox_in_Light_Polluton_Reduction_form() {
		WebUI.verifyElementPresent(findTestObject("Object Repository/LightPollutionReduction/FixtureShielding/input_Option 1. Fixture Shielding_exteriorFixtures"), 1)

	}

	@When("User modifies the checkbox in the Light Polluton Reduction form and waits for 10 seconds")
	public void user_modifies_the_checkbox_in_the_Light_Polluton_Reduction_form_and_waits_for_seconds() {
		WebUI.click(findTestObject("Object Repository/LightPollutionReduction/FixtureShielding/input_Option 1. Fixture Shielding_exteriorFixtures"))
		WebUI.delay(12)
	}
	static String checkbox_draft
	@Then("User can see the draft is saved automatically with date and time for checkbox in Light Polluton Reduction form")
	public void user_can_see_the_draft_is_saved_automatically_with_date_and_time_for_narrative_in_Light_Polluton_Reduction_form() {
		WebUI.verifyElementPresent(findTestObject("Object Repository/LightPollutionReduction/Autosave/span_Last draft saved on"),2)
		checkbox_draft = WebUI.getText(findTestObject("Object Repository/LightPollutionReduction/Autosave/span_Last draft saved on"))
		println checkbox_draft
		println "Previous Time Option"+dateTime
		WebUI.verifyNotMatch(dateTime, checkbox_draft, false)
	}
	static String txt_SpecialCircumstances = "Test Data for Narrative"

	@Given("User should be able to see the narrative in Light Polluton Reduction form")
	public void user_should_be_able_to_see_the_narrative_in_Light_Polluton_Reduction_form() {
		//WebUI.scrollToElement(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Htmleditorbox_sc/p_Describe the circumstances l'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Htmleditorbox_sc/p_Describe the circumstances l'), 5)

	}

	@When("User modifies the narrative data in the Light Polluton Reduction form form and waits for 10 seconds")
	public void user_modifies_the_narrative_data_in_the_Light_Polluton_Reduction_form_form_and_waits_for_seconds() {
		WebUI.setText(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Htmleditorbox_sc/body_SC_Editor'),txt_SpecialCircumstances)
		WebUI.delay(10)
	}

	static String narrative_draft
	@Then("User can see the draft is saved automatically with date and time for narrative in Light Polluton Reduction form")
	public void Then_User_can_see_the_draft_is_saved_automatically_with_date_and_time_for_narrative_in_Light_Polluton_Reduction_form(){
		WebUI.verifyElementPresent(findTestObject("Object Repository/LightPollutionReduction/Autosave/span_Last draft saved on"),2)
		narrative_draft = WebUI.getText(findTestObject("Object Repository/LightPollutionReduction/Autosave/span_Last draft saved on"))
		println narrative_draft
		println "Previous Time Checkbox"+checkbox_draft
		WebUI.verifyNotMatch(checkbox_draft, narrative_draft, false)
	}

	@Given("User should be able to see the textbox in Light Polluton Reduction form")
	public void user_should_be_able_to_see_the_textbox_in_Light_Polluton_Reduction_form() {
		boolean txt_Percent = WebUI.verifyElementPresent(findTestObject("Object Repository/LightPollutionReduction/FixtureShielding/input_PercentIncrease"), 30)
		println txt_Percent
	}

	static String txt_PersentIncrease
	@When("User modifies the textbox value in the Light Polluton Reduction form form and waits for 10 seconds")
	public void user_modifies_the_textbox_value_in_the_Light_Polluton_Reduction_form_form_and_waits_for_seconds() {
		txt_PersentIncrease = 67
		WebUI.setText(findTestObject("Object Repository/LightPollutionReduction/FixtureShielding/input_PercentIncrease"), txt_PersentIncrease)
		WebUI.delay(10)
	}
	static String textBox_draft
	@Then("User can see the draft is saved automatically with date and time for change in textbox in Light Polluton Reduction form")
	public void user_can_see_the_draft_is_saved_automatically_with_date_and_time_for_change_in_textbox_in_Light_Polluton_Reduction_form() {
		boolean isPresent = WebUI.verifyElementPresent(findTestObject("Object Repository/LightPollutionReduction/Autosave/span_Last draft saved on"), 2)
		println "draft Present  "+isPresent

		textBox_draft = WebUI.getText(findTestObject("Object Repository/LightPollutionReduction/Autosave/span_Last draft saved on"))
		println textBox_draft
		println "Previous Time Narrative"+narrative_draft
		WebUI.verifyNotMatch(narrative_draft,textBox_draft , false)


	}



	@Given("User can see the Draft is saved automatically with date and time in Light Polluton Reduction form")
	public void user_can_see_the_Draft_is_saved_automatically_with_date_and_time_in_Light_Polluton_Reduction_form() {
		WebUI.verifyElementPresent(findTestObject("Object Repository/LightPollutionReduction/Autosave/span_Last draft saved on"), 2)
	}

	@And("User can see the save button in Light Polluton Reduction form")
	public void user_can_see_the_save_button_in_Light_Polluton_Reduction_form() {
		WebUI.verifyElementPresent(findTestObject("Object Repository/LightPollutionReduction/FixtureShielding/Saveform/btn_Save"), 2)
	}

	@When("User saves the Light Polluton Reduction form")
	public void user_saves_the_Light_Polluton_Reduction_form() {
		WebUI.click(findTestObject("Object Repository/LightPollutionReduction/FixtureShielding/Saveform/btn_Save"))
		WebUI.delay(10)

	}

	@Then("User verifies the form draft warning message is not retained in Light Polluton Reduction form")
	public void user_verifies_the_form_draft_warning_message_is_not_retained_in_Light_Polluton_Reduction_form() {
		WebUI.verifyElementNotPresent(findTestObject("Object Repository/LightPollutionReduction/Autosave/div_Form drafted and not yet saved"), 2)

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

		String xpath_Shielding_Information="//*[@id='shieldingInfoUpload_files']/table/tbody/tr"
		int row_Count1 = (new projectKeywords()).countRowsPerPage(xpath_Shielding_Information)

		if (row_Count1 > 0){

			WebUI.scrollToElement(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_shielding information/p_Upload shielding information'), 30)

			for (int k = row_Count1; k>=1; k--){
				TestObject	 delete = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="shieldingInfoUpload_files"]/table/tbody/tr['+k+']/td[5]/a[2]/i', true)
				WebUI.delay(1)
				WebUI.switchToFrame(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/iframe'), 5)
				WebUI.click(delete)
				WebUI.delay(2)
				WebUI.switchToDefaultContent()
				WebUI.click(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/button_Yes'))
			}
		}

		WebUI.delay(5)
	}

	///Crear Draft

	@Given("User can see the narrative in Light Polluton Reduction form")
	public void User_can_see_the_narrative_in_Light_Polluton_Reduction_form(){
		WebUI.verifyElementPresent(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Htmleditorbox_sc/p_Describe the circumstances l'), 5)

	}

	@When("User modifies the narrative data in Light Polluton Reduction form form and waits for 10 seconds")
	public void User_modifies_the_narrative_data_in_Light_Polluton_Reduction_form_form_and_waits_for_10_seconds(){
		WebUI.click(findTestObject("Object Repository/LightPollutionReduction/FixtureShielding/input_Select one of the following_selectedOption"))

		WebUI.setText(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Htmleditorbox_sc/body_SC_Editor'),"Testing for ClearDraft")
		WebUI.delay(10)
	}

	@When("User can see the Clear draft in Light Polluton Reduction form")
	public void user_can_see_the_Clear_draft_in_Light_Polluton_Reduction_form() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/LightPollutionReduction/Autosave/a_Clear draft'),2)

	}

	@And("User clicks on Clear draft in Light Polluton Reduction form")
	public void user_clicks_on_Clear_draft_in_Light_Polluton_Reduction_form() {
		WebUI.click(findTestObject('Object Repository/LightPollutionReduction/Autosave/a_Clear draft'))
		WebUI.click(findTestObject("Object Repository/LightPollutionReduction/FixtureShielding/button_Yes"))
		WebUI.delay(5)
	}

	@Then("User can see the draft is cleared in Light Polluton Reduction form")
	public void user_can_see_the_draft_is_cleared_in_Light_Polluton_Reduction_form() {
		WebUI.verifyElementNotPresent(findTestObject("Object Repository/LightPollutionReduction/Autosave/span_Last draft saved on"), 2)
	}

	//##################Logout and Login##############################
	static String draft_date_beforeLogout
	@Given("User modifies narrative data in Light Polluton Reduction form")
	public void user_modifies_narrative_data_in_Light_Polluton_Reduction_form() {
		WebUI.setText(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Htmleditorbox_sc/body_SC_Editor'),"Testing for Logout and Login")
		WebUI.delay(10)
		draft_date_beforeLogout = WebUI.getText(findTestObject("Object Repository/LightPollutionReduction/Autosave/span_Last draft saved on"))
		println draft_date_beforeLogout
	}



	@When("User will logout from the Light Polluton Reduction form")
	public void user_will_logout_from_the_Light_Polluton_Reduction_form() {
		WebUI.click(findTestObject('Object Repository/LightPollutionReduction/Autosave/div_Signout'))
		WebUI.click(findTestObject('Object Repository/LightPollutionReduction/Autosave/a_Sign out'))
	}

	@When("User logs in again to Light Polluton Reduction form")
	public void user_logs_in_again_to_Light_Polluton_Reduction_form() {

		//WebUI.callTestCase(findTestCase('Test Cases/Login/TC_Login'), null, FailureHandling.STOP_ON_FAILURE)

		//WebUI.callTestCase(findTestCase('Test Cases/LightPollutionReduction/TC_NavigateToLPR'), null, FailureHandling.STOP_ON_FAILURE)

		String formName ="Object Repository/LightPollutionReduction/div_Light Pollution Reduction"
		String formv01 = "Object Repository/LightPollutionReduction/span_(V01)"
		
		new projectKeywords().callNavigationTestCase(formName,formv01)

	}

	@Then("User should see the warning message is displayed with date and time at the top of the Light Polluton Reduction form")
	public void user_should_see_the_warning_message_is_displayed_with_date_and_time_at_the_top_of_the_Light_Polluton_Reduction_form() {


		boolean isthere = WebUI.verifyElementPresent(findTestObject('Object Repository/LightPollutionReduction/Autosave/div_Form drafted and not yet saved'), 2)
		println "Warning Message ###############3"+isthere
	}

	@Then("User verifies draft version is not changed after logout and login in Light Polluton Reduction form")
	public void user_verifies_draft_version_is_not_changed_after_logout_and_login_in_Light_Polluton_Reduction_form() {

		//TestObject custom_draft_div = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="credit-form"]/div[6]/div/span/span', true)

		//WebUI.verifyElementPresent(custom_draft_div, 2)
		WebUI.verifyElementPresent(findTestObject('Object Repository/LightPollutionReduction/Autosave/Last draft saved dateTime_warningDiv'), 2)
		//String draft_date_afterLogin = WebUI.getText(custom_draft_div)
		String draft_date_afterLogin = WebUI.getText(findTestObject('Object Repository/LightPollutionReduction/Autosave/Last draft saved dateTime_warningDiv'))
		WebUI.verifyMatch(draft_date_beforeLogout,draft_date_afterLogin,false)

		println "Before Logout "+draft_date_beforeLogout
		println "Now"+draft_date_afterLogin

		WebUI.click(findTestObject('Object Repository/LightPollutionReduction/Autosave/a_Clear draft'))
		WebUI.click(findTestObject("Object Repository/LightPollutionReduction/FixtureShielding/button_Yes"))

	}



}