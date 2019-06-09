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

import com.kms.katalon.core.configuration.RunConfiguration
import groovy.io.FileType
import leedOnlineKeywords.projectKeywords

import java.text.DateFormat
import java.text.SimpleDateFormat

import com.testautomationguru.utility.PDFUtil
import org.apache.pdfbox.pdmodel.PDDocument
import org.apache.pdfbox.text.PDFTextStripper

class LightPolluRedu_Form {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	/**
	 *  The navigation to LPR form and changing the status to Attempted -- Started
	 */

	//static String FormName

	@Given("User should be on credits page")
	public void user_should_be_on_credits_page() {

		//println "FormName is "+ FormName
		WebUI.callTestCase(findTestCase('Test Cases/Login/TC_Login'), null, FailureHandling.STOP_ON_FAILURE)

		/*WebUI.openBrowser("")
		 WebUI.navigateToUrl("https://leedonline-stg.usgbc.org")
		 WebUI.delay(2)
		 WebUI.setText(findTestObject('Object Repository/Login/input_username'), "jaypeejay@hotmail.com")
		 WebUI.setText(findTestObject('Object Repository/Login/input_password'), "initpass")
		 WebUI.delay(3)
		 WebUI.scrollToElement(findTestObject('Object Repository/Login/span_End User License Agreement'), 30)
		 boolean userAgreemntVisible = WebUI.waitForElementVisible(findTestObject('Object Repository/Login/span_End User License Agreement'), 30)
		 if (userAgreemntVisible == true){
		 WebUI.check(findTestObject('Object Repository/Login/span_End User License Agreement'))
		 }
		 else{
		 println "End user license agreement not visible/not checked"
		 }
		 WebUI.delay(1)
		 WebUI.click(findTestObject('Object Repository/Login/button_Log In'))
		 TestObject projectName  = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//div[@title="BDDv4.1TestProject"]', true)
		 WebUI.click(projectName)
		 WebUI.click(findTestObject('Object Repository/Login/a_Credits'))*/
	}

	@And("User can see Light Pollution Reduction under Sustainable Sites section")
	public void user_can_see_Light_Pollution_Reduction_under_Sustainable_Sites_section() {

		WebUI.scrollToElement(findTestObject("Object Repository/LightPollutionReduction/div_Light Pollution Reduction"), 10)
		boolean formNamePresent = WebUI.verifyElementPresent(findTestObject("Object Repository/LightPollutionReduction/div_Light Pollution Reduction"), 30)
		if (formNamePresent == true){
			println "Form Present"
		}
		else{
			println "Form Not Present"
		}
	}

	@And("User has to select the status to Attempted for Light Pollution Reduction")
	public void user_has_to_select_the_status_to_Attempted_for_Light_Pollution_Reduction() {

		//WebUI.delay(2)
		String status =	WebUI.getText(findTestObject("Object Repository/LightPollutionReduction/h3_Status"))
		println "######################### h3" + status
		String divval = WebUI.getText(findTestObject("Object Repository/Page_LEED Online/div_Attempted Im still working Im done Withdraw Attempt Open to update"))
		println "######################### dival" + divval

		if (status == "READY FOR REVIEW"){
			println "Inside the if"
			//WebUI.delay(2)
			////	WebUI.click(findTestObject("Object Repository/LightPollutionReduction/a_MarkreadyForReview"))
			WebUI.click(findTestObject("Object Repository/LightPollutionReduction/a_MarkReadyForReview"))
			//	WebUI.click(findTestObject("Object Repository/Page_LEED Online/a_Submit"))
			WebUI.delay(5)

		}
		String changedStatus =	WebUI.getText(findTestObject("Object Repository/LightPollutionReduction/h3_Status"))
		println "The changed Status is "+changedStatus
	}

	@When("User clicks on Light Pollution Reduction")
	public void user_clicks_on_Light_Pollution_Reduction() {

		WebUI.click(findTestObject("Object Repository/LightPollutionReduction/div_Light Pollution Reduction"))
	}

	@And("User has to click on FormV01 button of Light Pollution Reduction")
	public void user_has_to_click_on_FormV_button_of_Light_Pollution_Reduction() {

		WebUI.click(findTestObject("Object Repository/LightPollutionReduction/span_(V01)"))
	}

	@Then("User should be able to see the Light Pollution Reduction form")
	public void user_should_be_able_to_see_the_Light_Pollution_Reduction_form() {
		println "Finsihed"
		boolean insideForm = WebUI.verifyElementPresent(findTestObject("Object Repository/LightPollutionReduction/div_LPRForm"), 30)
		if (insideForm == true){
			println "Inside the LPR form"
		}
		else {
			println "Not inside the LPR form"
		}
		//	WebUI.closeBrowser()
	}

	/**
	 *  The navigation to LPR form and changing the status to Attempted -- Ended
	 */


	/**
	 *  Filling the data in the LPR form for FixtureSheilding(Option 1) , saving the form , downloading the Pdf and verifying -- Started
	 */


	@Given("User should see the radio button option Fixture Shielding")
	public void user_should_see_the_radio_button_option_Fixture_Shielding() {

		//FormName = "LightPR"
		WebUI.callTestCase(findTestCase('Test Cases/LightPollutionReduction/TC_NavigateToLPR'), null, FailureHandling.STOP_ON_FAILURE)

		boolean option1Present =	WebUI.verifyElementPresent(findTestObject("Object Repository/LightPollutionReduction/FixtureShielding/input_Select one of the following_selectedOption"), 30)
		if (option1Present == true){
			println  "Fixture Shielding option is present"
		}
		else{
			println  "Fixture Shielding option is not present"
		}
	}

	@When("User clicks on Fixture Shielding option")
	public void user_clicks_on_Fixture_Shielding_option_Option() {

		WebUI.click(findTestObject("Object Repository/LightPollutionReduction/FixtureShielding/input_Select one of the following_selectedOption"))
		WebUI.delay(2)
	}

	@Then("User should see the contents for Fixture Shielding option")
	public void user_should_see_the_contents_for_Fixture_Shielding_option_Option() {
		//WebUI.verifyTextPresent("Option 1. Fixture Shielding", false)
		/*	boolean contentFixtureShielding =	WebUI.verifyElementPresent(findTestObject("Object Repository/LightPollutionReduction/FixtureShielding/input_Option 1. Fixture Shielding_exteriorFixtures"), 30)
		 if (contentFixtureShielding == true){
		 println "Contents for FixtureShielding is present"
		 }
		 else{
		 println "Contents for FixtureShielding is not present"
		 }
		 */
		WebUI.switchToFrame(findTestObject("Object Repository/LightPollutionReduction/FixtureShielding/iframe"), 30)
		WebUI.verifyTextPresent("Option 1. Fixture Shielding", false)
		WebUI.switchToDefaultContent()
	}


	@Given("User should be able to see the checkbox for the fixture exceeds 2500 lamp lumens")
	public void user_should_be_able_to_see_the_checkbox_for_the_fixture_exceeds_lamp_lumens() {

		boolean chk_FixturePresent =	WebUI.verifyElementPresent(findTestObject("Object Repository/LightPollutionReduction/FixtureShielding/input_Option 1. Fixture Shielding_exteriorFixtures"), 30)
		if (chk_FixturePresent == true){
			println "checkbox for the fixture is present"
		}
		else{
			println "checkbox for the fixture is not present"
		}
	}

	@When("User clicks on the check box for the fixture exceeds 2500 lamp lumens")
	public void user_click_on_the_check_box_for_the_fixture_exceeds_lamp_lumens() {

		/*	boolean isChecked =	WebUI.verifyElementChecked(findTestObject("Object Repository/LightPollutionReduction/FixtureShielding/input_Option 1. Fixture Shielding_exteriorFixtures"), 30)
		 println "Checking whether the Check box is checked or not "+ isChecked
		 if (isChecked == false){
		 WebUI.click(findTestObject("Object Repository/LightPollutionReduction/FixtureShielding/input_Option 1. Fixture Shielding_exteriorFixtures"))
		 }*/
		//WebUI.click(findTestObject("Object Repository/LightPollutionReduction/FixtureShielding/input_Option 1. Fixture Shielding_exteriorFixtures"))
		String chk_Xpath = "//*[@id='credit-form']/div[3]/div[2]/div[1]/div/input"
		new projectKeywords().IsChecked(chk_Xpath)
	}

	@Then("User should be able to see the checkbox checked for for the fixture exceeds 2500 lamp lumens")
	public void user_should_be_able_to_see_the_checkbox_checked_for_for_the_fixture_exceeds_lamp_lumens() {
		WebUI.delay(2)
		boolean isChecked =	WebUI.verifyElementChecked(findTestObject("Object Repository/LightPollutionReduction/FixtureShielding/input_Option 1. Fixture Shielding_exteriorFixtures"), 30)
		if (isChecked == true){

			println "checkbox is checked"
		}
		else{
			println "checkbox is not checked"
		}
	}

	@Given("User should be able to see the Add File button of shielding information for each luminaire")
	public void user_should_be_able_to_see_the_Add_File_button_for_shielding_information_for_each_luminaire() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_shielding information/p_Upload shielding information'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_shielding information/p_Upload shielding information'), 30)
	}

	@Then("User uploads file of shielding information for each luminaire")
	public void user_uploads_file_for_shielding_information_for_each_luminaire() {

		def list = []
		String path = RunConfiguration.getProjectDir() + '/Include/TestData/MultipleFileDiffExt'
		def dir = new File(path)
		dir.eachFile (FileType.FILES) { file -> list << file}
		for (item in list) {
			String item1 = item
			WebUI.switchToFrame(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/iframe'), 10)
			boolean wait_Shielding = WebUI.waitForElementAttributeValue(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_shielding information/Addfile_shielding information/btn_shielding information'), 'class', 'tiny ui button', 1000)
			WebUI.switchToDefaultContent()
			WebUI.uploadFile(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_shielding information/Addfile_shielding information/input_file'), item1)
			WebUI.delay(1)
		}
	}

	/*	@Then("User can see the uploaded files for shielding information for each luminaire")
	 public void user_can_see_the_uploaded_files_for_shielding_information_for_each_luminaire() {
	 }
	 */

	@Given("User should be able to see the textbox for Percent increase in illumination from lights off to lights on")
	public void user_should_be_able_to_see_the_textbox_for_Percent_increase_in_illumination_from_lights_off_to_lights_on() {

		boolean txt_Percent = WebUI.verifyElementPresent(findTestObject("Object Repository/LightPollutionReduction/FixtureShielding/input_PercentIncrease"), 30)
		if (txt_Percent == true){
			println "textbox for Percent increase is present"
		}
		else {
			println "textbox for Percent increase is not present"
		}
	}

	static String txt_PersentIncrease
	@When("User enters the percentage value for Percent increase in illumination from lights off to lights on")
	public void user_enters_the_percentage_value_for_Percent_increase_in_illumination_from_lights_off_to_lights_on() {
		txt_PersentIncrease = 677
		WebUI.setText(findTestObject("Object Repository/LightPollutionReduction/FixtureShielding/input_PercentIncrease"), txt_PersentIncrease)
	}

	String enterdValue
	@Then("User should be able to see the entered value in Percent increase in illumination from lights off to lights on")
	public void user_should_be_able_to_see_the_entered_value_in_Percent_increase_in_illumination_from_lights_off_to_lights_on() {
		WebUI.delay(3)
		WebUI.scrollToElement(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_shielding information/p_Upload shielding information'), 30)
		//WebUI.click(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_siteplan/p_Upload a site plan with scal'))
		//enterdValue = WebUI.getText(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/input_PercentIncrease'))
		enterdValue = WebUI.getAttribute(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/input_PercentIncrease'), 'value')
		println "The entered Value is "+ enterdValue
		println "The txt_PersentIncrease is " + txt_PersentIncrease
		WebUI.verifyMatch(txt_PersentIncrease, enterdValue, false)
	}

	@Given("User should be able to see the Add File button for site plan with scale and any related site features")
	public void user_should_be_able_to_see_the_Add_File_button_for_site_plan_with_scale_and_any_related_site_features() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_siteplan/p_Upload a site plan with scal'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_siteplan/p_Upload a site plan with scal'), 30)
	}

	@Then("User uploads file for site plan with scale and any related site features")
	public void user_uploads_file_for_site_plan_with_scale_and_any_related_site_features() {

		def list = []
		String path = RunConfiguration.getProjectDir() + '/Include/TestData/MultipleFileDiffExt'
		def dir = new File(path)
		dir.eachFile (FileType.FILES) { file -> list << file}
		for (item in list) {
			String item1 = item
			WebUI.switchToFrame(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/iframe'), 10)
			boolean wait_Shielding = WebUI.waitForElementAttributeValue(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_siteplan/Addfile_siteplan/btn_siteplan'), 'class', 'tiny ui button', 1000)
			WebUI.switchToDefaultContent()
			WebUI.uploadFile(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_siteplan/Addfile_siteplan/input_siteplan'), item1)
			WebUI.delay(1)
		}
	}

	/*	@Then("User can see the uploaded files for site plan with scale and any related site features")
	 public void user_can_see_the_uploaded_files_for_site_plan_with_scale_and_any_related_site_features() {
	 }*/

	@Given("User should be able to see the Add File button of special circumstances for fixture shielding in Light Pollution Reduction")
	public void user_should_be_able_to_see_the_Add_File_button_for_special_circumstances_for_fixture_shielding_in_Light_Pollution_Reduction() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_SpecialCircumstances/p_Upload any additional docume'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_SpecialCircumstances/p_Upload any additional docume'), 30)
	}

	@Then("User uploads file of special circumstances for fixture shielding in Light Pollution Reduction")
	public void user_uploads_file_for_special_circumstances_for_fixture_shielding_in_Light_Pollution_Reduction() {

		def list = []
		String path = RunConfiguration.getProjectDir() + '/Include/TestData/MultipleFileDiffExt'
		def dir = new File(path)
		dir.eachFile (FileType.FILES) { file -> list << file}
		for (item in list) {
			String item1 = item
			WebUI.switchToFrame(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/iframe'), 10)
			boolean wait_Shielding = WebUI.waitForElementAttributeValue(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_SpecialCircumstances/Addfile_SpecialCicumstances/btn_SpecialCircumstances'), 'class', 'tiny ui button', 1000)
			WebUI.switchToDefaultContent()
			WebUI.uploadFile(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_SpecialCircumstances/Addfile_SpecialCicumstances/input_additional'), item1)
			WebUI.delay(1)
		}
	}

	/*@Then("User can see the uploaded files for special circumstances for fixture shielding in Light Pollution Reduction")
	 public void user_can_see_the_uploaded_files_for_special_circumstances_for_fixture_shielding_in_Light_Pollution_Reduction() {
	 // Write code here that turns the phrase above into concrete actions
	 throw new PendingException();
	 }*/


	static String genearated_txt = (new projectKeywords()).generateRandomString(5)
	static String txt_SpecialCircumstances = findTestData("NarrativeData/Narrativecontent").getValue("Narrative",1)+genearated_txt
	@Given("User should see the editor for Special Circumstances for fixture shielding in Light Pollution Reduction")
	public void user_should_see_the_editor_for_Special_Circumstances_for_fixture_shielding_in_Light_Pollution_Reduction() {

		WebUI.scrollToElement(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Htmleditorbox_sc/p_Describe the circumstances l'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Htmleditorbox_sc/p_Describe the circumstances l'), 5)
	}

	@When("User feeds long narrative text for Special Circumstances text box for fixture shielding in Light Pollution Reduction")
	public void user_feeds_long_narrative_text_for_Special_Circumstances_text_box_for_fixture_shielding_in_Light_Pollution_Reduction() {
		println "##############"+ txt_SpecialCircumstances
		WebUI.setText(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Htmleditorbox_sc/body_SC_Editor'),txt_SpecialCircumstances)

		WebUI.delay(3)
	}

	@Then("User should see the narrative text persist on Special Circumstances text box for fixture shielding in Light Pollution Reduction")
	public void user_should_see_the_narrative_text_persist_on_Special_Circumstances_text_box_for_fixture_shielding_in_Light_Pollution_Reduction() {

		String narrativeSplCircum = WebUI.getText(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Htmleditorbox_sc/body_SC_Editor'))
		println "##############"+ narrativeSplCircum
		WebUI.verifyMatch(narrativeSplCircum, txt_SpecialCircumstances, false, FailureHandling.STOP_ON_FAILURE)
	}

	@Given("User can see the save button")
	public void user_can_see_the_save_button() {
		WebUI.verifyElementVisible(findTestObject("Object Repository/LightPollutionReduction/FixtureShielding/Saveform/btn_Save"))
	}

	@When("User clicks on save button")
	public void user_clicks_on_save_button() {
		WebUI.click(findTestObject("Object Repository/LightPollutionReduction/FixtureShielding/Saveform/btn_Save"))
	}

	@Then("User should see Form data saved successfully message")
	public void user_should_see_Form_data_saved_successfully_message() {
		WebUI.delay(2)
		boolean str =	WebUI.verifyTextPresent("Form data saved successfully.", false)
		println "###########" + str
	}


	@Given("User has to refresh the form")
	public void user_has_to_refresh_the_form() {
		WebUI.refresh()
	}

	@Then("User verifies the entered value in Percent increase in illumination from lights off to lights on")
	public void user_verifies_the_entered_value_in_Percent_increase_in_illumination_from_lights_off_to_lights_on() {
		/*		WebUI.scrollToElement(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/input_PercentIncrease'), 30)
		 String	enteredValue = WebUI.getText(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/input_PercentIncrease'))
		 println "################# Enteredvalue" + enteredValue	
		 WebUI.verifyMatch(txt_PersentIncrease, enteredValue, false)  */
		String enteredValue = WebUI.getAttribute(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/input_PercentIncrease'), 'value')
		println "################# Enteredvalue" + enteredValue
		WebUI.verifyMatch(txt_PersentIncrease, enteredValue, false)
	}

	@And("User verifies the narrative text of Special Circumstances html editor box for Light Pollution Reduction form")
	public void user_verifies_the_narrative_text_of_Special_Circumstances_html_editor_box_for_Light_Pollution_Reduction_form() {

		String narrativeSplCircum = WebUI.getText(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Htmleditorbox_sc/body_SC_Editor'))
		println "##############"+ narrativeSplCircum
		WebUI.verifyMatch(narrativeSplCircum, txt_SpecialCircumstances, false, FailureHandling.STOP_ON_FAILURE)

		WebUI.delay(2)
		println "Form refreshed and waited for the delay"
		WebUI.back()
		println "Back to previous page"
		WebUI.delay(2)
		println "Back to previous page and given delay"

		String status =	WebUI.getText(findTestObject("Object Repository/LightPollutionReduction/h3_Status"))
		println "The status is "+ status
		if (status == "ATTEMPTED"){
			println "Inside the if"
			WebUI.click(findTestObject("Object Repository/LightPollutionReduction/a_MarkReadyForReview"))
			//	WebUI.click(findTestObject("Object Repository/Page_LEED Online/a_Submit"))
			WebUI.delay(5)
		}

		String changed_Status =	WebUI.getText(findTestObject("Object Repository/LightPollutionReduction/h3_Status"))
		println "######################### changed_Status " + changed_Status
	}
	/**
	 *  Filling the data in the LPR form for FixtureSheilding(Option 1) -- Ended
	 */

	/**
	 *  Filling the data in the LPR form for Premier Measurements(Option 2) -- Started
	 */

	@Given("User should see the radio button option Perimeter Measurements")
	public void user_should_see_the_radio_button_option_Perimeter_Measurements() {

		WebUI.callTestCase(findTestCase('Test Cases/LightPollutionReduction/TC_NavigateToLPR'), null, FailureHandling.STOP_ON_FAILURE)

		boolean option1Present =	WebUI.verifyElementPresent(findTestObject("Object Repository/LightPollutionReduction/PremierMeasurements/input_Option2.Perimeter Measurements"), 30)
		if (option1Present == true){
			println  "Perimeter Measurements option is present"
		}
		else{
			println  "Perimeter Measurements option is not present"
		}
	}

	@When("User clicks on Perimeter Measurements option")
	public void user_clicks_on_Perimeter_Measurements_option() {

		WebUI.click(findTestObject("Object Repository/LightPollutionReduction/PremierMeasurements/input_Option2.Perimeter Measurements"))
		WebUI.delay(2)
	}

	@Then("User should see the contents for Perimeter Measurements option")
	public void user_should_see_the_contents_for_Perimeter_Measurements_option() {

		WebUI.switchToFrame(findTestObject("Object Repository/LightPollutionReduction/PremierMeasurements/iframe"), 30)
		WebUI.verifyTextPresent("Option 2. Perimeter Measurements", false)
		WebUI.switchToDefaultContent()
	}

	int i
	TestObject measurementID, exteriorLightsOff, exteriorLightsOn, percentageIncrease, addRow
	DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss a");
	@Given("User can see the Table Site lighting measurements of Perimeter Measurements")
	public void user_can_see_the_Table_Site_lighting_measurements_of_Perimeter_Measurements() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/LightPollutionReduction/PremierMeasurements/table_SiteLightnigMeasures'), 30)
	}


	@When("User enters the details of Measurements ID,Illumantion Level")
	public void user_can_enter_the_details_of_Measurements_ID_Illumantion_Level() {

		Date date = new Date()
		String tablestart= dateFormat.format(date)
		println "Table Site lighting measurements starting : "+tablestart

		WebUI.clearText(findTestObject('Object Repository/LightPollutionReduction/PremierMeasurements/input_measurementid'))
		WebUI.setText(findTestObject('Object Repository/LightPollutionReduction/PremierMeasurements/input_measurementid'), '55')

		WebUI.clearText(findTestObject('Object Repository/LightPollutionReduction/PremierMeasurements/input_With SiteExterior Lights off'))
		WebUI.setText(findTestObject('Object Repository/LightPollutionReduction/PremierMeasurements/input_With SiteExterior Lights off'), '56')

		WebUI.clearText(findTestObject('Object Repository/LightPollutionReduction/PremierMeasurements/input_With SiteExterior Lights on'))
		WebUI.setText(findTestObject('Object Repository/LightPollutionReduction/PremierMeasurements/input_With SiteExterior Lights on'), '57')

		WebUI.delay(3)

		WebUI.click(findTestObject('Object Repository/LightPollutionReduction/PremierMeasurements/i_SiteExterio_plus icon'))

		for(def row=1; row <=findTestData("LightPollutionReduction/TBL_SiteLighting").getRowNumbers() ; row++){

			i = row + 1
			WebUI.switchToFrame(findTestObject('Object Repository/LightPollutionReduction/PremierMeasurements/iframe'), 5)
			measurementID = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="credit-form"]/div[3]/div[2]/div/table/tbody/tr['+i+']/td[1]/input', true)
			exteriorLightsOff = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="credit-form"]/div[3]/div[2]/div/table/tbody/tr['+i+']/td[2]/input', true)
			exteriorLightsOn = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="credit-form"]/div[3]/div[2]/div/table/tbody/tr['+i+']/td[3]/input', true)
			//percentageIncrease = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="credit-form"]/div[3]/div[2]/div/table/tbody/tr['+i+']/td[4]/div', true)

			WebUI.setText(measurementID, findTestData("LightPollutionReduction/TBL_SiteLighting").getValue("MeasurementID", row))
			WebUI.setText(exteriorLightsOff, findTestData("LightPollutionReduction/TBL_SiteLighting").getValue("LightsOff", row))
			WebUI.setText(exteriorLightsOn, findTestData("LightPollutionReduction/TBL_SiteLighting").getValue("LightsOn", row))


			WebUI.switchToDefaultContent()

			addRow = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="credit-form"]/div[3]/div[2]/div/table/tbody/tr['+i+']/td[5]/a[1]/i', true)
			WebUI.delay(1)
			if(row !=findTestData("LightPollutionReduction/TBL_SiteLighting").getRowNumbers())
			{
				WebUI.switchToFrame(findTestObject('Object Repository/LightPollutionReduction/PremierMeasurements/iframe'), 5)
				WebUI.click(addRow)
				WebUI.switchToDefaultContent()
			}
		}

		WebUI.click(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/input_PercentIncrease'))
		Date date1 = new Date()
		String tableEnd= dateFormat.format(date1)

		println "Table Site lighting measurements ending : "+tableEnd
	}

	@Then("User can see the calculated value of Percent Increase of the Table Site lighting measurements of Perimeter Measurements")
	public void user_can_see_the_calculated_value_of_Percent_Increase_of_the_Table_Site_lighting_measurements_of_Perimeter_Measurements() {

		String percentageIncrease = WebUI.getText(findTestObject('Object Repository/LightPollutionReduction/PremierMeasurements/Input_Percent Increase'))
		println "############### percentageIncrease " + percentageIncrease
	}


	@Then("User verifies the data present in the table site lighting measurements with the entered data")
	public void user_verifies_the_percent_increase_value_present_in_the_table_site_lighting_measurements_with_the_entered_value() {

		for(def row=1; row <=findTestData("LightPollutionReduction/TBL_SiteLighting").getRowNumbers() ; row++){

			def measurementID_ExcelData =  findTestData("LightPollutionReduction/TBL_SiteLighting").getValue("MeasurementID", row)
			def lightsOff_ExcelData = findTestData("LightPollutionReduction/TBL_SiteLighting").getValue("LightsOff", row)
			def lightsOn_ExcelData = findTestData("LightPollutionReduction/TBL_SiteLighting").getValue("LightsOn", row)

			println "The MeasurementID in excel is :" + measurementID_ExcelData
			println "The LightsOff in excel is :" + lightsOff_ExcelData
			println "The LightsOn in excel is :" + lightsOn_ExcelData

			i = row + 1

			WebUI.switchToFrame(findTestObject('Object Repository/LightPollutionReduction/PremierMeasurements/iframe'), 5)
			measurementID = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="credit-form"]/div[3]/div[2]/div/table/tbody/tr['+i+']/td[1]/input', true)
			exteriorLightsOff = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="credit-form"]/div[3]/div[2]/div/table/tbody/tr['+i+']/td[2]/input', true)
			exteriorLightsOn = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="credit-form"]/div[3]/div[2]/div/table/tbody/tr['+i+']/td[3]/input', true)

			def measurementID_FormData = WebUI.getAttribute((measurementID), 'value')
			//input_Value =
			// WebUI.getText(measurementID)
			def lightsOff_FormData = WebUI.getAttribute((exteriorLightsOff), 'value')
			def lightsOn_FormData = WebUI.getAttribute((exteriorLightsOn), 'value')

			WebUI.switchToDefaultContent()
			println "The MeasurementID in form is :" + measurementID_FormData
			println "The LightsOff in form is :" + lightsOff_FormData
			println "The LightsOn in form is :" + lightsOn_FormData

			WebUI.verifyMatch(measurementID_ExcelData, measurementID_FormData, false)
			WebUI.verifyMatch(lightsOff_ExcelData, lightsOff_FormData, false)
			WebUI.verifyMatch(lightsOn_ExcelData, lightsOn_FormData, false)
		}
	}

	/**
	 *  Filling the data in the LPR form for Premier Measurements(Option 2) -- Ended
	 */


	/**
	 *  Download the pdf by clicking the generate pdf button Fixture Shielding(Option 1) -- Started
	 */

	@Given("User can see the generate pdf icon on the top of the form")
	public void user_can_see_the_generate_pdf_icon_on_the_top_of_the_form() {
		WebUI.switchToFrame(findTestObject('Object Repository/LightPollutionReduction/PremierMeasurements/iframe'), 5)
		WebUI.scrollToElement(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/icon_pdf'), 5)
		WebUI.verifyElementPresent(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/icon_pdf'), 30)
		WebUI.switchToDefaultContent()
	}

	@When("User clicks on generate pdf icon to download the file")
	public void user_clicks_on_generate_pdf_icon_to_download_the_file() {
		WebUI.switchToFrame(findTestObject('Object Repository/LightPollutionReduction/PremierMeasurements/iframe'), 5)
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/icon_pdf'))
		WebUI.delay(10)
		WebUI.switchToDefaultContent()
	}


	@Then("User has to verify Uploaded shielding information with downloaded pdf file")
	public void user_has_to_verify_Uploaded_shielding_information_with_downloaded_pdf_file() {

		String xpathid="//*[@id=\"shieldingInfoUpload_files\"]/table[@class=\"ui collapsing celled table unstackable\"]/tbody"
		String scroll1='Object Repository/LightPollutionReduction/FixtureShielding/Upload_shielding information/p_Upload shielding information'
		String iframe='Object Repository/LightPollutionReduction/FixtureShielding/iframe'
		new projectKeywords().compareUploadedFileWithPDF(xpathid,scroll1,iframe)
		WebUI.switchToDefaultContent()

		WebUI.delay(2)
	}

	@And("User had to verify the data in Percent increase in illumination with downloaded pdf file")
	public void user_had_to_verify_the_data_in_Percent_increase_in_illumination_with_downloaded_pdf_file() {

		String txt_Percentage = WebUI.getAttribute(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/input_PercentIncrease'), 'value')
		println "The Percenatge value in the form is " +txt_Percentage
		PDFUtil pdfUtil1 = new PDFUtil();
		String path = RunConfiguration.getProjectDir() + '/Include/TestData/DownloadedFiles/creditForm.pdf'
		String file = pdfUtil1.getText(path,1)
		WebUI.delay(3)
		println(file)

		if(file.contains(txt_Percentage)) {
			println("The value in the precentage text is found in the pdf --> Found")
		}
		else {
			println("The value in the precentage text is not found in the pdf --> Not Found")
		}

	}

	@And("User has to verify Uploaded site plan with downloaded pdf file")
	public void user_has_to_verify_Uploaded_site_plan_with_downloaded_pdf_file() {
		String xpathid="//*[@id=\"sitePlanUpload_files\"]/table[@class=\"ui collapsing celled table unstackable\"]/tbody"
		String scroll1='Object Repository/LightPollutionReduction/FixtureShielding/Upload_siteplan/p_Upload a site plan with scal'
		String iframe='Object Repository/LightPollutionReduction/FixtureShielding/iframe'
		new projectKeywords().compareUploadedFileWithPDF(xpathid,scroll1,iframe)
		WebUI.switchToDefaultContent()
		WebUI.delay(2)
	}


	@And("User has to verify the Special Circumstances html editor with downloaded pdf file")
	public void user_has_to_verify_the_Special_Circumstances_html_editor_with_downloaded_pdf_file() {
		String Editorpath='Object Repository/LightPollutionReduction/FixtureShielding/Htmleditorbox_sc/body_SC_Editor'
		String scroll='Object Repository/LightPollutionReduction/FixtureShielding/Htmleditorbox_sc/p_Describe the circumstances l'
		new projectKeywords().compareNarrativeDataWithPDF(scroll,Editorpath)
		WebUI.switchToDefaultContent()
		WebUI.delay(2)
	}

	@And("User has to verify Uploaded additional documentation with downloaded pdf file")
	public void user_has_to_verify_Uploaded_additional_documentation_with_downloaded_pdf_file() {
		String xpathid="//*[@id=\"splCircumstancesDocs_files\"]/table[@class=\"ui collapsing celled table unstackable\"]/tbody"
		String scroll1='Object Repository/LightPollutionReduction/FixtureShielding/Upload_SpecialCircumstances/p_Upload any additional docume'
		String iframe='Object Repository/LightPollutionReduction/FixtureShielding/iframe'
		new projectKeywords().compareUploadedFileWithPDF(xpathid,scroll1,iframe)
		WebUI.switchToDefaultContent()
		String path = RunConfiguration.getProjectDir()+ '/Include/TestData/DownloadedFiles'
		new projectKeywords().deleteDownloadedFiles(path)
	}

	/**
	 *  Download the pdf by clicking the generate pdf button Fixture Shielding(Option 1) -- Ended
	 */

	/**
	 *  Download the pdf by clicking the generate pdf button Perimeter Measurements(Option 1) -- Started 
	 *  
	 */

	@Then("User has to verify the Site lighting measurements table with downloaded pdf file")
	public void user_has_to_verify_the_site_lightning_measurements_table_with_downloaded_pdf_file(){

		WebUI.scrollToElement(findTestObject('Object Repository/LightPollutionReduction/PremierMeasurements/table_SiteLightnigMeasures'), 10)
		String measurementID = WebUI.getAttribute(findTestObject('Object Repository/LightPollutionReduction/PremierMeasurements/input_measurementid'), 'value')
		String lightOff = WebUI.getAttribute(findTestObject('Object Repository/LightPollutionReduction/PremierMeasurements/input_With SiteExterior Lights off'), 'value')
		String lightOn = WebUI.getAttribute(findTestObject('Object Repository/LightPollutionReduction/PremierMeasurements/input_With SiteExterior Lights on'), 'value')
		String percentIncrease = WebUI.getText(findTestObject('Object Repository/LightPollutionReduction/PremierMeasurements/Input_Percent Increase'))
		println "################" + percentIncrease
		PDFUtil pdfUtil1 = new PDFUtil();
		String path = RunConfiguration.getProjectDir() + '/Include/TestData/DownloadedFiles/creditForm.pdf'
		String file = pdfUtil1.getText(path,1)
		WebUI.delay(2)
		println(file)
		if (file.contains(measurementID)){
			println("The content in the downloaded pdf matches with the Table Data Content -->  Measuremnt ID Found")
		}
		else {
			println("The content in the downloaded pdf does not match with the Table Data Content --> Measuremnt ID Not Found")
		}
		if (file.contains(lightOff)){
			println("The content in the downloaded pdf matches with the Table Data Content -->  Light Off Found")
		}
		else {
			println("The content in the downloaded pdf does not match with the Table Data Content --> Light Off Not Found")
		}
		if (file.contains(lightOn)){
			println("The content in the downloaded pdf matches with the Table Data Content -->  Light On Found")
		}
		else {
			println("The content in the downloaded pdf does not match with the Table Data Content --> Light On Not Found")
		}
		if (file.contains(percentIncrease)){
			println("The content in the downloaded pdf matches with the Table Data Content -->  Percent Increase Found")
		}
		else {
			println("The content in the downloaded pdf does not match with the Table Data Content --> Percent Increase  Not Found")
		}


	}


	@And("User changes the status to mark for review for the form")
	public void user_changes_the_status_to_mark_for_review(){

		WebUI.delay(2)
		println "Form refreshed and waited for the delay"
		WebUI.back()
		println "Back to previous page"
		WebUI.delay(2)
		println "Back to previous page and given delay"

		String status =	WebUI.getText(findTestObject("Object Repository/LightPollutionReduction/h3_Status"))

		if (status == "ATTEMPTED"){
			println "Inside the if"
			WebUI.click(findTestObject("Object Repository/LightPollutionReduction/a_MarkReadyForReview"))
			//	WebUI.click(findTestObject("Object Repository/Page_LEED Online/a_Submit"))
			WebUI.delay(5)
		}

		String changed_Status =	WebUI.getText(findTestObject("Object Repository/LightPollutionReduction/h3_Status"))
		println "######################### changed_Status " + changed_Status
	}



	/**
	 *  Download the pdf by clicking the generate pdf button Perimeter Measurements(Option 1) -- Ended
	 */


}