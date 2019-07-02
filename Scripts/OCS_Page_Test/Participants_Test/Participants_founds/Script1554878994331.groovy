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

WebUI.click(findTestObject('Home_Page_OR/Page_Healthcare Manager/p_Participants'))

WebUI.click(findTestObject('Participants_Profile/Page_Healthcare Manager/i_Female_icon icon-views - Copy'))

WebUI.click(findTestObject('found_module_or/Page_Healthcare Manager/Page_Healthcare Manager/a_Funding'))

WebUI.click(findTestObject('found_module_or/Page_Healthcare Manager/a_Docs_link'))

WebUI.click(findTestObject('found_module_or/Page_Healthcare Manager/a_Upload New Doc(s)'))

WebUI.setText(findTestObject('found_module_or/Page_Healthcare Manager/input'), 'Demo download')

WebUI.click(findTestObject('found_module_or/Page_Healthcare Manager/div_Select_docs cat'))

WebUI.click(findTestObject('found_module_or/Page_Healthcare Manager/div_Option 2'))

WebUI.setText(findTestObject('found_module_or/Page_Healthcare Manager/input_Docs Expiry Date_expiry_date'), '20-04-2019')

if (false) {
    CustomKeywords.'Upload.uploadfile'(findTestObject('found_module_or/Page_Healthcare Manager/i_Upload New Doc(s)_field'), 
        'C:\\Users\\win10\\Downloads\\Screenshot_2019-04-03 Healthcare Manager.png')

    WebUI.click(findTestObject('found_module_or/Page_Healthcare Manager/input__save_btn'))

    WebUI.delay(5)

    WebUI.verifyElementVisible(findTestObject('found_module_or/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/span_uploaded successfully'))
} else {
    CustomKeywords.'Upload.uploadfile'(findTestObject('found_module_or/Page_Healthcare Manager/i_Upload New Doc(s)_field'), 
        'C:\\Users\\win10\\Documents\\daily task.txt')

    WebUI.click(findTestObject('found_module_or/Page_Healthcare Manager/input__save_btn'))

    WebUI.delay(5)

    WebUI.verifyElementVisible(findTestObject('found_module_or/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/div_The filetype you are attempting to upload is not allowed'))
}

