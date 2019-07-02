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

WebUI.callTestCase(findTestCase('OCS_Page_Test/FMS_Validate/FMS_login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('FMS_DashBoard/Page_Healthcare Manager/h1_Feedback_title'))

WebUI.click(findTestObject('FMS_DashBoard/Page_Healthcare Manager/a_Ongoing'))

WebUI.verifyElementClickable(findTestObject('FMS_DashBoard/Page_Healthcare Manager/a_Completed'))

WebUI.doubleClick(findTestObject('FMS_Profile/Page_Healthcare Manager/i_archana mohini_icon icon-views'), FailureHandling.STOP_ON_FAILURE)

if (true) {
    WebUI.click(findTestObject('FMS_Profile/Page_Healthcare Manager/Page_Healthcare Manager/a_Case Details'))

    WebUI.verifyElementPresent(findTestObject('FMS_Profile/Page_Healthcare Manager/Page_Healthcare Manager/li_OCSID  7'), 
        10)

    WebUI.verifyElementPresent(findTestObject('FMS_Profile/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/li_Initiator Name  dsfghg g Archana'), 
        10)

    WebUI.click(findTestObject('FMS_Profile/FMS_Prof_1/Page_Healthcare Manager/a_DocsNotes'))
}

if (true) {
    if (false) {
        WebUI.getText(findTestObject('FMS_Profile/FMS_Prof_1/Page_Healthcare Manager/ul_Currently no Docs found for this case'))

        WebUI.click(findTestObject('FMS_Profile/FMS_Prof_1/Page_Healthcare Manager/a_Download Selected'))

        WebUI.verifyElementVisible(findTestObject('FMS_Create_Case/last)OB/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/div_Please select atleast one file to continue'), 
            FailureHandling.STOP_ON_FAILURE)
    } else {
        not_run: WebUI.verifyTextPresent('Upload Case Docs(s):', false)

        WebUI.click(findTestObject('FMS_Profile/FMS_Prof_1/Page_Healthcare Manager/div_Upload Case Docs(s)'))

        WebUI.setText(findTestObject('FMS_Profile/FMS_Prof_1/Page_Healthcare Manager/input'), 'demo1')

        CustomKeywords.'Upload.uploadfile'(findTestObject('FMS_Profile/FMS_Prof_1/Page_Healthcare Manager/i_Upload New Doc(s)'), 
            'C:\\Users\\win10\\Downloads\\Screenshot_2019-04-03 Healthcare Manager.png')

        WebUI.click(findTestObject('FMS_Profile/FMS_Prof_1/Page_Healthcare Manager/input_Please select a file to upload_content'))
    }
}

