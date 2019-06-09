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
import com.testautomationguru.utility.PDFUtil

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
import groovy.io.FileType
import leedOnlineKeywords.projectKeywords


class GreenCleaning_Form {

	@Given("User can see Green Cleaning Policy under Indoor Environmental Quality section")
	public void user_can_see_Green_Cleaning_Policy_under_Indoor_Environmental_Quality_section() {

		WebUI.scrollToElement(findTestObject('Object Repository/GreenCleaningPolicy/div_Green Cleaning Policy'), 10)
		boolean formNamePresent = WebUI.verifyElementPresent(findTestObject('Object Repository/GreenCleaningPolicy/div_Green Cleaning Policy'), 30)
		if (formNamePresent == true){
			println "Form Present"
		}
		else{
			println "Form Not Present"
		}
	}

	@And("User has to select the status to Attempted for Green Cleaning Policy")
	public void user_has_to_select_the_status_to_Attempted_for_Green_Cleaning_Policy() {

		String status =	WebUI.getText(findTestObject('Object Repository/GreenCleaningPolicy/h3_Status'))
		println "######################### h3" + status
		String divval = WebUI.getText(findTestObject('Object Repository/GreenCleaningPolicy/divval'))
		println "######################### dival" + divval

		if (status == "READY FOR REVIEW") {
			println "Inside the if"
			WebUI.click(findTestObject('Object Repository/GreenCleaningPolicy/a_MarkReadyForReview'))
			WebUI.delay(5)
		}
		String changedStatus =	WebUI.getText(findTestObject('Object Repository/GreenCleaningPolicy/h3_Status'))
		println "The changed Status is "+changedStatus
	}

	@When("User clicks on Green Cleaning Policy")
	public void user_clicks_on_Green_Cleaning_Policy() {

		WebUI.click(findTestObject('Object Repository/GreenCleaningPolicy/div_Green Cleaning Policy'))
	}

	@And("User has to click on FormV01 button of Green Cleaning Policy")
	public void user_has_to_click_on_FormV_button_of_Green_Cleaning_Policy() {

		WebUI.click(findTestObject('Object Repository/GreenCleaningPolicy/a_Form (V01)'))
	}

	@Then("User should be able to see the Green Cleaning Policy form")
	public void user_should_be_able_to_see_the_Green_Cleaning_Policy_form() {
		println "Finsihed"
		boolean insideForm = WebUI.verifyElementPresent(findTestObject('Object Repository/GreenCleaningPolicy/div_Green Cleaning Policy_Credit library'), 30)
		if (insideForm == true){
			println "Inside the GCP form"
		}
		else {
			println "Not inside the GCP form"
		}
	}


	/**
	 * 
	 * Started In-house Green Cleaning Policy (Option 1)
	 * 
	 */
	@Given("User should see the radio button option In-house green cleaning policy")
	public void user_should_see_the_radio_button_option_In_house_green_cleaning_policy() {

		WebUI.callTestCase(findTestCase('Test Cases/GreenCleaningPolicy/TC_NavigateToGCP'), null, FailureHandling.STOP_ON_FAILURE)

		boolean option1Present =	WebUI.verifyElementPresent(findTestObject('Object Repository/GreenCleaningPolicy/Option1_GreenCleanPlcy/input_Option1_Radiobtn'), 30)
		if (option1Present == true){
			println  " In-house green cleaning policy option is present"
		}
		else{
			println  " In-house green cleaning policy option is not present"
		}
	}

	@When("User clicks on In-house green cleaning policy option")
	public void user_clicks_on_In_house_green_cleaning_policy_option() {

		WebUI.click(findTestObject('Object Repository/GreenCleaningPolicy/Option1_GreenCleanPlcy/input_Option1_Radiobtn'))
		WebUI.delay(2)
	}

	@Then("User should see the contents for In-house green cleaning policy option")
	public void user_should_see_the_contents_for_In_house_green_cleaning_policy_option() {

		WebUI.switchToFrame(findTestObject("Object Repository/GreenCleaningPolicy/iframe"), 30)
		WebUI.verifyTextPresent("Option 1. In-house green cleaning policy", false)
		WebUI.switchToDefaultContent()
	}

	@Given("User should be able to see the Add File button for Green Cleaning Policy")
	public void user_should_be_able_to_see_the_Add_File_button_for_Green_Cleaning_Policy() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/GreenCleaningPolicy/Option1_GreenCleanPlcy/AddFile_UploadGreenCleaningPlcy_Option1/p_Upload the Green Cleaning Policy'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/GreenCleaningPolicy/Option1_GreenCleanPlcy/AddFile_UploadGreenCleaningPlcy_Option1/p_Upload the Green Cleaning Policy'), 30)
	}

	@Then("User uploads file for Green Cleaning Policy")
	public void user_uploads_file_for_Green_Cleaning_Policy() {

		//		def list = []
		//		String path = RunConfiguration.getProjectDir() + '/Include/TestData/MultipleFileDiffExt'
		//		println "path :"+path
		//		def dir = new File(path)
		//		dir.eachFile (FileType.FILES) { file -> list << file}
		//		for (item in list) {
		//			String item1 = item
		//			WebUI.switchToFrame(findTestObject('Object Repository/GreenCleaningPolicy/iframe'), 10)
		//			boolean Greenplcy = WebUI.waitForElementAttributeValue(findTestObject('Object Repository/GreenCleaningPolicy/Option1_GreenCleanPlcy/AddFile_UploadGreenCleaningPlcy_Option1/Button_UploadGreenCleaningPlcy'), 'class', 'tiny ui button', 1000)
		//			WebUI.switchToDefaultContent()
		//			WebUI.uploadFile(findTestObject('Object Repository/GreenCleaningPolicy/Option1_GreenCleanPlcy/AddFile_UploadGreenCleaningPlcy_Option1/input_UploadGreenCleaningPlcy'), item1)
		//			WebUI.delay(1)
		//		}

		String uploadButton = "Object Repository/GreenCleaningPolicy/Option1_GreenCleanPlcy/AddFile_UploadGreenCleaningPlcy_Option1/Button_UploadGreenCleaningPlcy"
		String inputUploadFile = "Object Repository/GreenCleaningPolicy/Option1_GreenCleanPlcy/AddFile_UploadGreenCleaningPlcy_Option1/input_UploadGreenCleaningPlcy"

		new projectKeywords().uploadMultipleFiles(uploadButton,inputUploadFile )
	}

	static String genearated_txt = (new projectKeywords()).generateRandomString(5)
	static String txt_cleaningService = findTestData("NarrativeData/Narrativecontent").getValue("Narrative",1)+genearated_txt

	@Given("User should see the editor for cleaning service for In-house green cleaning policy in Green Cleaning Policy")
	public void user_should_see_the_editor_for_cleaning_service_for_In_house_green_cleaning_policy_in_Green_Cleaning_Policy() {

		WebUI.scrollToElement(findTestObject('Object Repository/GreenCleaningPolicy/CleaningService_EditorBox/p_CleaningService'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/GreenCleaningPolicy/CleaningService_EditorBox/p_CleaningService'), 5)
	}

	@When("User feeds long narrative text for cleaning service text box for In-house green cleaning policy in Green Cleaning Policy")
	public void user_feeds_long_narrative_text_for_cleaning_service_text_box_for_In_house_green_cleaning_policy_in_Green_Cleaning_Policy() {

		println "##############"+ txt_cleaningService
		WebUI.setText(findTestObject('Object Repository/GreenCleaningPolicy/CleaningService_EditorBox/body_CS_EditorBox'),txt_cleaningService )

		WebUI.delay(3)
	}

	@Then("User should see the narrative text persist on cleaning service text box for In-house green cleaning policy in Green Cleaning Policy")
	public void user_should_see_the_narrative_text_persist_on_cleaning_service_text_box_for_In_house_green_cleaning_policy_in_Green_Cleaning_Policy() {

		String cleaningService = WebUI.getText(findTestObject('Object Repository/GreenCleaningPolicy/CleaningService_EditorBox/body_CS_EditorBox'))
		println "##############"+ cleaningService
		WebUI.verifyMatch(cleaningService, txt_cleaningService , false, FailureHandling.STOP_ON_FAILURE)
	}

	@Given("User should be able to see the Add File button of special circumstances for In-house green cleaning policy in Green Cleaning Policy")
	public void user_should_be_able_to_see_the_Add_File_button_of_special_circumstances_for_In_house_green_cleaning_policy_in_Green_Cleaning_Policy() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/GreenCleaningPolicy/SpecialCircumstances/AddFile_UploadAddtionalDoc_SC/p_Upload any additional documentation that supports'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/GreenCleaningPolicy/SpecialCircumstances/AddFile_UploadAddtionalDoc_SC/p_Upload any additional documentation that supports'), 30)
	}

	@Then("User uploads file of special circumstances for In-house green cleaning policy in Green Cleaning Policy")
	public void user_uploads_file_of_special_circumstances_for_In_house_green_cleaning_policy_in_Green_Cleaning_Policy() {

		//		def list = []
		//		String path = RunConfiguration.getProjectDir() + '/Include/TestData/FileNamesExcel'
		//		def dir = new File(path)
		//		dir.eachFile (FileType.FILES) { file -> list << file}
		//		for (item in list) {
		//			String item1 = item
		//			WebUI.switchToFrame(findTestObject('Object Repository/GreenCleaningPolicy/iframe'), 10)
		//			boolean spl_circum = WebUI.waitForElementAttributeValue(findTestObject('Object Repository/GreenCleaningPolicy/SpecialCircumstances/AddFile_UploadAddtionalDoc_SC/Button_UploadAdditionalDoc_SC'), 'class', 'tiny ui button', 1000)
		//			WebUI.switchToDefaultContent()
		//			WebUI.uploadFile(findTestObject('Object Repository/GreenCleaningPolicy/SpecialCircumstances/AddFile_UploadAddtionalDoc_SC/input_UploadAdditionalDoc_SC'), item1)
		//			WebUI.delay(1)
		//		}

		String uploadButton = "Object Repository/GreenCleaningPolicy/SpecialCircumstances/AddFile_UploadAddtionalDoc_SC/Button_UploadAdditionalDoc_SC"
		String inputUploadFile = "Object Repository/GreenCleaningPolicy/SpecialCircumstances/AddFile_UploadAddtionalDoc_SC/input_UploadAdditionalDoc_SC"

		new projectKeywords().uploadMultipleFiles(uploadButton,inputUploadFile )
	}


	@Given("User should see the editor for Special Circumstances for In-house green cleaning policy in Green Cleaning Policy")
	public void user_should_see_the_editor_for_Special_Circumstances_for_In_house_green_cleaning_policy_in_Green_Cleaning_Policy() {

		WebUI.scrollToElement(findTestObject('Object Repository/GreenCleaningPolicy/SpecialCircumstances/SC_EditorBox/p_Describe the circumstances limiting the project teams'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/GreenCleaningPolicy/SpecialCircumstances/SC_EditorBox/p_Describe the circumstances limiting the project teams'), 5)
	}

	@When("User feeds long narrative text for Special Circumstances text box for In-house green cleaning policy in Green Cleaning Policy")
	public void user_feeds_long_narrative_text_for_Special_Circumstances_text_box_for_In_house_green_cleaning_policy_in_Green_Cleaning_Policy() {

		println "##############"+ txt_cleaningService
		WebUI.setText(findTestObject('Object Repository/GreenCleaningPolicy/SpecialCircumstances/SC_EditorBox/body_SC_EditorBox'),txt_cleaningService )

		WebUI.delay(3)
	}

	@Then("User should see the narrative text persist on Special Circumstances text box for In-house green cleaning policy in Green Cleaning Policy")
	public void user_should_see_the_narrative_text_persist_on_Special_Circumstances_text_box_for_In_house_green_cleaning_policy_in_Green_Cleaning_Policy() {

		String narrativeSplCircum = WebUI.getText(findTestObject('Object Repository/GreenCleaningPolicy/SpecialCircumstances/SC_EditorBox/body_SC_EditorBox'))
		println "##############"+ narrativeSplCircum
		WebUI.verifyMatch(narrativeSplCircum, txt_cleaningService , false, FailureHandling.STOP_ON_FAILURE)
	}

	@Given("User can see the save button in GCP")
	public void user_can_see_the_save_button_in_GCP() {

		WebUI.delay(10)
		WebUI.verifyElementVisible(findTestObject('Object Repository/GreenCleaningPolicy/button_Save'))
	}

	@When("User clicks on save button in GCP")
	public void user_clicks_on_save_button_in_GCP() {

		WebUI.click(findTestObject('Object Repository/GreenCleaningPolicy/button_Save'))
	}

	@Then("User should see Form data saved successfully message in GCP")
	public void user_should_see_Form_data_saved_successfully_message_in_GCP() {

		WebUI.delay(2)
		boolean str =	WebUI.verifyTextPresent("Form data saved successfully.", false)
		println "###########" + str
	}

	@Given("User can see the generate pdf icon on the top of the Green Cleaning Policy Form")
	public void user_can_see_the_generate_pdf_icon_on_the_top_of_the_Green_Cleaning_Policy_Form() {

		WebUI.switchToFrame(findTestObject('Object Repository/GreenCleaningPolicy/iframe'), 5)
		WebUI.scrollToElement(findTestObject('Object Repository/GreenCleaningPolicy/icon_pdf'), 5)
		WebUI.verifyElementPresent(findTestObject('Object Repository/GreenCleaningPolicy/icon_pdf'), 30)
		WebUI.switchToDefaultContent()
	}

	@When("User clicks on generate pdf icon to download the file in Green Cleaning Policy Form")
	public void user_clicks_on_generate_pdf_icon_to_download_the_file_in_Green_Cleaning_Policy_Form() {

		WebUI.switchToFrame(findTestObject('Object Repository/GreenCleaningPolicy/iframe'), 5)
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/GreenCleaningPolicy/icon_pdf'))
		WebUI.delay(10)
		WebUI.switchToDefaultContent()
	}

	@Then("User has to verify Uploaded Green Cleaning Policy with downloaded pdf file in Green Cleaning Policy Form")
	public void user_has_to_verify_Uploaded_Green_Cleaning_Policy_with_downloaded_pdf_file_in_Green_Cleaning_Policy_Form() {

		//String xpathid="//*[@id=\"greenCleaningPolicyDocs_files\" or @id=\"contractDocs_files\"]/table[@class=\"ui collapsing celled table unstackable\"]/tbody"
		String xpathid=GCP_PageObjectClass.table_Xpath_GCP
		String scroll1='Object Repository/GreenCleaningPolicy/Option1_GreenCleanPlcy/AddFile_UploadGreenCleaningPlcy_Option1/p_Upload the Green Cleaning Policy'
		String iframe='Object Repository/GreenCleaningPolicy/iframe'
		new projectKeywords().compareUploadedFileWithPDF(xpathid,scroll1,iframe)
		WebUI.switchToDefaultContent()

		WebUI.delay(2)
	}

	@Then("User has to verify the cleaning service html editor with downloaded pdf file in Green Cleaning Policy Form")
	public void user_has_to_verify_the_cleaning_service_html_editor_with_downloaded_pdf_file_in_Green_Cleaning_Policy_Form() {

		String Editorpath='Object Repository/GreenCleaningPolicy/CleaningService_EditorBox/body_CS_EditorBox'
		String scroll='Object Repository/GreenCleaningPolicy/CleaningService_EditorBox/p_CleaningService'
		new projectKeywords().compareNarrativeDataWithPDF(scroll,Editorpath)
		WebUI.switchToDefaultContent()
		WebUI.delay(2)
	}

	@Then("User has to verify the Special Circumstances html editor with downloaded pdf file in Green Cleaning Policy Form")
	public void user_has_to_verify_the_Special_Circumstances_html_editor_with_downloaded_pdf_file_in_Green_Cleaning_Policy_Form() {

		String Editorpath='Object Repository/GreenCleaningPolicy/SpecialCircumstances/SC_EditorBox/body_SC_EditorBox'
		String scroll='Object Repository/GreenCleaningPolicy/SpecialCircumstances/SC_EditorBox/p_Describe the circumstances limiting the project teams'
		new projectKeywords().compareNarrativeDataWithPDF(scroll,Editorpath)
		WebUI.switchToDefaultContent()
		WebUI.delay(2)
	}

	@Then("User has to verify Uploaded additional documentation with downloaded pdf file in Green Cleaning Policy Form")
	public void user_has_to_verify_Uploaded_additional_documentation_with_downloaded_pdf_file_in_Green_Cleaning_Policy_Form() {

		//String xpathid="//*[@id=\"splCircumstancesDocs_files\"]/table[@class=\"ui collapsing celled table unstackable\"]/tbody"
		String xpathid=GCP_PageObjectClass.table_Xpath_SplCircum_GCP
		String scroll1='Object Repository/GreenCleaningPolicy/SpecialCircumstances/SC_EditorBox/p_Describe the circumstances limiting the project teams'
		String iframe='Object Repository/GreenCleaningPolicy/iframe'
		new projectKeywords().compareUploadedFileWithPDF(xpathid,scroll1,iframe)
		WebUI.switchToDefaultContent()

		WebUI.delay(2)
	}

	@Then("User verifies the narrative text of cleaning service html editor box for Green Cleaning Policy form")
	public void user_verifies_the_narrative_text_of_cleaning_service_html_editor_box_for_Green_Cleaning_Policy_form() {


		String cleaningService = WebUI.getText(findTestObject('Object Repository/GreenCleaningPolicy/CleaningService_EditorBox/body_CS_EditorBox'))
		println "##############"+ cleaningService
		WebUI.verifyMatch(cleaningService, txt_cleaningService, false, FailureHandling.STOP_ON_FAILURE)

		WebUI.delay(2)
	}

	@Then("User verifies the narrative text of Special Circumstances html editor box for Green Cleaning Policy form")
	public void user_verifies_the_narrative_text_of_Special_Circumstances_html_editor_box_for_Green_Cleaning_Policy_form() {


		String specialCircum = WebUI.getText(findTestObject('Object Repository/GreenCleaningPolicy/CleaningService_EditorBox/body_CS_EditorBox'))
		println "##############"+ specialCircum
		WebUI.verifyMatch(specialCircum, txt_cleaningService, false, FailureHandling.STOP_ON_FAILURE)

		WebUI.delay(2)
		println "Form refreshed and waited for the delay"
		WebUI.back()
		println "Back to previous page"
		WebUI.delay(2)
		println "Back to previous page and given delay"

		String status =	WebUI.getText(findTestObject("Object Repository/GreenCleaningPolicy/h3_Status"))
		println "The status is "+ status
		if (status == "ATTEMPTED"){
			println "Inside the if"
			WebUI.click(findTestObject("Object Repository/GreenCleaningPolicy/a_MarkReadyForReview"))
			//	WebUI.click(findTestObject("Object Repository/Page_LEED Online/a_Submit"))
			WebUI.delay(5)
		}

		String changed_Status =	WebUI.getText(findTestObject("Object Repository/GreenCleaningPolicy/h3_Status"))
		println "######################### changed_Status " + changed_Status
	}


	/**
	 * Ending of In-house Green Cleaning policy (option 1)
	 * 
	 */

	/**
	 * Starting of Certified Cleaning service (Option 2)
	 */


	@Given("User should see the radio button option CertifiedCleaningService")
	public void user_should_see_the_radio_button_option_CertifiedCleaningService() {

		WebUI.callTestCase(findTestCase('Test Cases/GreenCleaningPolicy/TC_NavigateToGCP'), null, FailureHandling.STOP_ON_FAILURE)

		boolean CertifiedCleaning =	WebUI.verifyElementPresent(findTestObject('Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/input_Option 2_RadioBtn'), 30)
		if (CertifiedCleaning == true){
			println  "Certified Cleaning option is present"
		}
		else{
			println  "Certified Cleaning option is not present"
		}
	}

	@When("User clicks on Certified Cleaning Service option")
	public void user_clicks_on_Certified_Cleaning_Service_option() {

		WebUI.click(findTestObject('Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/input_Option 2_RadioBtn'))
		WebUI.delay(5)
	}

	@Then("User should see the contents for Certified Cleaning Service")
	public void user_should_see_the_contents_for_Certified_Cleaning_Service() {

		WebUI.switchToFrame(findTestObject("Object Repository/GreenCleaningPolicy/iframe"), 30)
		WebUI.verifyTextPresent("Option 2. Certified cleaning service", false)
		WebUI.switchToDefaultContent()
	}

	@Given("User should be able to see the Add File button of Cleaning Contract for Certified Cleaning Service in Green Cleaning Policy")
	public void user_should_be_able_to_see_the_Add_File_button_of_Cleaning_Contract_for_Certified_Cleaning_Service_in_Green_Cleaning_Policy() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/AddFile_UploadCleaningContract_Option2/p_Upload the Cleaning Contract'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/AddFile_UploadCleaningContract_Option2/p_Upload the Cleaning Contract'), 30)
	}

	@Then("User uploads file of Cleaning Contract for Certified Cleaning Service in Green Cleaning Policy")
	public void user_uploads_file_of_Cleaning_Contract_for_Certified_Cleaning_Service_in_Green_Cleaning_Policy() {

		String uploadButton = "Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/AddFile_UploadCleaningContract_Option2/Button_UploadCleaningContract"
		String inputUploadFile = "Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/AddFile_UploadCleaningContract_Option2/input_UploadCleaningContract"

		new projectKeywords().uploadMultipleFiles(uploadButton,inputUploadFile )
	}

	@Given("User should be able to see the textbox for green cleaning service is certified by")
	public void user_should_be_able_to_see_the_textbox_for_green_cleaning_service_is_certified_by() {

		boolean greenCleaningService = WebUI.verifyElementPresent(findTestObject('Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/TextBox_Option2/input_TextBox_GreenCleaningService'), 30)
		if (greenCleaningService == true){
			println "textbox for green cleaning service is present"
		}
		else {
			println "textbox for green cleaning service is not present"
		}
	}

	static String green_cleaningService
	@When("User enters the green cleaning service is certified by")
	public void user_enters_the_green_cleaning_service_is_certified_by() {

		green_cleaningService = 1141
		WebUI.setText(findTestObject('Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/TextBox_Option2/input_TextBox_GreenCleaningService'), green_cleaningService)
	}

	String enterdValue
	@Then("User should be able to see the entered value in green cleaning service is certified by")
	public void user_should_be_able_to_see_the_entered_value_in_green_cleaning_service_is_certified_by() {

		WebUI.delay(3)
		//WebUI.scrollToElement(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/Upload_shielding information/p_Upload shielding information'), 30)

		enterdValue = WebUI.getAttribute(findTestObject('Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/TextBox_Option2/input_TextBox_GreenCleaningService'), 'value')
		println "The entered Value is "+ enterdValue
		println "The green_cleaningService is " + green_cleaningService
		WebUI.verifyMatch(green_cleaningService, enterdValue, false)
	}

	@Given("User should be able to see the Add File button of information showing the contractor’s GS-42 for Certified Cleaning Service in Green Cleaning Policy")
	public void user_should_be_able_to_see_the_Add_File_button_of_information_showing_the_contractor_s_GS_for_Certified_Cleaning_Service_in_Green_Cleaning_Policy() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/AddFile_UploadInfoShowingContract_Option2/p_Upload the information showing the contractors'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/AddFile_UploadInfoShowingContract_Option2/p_Upload the information showing the contractors'), 30)
	}

	@Then("User uploads file of information showing the contractor’s GS-42 for Certified Cleaning Service in Green Cleaning Policy")
	public void user_uploads_file_of_information_showing_the_contractor_s_GS_for_Certified_Cleaning_Service_in_Green_Cleaning_Policy() {

		String uploadButton = "Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/AddFile_UploadInfoShowingContract_Option2/Button_UploadInfoShowingContract"
		String inputUploadFile = "Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/AddFile_UploadInfoShowingContract_Option2/input_UploadInfoShowingContract"

		new projectKeywords().uploadMultipleFiles(uploadButton,inputUploadFile )
	}

	@Then("User has to verify Uploaded the Cleaning Contract with downloaded pdf file in Green Cleaning Policy Form")
	public void user_has_to_verify_Uploaded_the_Cleaning_Contract_with_downloaded_pdf_file_in_Green_Cleaning_Policy_Form() {

		//String xpathid="//*[@id=\"greenCleaningPolicyDocs_files\" or @id=\"contractDocs_files\"]/table[@class=\"ui collapsing celled table unstackable\"]/tbody"
		String xpathid=GCP_PageObjectClass.table_Xpath_GCP
		String scroll1='Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/AddFile_UploadCleaningContract_Option2/p_Upload the Cleaning Contract'
		String iframe='Object Repository/GreenCleaningPolicy/iframe'
		new projectKeywords().compareUploadedFileWithPDF(xpathid,scroll1,iframe)
		WebUI.switchToDefaultContent()

		WebUI.delay(2)
	}

	@And("User had to verify the data in green cleaning service is certified by with downloaded pdf file")
	public void user_had_to_verify_the_data_in_green_cleaning_service_is_certified_by_with_downloaded_pdf_file() {

		def greenCleaningService = WebUI.getAttribute(findTestObject('Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/TextBox_Option2/input_TextBox_GreenCleaningService'), 'value')
		println "The Percenatge value in the form is " +greenCleaningService
		PDFUtil pdfUtil1 = new PDFUtil();
		String path = RunConfiguration.getProjectDir() + '/Include/TestData/DownloadedFiles/creditForm.pdf'
		String file = pdfUtil1.getText(path,1)
		WebUI.delay(3)
		println(file)

		if(file.contains(greenCleaningService)) {
			println("The value in the precentage text is found in the pdf --> Found")
		}
		else {
			println("The value in the precentage text is not found in the pdf --> Not Found")
		}
	}

	@And("User has to verify Uploaded the information showing the contractor’s GS-42 with downloaded pdf file in Green Cleaning Policy Form")
	public void user_has_to_verify_Uploaded_the_information_showing_the_contractor_s_GS_CIMS_GB_or_local_equivalent_certification_with_downloaded_pdf_file_in_Green_Cleaning_Policy_Form() {

		//String xpathid="//*[@id=\"contractorCertDocs_files\"]/table[@class=\"ui collapsing celled table unstackable\"]/tbody"
		String xpathid=GCP_PageObjectClass.table_Xpath_information_GCP
		String scroll1='Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/AddFile_UploadInfoShowingContract_Option2/p_Upload the information showing the contractors'
		String iframe='Object Repository/GreenCleaningPolicy/iframe'
		new projectKeywords().compareUploadedFileWithPDF(xpathid,scroll1,iframe)
		WebUI.switchToDefaultContent()

		WebUI.delay(2)
	}

	@And("User changes the status to mark for review for GCP form")
	public void user_changes_the_status_to_mark_for_review(){

		WebUI.delay(2)
		println "Form refreshed and waited for the delay"
		WebUI.back()
		println "Back to previous page"
		WebUI.delay(2)
		println "Back to previous page and given delay"

		String status =	WebUI.getText(findTestObject("Object Repository/GreenCleaningPolicy/h3_Status"))

		if (status == "ATTEMPTED"){
			println "Inside the if"
			WebUI.click(findTestObject("Object Repository/GreenCleaningPolicy/a_MarkReadyForReview"))
			//	WebUI.click(findTestObject("Object Repository/Page_LEED Online/a_Submit"))
			WebUI.delay(5)
		}

		String changed_Status =	WebUI.getText(findTestObject("Object Repository/GreenCleaningPolicy/h3_Status"))
		println "######################### changed_Status " + changed_Status
		String path = RunConfiguration.getProjectDir()+ '/Include/TestData/DownloadedFiles'
		new projectKeywords().deleteDownloadedFiles(path)
	}
}