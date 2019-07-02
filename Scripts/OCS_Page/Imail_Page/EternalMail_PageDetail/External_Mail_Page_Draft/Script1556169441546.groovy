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

not_run: WebUI.click(findTestObject('Home_Page_OR/Page_Healthcare Manager/p_Imail'))

not_run: WebUI.click(findTestObject('Imail_OR/Page_Healthcare Manager/span_ExternalImail_icon icon-share Ext_1'))

WebUI.click(findTestObject('Imail_OR/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/a_Drafts'))

