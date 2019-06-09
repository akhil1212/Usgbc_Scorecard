package integratedPestMgmtForm
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

import integratedPestMgmtForm.IPM_PageObjectClass
import leedOnlineKeywords.projectKeywords


class Verify_Files_IPM_CertifiedService {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	
	@Given("User has to see the table of uploaded files on integrated pest management service contract")
	public void user_has_to_see_the_table_of_uploaded_files_on_integrated_pest_management_service_contract() {
		
		WebUI.callTestCase(findTestCase('Test Cases/IntegratedPestManagement/TC_NavigateToIPM'), null, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject("Object Repository/IntegratedPestMgmt/Option_IPMService/Input_Option2_RadioBtn"))
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMService/AddFile_IntegratedPestMngnt/table_IPM_ServiceContract'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMService/AddFile_IntegratedPestMngnt/table_IPM_ServiceContract'), 30)
	}
	
	@Then("User verifies the file name uploaded with the file name present in the table of integrated pest management service contract")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_integrated_pest_management_service_contract() {
		
		String tableRow = IPM_PageObjectClass.tableRow_Xpath_IPM_ServiceContract
		String tableId = IPM_PageObjectClass.tableId_Xpath_IPM_ServiceContract
		new projectKeywords().verifyUploadedFiles(tableRow,tableId)
	}
	
	@Given("User has to see the table of uploaded files on the information showing the contractor’s GreenPro, EcoWise, GreenShield")
	public void user_has_to_see_the_table_of_uploaded_files_on_the_information_showing_the_contractor_s_GreenPro_EcoWise_GreenShield() {
		
		WebUI.scrollToElement(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMService/AddFile_GreenPro/table_GreenPro'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMService/AddFile_GreenPro/table_GreenPro'), 30)
	}
	
	@Then("User verifies the file name uploaded with the file name present in the table of the information showing the contractor’s GreenPro, EcoWise, GreenShield")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_the_information_showing_the_contractor_s_GreenPro_EcoWise_GreenShield() {
		
		
		String tableRow = IPM_PageObjectClass.tableRow_Xpath_GreenPro_Certification
		String tableId = IPM_PageObjectClass.tableId_Xpath_GreenPro_Certification
		new projectKeywords().verifyUploadedFiles(tableRow,tableId)
	}
	
	@Given("User has to see the table of uploaded files on special circumstances for Integrated Pest Management")
	public void user_has_to_see_the_table_of_uploaded_files_on_special_circumstances_for_Integrated_Pest_Management() {
		WebUI.scrollToElement(findTestObject('Object Repository/IntegratedPestMgmt/SpecialCircumstances/SC_AddFile/table_SplCircum'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedPestMgmt/SpecialCircumstances/SC_AddFile/table_SplCircum'), 30)
	}
	
	@Then("User verifies the file name uploaded with the file name present in the table of special circumstances for Integrated Pest Management")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_special_circumstances_for_Integrated_Pest_Management() {
		String tableRow = IPM_PageObjectClass.tableRow_Xpath_SpecialCircumstances
		String tableId = IPM_PageObjectClass.tableId_Xpath_SpecialCircumstances
		new projectKeywords().verifyUploadedFiles(tableRow,tableId)
	}
}