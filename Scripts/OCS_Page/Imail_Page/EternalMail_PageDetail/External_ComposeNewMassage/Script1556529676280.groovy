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

not_run: WebUI.callTestCase(findTestCase('OCS_Page/Login_Page/LoginPage_Positive_validate'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Home_Page_OR/Page_Healthcare Manager/p_Imail'))

WebUI.click(findTestObject('Imail_OR/Page_Healthcare Manager/span_ExternalImail_icon icon-share Ext_1'))

WebUI.click(findTestObject('create externail mail/Page_Healthcare Manager/span_Compose New Message'))

WebUI.click(findTestObject('create externail mail/Page_Healthcare Manager/div_To'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('create externail mail/Page_Healthcare Manager/Page_Healthcare Manager/input'), 'archana')

WebUI.click(findTestObject('create externail mail/Page_Healthcare Manager/div_archana  Archana'))

WebUI.sendKeys(findTestObject('create externail mail/Page_Healthcare Manager/input_CC_subject'), 'test  mail')

WebUI.setText(findTestObject('create externail mail/Page_Healthcare Manager/i_dfgdgdfgdgdgdddddd_icon icon-share-icon'), 
    'This internet advertisement / campaign / e mailer/ promotional marketing activity is wholly / completely managed and sponsored by the advertising / promotional company and/or its media partners / Agencies. Monster.com as a publisher of this advertisement/ campaign /e-mailer / promotion and/or its digital agency does not validate the accuracy / genuineness of the contents of this internet advertisement / campaign / e mailer/')

WebUI.click(findTestObject('create externail mail/Page_Healthcare Manager/Page_Healthcare Manager/Send icon'))

WebUI.verifyElementVisible(findTestObject('create externail mail/Page_Healthcare Manager/div_Send mail successfully'))

WebUI.delay(120)

