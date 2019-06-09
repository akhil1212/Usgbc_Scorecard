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

import integratedPestMgmtForm.IPM_PageObjectClass
import leedOnlineKeywords.projectKeywords


class NegativeCases_IPM_CertifiedService {
	/**
	 * Checking the negative test cases for the uploads in Certified IPM Service -- Option-2 ---- Started
	 */

	@Given("User should be Certfied IPM Services option")
	public void user_should_be_Certfied_IPM_Services_option() {

		WebUI.callTestCase(findTestCase('Test Cases/IntegratedPestManagement/TC_NavigateToIPM'), null, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject("Object Repository/IntegratedPestMgmt/Option_IPMService/Input_Option2_RadioBtn"))
		WebUI.delay(2)
	}

	static String txt_dataIPM
	@When("User enters the data more than {int} characters for integrated pest management service is certified and in good standing with")
	public void user_enters_the_data_more_than_characters_for_integrated_pest_management_service_is_certified_and_in_good_standing_with(Integer int1) {

		txt_dataIPM = "I am trying to capture the Error that comes after entering the characters more than 100 as it allows only 100 characters"
		WebUI.setText(findTestObject("Object Repository/IntegratedPestMgmt/Option_IPMService/Input_IntegratedPMService"), txt_dataIPM)
	}

	String enterdValue
	@Then("User should not be able to see the complete entered value in integrated pest management service is certified and in good standing with")
	public void user_should_not_be_able_to_see_the_complete_entered_value_in_integrated_pest_management_service_is_certified_and_in_good_standing_with() {

		enterdValue = WebUI.getAttribute(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMService/Input_IntegratedPMService'), 'value')
		println "The entered Value is "+ enterdValue
		println "The txt_PersentIncrease is " + txt_dataIPM
		WebUI.verifyNotMatch(txt_dataIPM, enterdValue, false)
	}

	@When("User enters the data Zero for integrated pest management service is certified and in good standing with")
	public void user_enters_the_data_Zero_for_integrated_pest_management_service_is_certified_and_in_good_standing_with() {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/MultipleFileDiffExt/ZZ.pdf'
		println myPdffilePath

		WebUI.scrollToElement(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMService/AddFile_IntegratedPestMngnt/p_IntegratedPestMngnt'), 2)
		WebUI.uploadFile(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMService/AddFile_IntegratedPestMngnt/Input_AddFile'),myPdffilePath )
		WebUI.uploadFile(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMService/AddFile_GreenPro/Input_AddFile'), myPdffilePath)

		String txt_dataIPM_Zero = "0"
		WebUI.setText(findTestObject("Object Repository/IntegratedPestMgmt/Option_IPMService/Input_IntegratedPMService"), txt_dataIPM_Zero)
	}

	@Then("User clicks on integrated pest management save button")
	public void user_clicks_on_integrated_pest_management_save_button() {

		WebUI.delay(10)
		WebUI.scrollToElement(findTestObject('Object Repository/IntegratedPestMgmt/Save_Btn'), 30)
		WebUI.click(findTestObject('Object Repository/IntegratedPestMgmt/Save_Btn'))
	}


	@And("User checks the error message saying Please fix the highlighted errors will be displayed")
	public void user_checks_the_error_message_saying_please_fix_the_highlighted_errors_will_be_displayed(){

		WebUI.delay(2)
		boolean str =	WebUI.verifyTextPresent("Please fix the highlighted errors.", false)
		println "###########" + str
		WebUI.delay(2)

		String tableRow = IPM_PageObjectClass.tableRow_Xpath_IPM_ServiceContract
		String tableId = IPM_PageObjectClass.tableId_Xpath_IPM_ServiceContract
		String scrollTo = "Object Repository/IntegratedPestMgmt/Option_IPMService/AddFile_IntegratedPestMngnt/p_IntegratedPestMngnt"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo)

		String tableRow1 = IPM_PageObjectClass.tableRow_Xpath_GreenPro_Certification
		String tableId1 = IPM_PageObjectClass.tableId_Xpath_GreenPro_Certification
		String scrollTo1 = "Object Repository/IntegratedPestMgmt/Option_IPMService/AddFile_GreenPro/p_AddFile"

		new projectKeywords().deleteUploadedFiles(tableRow1, tableId1, scrollTo1)
	}

	@When("User uploads a file which is greater than 100mb of integrated pest management service contract (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_integrated_pest_management_service_contract_MBfile_pdf(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.scrollToElement(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMService/AddFile_IntegratedPestMngnt/p_IntegratedPestMngnt'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMService/AddFile_IntegratedPestMngnt/Input_AddFile'), myPdffilePath)
	}

	@When("User uploads a file of integrated pest management service contract (.*)")
	public void user_uploads_a_file_of_integrated_pest_management_service_contract_MBfile_doc(String FileName) {
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.scrollToElement(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMService/AddFile_IntegratedPestMngnt/p_IntegratedPestMngnt'), 30)
		WebUI.delay(2)
		WebUI.uploadFile(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMService/AddFile_IntegratedPestMngnt/Input_AddFile'), myPdffilePath)
	}

	@When("User uploads a file which is greater than 100mb of the information showing the contractor’s GreenPro, EcoWise, GreenShield (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_the_information_showing_the_contractor_s_GreenPro_EcoWise_GreenShield_MBfile_pdf(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.scrollToElement(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMService/AddFile_GreenPro/p_AddFile'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMService/AddFile_GreenPro/Input_AddFile'), myPdffilePath)
	}

	@When("User uploads a file of the information showing the contractor’s GreenPro, EcoWise, GreenShield (.*)")
	public void user_uploads_a_file_of_the_information_showing_the_contractor_s_GreenPro_EcoWise_GreenShield_MBfile_doc(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.scrollToElement(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMService/AddFile_GreenPro/p_AddFile'), 30)
		WebUI.delay(2)
		WebUI.uploadFile(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMService/AddFile_GreenPro/Input_AddFile'), myPdffilePath)
	}

	@When("User uploads a file which is greater than 100mb of special circumstances for Integrated Pest Management (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_special_circumstances_for_Integrated_Pest_Management_MBfile_pdf(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.scrollToElement(findTestObject('Object Repository/IntegratedPestMgmt/SpecialCircumstances/SC_AddFile/p_Upload_AddDoc_SC'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/IntegratedPestMgmt/SpecialCircumstances/SC_AddFile/input_Addfile'), myPdffilePath)
	}

	@When("User uploads a file of special circumstances for Integrated Pest Management (.*)")
	public void user_uploads_a_file_of_special_circumstances_for_Integrated_Pest_Management_MBfile_doc(String FileName) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.scrollToElement(findTestObject('Object Repository/IntegratedPestMgmt/SpecialCircumstances/SC_AddFile/p_Upload_AddDoc_SC'), 30)
		WebUI.delay(2)
		WebUI.uploadFile(findTestObject('Object Repository/IntegratedPestMgmt/SpecialCircumstances/SC_AddFile/input_Addfile'), myPdffilePath)
	}

	/**
	 * Checking the negative test cases for the uploads in Certified IPM Service -- Option-2 ---- Ended
	 */
}