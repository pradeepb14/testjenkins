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

not_run: WebUI.sendKeys(findTestObject('FMS_DashBoard/Page_Healthcare Manager/input_Initiate FMS Case_srch_box'), 'archana')

WebUI.click(findTestObject('FMS_DashBoard/Page_Healthcare Manager/a_Ongoing'))

WebUI.verifyElementClickable(findTestObject('FMS_DashBoard/Page_Healthcare Manager/a_Completed'))

WebUI.doubleClick(findTestObject('FMS_Profile/Page_Healthcare Manager/i_archana mohini_icon icon-views'), FailureHandling.STOP_ON_FAILURE)

if (true) {
    WebUI.click(findTestObject('FMS_Profile/Page_Healthcare Manager/Page_Healthcare Manager/a_Case Details'))

    WebUI.verifyElementPresent(findTestObject('FMS_Profile/Page_Healthcare Manager/Page_Healthcare Manager/li_OCSID  7'), 
        10)

    WebUI.verifyElementPresent(findTestObject('FMS_Profile/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/li_Initiator Name  dsfghg g Archana'), 
        10)

    if (false) {
        WebUI.click(findTestObject('FMS_Profile/Page_Healthcare Manager/Page_Healthcare Manager/a_CategoryReason'))

        WebUI.click(findTestObject('FMS_Profile/Page_Healthcare Manager/Page_Healthcare Manager/span_Serious Misconduct'))

        WebUI.click(findTestObject('FMS_Profile/Page_Healthcare Manager/Page_Healthcare Manager/div_Staff Performance'))

        WebUI.click(findTestObject('FMS_Profile/Page_Healthcare Manager/Page_Healthcare Manager/span_addnewReson'))

        WebUI.verifyElementPresent(findTestObject('FMS_Profile/Page_Healthcare Manager/Page_Healthcare Manager/div_Add New Reason'), 
            5)

        WebUI.setText(findTestObject('FMS_Profile/Page_Healthcare Manager/Page_Healthcare Manager/input_Please Type a Title Here_title'), 
            'major issue')

        WebUI.setText(findTestObject('FMS_Profile/Page_Healthcare Manager/Page_Healthcare Manager/textarea_Short description_description'), 
            'The Cadaver Tomb of René of Chalon is a Gothic funerary monument in the church of Saint-Étienne at Bar-le-Duc in northeastern France. It consists of an altarpiece and a limestone statue of a putrefied and skinless corpse which stands upright; its left arm is raised as if gesturing towards heaven. Completed sometime between 1544 and 1557, the majority of its construction is attributed to the French sculptor Ligier Richier.')

        WebUI.click(findTestObject('FMS_Profile/Page_Healthcare Manager/Page_Healthcare Manager/input_This field is required_but'))
    } else {
        WebUI.click(findTestObject('FMS_Profile/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/i_Reason_more-less glyphicon glyphicon-plus'))

        WebUI.click(findTestObject('FMS_Profile/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/i_By_icon icon-update update_button'))

        WebUI.click(findTestObject('FMS_Profile/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/i_Update Reason_icon icon-cross-icons'))
    }
}

WebUI.doubleClick(findTestObject('FMS_Profile/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/a_Escalate to Incident'))

if (false) {
    WebUI.verifyElementPresent(findTestObject('FMS_Profile/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/h3_Confirmation'), 
        10)

    WebUI.click(findTestObject('FMS_Profile/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/button_Confirm'))
} else {
    WebUI.click(findTestObject('FMS_Profile/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/Page_Healthcare Manager/button_Cancel'))
}

