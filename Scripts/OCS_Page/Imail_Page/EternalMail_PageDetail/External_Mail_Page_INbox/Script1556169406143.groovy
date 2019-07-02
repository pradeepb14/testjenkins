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

not_run: WebUI.callTestCase(findTestCase('OCS_Page_Test/Login_Validate/Login_positive_validate'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Home_Page_OR/Page_Healthcare Manager/p_Imail'))

WebUI.verifyElementVisible(findTestObject('Imail_OR/Page_Healthcare Manager/h1_Welcome to Imail archana mohini'))

WebUI.click(findTestObject('Imail_OR/Page_Healthcare Manager/span_ExternalImail_icon icon-share Ext_1'))

WebUI.verifyElementVisible(findTestObject('Imail_OR/Page_Healthcare Manager/h1_External Imail'))

WebUI.sendKeys(findTestObject('Imail_OR/Page_Healthcare Manager/input_Archived_search'), 'archana')

WebUI.doubleClick(findTestObject('Imail_OR/Page_Healthcare Manager/Page_Healthcare Manager/span_Archived_icon icon-search'))

WebUI.doubleClick(findTestObject('Imail_OR/Page_Healthcare Manager/div_From archana mohini'))

WebUI.verifyElementClickable(findTestObject('Imail_OR/Page_Healthcare Manager/i_test_icon icon-envelope-im'))

WebUI.verifyElementClickable(findTestObject('Imail_OR/Page_Healthcare Manager/i_test_icon icon-favorite-im'))

WebUI.verifyElementClickable(findTestObject('Imail_OR/Page_Healthcare Manager/i_test_icon icon-flag-im'))

WebUI.verifyElementClickable(findTestObject('Imail_OR/Page_Healthcare Manager/i_test_icon icon-block-im'))

not_run: WebUI.verifyElementClickable(findTestObject('Imail_OR/Page_Healthcare Manager/i_test_icon icon-archive-im'))

