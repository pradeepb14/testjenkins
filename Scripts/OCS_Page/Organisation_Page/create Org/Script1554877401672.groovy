import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ydtwebstaging.com')

WebUI.maximizeWindow()

WebUI.deleteAllCookies()

WebUI.getWindowTitle()

WebUI.waitForPageLoad(30)

WebUI.setText(findTestObject('Login_Page_OB/Page_Healthcare Manager/input_Login here_username'), 'admin')

WebUI.setText(findTestObject('Login_Page_OB/Page_Healthcare Manager/input_Login here_password'), '123456')

WebUI.click(findTestObject('Login_Page_OB/Page_Healthcare Manager/button_Submit'))

WebUI.click(findTestObject('Home_Page_OR/Page_Healthcare Manager/p_Organisation'))

WebUI.click(findTestObject('organisation OR/Page_Healthcare Manager/span_Create New Org'))

WebUI.click(findTestObject('organisation OR/Page_Healthcare Manager/div_Search_org_box'))

WebUI.setText(findTestObject('organisation OR/Page_Healthcare Manager/input'), 'company')

WebUI.click(findTestObject('organisation OR/Page_Healthcare Manager/div_COMPANY'))

