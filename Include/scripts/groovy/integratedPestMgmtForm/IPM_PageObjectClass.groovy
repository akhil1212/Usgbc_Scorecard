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


public class IPM_PageObjectClass {
	/**
	 * The Xpath for the In-house IPM Program tables are declared here  ----- Option 1 -- Started
	 */

	//static String  table_Xpath_Integrated_Pest_Mgmt_Plan = "//*[@id='pestMangePlanDocs_files']/table/tbody"
	static String  table_Xpath_Integrated_Pest_Mgmt_Plan = "//*[@id='pestMangePlanDocs_files' or @id='contractDocs_files']/table/tbody"
	static String table_Xpath_Examples_Documentation = "//*[@id='pestControlStrategiesDocs_files']/table/tbody"
	//static String  table_Xpath_PestcideAppList = "//*[@id='pesticideAppList_files']/table/tbody"
	static String  table_Xpath_PestcideAppList = "//*[@id='pesticideAppList_files' or @id='contractorCertDocs_files']/table/tbody"
	static String table_Xpath_SpecialCircumstances = "//*[@id='splCircumstancesDocs_files']/table/tbody"


	//static String tableId_Xpath_Integrated_PMP = "pestMangePlanDocs_files"
	static String tableId_Xpath_Integrated_PMP = "@id='pestMangePlanDocs_files' or @id='contractDocs_files'"
	static String tableId_Xpath_Examples_Documentation = "@id='pestControlStrategiesDocs_files'"
	//static String  tableId_Xpath_PestcideAppList = "pesticideAppList_files"
	static String  tableId_Xpath_PestcideAppList = "@id='pesticideAppList_files' or @id='contractorCertDocs_files'"
	static String tableId_Xpath_SpecialCircumstances = "@id='splCircumstancesDocs_files'"


	//static String tableRow_Xpath_Integrated_PMP = "//*[@id='pestMangePlanDocs_files']/table/tbody/tr"
	static String tableRow_Xpath_Integrated_PMP = "//*[@id='pestMangePlanDocs_files' or @id='contractDocs_files']/table/tbody/tr"
	static String tableRow_Xpath_Examples_Documentation = "//*[@id='pestControlStrategiesDocs_files']/table/tbody/tr"
	//static String  tableRow_Xpath_PestcideAppList = "//*[@id='pesticideAppList_files']/table/tbody/tr"
	static String  tableRow_Xpath_PestcideAppList = "//*[@id='pesticideAppList_files' or @id='contractorCertDocs_files']/table/tbody/tr"
	static String tableRow_Xpath_SpecialCircumstances = "//*[@id='splCircumstancesDocs_files']/table/tbody/tr"



	/**
	 * The Xpath for the In-house IPM Program tables are declared here  ----- Option 1 -- Ended
	 */




	/**
	 * The Xpath for the Certified IPM Service tables are declared here  ----- Option 2 -- Started
	 */
	//static String  table_Xpath_GreenPro_Certification = "//*[@id='pesticideAppList_files']/table/tbody"
	// static String  table_Xpath_IPM_ServiceContract = "//*[@id='pestMangePlanDocs_files']/table/tbody"

	static String  table_Xpath_GreenPro_Certification = "//*[@id='pesticideAppList_files' or @id='contractorCertDocs_files']/table/tbody"
	static String  table_Xpath_IPM_ServiceContract = "//*[@id='pestMangePlanDocs_files' or @id='contractDocs_files']/table/tbody"

	// static String  tableId_Xpath_GreenPro_Certification = "pesticideAppList_files"
	// static String  tableId_Xpath_IPM_ServiceContract = "pestMangePlanDocs_files"

	static String  tableId_Xpath_GreenPro_Certification = "@id='pesticideAppList_files' or @id='contractorCertDocs_files'"
	static String  tableId_Xpath_IPM_ServiceContract = "@id='pestMangePlanDocs_files' or @id='contractDocs_files'"

	// static String  tableRow_Xpath_GreenPro_Certification = "//*[@id='pesticideAppList_files']/table/tbody/tr"
	// static String  tableRow_Xpath_IPM_ServiceContract = "//*[@id='pestMangePlanDocs_files']/table/tbody/tr"

	static String  tableRow_Xpath_GreenPro_Certification = "//*[@id='pesticideAppList_files' or @id='contractorCertDocs_files']/table/tbody/tr"
	static String  tableRow_Xpath_IPM_ServiceContract = "//*[@id='pestMangePlanDocs_files' or @id='contractDocs_files']/table/tbody/tr"

	/**
	 * The Xpath for the Certified IPM Service tables are declared here  ----- Option 2 -- Started
	 */
}