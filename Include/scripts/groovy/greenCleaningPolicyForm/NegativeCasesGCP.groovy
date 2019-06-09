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

class NegativeCasesGCP {

	@Given("User should be In-house green cleaning policy option")
	public void user_should_be_In_house_green_cleaning_policy_option() {

		WebUI.callTestCase(findTestCase('Test Cases/GreenCleaningPolicy/TC_NavigateToGCP'), null, FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Object Repository/GreenCleaningPolicy/Option1_GreenCleanPlcy/input_Option1_Radiobtn'))
		WebUI.delay(2)
	}

	@When("User clicks on save button without entering any data in GCP")
	public void user_clicks_on_save_button_without_entering_any_data_in_GCP() {

		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/GreenCleaningPolicy/button_Save'))
	}

	@Given("User should be able to see the Add File button of Green Cleaning Policy")
	public void user_should_be_able_to_see_the_Add_File_button_of_Green_Cleaning_Policy() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/GreenCleaningPolicy/Option1_GreenCleanPlcy/AddFile_UploadGreenCleaningPlcy_Option1/p_Upload the Green Cleaning Policy'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/GreenCleaningPolicy/Option1_GreenCleanPlcy/AddFile_UploadGreenCleaningPlcy_Option1/p_Upload the Green Cleaning Policy'), 30)
	}

	@When("User uploads a file which is greater than 100mb of Green Cleaning Policy (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_Green_Cleaning_Policy_MBfile_pdf(String Green_Cleaning) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+Green_Cleaning
		println ("######################"+ myPdffilePath)

		WebUI.scrollToElement(findTestObject('Object Repository/GreenCleaningPolicy/Option1_GreenCleanPlcy/AddFile_UploadGreenCleaningPlcy_Option1/p_Upload the Green Cleaning Policy'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/GreenCleaningPolicy/Option1_GreenCleanPlcy/AddFile_UploadGreenCleaningPlcy_Option1/input_UploadGreenCleaningPlcy'), myPdffilePath)
	}


	@When("User uploads a file of Green_Cleaning (.*)")
	public void user_uploads_a_file_of_Green_Cleaning_MBfile_doc(String Green_Cleaning) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+Green_Cleaning
		println ("######################"+ myPdffilePath)

		WebUI.scrollToElement(findTestObject('Object Repository/GreenCleaningPolicy/Option1_GreenCleanPlcy/AddFile_UploadGreenCleaningPlcy_Option1/p_Upload the Green Cleaning Policy'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/GreenCleaningPolicy/Option1_GreenCleanPlcy/AddFile_UploadGreenCleaningPlcy_Option1/input_UploadGreenCleaningPlcy'), myPdffilePath)
	}

	@Then("User clicks on save while the file is uploading in GCP")
	public void user_clicks_on_save_while_the_file_is_uploading_in_GCP() {

		WebUI.scrollToElement(findTestObject("Object Repository/LightPollutionReduction/FixtureShielding/Saveform/btn_Save"), 30)
		WebUI.click(findTestObject("Object Repository/LightPollutionReduction/FixtureShielding/Saveform/btn_Save"))
	}

	@When("User uploads a file which is greater than 100mb of special circumstances for In-house green cleaning policy in Green Cleaning Policy (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_special_circumstances_for_In_house_green_cleaning_policy_in_Green_Cleaning_Policy_MBfile_pdf(String Spl_Circ ) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+Spl_Circ
		println ("######################"+ myPdffilePath)

		WebUI.scrollToElement(findTestObject('Object Repository/GreenCleaningPolicy/SpecialCircumstances/AddFile_UploadAddtionalDoc_SC/p_Upload any additional documentation that supports'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/GreenCleaningPolicy/SpecialCircumstances/AddFile_UploadAddtionalDoc_SC/input_UploadAdditionalDoc_SC'), myPdffilePath)
	}

	@When("User uploads a file of special circumstances for In-house green cleaning policy in Green Cleaning Policy (.*)")
	public void user_uploads_a_file_of_special_circumstances_for_In_house_green_cleaning_policy_in_Green_Cleaning_Policy_MBfile_doc(String Spl_Circ) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+Spl_Circ
		println ("######################"+ myPdffilePath)

		WebUI.scrollToElement(findTestObject('Object Repository/GreenCleaningPolicy/SpecialCircumstances/AddFile_UploadAddtionalDoc_SC/p_Upload any additional documentation that supports'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/GreenCleaningPolicy/SpecialCircumstances/AddFile_UploadAddtionalDoc_SC/input_UploadAdditionalDoc_SC'), myPdffilePath)
	}

	@Then("User clicks on clear draft and confirms in GCP")
	public void user_clicks_on_clear_draft_and_confirms_in_GCP() {

		WebUI.delay(1)
		WebUI.click(findTestObject("Object Repository/GreenCleaningPolicy/a_Clear draft"))
		WebUI.click(findTestObject("Object Repository/GreenCleaningPolicy/button_Yes"))
		WebUI.delay(2)
	}

	/**
	 *  Certified cleaning service (Option 2)
	 */

	//	@Given("User should be able to see the Add File button of Cleaning Contract")
	//	public void user_should_be_able_to_see_the_Add_File_button_of_Cleaning_Contract() {
	//
	//	}

	@When("User uploads a file which is greater than 100mb of Cleaning Contract (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_Cleaning_Contract_MBfile_pdf(String Green_Cleaning) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+Green_Cleaning
		println ("######################"+ myPdffilePath)

		WebUI.scrollToElement(findTestObject('Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/AddFile_UploadCleaningContract_Option2/p_Upload the Cleaning Contract'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/AddFile_UploadCleaningContract_Option2/input_UploadCleaningContract'), myPdffilePath)

	}

	@When("User uploads a file of Cleaning Contract (.*)")
	public void user_uploads_a_file_of_Cleaning_Contract_MBfile_doc(String Green_Cleaning) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+Green_Cleaning
		println ("######################"+ myPdffilePath)

		WebUI.scrollToElement(findTestObject('Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/AddFile_UploadCleaningContract_Option2/p_Upload the Cleaning Contract'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/AddFile_UploadCleaningContract_Option2/input_UploadCleaningContract'), myPdffilePath)

	}

	//	@Given("User should be able to see the Add File button of information showing the contractor’s GS-42 for Certified cleaning service in Green Cleaning Policy")
	//	public void user_should_be_able_to_see_the_Add_File_button_of_information_showing_the_contractor_s_GS_for_Certified_cleaning_service_in_Green_Cleaning_Policy() {
	//
	//	}

	@When("User uploads a file which is greater than 100mb of information showing the contractor’s GS-42 for Certified cleaning service in Green Cleaning Policy (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_information_showing_the_contractor_s_GS_for_Certified_cleaning_service_in_Green_Cleaning_Policy_MBfile_pdf(String info_showing) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+info_showing
		println ("######################"+ myPdffilePath)

		WebUI.scrollToElement(findTestObject('Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/AddFile_UploadInfoShowingContract_Option2/p_Upload the information showing the contractors'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/AddFile_UploadInfoShowingContract_Option2/input_UploadInfoShowingContract'), myPdffilePath)

	}

	@When("User uploads a file of special circumstances for information showing the contractor’s GS-42 for Certified cleaning service in Green Cleaning Policy (.*)")
	public void user_uploads_a_file_of_special_circumstances_for_information_showing_the_contractor_s_GS_for_Certified_cleaning_service_in_Green_Cleaning_Policy_MBfile_doc(String info_showing) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+info_showing
		println ("######################"+ myPdffilePath)

		WebUI.scrollToElement(findTestObject('Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/AddFile_UploadInfoShowingContract_Option2/p_Upload the information showing the contractors'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/AddFile_UploadInfoShowingContract_Option2/input_UploadInfoShowingContract'), myPdffilePath)

	}
	
	static String txt_dataGCP
	@When("User enters data more than {int} characters in green cleaning service is certified by")
	public void user_enters_data_more_than_characters_in_green_cleaning_service_is_certified_by(Integer int1) {
		txt_dataGCP = "I am trying to capture the Error that comes after entering the characters more than 100 as it allows only 100 characters"
		
		WebUI.setText(findTestObject('Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/TextBox_Option2/input_TextBox_GreenCleaningService'), txt_dataGCP)
		}
	String enterdValue
	@Then("User should not be able to see the complete entered value in green cleaning service is certified by")
	public void user_should_not_be_able_to_see_the_complete_entered_value_in_green_cleaning_service_is_certified_by() {
	   
		enterdValue = WebUI.getAttribute(findTestObject('Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/TextBox_Option2/input_TextBox_GreenCleaningService'), 'value')
		println "The entered Value is "+ enterdValue
		println "The txt_PersentIncrease is " + txt_dataGCP
		WebUI.verifyNotMatch(txt_dataGCP, enterdValue, false)
	}
	
	@When("User enters the data Zero for green cleaning service is certified by")
	public void user_enters_the_data_Zero_for_green_cleaning_service_is_certified_by() {
	   
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/MultipleFileDiffExt/ZZ.pdf'
		println myPdffilePath
		
		WebUI.delay(5)
		WebUI.uploadFile(findTestObject('Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/AddFile_UploadCleaningContract_Option2/input_UploadCleaningContract'),myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/AddFile_UploadInfoShowingContract_Option2/input_UploadInfoShowingContract'), myPdffilePath)
		

		txt_dataGCP = "0"
		
		WebUI.setText(findTestObject('Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/TextBox_Option2/input_TextBox_GreenCleaningService'), txt_dataGCP)
	}
	
	@When("User checks the error message saying Please fix the highlighted errors will be displayed in GCP")
	public void user_checks_the_error_message_saying_Please_fix_the_highlighted_errors_will_be_displayed() {
	   
		WebUI.delay(2)
		boolean str =	WebUI.verifyTextPresent("Please fix the highlighted errors.", false)
		println "###########" + str
		WebUI.delay(2)
		
		String tableRow = GCP_PageObjectClass.tableRow_Xpath_GCP
		String tableId = GCP_PageObjectClass.tableId_Xpath_GCP
		String scrollTo = "Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/AddFile_UploadCleaningContract_Option2/p_Upload the Cleaning Contract"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo)

		
		String tableRow1 = GCP_PageObjectClass.tableRow_Xpath_information_GCP
		String tableId1 = GCP_PageObjectClass.tableId_Xpath_information_GCP
		String scrollTo1 = "Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/AddFile_UploadInfoShowingContract_Option2/p_Upload the information showing the contractors"

		new projectKeywords().deleteUploadedFiles(tableRow1, tableId1, scrollTo1)
	}

}