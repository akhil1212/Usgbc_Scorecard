package leedOnlineKeywords
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.lang.reflect.Field

import com.fasterxml.jackson.databind.ObjectMapper
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
//import com.oracle.webservices.internal.api.message.ContentType

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI
import groovy.io.FileType

import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeDriverService
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.json.Json
import org.openqa.selenium.WebDriver
import org.apache.http.client.utils.URIBuilder
import org.apache.http.impl.client.CloseableHttpClient
import org.apache.http.impl.client.HttpClients
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
import org.apache.http.entity.StringEntity
import org.openqa.selenium.remote.HttpCommandExecutor
import org.openqa.selenium.remote.SessionId

import org.apache.http.client.HttpClient
import org.apache.http.client.methods.CloseableHttpResponse
import org.apache.http.client.methods.HttpPost

import org.apache.http.io.SessionInputBuffer
import org.apache.http.entity.ContentType
import org.openqa.selenium.remote.RemoteWebDriver
import org.openqa.selenium.Capabilities;

import com.testautomationguru.utility.PDFUtil
import org.apache.pdfbox.pdmodel.PDDocument
import org.apache.pdfbox.text.PDFTextStripper


class projectKeywords {

	String Url = GlobalVariable.Url
	String userName = GlobalVariable.userName
	String password = GlobalVariable.password

	@Keyword
	def public String generateRandomString(int strLen) {

		String aToZ = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890"
		Random rand=new Random();
		StringBuilder res=new StringBuilder();
		for (int i = 0; i <strLen ; i++) {
			int randIndex=rand.nextInt(aToZ.length());
			res.append(aToZ.charAt(randIndex));
		}
		return res.toString();
	}

	@Keyword
	def countRowsPerPage(String xpath){

		//println "xpath is " + xpath
		WebDriver driver = DriverFactory.getWebDriver()

		//Find the table element on the page

		WebUI.switchToFrame(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/iframe'), 10)


		WebElement Webtable=driver.findElement(By.xpath(xpath))
		//println Webtable

		List TotalRowCount=Webtable.findElements(By.xpath(xpath))

		//Get the size of the List, this is the number of rows
		int totalNumberOfRows=TotalRowCount.size()
		println('Total Number of rows on the page:= ' + totalNumberOfRows)

		WebUI.switchToDefaultContent()

		return totalNumberOfRows

	}


	//------------------Check whether File got Downloaded-----------------------

	@Keyword

	//	public boolean isFiledownloaded(String downloadPath, String fileName) {
	def isFiledownloaded(String downloadPath, String fileName) {
		File dir = new File(downloadPath);

		File[] dirContents = dir.listFiles();

		String lastAttempt = '';
		String fileNameInExcel ='';
		WebUI.delay(1)

		println "######################## dowloadPath" + downloadPath
		println "######################## dirContents.length"+ dirContents.length
		if (dirContents.length > 0) {

			for (int i = 0; i < dirContents.length; i++) {

				if (dirContents[i].getName().equals(fileName)) {

					// File has been found, it can now be deleted:

					dirContents[i].delete();

					KeywordUtil.markPassed(fileName + ' exist in ' + downloadPath + ' and was deleted')
					KeywordUtil.markPassed("")
					println "Fname from folder "+dirContents[i].getName() + "equals to" + fileName
					fileNameInExcel = dirContents[i].getName()
					println "File name is = "+ fileNameInExcel
					return fileNameInExcel;
					//return true;

				}

				//	lastAttempt = dirContents[i].getName().equals(fileName);
				lastAttempt = dirContents[i].getName()
				println "lastAttempt is = "+ lastAttempt
			}

			if (lastAttempt != fileName) {
				//println "Fname from folder "+dirContents[i].getName() + "not equals to" + fileName
				//fileNameInExcel = dirContents[i].getName()
				KeywordUtil.markFailed(fileName + ' does not exist in ' + downloadPath)
				println "lastAttempt is = "+ lastAttempt
				return lastAttempt
				//return false;
			}
		}

		return false;
	}


	//####################################Delete All the Files From Downloaded Location###################

	@Keyword

	def deleteDownloadedFiles(String downloadPath){
		File dir = new File(downloadPath);
		File[] dirContents = dir.listFiles();

		println "#################"+downloadPath
		println dirContents.length
		if (dirContents.length > 0) {

			for (int i = 0; i < dirContents.length; i++) {

				dirContents[i].delete();
				//return true;

			}

		}

		return false
	}

	//#############Compare from Excel ##############
	@Keyword
	def Excelcompare(String Fname, String DataFile, String ColName) {
		String b
		String a =Fname
		for(def row=1;row<=findTestData(DataFile).getRowNumbers();row++){

			b= findTestData(DataFile).getValue(ColName, row)

			//println b
			if(a.equals(b)){

				println a+" is equal to "+b

				KeywordUtil.markPassed(a+ ' is equal to '+b)

				return true
			}
		}

		if(a!=b) {
			KeywordUtil.markFailed(a + " is not equal to "+ b)

			return false
		}
	}

	//##########################Compare Excel########################################

	@Keyword
	def CompareExcel(String Fname, String DataFile, String ColName) {
		String b
		String a = Fname
		for(def row=1;row<=findTestData(DataFile).getRowNumbers();row++){

			b= findTestData(DataFile).getValue(ColName, row)

			//println b
			if(a.equals(b)){

				println a+" is equal to "+b

				KeywordUtil.markPassed(a+ ' is equal to '+b)

				return b
			}
		}

		if(a!=b) {
			KeywordUtil.markFailed(a + " is not equal to "+ b)

			return b
		}
	}

	//#####################Set Download Location################################

	@Keyword

	def setDownloadPath() {

		//ChromeOptions options = new ChromeOptions();
		//options.setHeadless(true)

		////	HashMap<Object, String> chromePrefs = new HashMap<Object, String>();

		////	chromePrefs.put("download.default_directory", RunConfiguration.getProjectDir() + "/Include/TestData/DownloadedFiles")

		////	RunConfiguration.setWebDriverPreferencesProperty("prefs", chromePrefs)





	}


	//#####################Delete Reports Location################################

	@Keyword

	public boolean isFiledelete(String reportPath) {

		File dir = new File(reportPath);

		File[] dirContents = dir.listFiles();

		WebUI.delay(1)
		println "length :" + dirContents.length
		if (dirContents.length > 0) {
			println " inside length :" + dirContents.length

			for (int i = 0; i < dirContents.length; i++) {

				dirContents[i].delete();
			}
		}
		return false
	}


	//#####################Modify Reports Name################################

	@Keyword

	def modifyFile(String filePath, String oldString, String newString)
	{
		File fileToBeModified = new File(filePath);

		String oldContent = "";

		BufferedReader reader = null;

		FileWriter writer = null;

		try
		{
			reader = new BufferedReader(new FileReader(fileToBeModified));

			//Reading all the lines of input text file into oldContent

			String line = reader.readLine();

			while (line != null)
			{
				oldContent = oldContent + line + System.lineSeparator();

				line = reader.readLine();
			}

			//Replacing oldString with newString in the oldContent

			String newContent = oldContent.replaceAll(oldString, newString);

			//Rewriting the input text file with newContent

			writer = new FileWriter(fileToBeModified);

			writer.write(newContent);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				//Closing the resources

				reader.close();

				writer.close();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

	// To change the report Naame for Katalon Analytics

	@Keyword
	def getXmlFiles(String testSuiteId){

		String pathToFolder = RunConfiguration.getProjectDir() + '/MyReports'
		List<File> aList = new ArrayList<File>();

		File dir = new File(pathToFolder);

		File[] dirContents = dir.listFiles();

		for (File xmlfname : dirContents) {

			if (xmlfname.isFile() && getFileExtensionName(xmlfname).indexOf("xml") != -1) {
				aList.add(xmlfname);
			}
		}


		aList= aList.toArray(new File[aList.size()]);

		println aList
		for(int i=0;i<aList.size;i++){

			String fpath = aList[i]
			println fpath
			modifyFile(fpath,"cucumber.runtime.formatter.JUnitFormatter",testSuiteId)
		}


	}

	public static String getFileExtensionName(File f) {
		if (f.getName().indexOf(".") == -1) {
			return "";
		} else {
			return f.getName().substring(f.getName().length() - 3, f.getName().length());
		}
	}

	@Keyword
	static void sendCommandForDownloadChromeHeadLess(HttpCommandExecutor driverCommandExecutor,SessionId sessionId,String downloadPath) {
		println "Entered now"
		println ""+driverCommandExecutor
		println ""+sessionId
		println "" +downloadPath
		Json json = new Json()

		Map<String, Object> paramsMap = new HashMap<>();
		paramsMap.put("cmd", "Page.setDownloadBehavior");

		//	println "######################" + paramsMap
		Map<String,String> cmdParamsMap = new HashMap<>();
		cmdParamsMap.put("behavior", "allow");
		//	println "######################" + cmdParamsMap
		cmdParamsMap.put("downloadPath", downloadPath);
		//	println "######################" + cmdParamsMap
		paramsMap.put("params", cmdParamsMap);
		//	println "######################" + paramsMap

		String content = json.toJson(paramsMap)
		//	println "################# Content = "+content
		//log.debug("The request content is :: {}" ,content);
		URL remoteServerUri = null;
		try {

			Field field = HttpCommandExecutor.class.getDeclaredField("remoteServer")

			//		println "################# Field = "+field
			field.setAccessible(true);
			remoteServerUri = (URL)field.get(driverCommandExecutor);
			//		println "################# remoteServerUri = "+remoteServerUri
		}catch (Exception e) {
			println "############# ERROR"+e
			println "This will cause all the file validations to fail"
			//log.debug("The HttpCommandExecutor has been modified please check with the framework team",e);
			//log.error("This will cause all the file validations to fail");
			return;
		}

		CloseableHttpClient httpclient = null;

		try {


			httpclient = HttpClients.createDefault()
			//	println "############# httpclient"+ httpclient
			URIBuilder builder = new URIBuilder(remoteServerUri.toURI())
			//	println "############# builder"+ builder

			//Change it for Server ---------------------------------->
			builder.setPath("/session/"+sessionId.toString()+"/chromium/send_command");
			//Change it for Server ---------------------------------->

			//Change it for Local ---------------------------------->
			////////////////////////////////////////////builder.setPath("session/"+sessionId.toString()+"/chromium/send_command");
			//Change it for Local ---------------------------------->

			//	println "############# builder.setPath"+ builder
			HttpPost sendCommandPost = new HttpPost(builder.build())
			//	println "############# sendCommandPost"+ sendCommandPost
			sendCommandPost.setHeader("Content-Type", ContentType.APPLICATION_JSON.getMimeType())
			//sendCommandPost.setHeaders("Content-Type","")

			//StringEntity entity = new StringEntity(content, );
			StringEntity entity = new StringEntity(content, ContentType.APPLICATION_JSON)
			//		println "############# entity"+ entity
			sendCommandPost.setEntity(entity);
			//		println "############# sendCommandPost"+ sendCommandPost
			CloseableHttpResponse response = httpclient.execute(sendCommandPost);
			//		println "############# response"+ response
			int statusCode = response.getStatusLine().getStatusCode();
			//log.debug("The Response Status code is {}",statusCode);
			println"The Response Status code is {}" + statusCode;
			if(statusCode <= 200 && statusCode >= 300) {
				///log.debug("Un-Successfull status code received");
				println "Failure"
			}
		}catch (IOException e) {
			//log.error("Error Occured while enabling download file setting for chrome headless mode");
			//log.error("This will cause all the file validations to fail",e);
			println "This will cause all the file validations to fail"+e

		} catch (URISyntaxException e) {
			//log.debug("this should never ever occur");
			println "this should never ever occur"

		}
		finally {
			if(httpclient != null) {
				try {
					//httpclient.close()
				} catch (IOException e) {
					//log.warn("Error Occured while closing the http client",e);
					println "Error Occured while closing the http client" + e
				}
			}
		}

	}

	//keyword for customdelay for download files//

	@Keyword

	def customdelay(TestObject sizeObject){

		String  fsize_txt = WebUI.getText(sizeObject)
		String fsize = fsize_txt.substring(0,fsize_txt.length() - 2)
		println sizeObject

		println fsize



		float float_size = Float.parseFloat(fsize);


		if(float_size <= 10.00){
			WebUI.delay(60)
		}
		if (float_size > 10 && float_size <= 20) {
			WebUI.delay(120)
		}
		else if (float_size > 20 && float_size <= 40) {
			WebUI.delay(240)
		}
		else if (float_size > 40 && float_size <= 60) {
			WebUI.delay(500)
		}

		else if (float_size > 60 && float_size <= 80) {
			WebUI.delay(860)
		}

		else if (float_size > 80 && float_size <= 100) {
			WebUI.delay(1060)
		}
		else {
			WebUI.delay(15)
		}

	}

	@Keyword

	def IsFileExist(TestObject fileNameObject){

		String  fname_txt = WebUI.getText(fileNameObject)
		String path = RunConfiguration.getProjectDir() + '/Include/TestData/DownloadedFiles/'+fname_txt
		println "############################## Path = "+path
		File file = new File(path);
		println "############################## file = "+file
		while (!file.exists()) {
			println "Waiting for file to download"
			WebUI.delay(10)
		}
	}

	@Keyword
	def public String getBrowserName(){
		RemoteWebDriver driver = DriverFactory.getWebDriver()
		Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
		String browserName = cap.getBrowserName().toLowerCase();
		println "The browserName is ########### " + browserName
		return browserName
	}

	@Keyword
	def public String getFilePath(String browserName){
		String path = ""
		if (browserName == "chrome"){
			path = RunConfiguration.getProjectDir() +'/Include/TestData/'
			println "####################### Path is" + path
		}
		else if(browserName == "firefox" || browserName == "internet explorer"){
			path ="G:\\Sabareesh\\Usgbc_GitProjects\\LeedOnlineBDD\\Usgbc_creditform\\Include\\TestData\\"
			println "####################### Path is" + path
		}
		return path
	}

	@Keyword
	def public IsChecked(String xpath){
		WebDriver driver = DriverFactory.getWebDriver()
		//println "################### xpath is "+xpath
		WebUI.switchToFrame(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/iframe'), 10)

		WebElement checkbox =driver.findElement(By.xpath(xpath))
		if(!checkbox.isSelected()){
			println"Checked ##########"
			checkbox.click()
		}
		WebUI.switchToDefaultContent()
	}

	@Keyword
	def compareUploadedFileWithPDF(String xpathid,String scroll1,String iframe) {
		PDFUtil pdfUtil1 = new PDFUtil();
		String path = RunConfiguration.getProjectDir() + '/Include/TestData/DownloadedFiles/creditForm.pdf'
		String file = pdfUtil1.getText(path,1)
		//String file = pdfUtil1.getText("C:\\Users\\Promantus Inc\\Downloads\\creditForm.pdf",1);
		WebUI.delay(5)
		println(file)
		WebDriver driver = DriverFactory.getWebDriver()
		WebUI.scrollToElement(findTestObject(scroll1), 15)
		WebUI.switchToFrame(findTestObject(iframe),5)
		WebElement Table = driver.findElement(By.xpath(xpathid));

		List < WebElement > rows_table = Table.findElements(By.tagName('tr'))
		int rows_count = rows_table.size()
		for (int row = 0; row < rows_count; row++) {
			List < WebElement > Columns_row = rows_table.get(row).findElements(By.tagName('td'))
			int columns_count = Columns_row.size()
			int col = columns_count-1;
			int  col1=0;

			for (int column = 0; column <2; column++) {

				//if(column==3)continue;
				//println(column,end=' ')

				String celltext = Columns_row.get(col1).getText()
				println(celltext)
				col1++
				if(file.contains(celltext)) {
					println("The content in the downloaded pdf matches with the Form Content --> Found")
				}
				else {
					println("The content in the downloaded pdf does not match with the Form Content --> Not Found")
				}
			}

		}


	}

	@Keyword
	def compareNarrativeDataWithPDF(String scroll,String Editorpath) {

		//getting pdf in doc
		PDFUtil pdfUtil1 = new PDFUtil();
		String path = RunConfiguration.getProjectDir() + '/Include/TestData/DownloadedFiles/creditForm.pdf'
		String file = pdfUtil1.getText(path,1)
		//String file = pdfUtil1.getText("C:\\Users\\Promantus Inc\\Downloads\\creditForm.pdf",1);
		WebUI.delay(5)
		println(file)
		WebUI.scrollToElement(findTestObject(scroll), 15)
		String Narrative = WebUI.getText(findTestObject(Editorpath))
		println "#############################"+ Narrative
		//compare pdf with narrative

		if(file.contains(Narrative)) {
			println("The content in the downloaded pdf matches with the Form Narrative Content --> Found")

		}
		else {
			println("The content in the downloaded pdf does not match with the Form Narrative Content --> Not Found")

		}
	}


	//#Calling Navigation

	@Keyword

	def public callNavigationTestCase(String formName, String formv01){

		println "formName is " + formName
		println "formv01 is " + formv01
		WebUI.openBrowser("")
		WebUI.navigateToUrl(Url)
		WebUI.delay(2)
		WebUI.setText(findTestObject('Object Repository/Login/input_username'), userName)
		WebUI.setText(findTestObject('Object Repository/Login/input_password'), password)
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
		WebUI.click(findTestObject('Object Repository/Login/a_Credits'))
		WebUI.delay(2)
		WebUI.click(findTestObject(formName))
		WebUI.delay(2)
		WebUI.click(findTestObject(formv01))
		

	}



	@Keyword
	def public uploadMultipleFiles(String uploadButton, String inputUploadFile ){

		println "The button is ^^^^^^^^^^^^^^^^^ " + uploadButton
		println "The input is ^^^^^^^^^^^^^^^^^ " + inputUploadFile
		def list = []
		String path = RunConfiguration.getProjectDir() + '/Include/TestData/MultipleFileDiffExt'
		println "path :"+path
		def dir = new File(path)
		dir.eachFile (FileType.FILES) { file -> list << file}
		for (item in list) {
			String item1 = item
			WebUI.switchToFrame(findTestObject('Object Repository/GreenCleaningPolicy/iframe'), 10)
			boolean Greenplcy = WebUI.waitForElementAttributeValue(findTestObject(uploadButton), 'class', 'tiny ui button', 1000)
			WebUI.switchToDefaultContent()
			WebUI.uploadFile(findTestObject(inputUploadFile), item1)
			WebUI.delay(1)
		}

	}



	// Repeated function with name change

	@Keyword
	def compareUploadedFileWithPDF1(String Table_Xpathid,String scrollTo,String iframe) {
		PDFUtil pdfUtil1 = new PDFUtil();
		String path = RunConfiguration.getProjectDir() + '/Include/TestData/DownloadedFiles/creditForm.pdf'
		String file = pdfUtil1.getText(path,1)
		//String file = pdfUtil1.getText("C:\\Users\\Promantus Inc\\Downloads\\creditForm.pdf",1);
		WebUI.delay(5)
		println(file)
		WebDriver driver = DriverFactory.getWebDriver()
		WebUI.scrollToElement(findTestObject(scrollTo), 15)
		WebUI.switchToFrame(findTestObject(iframe),5)
		println "The xpath of the table is :" + Table_Xpathid
		WebElement Table = driver.findElement(By.xpath(Table_Xpathid));
		//WebElement Table = driver.find

		List < WebElement > rows_table = Table.findElements(By.tagName('tr'))
		int rows_count = rows_table.size()
		for (int row = 0; row < rows_count; row++) {
			List < WebElement > Columns_row = rows_table.get(row).findElements(By.tagName('td'))
			int columns_count = Columns_row.size()
			int col = columns_count-1;
			int  col1=0;

			for (int column = 0; column <2; column++) {

				//if(column==3)continue;
				//println(column,end=' ')

				String celltext = Columns_row.get(col1).getText()
				println(celltext)
				col1++
				if(file.contains(celltext)) {
					println("The content in the downloaded pdf matches with the Form Content --> Found")
				}
				else {
					println("The content in the downloaded pdf does not match with the Form Content --> Not Found")
				}
			}

		}


	}

	@Keyword
	def verifyUploadedFiles(String tableRow, String tableId ){
		//println "The tableRow xpath is "  + tableRow
		println "The tableId xpath is "  + tableId
		String fileName
		int count = (new projectKeywords()).countRowsPerPage(tableRow)
		println "The table count is "+ count

		for(def row=1;row<=count ;row++){
			int k=row
			WebUI.switchToFrame(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/iframe'), 5)
			TestObject name = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*['+ tableId +']/table/tbody/tr['+k+']/td[1]', true)
			//	println "File name is : "+fileName

			fileName = WebUI.getText(name)
			println "File name in the table is : "+ fileName
			println "Entering Excel"

			String excelFileName =(new projectKeywords()).CompareExcel(fileName,"UploadedData/UploadedFileNames","FileNames")
			println "File name in the excel is : "+ excelFileName
			WebUI.switchToDefaultContent()
			WebUI.verifyMatch(excelFileName, fileName, false)
		}
	}

	@Keyword
	def downloadUploadedFiles(String tableRow, String tableId, String scrollTo ){

		println "The tableRow xpath is "  + tableRow
		println "The tableId xpath is "  + tableId
		println "The scrollTo test object is "+ scrollTo

		int count = (new projectKeywords()).countRowsPerPage(tableRow)
		println "Count in table : "+count

		if (count > 0){

			WebUI.scrollToElement(findTestObject(scrollTo), 30)
			for (int k = count; k>=1; k--) {
				TestObject	 download = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*['+tableId+']/table/tbody/tr['+k+']/td[5]/a[1]/i', true)
				WebUI.delay(2)
				WebUI.mouseOver(findTestObject(scrollTo))
				WebUI.switchToFrame(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/iframe'), 5)
				TestObject fileName =  new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*['+tableId+']/table/tbody/tr['+k+']/td[1]', true)
				WebUI.click(download)
				new projectKeywords().IsFileExist(fileName)
				WebUI.switchToDefaultContent()
				WebUI.mouseOver(findTestObject(scrollTo))
				WebUI.delay(2)
			}
			WebUI.delay(3)
		}

	}


	@Keyword
	def verifyDownloadedFiles(){

		String path = RunConfiguration.getProjectDir() + '/Include/TestData/DownloadedFiles'
		for(int i=1;i<=findTestData("UploadedData/UploadedFileNames").getRowNumbers();i++){
			WebUI.delay(2)
			String fname = findTestData("UploadedData/UploadedFileNames").getValue("FileNames", i)
			String isDownloaded = new projectKeywords().isFiledownloaded(path, fname)
			WebUI.verifyMatch(isDownloaded, fname, false)
		}
		new projectKeywords().deleteDownloadedFiles(path)
	}


	@Keyword
	def deleteUploadedFiles(String tableRow, String tableId, String scrollTo){

		int row_Count = (new projectKeywords()).countRowsPerPage(tableRow)

		if (row_Count > 0){

			WebUI.scrollToElement(findTestObject(scrollTo), 30)

			for (int k = row_Count; k>=1; k--){
				TestObject delete = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*['+tableId+']/table/tbody/tr['+k+']/td[5]/a[2]/i', true)
				WebUI.delay(1)
				WebUI.switchToFrame(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/iframe'), 5)
				WebUI.click(delete)
				WebUI.delay(2)
				WebUI.switchToDefaultContent()
				WebUI.click(findTestObject('Object Repository/LightPollutionReduction/FixtureShielding/button_Yes'))
			}
		}
	}
}