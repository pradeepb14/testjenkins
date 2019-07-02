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

WebUI.verifyElementVisible(findTestObject('Home_Page_OR/Page_Healthcare Manager/div_Search'))

WebUI.verifyElementPresent(findTestObject('Home_Page_OR/Page_Healthcare Manager/p_Participants'), 20)

WebUI.verifyElementVisible(findTestObject('Home_Page_OR/Page_Healthcare Manager/p_Organisation'))

WebUI.verifyElementVisible(findTestObject('Home_Page_OR/Page_Healthcare Manager/p_FMS'))

WebUI.verifyElementVisible(findTestObject('Home_Page_OR/Page_Healthcare Manager/p_Imail'))

WebUI.verifyElementVisible(findTestObject('Home_Page_OR/Page_Healthcare Manager/p_CRM'))

WebUI.verifyElementVisible(findTestObject('Home_Page_OR/Page_Healthcare Manager/p_Recruitment'))

WebUI.verifyElementVisible(findTestObject('Home_Page_OR/Page_Healthcare Manager/p_Schedule'))

