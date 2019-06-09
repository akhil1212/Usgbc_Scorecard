
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import org.openqa.selenium.remote.HttpCommandExecutor

import org.openqa.selenium.remote.SessionId

import com.kms.katalon.core.testobject.TestObject


def static "leedOnlineKeywords.projectKeywords.generateRandomString"(
    	int strLen	) {
    (new leedOnlineKeywords.projectKeywords()).generateRandomString(
        	strLen)
}

def static "leedOnlineKeywords.projectKeywords.countRowsPerPage"(
    	String xpath	) {
    (new leedOnlineKeywords.projectKeywords()).countRowsPerPage(
        	xpath)
}

def static "leedOnlineKeywords.projectKeywords.isFiledownloaded"(
    	String downloadPath	
     , 	String fileName	) {
    (new leedOnlineKeywords.projectKeywords()).isFiledownloaded(
        	downloadPath
         , 	fileName)
}

def static "leedOnlineKeywords.projectKeywords.deleteDownloadedFiles"(
    	String downloadPath	) {
    (new leedOnlineKeywords.projectKeywords()).deleteDownloadedFiles(
        	downloadPath)
}

def static "leedOnlineKeywords.projectKeywords.Excelcompare"(
    	String Fname	
     , 	String DataFile	
     , 	String ColName	) {
    (new leedOnlineKeywords.projectKeywords()).Excelcompare(
        	Fname
         , 	DataFile
         , 	ColName)
}

def static "leedOnlineKeywords.projectKeywords.CompareExcel"(
    	String Fname	
     , 	String DataFile	
     , 	String ColName	) {
    (new leedOnlineKeywords.projectKeywords()).CompareExcel(
        	Fname
         , 	DataFile
         , 	ColName)
}

def static "leedOnlineKeywords.projectKeywords.setDownloadPath"() {
    (new leedOnlineKeywords.projectKeywords()).setDownloadPath()
}

def static "leedOnlineKeywords.projectKeywords.isFiledelete"(
    	String reportPath	) {
    (new leedOnlineKeywords.projectKeywords()).isFiledelete(
        	reportPath)
}

def static "leedOnlineKeywords.projectKeywords.modifyFile"(
    	String filePath	
     , 	String oldString	
     , 	String newString	) {
    (new leedOnlineKeywords.projectKeywords()).modifyFile(
        	filePath
         , 	oldString
         , 	newString)
}

def static "leedOnlineKeywords.projectKeywords.getXmlFiles"(
    	String testSuiteId	) {
    (new leedOnlineKeywords.projectKeywords()).getXmlFiles(
        	testSuiteId)
}

def static "leedOnlineKeywords.projectKeywords.sendCommandForDownloadChromeHeadLess"(
    	HttpCommandExecutor driverCommandExecutor	
     , 	SessionId sessionId	
     , 	String downloadPath	) {
    (new leedOnlineKeywords.projectKeywords()).sendCommandForDownloadChromeHeadLess(
        	driverCommandExecutor
         , 	sessionId
         , 	downloadPath)
}

def static "leedOnlineKeywords.projectKeywords.customdelay"(
    	TestObject sizeObject	) {
    (new leedOnlineKeywords.projectKeywords()).customdelay(
        	sizeObject)
}

def static "leedOnlineKeywords.projectKeywords.IsFileExist"(
    	TestObject fileNameObject	) {
    (new leedOnlineKeywords.projectKeywords()).IsFileExist(
        	fileNameObject)
}

def static "leedOnlineKeywords.projectKeywords.getBrowserName"() {
    (new leedOnlineKeywords.projectKeywords()).getBrowserName()
}

def static "leedOnlineKeywords.projectKeywords.getFilePath"(
    	String browserName	) {
    (new leedOnlineKeywords.projectKeywords()).getFilePath(
        	browserName)
}

def static "leedOnlineKeywords.projectKeywords.IsChecked"(
    	String xpath	) {
    (new leedOnlineKeywords.projectKeywords()).IsChecked(
        	xpath)
}

def static "leedOnlineKeywords.projectKeywords.compareUploadedFileWithPDF"(
    	String xpathid	
     , 	String scroll1	
     , 	String iframe	) {
    (new leedOnlineKeywords.projectKeywords()).compareUploadedFileWithPDF(
        	xpathid
         , 	scroll1
         , 	iframe)
}

def static "leedOnlineKeywords.projectKeywords.compareNarrativeDataWithPDF"(
    	String scroll	
     , 	String Editorpath	) {
    (new leedOnlineKeywords.projectKeywords()).compareNarrativeDataWithPDF(
        	scroll
         , 	Editorpath)
}

def static "leedOnlineKeywords.projectKeywords.callNavigationTestCase"(
    	String formName	
     , 	String formv01	) {
    (new leedOnlineKeywords.projectKeywords()).callNavigationTestCase(
        	formName
         , 	formv01)
}

def static "leedOnlineKeywords.projectKeywords.uploadMultipleFiles"(
    	String uploadButton	
     , 	String inputUploadFile	) {
    (new leedOnlineKeywords.projectKeywords()).uploadMultipleFiles(
        	uploadButton
         , 	inputUploadFile)
}

def static "leedOnlineKeywords.projectKeywords.compareUploadedFileWithPDF1"(
    	String Table_Xpathid	
     , 	String scrollTo	
     , 	String iframe	) {
    (new leedOnlineKeywords.projectKeywords()).compareUploadedFileWithPDF1(
        	Table_Xpathid
         , 	scrollTo
         , 	iframe)
}

def static "leedOnlineKeywords.projectKeywords.verifyUploadedFiles"(
    	String tableRow	
     , 	String tableId	) {
    (new leedOnlineKeywords.projectKeywords()).verifyUploadedFiles(
        	tableRow
         , 	tableId)
}

def static "leedOnlineKeywords.projectKeywords.downloadUploadedFiles"(
    	String tableRow	
     , 	String tableId	
     , 	String scrollTo	) {
    (new leedOnlineKeywords.projectKeywords()).downloadUploadedFiles(
        	tableRow
         , 	tableId
         , 	scrollTo)
}

def static "leedOnlineKeywords.projectKeywords.verifyDownloadedFiles"() {
    (new leedOnlineKeywords.projectKeywords()).verifyDownloadedFiles()
}

def static "leedOnlineKeywords.projectKeywords.deleteUploadedFiles"(
    	String tableRow	
     , 	String tableId	
     , 	String scrollTo	) {
    (new leedOnlineKeywords.projectKeywords()).deleteUploadedFiles(
        	tableRow
         , 	tableId
         , 	scrollTo)
}
