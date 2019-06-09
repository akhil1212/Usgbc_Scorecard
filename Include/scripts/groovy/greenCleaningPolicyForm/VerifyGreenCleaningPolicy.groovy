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



public class VerifyGreenCleaningPolicy {
	/**
	 * In-house Green Cleaning Policy (Option 1)
	 */

	String fileName
	@Given("User has to see the table of uploaded files on Green Cleaning Policy")
	public void user_has_to_see_the_table_of_uploaded_files_on_Green_Cleaning_Policy() {

		WebUI.callTestCase(findTestCase('Test Cases/GreenCleaningPolicy/TC_NavigateToGCP'), null, FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Object Repository/GreenCleaningPolicy/Option1_GreenCleanPlcy/input_Option1_Radiobtn'))
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/GreenCleaningPolicy/Option1_GreenCleanPlcy/Table_UploadGreenCleaningPolicy'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/GreenCleaningPolicy/Option1_GreenCleanPlcy/Table_UploadGreenCleaningPolicy'), 30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table of the Green Cleaning Policy")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_the_Green_Cleaning_Policy() {

		String tableRow = GCP_PageObjectClass.tableRow_Xpath_GCP
		String tableId = GCP_PageObjectClass.tableId_Xpath_GCP
		new projectKeywords().verifyUploadedFiles(tableRow,tableId)


		//		String xpath_Shielding_Information="//*[@id='greenCleaningPolicyDocs_files']/table/tbody/tr"
		//		int count = (new projectKeywords()).countRowsPerPage(xpath_Shielding_Information)
		//		println "Count in table : "+count
		//
		//		for(def row=1;row<=count ;row++){
		//			int k=row
		//			WebUI.switchToFrame(findTestObject('Object Repository/GreenCleaningPolicy/iframe'), 5)
		//			TestObject name = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="greenCleaningPolicyDocs_files"]/table/tbody/tr['+k+']/td[1]', true)
		//			//	println "File name is : "+fileName
		//
		//			fileName = WebUI.getText(name)
		//			println "File name in the table is : "+ fileName
		//			println "Excel Entering"
		//
		//			String excelFileName =(new projectKeywords()).CompareExcel(fileName,"UploadedData/UploadedFileNames","FileNames")
		//			println "File name in the excel is : "+ excelFileName
		//			WebUI.switchToDefaultContent()
		//			WebUI.verifyMatch(excelFileName, fileName, false)
		//		}
	}

	@Given("User has to see the table of uploaded files on special circumstances for In-house green cleaning policy in GCP")
	public void user_has_to_see_the_table_of_uploaded_files_on_special_circumstances_for_In_house_green_cleaning_policy_in_GCP() {

		WebUI.scrollToElement(findTestObject('Object Repository/GreenCleaningPolicy/SpecialCircumstances/Table_SpecialCircum'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/GreenCleaningPolicy/SpecialCircumstances/Table_SpecialCircum'), 30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table of special circumstances for In-house green cleaning policy in GCP")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_special_circumstances_for_In_house_green_cleaning_policy_in_GCP() {

		String tableRow = GCP_PageObjectClass.tableRow_Xpath_SplCircum_GCP
		String tableId = GCP_PageObjectClass.tableId_Xpath_SplCircum_GCP
		new projectKeywords().verifyUploadedFiles(tableRow,tableId)

		//		String xpath_Shielding_Information="//*[@id='splCircumstancesDocs_files']/table/tbody/tr"
		//		int count = (new projectKeywords()).countRowsPerPage(xpath_Shielding_Information)
		//		println "Count in table : "+count
		//
		//		for(def row=1;row<=count ;row++){
		//			int k=row
		//			WebUI.switchToFrame(findTestObject('Object Repository/GreenCleaningPolicy/iframe'), 5)
		//			TestObject name = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="splCircumstancesDocs_files"]/table/tbody/tr['+k+']/td[1]', true)
		//			//	println "File name is : "+fileName
		//
		//			fileName = WebUI.getText(name)
		//			println "File name in the table is : "+ fileName
		//			println "Excel Entering"
		//
		//			String excelFileName =(new projectKeywords()).CompareExcel(fileName,"UploadedData/UploadedFileNames","FileNames")
		//			println "File name in the excel is : "+ excelFileName
		//			WebUI.switchToDefaultContent()
		//			WebUI.verifyMatch(excelFileName, fileName, false)
		//		}
	}

	/**
	 * Certified cleaning service(Option 2)
	 */

	@Given("User has to see the table of uploaded files on Cleaning Contract")
	public void user_has_to_see_the_table_of_uploaded_files_on_Cleaning_Contract() {

		WebUI.callTestCase(findTestCase('Test Cases/GreenCleaningPolicy/TC_NavigateToGCP'), null, FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/input_Option 2_RadioBtn'))
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/Table_CleaningContract'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/Table_CleaningContract'), 30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table of Cleaning Contract")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_Cleaning_Contract() {

		String tableRow = GCP_PageObjectClass.tableRow_Xpath_GCP
		String tableId = GCP_PageObjectClass.tableId_Xpath_GCP
		new projectKeywords().verifyUploadedFiles(tableRow,tableId)

		//		String xpath_Shielding_Information="//*[@id='greenCleaningPolicyDocs_files']/table/tbody/tr"
		//		int count = (new projectKeywords()).countRowsPerPage(xpath_Shielding_Information)
		//		println "Count in table : "+count
		//
		//		for(def row=1;row<=count ;row++){
		//			int k=row
		//			WebUI.switchToFrame(findTestObject('Object Repository/GreenCleaningPolicy/iframe'), 5)
		//			TestObject name = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="greenCleaningPolicyDocs_files"]/table/tbody/tr['+k+']/td[1]', true)
		//			//	println "File name is : "+fileName
		//
		//			fileName = WebUI.getText(name)
		//			println "File name in the table is : "+ fileName
		//			println "Excel Entering"
		//
		//			String excelFileName =(new projectKeywords()).CompareExcel(fileName,"UploadedData/UploadedFileNames","FileNames")
		//			println "File name in the excel is : "+ excelFileName
		//			WebUI.switchToDefaultContent()
		//			WebUI.verifyMatch(excelFileName, fileName, false)
		//		}
	}

	@Given("User has to see the table of uploaded files on information showing the contractor’s GS-42 for Certified cleaning service in GCP")
	public void user_has_to_see_the_table_of_uploaded_files_on_information_showing_the_contractor_s_GS_for_Certified_cleaning_service_in_GCP() {

		WebUI.scrollToElement(findTestObject('Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/Table_UploadInfoShowingContract'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/Table_UploadInfoShowingContract'), 30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table of information showing the contractor’s GS-42 for Certified cleaning service in GCP")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_information_showing_the_contractor_s_GS_for_Certified_cleaning_service_in_GCP() {


		String tableRow = GCP_PageObjectClass.tableRow_Xpath_information_GCP
		String tableId = GCP_PageObjectClass.tableId_Xpath_information_GCP
		new projectKeywords().verifyUploadedFiles(tableRow,tableId)


		//		String xpath_Shielding_Information="//*[@id='contractorCertDocs_files']/table/tbody/tr"
		//		int count = (new projectKeywords()).countRowsPerPage(xpath_Shielding_Information)
		//		println "Count in table : "+count
		//
		//		for(def row=1;row<=count ;row++){
		//			int k=row
		//			WebUI.switchToFrame(findTestObject('Object Repository/GreenCleaningPolicy/iframe'), 5)
		//			TestObject name = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="contractorCertDocs_files"]/table/tbody/tr['+k+']/td[1]', true)
		//			//	println "File name is : "+fileName
		//
		//			fileName = WebUI.getText(name)
		//			println "File name in the table is : "+ fileName
		//			println "Excel Entering"
		//
		//			String excelFileName =(new projectKeywords()).CompareExcel(fileName,"UploadedData/UploadedFileNames","FileNames")
		//			println "File name in the excel is : "+ excelFileName
		//			WebUI.switchToDefaultContent()
		//			WebUI.verifyMatch(excelFileName, fileName, false)
		//		}
	}
}
