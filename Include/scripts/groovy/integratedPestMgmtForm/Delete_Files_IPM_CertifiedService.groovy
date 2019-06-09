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

import leedOnlineKeywords.projectKeywords
import integratedPestMgmtForm.IPM_PageObjectClass


class Delete_Files_IPM_CertifiedService {
	/**
	 * Deleteing the uploaded files in Integrated Pest Management Certified IPM Service --- Started
	 */

	@When("User deletes the uploaded files of integrated pest management service contract")
	public void user_deletes_the_uploaded_files_of_integrated_pest_management_service_contract() {

		String tableRow = IPM_PageObjectClass.tableRow_Xpath_IPM_ServiceContract
		String tableId = IPM_PageObjectClass.tableId_Xpath_IPM_ServiceContract
		String scrollTo = "Object Repository/IntegratedPestMgmt/Option_IPMService/AddFile_IntegratedPestMngnt/p_IntegratedPestMngnt"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo)
	}

	@Then("User can see all the integrated pest management service contract files are deleted")
	public void user_can_see_all_the_integrated_pest_management_service_contract_files_are_deleted() {

		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMService/AddFile_IntegratedPestMngnt/table_IPM_ServiceContract'), 30)
	}


	@When("User deletes the uploaded files of the information showing the contractor’s GreenPro, EcoWise, GreenShield")
	public void user_deletes_the_uploaded_files_of_the_information_showing_the_contractor_s_GreenPro_EcoWise_GreenShield() {

		String tableRow = IPM_PageObjectClass.tableRow_Xpath_GreenPro_Certification
		String tableId = IPM_PageObjectClass.tableId_Xpath_GreenPro_Certification
		String scrollTo = "Object Repository/IntegratedPestMgmt/Option_IPMService/AddFile_GreenPro/p_AddFile"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo)
	}

	@Then("User can see all the the information showing the contractor’s GreenPro, EcoWise, GreenShield files are deleted")
	public void user_can_see_all_the_the_information_showing_the_contractor_s_GreenPro_EcoWise_GreenShield_files_are_deleted() {

		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/IntegratedPestMgmt/Option_IPMService/AddFile_GreenPro/table_GreenPro'), 30)
	}

	@When("User deletes the uploaded files of special circumstances for Integrated Pest Management")
	public void user_deletes_the_uploaded_files_of_special_circumstances_for_Integrated_Pest_Management() {

		String tableRow = IPM_PageObjectClass.tableRow_Xpath_SpecialCircumstances
		String tableId = IPM_PageObjectClass.tableId_Xpath_SpecialCircumstances
		String scrollTo = "Object Repository/IntegratedPestMgmt/SpecialCircumstances/SC_AddFile/p_Upload_AddDoc_SC"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo)
	}

	@Then("User can see all the special circumstances for Integrated Pest Management files are deleted")
	public void user_can_see_all_the_special_circumstances_for_Integrated_Pest_Management_files_are_deleted() {

		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/IntegratedPestMgmt/SpecialCircumstances/SC_AddFile/table_SplCircum'), 30)
	}

	/**
	 * Deleteing the uploaded files in Integrated Pest Management Certified IPM Service --- Ended
	 */
}